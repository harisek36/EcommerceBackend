package com.BestBuyApp.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Brand {

    private String id;
    private String name;
    private String description;

    public Brand(){

    }

    public Brand(String _id, String _name, String _description) {
        this.id = _id;
        this.name = _name;
        this.description = _description;
    }

    public String get_id() {
        return id;
    }

    public void set_id(String _id) {
        this.id = _id;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String _name) {
        this.name = _name;
    }

    public String get_description() {
        return description;
    }

    public void set_description(String _description) {
        this.description = _description;
    }
}
