package com.ketchuphub.www.digife;

public class DescriptionData {

    String description;
    String name;
    int pic;

    public DescriptionData(String description,String name, int pic){
        this.description = description;
        this.pic = pic;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPic() {
        return pic;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
