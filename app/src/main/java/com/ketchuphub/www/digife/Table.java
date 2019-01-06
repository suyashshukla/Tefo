package com.ketchuphub.www.digife;

public class Table {

    String table;
    String name;
    String amount;

    public Table(String table,String name,String amount){

        this.table = table;
        this.name = name;
        this.amount = amount;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public String getTable() {
        return table;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setTable(String table) {
        this.table = table;
    }
}
