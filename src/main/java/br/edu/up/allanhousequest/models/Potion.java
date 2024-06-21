package br.edu.up.allanhousequest.models;

public class Potion extends Item{
    private Type type;
    private int potionDice;
    private int potionDiceQuantity;

    public enum Type {
        HEALING, ATTACK, DEFENSE, DAMAGE;
    }

    //Constructor
    public Potion(String name, int level, int potionDice, int potionDiceQuantity){
        super(name, level);
        this.potionDice = potionDice;
        this.potionDiceQuantity = potionDiceQuantity;
    }

    //Getters and Setters
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

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
    public void useItem(Player player) {
    }
}
