package com.fems.company;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CompanyWebDesignActivity extends AppCompatActivity {
    private ImageView backView;
    private TextView titleName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_design);
        backView=findViewById(R.id.back_view);
        titleName=findViewById(R.id.title_name);
        titleName.setText("网站建设");
        backView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CompanyWebDesignActivity.this.finish();
            }
        });
    }
}
