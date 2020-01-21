package com.myapp.login_template.utils;

import android.content.Context;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

import com.myapp.login_template.R;

public class MyAlertDialog {

    public static final String SUKSES="sukses";
    public static final String GAGAL="gagal";

    public MyAlertDialog(Context ctx) {
        this.ctx = ctx;
    }

    Context ctx;


    public void showDialog(String status) {
        if (status.equals(SUKSES)){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ctx);
            alertDialogBuilder
                    .setMessage("Berhasil")
                    .setIcon(R.mipmap.ic_launcher)
                    .setCancelable(false)
                    .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        }
                    })
                    .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if (status.equals(GAGAL)){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ctx);
            alertDialogBuilder
                    .setMessage("Gagal")
                    .setIcon(R.mipmap.ic_launcher)
                    .setCancelable(false)
                    .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        }
                    })
                    .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }

    }
}
