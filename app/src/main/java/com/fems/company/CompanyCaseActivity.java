package com.fems.company;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CompanyCaseActivity extends CompanyBasicActivity {
    private ImageView companyHomeIcon,companyAnliIcon,companyAboutWeIcon;
    private ConstraintLayout canyinIdustry,jiudianIndustry,dianshangIndustry,tongchengIndustry,trimIndustry;
    private LinearLayout compHome,compAboutWe;//底部导航
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_anli);
        compHome=findViewById(R.id.company_home);
        compAboutWe=findViewById(R.id.company_about_we);

        companyHomeIcon=findViewById(R.id.company_home_icon);
        companyAnliIcon=findViewById(R.id.company_anli_icon);
        companyAboutWeIcon=findViewById(R.id.about_us_icon);

        canyinIdustry=findViewById(R.id.industry_canyin);
        jiudianIndustry=findViewById(R.id.industry_jiudian);
        dianshangIndustry=findViewById(R.id.industry_dianshang);
        tongchengIndustry=findViewById(R.id.industry_tongcheng);
        trimIndustry=findViewById(R.id.industry_trim);

        companyHomeIcon.setImageResource(R.drawable.company_icon_2);
        companyAnliIcon.setImageResource(R.drawable.anli_icon_1);
        companyAboutWeIcon.setImageResource(R.drawable.about_us_2);

        compHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyCaseActivity.this,CompanyActivity.class);
                CompanyCaseActivity.this.startActivity(intent);
            }
        });
        compAboutWe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyCaseActivity.this,CompanyAboutWeActivity.class);
                CompanyCaseActivity.this.startActivity(intent);
            }
        });
        setIndustryCaseOnclickListener(canyinIdustry,"餐饮行业案例");
        setIndustryCaseOnclickListener(jiudianIndustry,"酒店行业案例");
        setIndustryCaseOnclickListener(dianshangIndustry,"电商行业案例");
        setIndustryCaseOnclickListener(tongchengIndustry,"同城行业案例");
        setIndustryCaseOnclickListener(trimIndustry,"家装行业案例");
    }

    private void setIndustryCaseOnclickListener(ConstraintLayout industryKey, final String industryName){
        industryKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyCaseActivity.this,CompanyIndustryCaseActivity.class);
                intent.putExtra("industryName",industryName);
                CompanyCaseActivity.this.startActivity(intent);
            }
        });
    }
}
