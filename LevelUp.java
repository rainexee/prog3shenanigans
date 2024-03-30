public class LevelUp {
    private int LEVEL;
    private int HEALTH;
    private int RUNES;
    private int ENDURANCE;
    private int DEXTERITY;
    private int STRENGTH;
    private int INTELLIGENCE;
    private int FAITH;
    public LevelUp(int LEVEL, int HEALTH, int RUNES, int ENDURANCE, int DEXTERITY,
                   int STRENGTH, int INTELLIGENCE, int FAITH) {
        this.LEVEL = LEVEL;
        this.HEALTH = HEALTH;
        this.RUNES = RUNES;
        this.ENDURANCE = ENDURANCE;
        this.DEXTERITY = DEXTERITY;
        this.STRENGTH = STRENGTH;
        this.INTELLIGENCE = INTELLIGENCE;
        this.FAITH = FAITH;
    }

    void levelUp() {
        int runeCost = (LEVEL * 100) / 2;

        System.out.println("\t\t\t\t HEALTH: " + HEALTH + "\t ENDURANCE: " + ENDURANCE);
        System.out.println("\t\t\t\t DEXTERITY: " + DEXTERITY + "\t STRENGTH: " + STRENGTH);
        System.out.println("\t\t\t\t INTELLIGENCE: " + INTELLIGENCE + "\t FAITH: " + FAITH);
        System.out.println("\n\t\t\t\t COST: " + runeCost);
        System.out.println("\t\t\t\t RUNES: " + RUNES);
        System.out.println("Choose a stat to LEVEL up");
        System.out.println("\t\t\t\t [1] LEVEL HEALTH");
        System.out.println("\t\t\t\t [2] LEVEL ENDURANCE");
        System.out.println("\t\t\t\t [3] LEVEL DEXTERITY");
        System.out.println("\t\t\t\t [4] LEVEL STRENGTH");
        System.out.println("\t\t\t\t [5] LEVEL INTELLIGENCE");
        System.out.println("\t\t\t\t [6] LEVEL FAITH");
        System.out.println("\t\t\t\t [7] BACK");

        int choice = UserInput.getUserChoice(7);

        switch (choice) {
            case 1:
                // For leveling up Health stat
                if (RUNES < runeCost) {
                    System.out.println("You do not have enough runes!");
                    levelUp();
                } else {
                    if (HEALTH == 50) {
                        System.out.println("Your HEALTH is already maxed!");
                        levelUp();
                    } else {
                        RUNES -= runeCost;
                        HEALTH++;
                        LEVEL++;
                        System.out.printf("Your HEALTH is now %d!\n", HEALTH);
                        levelUp();
                    }
                }
                break;
            case 2:
                // For leveling up Endurance stat
                if (RUNES < runeCost) {
                    System.out.println("You do not have enough runes!");
                    levelUp();
                } else {
                    if (ENDURANCE == 50) {
                        System.out.println("Your ENDURANCE is already maxed!");
                        levelUp();
                    } else {
                        RUNES -= runeCost;
                        ENDURANCE++;
                        LEVEL++;
                        System.out.printf("Your ENDURANCE is now %d!\n", ENDURANCE);
                        levelUp();
                    }
                }
                break;
            case 3:
                // For leveling up Dexterity stat
                if (RUNES < runeCost) {
                    System.out.println("You do not have enough runes!");
                    levelUp();
                } else {
                    if (DEXTERITY == 50) {
                        System.out.println("Your DEXTERITY is already maxed!");
                        levelUp();
                    } else {
                        RUNES -= runeCost;
                        DEXTERITY++;
                        LEVEL++;
                        System.out.printf("Your DEXTERITY is now %d!\n", DEXTERITY);
                        levelUp();
                    }
                }
                break;
            case 4:
                // For leveling up Strength stat
                if (RUNES < runeCost) {
                    System.out.println("You do not have enough runes!");
                    levelUp();
                } else {
                    if (STRENGTH == 50) {
                        System.out.println("Your STRENGTH is already maxed!");
                        levelUp();
                    } else {
                        RUNES -= runeCost;
                        STRENGTH++;
                        LEVEL++;
                        System.out.printf("Your STRENGTH is now %d!\n", STRENGTH);
                        levelUp();
                    }
                }
                break;
            case 5:
                // For leveling up Intelligence stat
                if (RUNES < runeCost) {
                    System.out.println("You do not have enough runes!");
                    levelUp();
                } else {
                    if (INTELLIGENCE == 50) {
                        System.out.println("Your INTELLIGENCE is already maxed!");
                        levelUp();
                    } else {
                        RUNES -= runeCost;
                        INTELLIGENCE++;
                        LEVEL++;
                        System.out.printf("Your INTELLIGENCE is now %d!\n", INTELLIGENCE);
                        levelUp();
                    }
                }
                break;
            case 6:
                // For leveling up Faith stat
                if (RUNES < runeCost) {
                    System.out.println("You do not have enough runes!");
                    levelUp();
                } else {
                    if (FAITH == 50) {
                        System.out.println("Your FAITH is already maxed!");
                        levelUp();
                    } else {
                        RUNES -= runeCost;
                        FAITH++;
                        LEVEL++;
                        System.out.printf("Your FAITH is now %d!\n", FAITH);
                        levelUp();
                    }
                }
                break;
            case 7:
            GameLobby gameLobby = new GameLobby("", "", LEVEL, HEALTH, DEXTERITY, INTELLIGENCE, ENDURANCE, STRENGTH, FAITH);
            gameLobby.display();
                break;
            default:
                levelUp();
                break;
        }
    }
}
