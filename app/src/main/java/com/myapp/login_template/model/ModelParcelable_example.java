package com.myapp.login_template.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelParcelable_example implements Parcelable {
    String nama;
    String hobi;
    String alamat;
    String agama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.hobi);
        dest.writeString(this.alamat);
        dest.writeString(this.agama);
    }

    public ModelParcelable_example() {
    }

    protected ModelParcelable_example(Parcel in) {
        this.nama = in.readString();
        this.hobi = in.readString();
        this.alamat = in.readString();
        this.agama = in.readString();
    }

    public static final Parcelable.Creator<ModelParcelable_example> CREATOR = new Parcelable.Creator<ModelParcelable_example>() {
        @Override
        public ModelParcelable_example createFromParcel(Parcel source) {
            return new ModelParcelable_example(source);
        }

        @Override
        public ModelParcelable_example[] newArray(int size) {
            return new ModelParcelable_example[size];
        }
    };
}
