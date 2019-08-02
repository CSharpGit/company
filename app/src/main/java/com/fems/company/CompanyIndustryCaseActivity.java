package com.fems.company;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CompanyIndustryCaseActivity extends CompanyBasicActivity {
    private ImageView backView;
    private TextView titleName;
    private RecyclerView recyclerView;
    private List<String> listData;
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
        for (int i=1;i<=5;i++){
            listData.add("案例"+i);
        }
        mAdapter=new CompanyIndustryCaseAdapter(CompanyIndustryCaseActivity.this,listData);
        StaggeredGridLayoutManager staggered=new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggered);
        recyclerView.setAdapter(mAdapter);
    }

    private void initData() {
        Intent intent=getIntent();
        String industryName=intent.getStringExtra("industryName");
        titleName.setText(industryName);
    }

    private void initEvent() {
        backView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CompanyIndustryCaseActivity.this.finish();
            }
        });
    }
}
