package com.myapp.login_template.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.myapp.login_template.R;
import com.myapp.login_template.utils.MyToastShow;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements Validator.ValidationListener {

    Context ctx = MainActivity.this;

    @NotEmpty
    @BindView(R.id.et_username)
    TextInputEditText et_username;

    @NotEmpty
    @BindView(R.id.et_password)
    TextInputEditText et_password;
    Validator validator;
    MyToastShow toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        validator = new Validator(this);
        validator.setValidationListener(this);
        toast = new MyToastShow(this);
    }



    @OnClick(R.id.btn_login)
    void btn_login() {
        validator.validate();
    }

    @Override
    public void onValidationSucceeded() {
        toast.show("Login Succes");

        startActivity(new Intent(this, list_example.class));
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {
        for (ValidationError error : errors) {
            View view = error.getView();
            String message = error.getCollatedErrorMessage(this);
            if (view instanceof EditText) {
                ((EditText) view).setError(message);
            } else {
                Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            }
        }
    }
}
