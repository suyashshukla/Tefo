package com.ketchuphub.www.digife;

public class Order {

    String name;
    String amount;

    public Order(String name, String amount){
        this.name = name;
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }


}
