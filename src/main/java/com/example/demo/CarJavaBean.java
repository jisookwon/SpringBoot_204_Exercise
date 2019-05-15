package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CarJavaBean {
    @NotNull
    @Size(min=3, max=20)
    private String name;
    @NotNull
    @Size(min=3, max=10)
    private String type;
    @NotNull
    @Size(min=10, max=30)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
