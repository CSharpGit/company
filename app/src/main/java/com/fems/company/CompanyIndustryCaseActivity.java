package com.fems.company;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.fems.company.bean.IndustryCaseItemBean;
import com.fems.company.server.AsyncHttpCient;
import com.fems.company.server.Commons;
import com.fems.company.server.HttpListener;
import com.fems.company.server.HttpParam;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class CompanyIndustryCaseActivity extends CompanyBasicActivity {
    private ImageView backView;
    private TextView titleName;
    private RecyclerView recyclerView;
    private List<IndustryCaseItemBean> listData;
    private CompanyIndustryCaseAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_industry_case);
        initView();
        initData();
        initEvent();
    }

    private void initView() {
        backView=findViewById(R.id.back_view);
        titleName=findViewById(R.id.title_name);
        recyclerView=findViewById(R.id.recycler_view);
        listData=new ArrayList<>();
        mAdapter=new CompanyIndustryCaseAdapter(CompanyIndustryCaseActivity.this,listData);
        StaggeredGridLayoutManager staggered=new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggered);
        recyclerView.setAdapter(mAdapter);
    }

    private void initData() {
        Intent intent=getIntent();
        String industryName=intent.getStringExtra("industryName");
        titleName.setText(industryName);
        loadData();
    }

    private void initEvent() {
        backView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CompanyIndustryCaseActivity.this.finish();
            }
        });
    }

    private void loadData(){
        AsyncHttpCient hndl = new AsyncHttpCient();
        HttpParam prm = new HttpParam();
        prm.httpListener = mHttpListener;
        prm.url = Commons.BANNER;
        hndl.execute(prm);
    }
    private HttpListener mHttpListener = new HttpListener() {
        @Override
        public void onPostData(String data) {
            try {
                JSONObject jsn = new JSONObject(data);
                listData.clear();
                if(jsn.getInt("errcode")==0){
                    JSONObject dd = jsn.getJSONObject("data");
                    JSONArray jsa = dd.getJSONArray("lst");
//                    ImageLoader.getInstance().displayImage(Commons.WEB_URL+jsn.getString("errmsg"),backView,options,mImageLoadingListener);
                    for (int i=0;i<jsa.length();i++)
                    {
                        JSONObject jsnx = jsa.getJSONObject(i);
                        IndustryCaseItemBean adb = new IndustryCaseItemBean();
                        adb.industryName = jsnx.getString("title");
                        listData.add(adb);
                    }
                }
                mAdapter.notifyDataSetChanged();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
}
