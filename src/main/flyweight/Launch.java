package main.flyweight;

import main.flyweight.factory.FlyweightFactory;
import main.flyweight.model.EnglishCharacter;

public class Launch {

    public static void main (String [] args){
        FlyweightFactory factory = new FlyweightFactory();
        int [] characterCodes = {1,2,3};
        for (int nextCode : characterCodes){
            EnglishCharacter character = factory.getCharacter(nextCode);
            character.printCharacter();
        }
    }
}
