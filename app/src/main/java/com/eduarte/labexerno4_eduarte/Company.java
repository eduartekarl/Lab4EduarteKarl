package com.eduarte.labexerno4_eduarte;

public class Company {
    int companyLogo;
    String companyNames, companyCountry, companyIndustry, companyCEO;

    public Company(int companyLogo, String companyNames, String companyCountry, String companyIndustry, String companyCEO) {
        this.companyLogo = companyLogo;
        this.companyNames = companyNames;
        this.companyCountry = companyCountry;
        this.companyIndustry = companyIndustry;
        this.companyCEO = companyCEO;
    }

    public int getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(int companyLogo) {

        this.companyLogo = companyLogo;
    }

    public String getCompanyNames() {

        return companyNames;
    }

    public void setCompanyNames(String companyNames) {

        this.companyNames = companyNames;
    }

    public String getCompanyCountry() {

        return companyCountry;
    }

    public void setCompanyCountry(String companyCountry) {

        this.companyCountry = companyCountry;
    }

    public String getCompanyIndustry() {

        return companyIndustry;
    }

    public void setCompanyIndustry(String companyIndustry) {

        this.companyIndustry = companyIndustry;
    }

    public String getCompanyCEO() {

        return companyCEO;
    }

    public void setCompanyCEO(String companyCEO) {

        this.companyCEO = companyCEO;
    }
}

