package com.eduarte.labexerno4_eduarte;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CompanyAdaptors extends ArrayAdapter<Company> {
    Context companyContext;
    int companyResource;


    public CompanyAdaptors(@NonNull Context context, int resource, @NonNull List<Company> objects) {
        super(context, resource, objects);
        companyContext = context;
        companyResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int image = getItem(position).getCompanyLogo();
        String companyName = getItem(position).getCompanyNames();
        String companyCountries = getItem(position).getCompanyCountry();
        String companyIndustries = getItem(position).getCompanyIndustry();
        String companyCEOs = getItem(position).getCompanyCEO();

        LayoutInflater inflater = LayoutInflater.from(companyContext);
        convertView = inflater.inflate(companyResource, parent, false);

        TextView tvName = convertView.findViewById(R.id.textView);
        TextView tvCountry = convertView.findViewById(R.id.textView2);
        TextView tvIndustry = convertView.findViewById(R.id.textView3);
        TextView tvCEO = convertView.findViewById(R.id.textView4);
        ImageView ivLogo = convertView.findViewById(R.id.imageView);

        ivLogo.setImageResource(image);
        tvName.setText(companyName);
        tvCountry.setText(companyCountries);
        tvIndustry.setText(companyIndustries);
        tvCEO.setText(companyCEOs);

        return convertView;
    }
}

