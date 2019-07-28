package com.fems.company;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class CompanySolutionOfKtvActivity extends CompanyBasicActivity {
    private ImageView backView;
    private TextView titleName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fangan_ktv);
        backView=findViewById(R.id.back_view);
        titleName=findViewById(R.id.title_name);
        titleName.setText("KTV解决方案");
        backView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CompanySolutionOfKtvActivity.this.finish();
            }
        });
    }
}