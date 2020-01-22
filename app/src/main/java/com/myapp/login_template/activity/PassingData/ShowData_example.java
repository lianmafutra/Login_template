package com.myapp.login_template.activity.PassingData;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.myapp.login_template.R;
import com.myapp.login_template.model.ModelParcelable_example;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowData_example extends AppCompatActivity {

    ModelParcelable_example model;
    public static String KEY_DATA = "key_data";
    @BindView(R.id.tv_data)
    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        ButterKnife.bind(this);
        model = getIntent().getParcelableExtra("key_data");
        initToolbar();
        if (getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            tvData.setText(bundle.getString("key_data"));
        }
        if (model != null) {
            tvData.setText(model.getNama() + ", " + model.getAgama() + ", " + model.getAlamat() + ", " + model.getHobi());
        } else {
            tvData.setText(getIntent().getStringExtra(KEY_DATA));
        }
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Passing Data Activity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
