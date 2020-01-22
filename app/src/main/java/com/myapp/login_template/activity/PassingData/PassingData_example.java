package com.myapp.login_template.activity.PassingData;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.myapp.login_template.R;
import com.myapp.login_template.model.ModelParcelable_example;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PassingData_example extends AppCompatActivity {

    ModelParcelable_example model ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_example);
        ButterKnife.bind(this);
        ButterKnife.bind(this);
        isidata();
    }

    //2 cara Mengirim data antar Activity dengan bundle dan intent
    //support type data : integer, float, double,ArrayList, boolean, array, character

    @OnClick({R.id.btn_intent, R.id.btn_bundle, R.id.btn_parcelable})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_intent:
                Intent intent1 = new Intent(this, ShowData_example.class);
                intent1.putExtra("key_data", "ini data dari intent");
                startActivity(intent1);
                break;
            case R.id.btn_bundle:
                Bundle bundle = new Bundle(); //dibungkus didalam bundle
                bundle.putString("key_data", "ini data dari bundle");
                Intent intent2 = new Intent(this, ShowData_example.class);
                intent2.putExtras(bundle);
                startActivity(intent2);
                break;
            case R.id.btn_parcelable:
                Intent i = new Intent(this, ShowData_example.class);
                i.putExtra("key_data", model);
                startActivity(i);
                break;
        }
    }

    //isi model data passing with parcelable
    private void isidata(){
        model = new ModelParcelable_example();
        model.setNama("Lian Mafutra");
        model.setAlamat("Inilah Jalan yang harus aku lalui");
        model.setAgama("Islam");
        model.setHobi("Programmer");
    }




}
