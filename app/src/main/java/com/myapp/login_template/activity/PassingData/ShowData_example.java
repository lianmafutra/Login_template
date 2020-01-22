package com.myapp.login_template.activity.PassingData;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.myapp.login_template.R;
import com.myapp.login_template.model.ModelParcelable_example;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowData_example extends AppCompatActivity {
    ModelParcelable_example model;
    @BindView(R.id.tv_data)
    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        ButterKnife.bind(this);
        model = getIntent().getParcelableExtra("key_data");

        if (getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            tvData.setText(bundle.getString("key_data"));
        }
        if (model!=null) {
            tvData.setText(model.getNama() + ", " + model.getAgama() + ", " + model.getAlamat() + ", " + model.getHobi());
        } else {
            tvData.setText(getIntent().getStringExtra("key_data"));
        }
    }
}
