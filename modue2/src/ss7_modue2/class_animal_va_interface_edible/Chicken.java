package ss7_modue2.class_animal_va_interface_edible;

import ss7_modue2.edible.Edible;

public class Chicken extends Animal implements Edible {


    @Override
    public String makeSound() {
        return "Chicken : chíp chip";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
