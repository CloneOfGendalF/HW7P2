package com.geektech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Magic gendalf = new Magic();
        gendalf.setHp(100);
        gendalf.setDmg(10);
        gendalf.setSpt("Ты не пройдешь!");





        Medic arven = new Medic();
        arven.setHp(150);
        arven.setDmg(0);
        arven.setSpt("Я тебя вылечу");



        Warrior boromir = new Warrior();
        boromir.setHp(125);
        boromir.setDmg(20);
        boromir.setSpt("Атакую цель!");

        boromir.applySuperAbility();
        arven.applySuperAbility();
        gendalf.applySuperAbility();

        Hero[] heroes = {gendalf,boromir,arven};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("Spt"); }


        }





}





