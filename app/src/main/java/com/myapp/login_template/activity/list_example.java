package com.myapp.login_template.activity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.dinuscxj.refresh.RecyclerRefreshLayout;
import com.myapp.login_template.R;
import com.myapp.login_template.utils.MyAlertDialog;
import com.myapp.login_template.utils.MyToastShow;

import butterknife.BindView;
import butterknife.ButterKnife;

public class list_example extends AppCompatActivity {

    @BindView(R.id.progressBar_example)
    ProgressBar progressBarExample;
    @BindView(R.id.tv_nodata)
    TextView tvNodata;
    @BindView(R.id.rv_example)
    RecyclerView rvExample;
    @BindView(R.id.refresh_layout)
    RecyclerRefreshLayout refreshLayout;
    MyAlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_example);
        ButterKnife.bind(this);
        alertDialog = new MyAlertDialog(this);

        alertDialog.showDialog(MyAlertDialog.GAGAL);
    }
}
