package com.example.vanloc_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listdanhsach;
    ArrayList<DanhSach> danhsach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listdanhsach=findViewById(R.id.danhsach);
        danhsach=DanhSach.dulieu();
        AdapterDanhSach adapterDanhBa= new AdapterDanhSach(MainActivity.this,R.layout.item_danhsach,danhsach);
        listdanhsach.setAdapter(adapterDanhBa);
        listdanhsach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String ten;
                ten=danhsach.get(i).getTen();
                Toast.makeText(MainActivity.this,ten,Toast.LENGTH_SHORT).show();
            }
        });
    }
}