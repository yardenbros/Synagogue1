package com.eliorcohen1.synagogue.ButtonsPackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.eliorcohen1.synagogue.CustomAdapterPackage.AdapterResponsible;
import com.eliorcohen1.synagogue.R;
import com.eliorcohen1.synagogue.StartPackage.MainActivity;
import com.eliorcohen1.synagogue.StartPackage.TotalModel;

import java.util.ArrayList;

public class Responsible extends AppCompatActivity implements View.OnClickListener {

    private Button backResponsible;
    private ArrayList<TotalModel> arrayList;
    private RecyclerView rv;
    private AdapterResponsible adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responsible);

        initUI();
        initListeners();
        showUI();
    }

    private void initUI() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        backResponsible = findViewById(R.id.backResponsible);

        rv = findViewById(R.id.listResponsible);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        arrayList = new ArrayList<TotalModel>();
    }

    private void initListeners() {
        backResponsible.setOnClickListener(this);
    }

    private void showUI() {
        arrayList.add(new TotalModel("אבי קריאף", "054-4807328"));
        arrayList.add(new TotalModel("שלום נסים", "052-9426607"));
        arrayList.add(new TotalModel("מוטי כהן", "054-4917147"));
        adapter = new AdapterResponsible(arrayList, this);
        rv.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.backResponsible:
                Intent intent = new Intent(Responsible.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }

}
