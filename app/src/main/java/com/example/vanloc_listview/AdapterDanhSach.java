package com.example.vanloc_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdapterDanhSach extends ArrayAdapter<DanhSach> {
        Context context;
        int res;
        ArrayList<DanhSach> listDanhba;
        public AdapterDanhSach(@NonNull Context context, int resource, @NonNull ArrayList<DanhSach> objects) {
            super(context, resource, objects);
            this.context=context;
            this.res=resource;
            this.listDanhba=objects;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if(convertView == null)
                convertView= LayoutInflater.from(context).inflate(res,parent,false);
            TextView ten=convertView.findViewById(R.id.lop);
            ImageView logo=convertView.findViewById(R.id.logocaothang);
            TextView ca=convertView.findViewById(R.id.ca);
            ImageView muiten=convertView.findViewById(R.id.muiten);

            DanhSach db=listDanhba.get(position);
            int anh=db.getLogo();
            logo.setImageResource(anh);
            String name=db.getTen();
            ten.setText(name);
            String soca=db.getCa();
            ca.setText(soca);
            int anh2= db.getMuiten();
            muiten.setImageResource(anh2);
            return convertView;
        }
    }