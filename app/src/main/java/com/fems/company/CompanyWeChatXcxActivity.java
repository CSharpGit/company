package com.fems.company;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CompanyWeChatXcxActivity extends AppCompatActivity {
    private ImageView backView;
    private TextView titleName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wechat_xcx);
        backView=findViewById(R.id.back_view);
        titleName=findViewById(R.id.title_name);
        titleName.setText("微信小程序");
        backView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CompanyWeChatXcxActivity.this.finish();
            }
        });
    }
}
