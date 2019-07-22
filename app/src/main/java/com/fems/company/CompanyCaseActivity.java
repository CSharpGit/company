package com.fems.company;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class CompanyCaseActivity extends AppCompatActivity {
    private LinearLayout compHome,compCase,compChat;//底部导航
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anli);

        compHome=findViewById(R.id.company_home);
        compChat=findViewById(R.id.company_chat);
        compHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyCaseActivity.this,CompanyActivity.class);
                CompanyCaseActivity.this.startActivity(intent);
            }
        });
    }
}
