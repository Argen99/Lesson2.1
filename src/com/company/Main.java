package com.company;

public class Main {

    public static void main(String[] args) {

        Shelter shelter = new Shelter("Shelter",
                "ул. Манаса 12");

        Shelter romashka = new Shelter("Romashka",
                "ул. Ленина 46");

        Dog sharik = new Dog("Sharik", "Brodyaga",
                Enum_Color.WHITE, shelter);
        System.out.println(sharik.getInfo());
        sharik.makeVoice();

        Dog sosiska = new Dog("Sosiska", "Taksa",
                Enum_Color.BLACK, romashka,
                new String[]{"Сидеть","Лежать"});
        System.out.println(sosiska.getInfo());
        sosiska.makeVoice("Rrrrr");

        Dog balto = new Dog("Balto", "Wolf",
                Enum_Color.GRAY,shelter,new String[]{"Голос","Домой"});
        System.out.println(balto.getInfo());
        balto.makeVoice("Guv Guv");

    }
}
