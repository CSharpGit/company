package com.fems.company;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fems.company.bean.IndustryCaseItemBean;
import com.fems.company.server.AsyncHttpCient;
import com.fems.company.server.Commons;
import com.fems.company.server.HttpListener;
import com.fems.company.server.HttpParam;

import org.json.JSONArray;
import org.json.JSONObject;

public class CompanyAboutWeActivity extends CompanyBasicActivity {
    private TextView graph_1,graph_2,graph_3;
    private ImageView companyHomeIcon,companyAnliIcon,companyAboutWeIcon;
    private LinearLayout compHome,compCase;//底部导航
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_we);
        initView();
        initData();
        initEvent();
    }

    private void initEvent() {
        compHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyAboutWeActivity.this,CompanyActivity.class);
                CompanyAboutWeActivity.this.startActivity(intent);
            }
        });
        compCase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyAboutWeActivity.this,CompanyCaseActivity.class);
                CompanyAboutWeActivity.this.startActivity(intent);
            }
        });
    }

    private void initData() {
        loadData();
    }

    private void initView() {
        graph_1=findViewById(R.id.graph_1);
        graph_2=findViewById(R.id.graph_2);
        graph_3=findViewById(R.id.graph_3);
        compHome=findViewById(R.id.company_home);
        compCase=findViewById(R.id.company_case);

        companyHomeIcon=findViewById(R.id.company_home_icon);
        companyAnliIcon=findViewById(R.id.company_anli_icon);
        companyAboutWeIcon=findViewById(R.id.about_us_icon);

        companyHomeIcon.setImageResource(R.drawable.company_icon_2);
        companyAnliIcon.setImageResource(R.drawable.anli_icon_2);
        companyAboutWeIcon.setImageResource(R.drawable.about_us_1);
    }

    private void loadData(){
        AsyncHttpCient hndl = new AsyncHttpCient();
        HttpParam prm = new HttpParam();
        prm.httpListener = mHttpListener;
        prm.url = Commons.INTRO;
        hndl.execute(prm);
    }

    private HttpListener mHttpListener = new HttpListener() {
        @Override
        public void onPostData(String data) {
            try {
                JSONObject jsn = new JSONObject(data);
                if(jsn.getInt("error")==0){
                    JSONArray dd = jsn.getJSONArray("data");
                    JSONObject jo=dd.getJSONObject(0);
                    graph_1.setText("\u3000\u3000"+jo.getString("intro_1"));
                    graph_2.setText("\u3000\u3000"+jo.getString("intro_2"));
                    graph_3.setText("\u3000\u3000"+jo.getString("intro_3"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
}
