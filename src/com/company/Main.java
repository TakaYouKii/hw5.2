package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(500);
        boss.setDefense("magic");
        System.out.println("Boss health:" + boss.getHealth() + " Boss damage: " + boss.getDamage() + " Boss defence: " + boss.getDefense());
        for (Hero hero:creatHeroes()){

            System.out.println(  "Hero health:" + hero.getHealth() + " Hero damage: " +hero.getDamage() + " Hero superpower: " + hero.getSuperpower());

        }
    }

    public static Hero[] creatHeroes() {

        Hero Physical = new Hero(250, 15, "Physical");
        Hero Kinetic = new Hero(230, 10);
        Hero Magical = new Hero(200, 20, "Physical");
        Hero[] heroes = {Physical, Kinetic, Magical};
        return heroes;


    }
}



