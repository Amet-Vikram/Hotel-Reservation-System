package com.bridgelabz;

public class Hotels {
    String name;
    private Integer RATING;
    private Integer WD_REGULAR;
    private Integer WD_REWARD;
    private Integer WE_REGULAR;
    private Integer WE_REWARD;

    Hotels(){}

    public Hotels(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRATING() {
        return RATING;
    }

    public void setRATING(Integer RATING) {
        this.RATING = RATING;
    }

    public Integer getWD_REGULAR() {
        return WD_REGULAR;
    }

    public void setWD_REGULAR(Integer WD_REGULAR) {
        this.WD_REGULAR = WD_REGULAR;
    }

    public Integer getWD_REWARD() {
        return WD_REWARD;
    }

    public void setWD_REWARD(Integer WD_REWARD) {
        this.WD_REWARD = WD_REWARD;
    }

    public Integer getWE_REGULAR() {
        return WE_REGULAR;
    }

    public void setWE_REGULAR(Integer WE_REGULAR) {
        this.WE_REGULAR = WE_REGULAR;
    }

    public Integer getWE_REWARD() {
        return WE_REWARD;
    }

    public void setWE_REWARD(Integer WE_REWARD) {
        this.WE_REWARD = WE_REWARD;
    }
}
