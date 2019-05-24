package main.flyweight.model;

public class CharacterC extends EnglishCharacter {

    public CharacterC(){
        symbol = 'C';
        width = 40;
        height = 50;
    }

    @Override
    public void printCharacter() {
        System.out.println("Simbol = " + symbol + " Width = " + width + " Height = " + height);
    }

}
