public class Item {
    private String name;
    private int dexterityRequirement;
    private int health;
    private int endurance;
    private int strength;
    private int intelligence;
    private int faith;
    private int runeCost;

    // Constructor
    public Item(String name, int dexterityRequirement, int health, int endurance, int strength, int intelligence, int faith, int runeCost) {
        this.name = name;
        this.dexterityRequirement = dexterityRequirement;
        this.health = health;
        this.endurance = endurance;
        this.strength = strength;
        this.intelligence = intelligence;
        this.faith = faith;
        this.runeCost = runeCost;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDexterityRequirement() {
        return dexterityRequirement;
    }

    public void setDexterityRequirement(int dexterityRequirement) {
        this.dexterityRequirement = dexterityRequirement;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getFaith() {
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public int getRuneCost() {
        return runeCost;
    }

    public void setRuneCost(int runeCost) {
        this.runeCost = runeCost;
    }
}
