package br.edu.up.allanhousequest.models;

public class Potion extends Item{
    private int potionDice;
    private int potionDiceQuantity;

    //Constructor
    public Potion(String name, int level, int potionDice, int potionDiceQuantity) {
        super(name, level);
        this.potionDice = potionDice;
        this.potionDiceQuantity = potionDiceQuantity;
    }

    //Getters and Setters
    public int getPotionDice() {
        return potionDice;
    }

    public void setPotionDice(int potionDice) {
        this.potionDice = potionDice;
    }

    public int getPotionDiceQuantity() {
        return potionDiceQuantity;
    }

    public void setPotionDiceQuantity(int potionDiceQuantity) {
        this.potionDiceQuantity = potionDiceQuantity;
    }

    //Methods
    @Override
    public String toString() {
        return super.getName() + "\nNível: " + super.getLevel() + "\nDado: " + potionDice + "\nQuant. dados: " + potionDiceQuantity;
    }
}
