package com.company;

public class Hero {
    private int heroHealth = 500;
    private int heroDamage = 50;
    private String heroSuperpower = "'Шаринган'";

    public Hero(String heroSuperpower, int heroDamage, int heroHealth) {
        this.heroDamage = heroDamage;
        this.heroHealth = heroHealth;
        this.heroSuperpower = heroSuperpower;
    }
    public Hero(){
        System.out.println("Характеристики Героя:");
        System.out.println("Здоровье " + heroHealth);
        System.out.println("Урон " + heroDamage);
        System.out.println("Суперспособность " + heroSuperpower);
    }

    public String getHeroSuperpower(){
        return heroSuperpower;
    }
    public void setHeroSuperpower(){
        this.heroSuperpower = heroSuperpower;
    }
    public int getHeroHealth(int i){
        return heroHealth;
    }
    public void setHeroHealth(int i){
        this.heroHealth = heroHealth;
    }
    public int getHeroDamage(){
        return heroDamage;
    }
    public void setHeroDamage(int i){
        this.heroDamage = heroDamage;
    }
}