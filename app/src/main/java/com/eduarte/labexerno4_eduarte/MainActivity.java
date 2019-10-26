package com.eduarte.labexerno4_eduarte;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] companyNames, companyCountry, companyIndustry, companyCEO;
    ListView lists;
    int[] companyLogo = {R.drawable.icbc, R.drawable.jp, R.drawable.chinacon, R.drawable.agri, R.drawable.boa, R.drawable.apple, R.drawable.ping, R.drawable.boc ,R.drawable.shell, R.drawable.wells, R.drawable.exxon, R.drawable.att, R.drawable.samsung, R.drawable.citi};
    ArrayList<Company> companyList = new ArrayList<>();
    String[] companyInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("TOP GLOBAL COMPANIES");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        companyNames = getResources().getStringArray(R.array.companyNames);
        companyCountry = getResources().getStringArray(R.array.companyCountry);
        companyIndustry = getResources().getStringArray(R.array.companyIndustry);
        companyCEO = getResources().getStringArray(R.array.companyCEO);
        companyInfo = getResources().getStringArray(R.array.companyInfo);

        for(int i=0; i < companyNames.length; i++){
            companyList.add(new Company(companyLogo[i], companyNames[i], "Country: " + companyCountry[i], "Industry: " + companyIndustry[i], "CEO: " + companyCEO[i]));
        }

        lists = findViewById(R.id.listView);

        ArrayAdapter androidArrayAdapter = new CompanyAdaptors(this, R.layout.item, companyList);

        lists.setAdapter(androidArrayAdapter);
        lists.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
        final AlertDialog.Builder myDialog = new AlertDialog.Builder(this);
        myDialog.setTitle(companyList.get(position).getCompanyNames());
        myDialog.setIcon(companyList.get(position).getCompanyLogo());
        myDialog.setMessage(companyInfo[position]);
        myDialog.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, companyNames[position], Toast.LENGTH_LONG).show();
            }
        });
        myDialog.create().show();
    }
}

