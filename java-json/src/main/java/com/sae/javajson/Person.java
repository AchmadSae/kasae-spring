package com.sae.javajson;

import java.util.List;

public class Person {

    private String id;
    private String name;

    private List<String> dreamsWork;

    public List<String> getDreamsWork() {
        return dreamsWork;
    }

    public void setDreamsWork(List<String> dreamsWork) {
        this.dreamsWork = dreamsWork;
    }


    private String adress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
