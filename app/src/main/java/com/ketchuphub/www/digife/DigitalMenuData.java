package com.ketchuphub.www.digife;

public class DigitalMenuData {

    String name;
    int resource;
    String amount;

    DigitalMenuData(String name,String amount,int resource){

        this.name = name;
        this.amount = amount;
        this.resource = resource;

    }

    public String getName() {
        return name;
    }

    public int getResource() {
        return resource;
    }

    public String getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
