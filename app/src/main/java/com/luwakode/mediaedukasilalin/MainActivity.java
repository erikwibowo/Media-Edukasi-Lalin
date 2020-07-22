package com.luwakode.mediaedukasilalin;

import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.luwakode.mediaedukasilalin.activity.BaseActivity;
import com.luwakode.mediaedukasilalin.activity.Web;

public class MainActivity extends BaseActivity {

    CardView card_pasal, card_denda, card_rambu, card_soal, card_tips, card_keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        findView();
        initView();
        initListener();
    }

    @Override
    public void findView() {
        card_pasal = findViewById(R.id.card_pasal);
        card_denda = findViewById(R.id.card_denda);
        card_rambu = findViewById(R.id.card_rambu);
        card_soal = findViewById(R.id.card_soal);
        card_tips = findViewById(R.id.card_tips);
        card_keluar = findViewById(R.id.card_keluar);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {
        card_pasal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Web.class);
                i.putExtra("judul", "Pasal Pidana");
                i.putExtra("link", "https://lalin.luwakode.com/webview/#/app/pasal");
                startActivity(i);
            }
        });

        card_denda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Web.class);
                i.putExtra("judul", "Denda Pelanggaran");
                i.putExtra("link", "https://lalin.luwakode.com/webview/#/app/denda");
                startActivity(i);
            }
        });

        card_rambu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Web.class);
                i.putExtra("judul", "Rambu-rambu Lalulintas");
                i.putExtra("link", "https://lalin.luwakode.com/webview/#/app/rambu");
                startActivity(i);
            }
        });

        card_soal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Web.class);
                i.putExtra("judul", "Latihan Soal");
                i.putExtra("link", "https://lalin.luwakode.com/webview/#/app/soal");
                startActivity(i);
            }
        });


        card_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Web.class);
                i.putExtra("judul", "Tips Aman Berkendara");
                i.putExtra("link", "https://lalin.luwakode.com/webview/#/app/tips");
                startActivity(i);
            }
        });

        card_keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
