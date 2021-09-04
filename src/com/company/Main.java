package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(999);
        boss.setBossDamage(99);
        boss.setBossDefenseType();
        System.out.println("Характеристики Босса:");
        System.out.println("Здоровье " + boss.getBossHealth());
        System.out.println("Урон " + boss.getBossDamage());
        System.out.println("Тип защиты " + boss.getBossDefenseType());

        System.out.println("___________________________");

        Hero hero = new Hero();
        hero.setHeroHealth(500);
        hero.setHeroDamage(50);
        hero.getHeroSuperpower();
    }
}
