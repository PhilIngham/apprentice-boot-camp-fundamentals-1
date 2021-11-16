package cards;

public class AnimalCard implements Card {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    public String getFaceValue() { return animal.toString(); }

    public boolean snap(Card otherCard){
        return otherCard != null && this.getFaceValue().equals(otherCard.getFaceValue());
    }

    @Override
    public String toString() {
        return animal.toString();
    }


}
