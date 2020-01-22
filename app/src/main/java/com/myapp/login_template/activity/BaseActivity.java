package com.myapp.login_template.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.myapp.login_template.R;
import com.myapp.login_template.activity.ListActivity.List_example;
import com.myapp.login_template.activity.LoginActivity.LoginActivity;
import com.myapp.login_template.activity.PassingData.PassingData_example;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_passing_data, R.id.btn_login_activity})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_passing_data:
                startActivity(new Intent(this, PassingData_example.class));
                break;
            case R.id.btn_login_activity:
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }
    }
}
