package session_abstract_interface.animal_edible;

public class Chicken extends Animal implements IEdible{
    @Override
    protected String makeSound() {
        return "Chicken sound";
    }

    @Override
    public String howtoEat() {
        return "Eat chicken";
    }
}
