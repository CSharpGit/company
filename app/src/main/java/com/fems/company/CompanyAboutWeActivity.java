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

public class CompanyAboutWeActivity extends CompanyBasicActivity {
    private ImageView companyHomeIcon,companyAnliIcon,companyAboutWeIcon;
    private LinearLayout compHome,compCase;//底部导航
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_we);

        compHome=findViewById(R.id.company_home);
        compCase=findViewById(R.id.company_case);

        companyHomeIcon=findViewById(R.id.company_home_icon);
        companyAnliIcon=findViewById(R.id.company_anli_icon);
        companyAboutWeIcon=findViewById(R.id.about_us_icon);

        companyHomeIcon.setImageResource(R.drawable.company_icon_2);
        companyAnliIcon.setImageResource(R.drawable.anli_icon_2);
        companyAboutWeIcon.setImageResource(R.drawable.about_us_1);

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
}
