package com.fems.company;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CompanyActivity extends CompanyBasicActivity {
    private ImageView toAnliActivity,companyHomeIcon,companyAnliIcon,companyAboutWeIcon;
    private LinearLayout compCase,compAboutWe;//底部导航
    private LinearLayout toWebDesign,toWeChatPub,toWeChatXcx,toWebVisualDesign;//主营业务
    private LinearLayout toSolutionKtv,toSolutionJiuDian,toSolutionCanYin,toSolutionEnterprise;//解决方案
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);

        toAnliActivity=findViewById(R.id.to_anli_activity);

        compCase=findViewById(R.id.company_case);
        compAboutWe=findViewById(R.id.company_about_we);

        companyHomeIcon=findViewById(R.id.company_home_icon);
        companyAnliIcon=findViewById(R.id.company_anli_icon);
        companyAboutWeIcon=findViewById(R.id.about_us_icon);

        toWebDesign=findViewById(R.id.to_web_design);
        toWeChatPub=findViewById(R.id.to_we_chat_pub);
        toWeChatXcx=findViewById(R.id.to_we_chat_xcx);
        toWebVisualDesign=findViewById(R.id.to_web_visual_design);

        toSolutionKtv=findViewById(R.id.to_solution_ktv);
        toSolutionJiuDian=findViewById(R.id.to_solution_jiudian);
        toSolutionCanYin=findViewById(R.id.to_solution_canyin);
        toSolutionEnterprise=findViewById(R.id.to_solution_enterprise);

        companyHomeIcon.setImageResource(R.drawable.company_icon_1);
        companyAnliIcon.setImageResource(R.drawable.anli_icon_2);
        companyAboutWeIcon.setImageResource(R.drawable.about_us_2);

        compCase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,CompanyCaseActivity.class);
                CompanyActivity.this.startActivity(intent);
            }
        });
        compAboutWe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,CompanyAboutWeActivity.class);
                CompanyActivity.this.startActivity(intent);
            }
        });
        toAnliActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,CompanyCaseActivity.class);
                CompanyActivity.this.startActivity(intent);
            }
        });
        toWebDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,CompanyWebDesignActivity.class);
                CompanyActivity.this.startActivity(intent);
            }
        });
        toWeChatPub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,CompanyWeChatPubActivity.class);
                CompanyActivity.this.startActivity(intent);
            }
        });
        toWeChatXcx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,CompanyWeChatXcxActivity.class);
                CompanyActivity.this.startActivity(intent);
            }
        });
        toWebVisualDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,CompanyWebVisualDesignActivity.class);
                CompanyActivity.this.startActivity(intent);
            }
        });
        toSolutionKtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,CompanySolutionOfKtvActivity.class);
                CompanyActivity.this.startActivity(intent);
            }
        });
        toSolutionJiuDian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,CompanySolutionOfJiuDianActivity.class);
                CompanyActivity.this.startActivity(intent);
            }
        });
       toSolutionCanYin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,CompanySolutionOfCanYinActivity.class);
                CompanyActivity.this.startActivity(intent);
            }
        });
        toSolutionEnterprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,CompanySolutionOfEnterpriseActivity.class);
                CompanyActivity.this.startActivity(intent);
            }
        });
    }
}
