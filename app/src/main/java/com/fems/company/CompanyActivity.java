package com.fems.company;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class CompanyActivity extends AppCompatActivity {
    private LinearLayout compHome,compCase,compChat;//底部导航
    private LinearLayout toWebDesign,toWeChatPub,toWeChatXcx,toWebVisualDesign;//主营业务
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);

        compCase=findViewById(R.id.company_case);
        compChat=findViewById(R.id.company_chat);
        toWebDesign=findViewById(R.id.to_web_design);
        toWeChatPub=findViewById(R.id.to_we_chat_pub);
        toWeChatXcx=findViewById(R.id.to_we_chat_xcx);
        toWebVisualDesign=findViewById(R.id.to_web_visual_design);
        compCase.setOnClickListener(new View.OnClickListener() {
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
    }
}
