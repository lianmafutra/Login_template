package com.myapp.login_template.utils;

import android.content.Context;
import android.widget.Toast;

public class MyToastShow {
    Context ctx;

    public MyToastShow(Context ctx) {
        this.ctx = ctx;
    }
    public void show(String message) {
        Toast.makeText(ctx, message, Toast.LENGTH_LONG).show();
    }
}
