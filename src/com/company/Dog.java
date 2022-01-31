package com.company;

import java.util.Arrays;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog(String name, String breed, Enum_Color color,
               Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, Enum_Color color,
               Shelter shelter, String[] commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(){
        System.out.println("Gav Gav");
    }

    public void makeVoice(String voice){
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nCommands: " + Arrays.toString(commands);
    }
}
