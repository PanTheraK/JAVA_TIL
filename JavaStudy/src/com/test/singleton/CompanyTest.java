package com.test.singleton;

public class CompanyTest {
    public static void main(String[] args) {
        
        Company myCompany1 = Company.getInstance();
        Company mycoCompany2 = Company.getInstance();
        System.out.println(myCompany1==mycoCompany2);
    }
}

class Company{
    private static Company instance = new Company();
    private Company(){

    }

    public static Company getInstance(){
        if(instance ==null){
            instance = new Company();
        }
        return instance;
    }
}
