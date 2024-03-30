import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GameLobby {
  private List<Item> inventoryItems = new ArrayList<>();
  private List<Item> shopItems;
    private Scanner scanner;

    String NAME = "";
    String JOB = "";
    int LEVEL = 1;
    int RUNES = 0;
    int HEALTH = 0, DEXTERITY = 0, INTELLIGENCE = 0, ENDURANCE = 0, STRENGTH = 0, FAITH = 0;


    public GameLobby(String NAME, String JOB, int LEVEL, int HEALTH, int DEXTERITY, int INTELLIGENCE, int ENDURANCE, int STRENGTH, int FAITH) {

        this.NAME = NAME;
        this.JOB = JOB;
        this.LEVEL = LEVEL;
        this.HEALTH = HEALTH;
        this.DEXTERITY = DEXTERITY;
        this.INTELLIGENCE = INTELLIGENCE;
        this.ENDURANCE = ENDURANCE;
        this.STRENGTH = STRENGTH;
        this.FAITH = FAITH;

        this.shopItems = new ArrayList<>();
        // Add shop items here

        this.scanner = new Scanner(System.in);
    }
    
    public void display() {
        System.out.println(" GAME LOBBY ");
        System.out.println("[1] FAST TRAVEL");
        System.out.println("[2] LEVEL UP");
        System.out.println("[3] INVENTORY");
        System.out.println("[4] SHOP");
        System.out.println("[5] QUIT GAME");

        int choice = getUserChoice(5);

        switch (choice) {
            case 1:
                fastTravel();
                break;
            case 2:
                Level_Up();
                break;
            case 3:
                Inventory();
                break;
            case 4:
                Shop();
                break;
            case 5:
                System.out.println("\nExiting the game. Goodbye!\n");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice.");
                display();
        }
    }


    void menu(){
        TitleScreen title = new TitleScreen();
        area.update_values(NAME, JOB, LEVEL, HEALTH, DEXTERITY, INTELLIGENCE, ENDURANCE, STRENGTH, FAITH);

        System.out.printf("\t\t\t\t NAME: %s\n", NAME);
        System.out.printf("\t\t\t\t JOB CLASS: %s\n", JOB);
        System.out.printf("\t\t\t\t LEVEL: %d\n", LEVEL);
        System.out.printf("\t\t\t\t RUNES: %d\n\n", RUNES);
        System.out.printf("\t\t\t\t [1] FAST TRAVEL\n");
        System.out.printf("\t\t\t\t [2] LEVEL UP\n");
        System.out.printf("\t\t\t\t [3] INVENTORY\n");
        System.out.printf("\t\t\t\t [4] SHOP\n");
        System.out.printf("\t\t\t\t [5] QUIT GAME\n");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                fastTravel();
                break;
            case 2:
            Level_Up();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                title.display();
                break;
            default:
                menu();
                break;
        }
    }

    private void Inventory() {
        System.out.println("Inventory:");
        // Display inventory items
        displayInventory();
    
        // Allow player to select an item
        int choice = getUserChoice(inventoryItems.size());
    
        // Perform actions based on the selected item
        if (choice >= 1 && choice <= inventoryItems.size()) {
            Item selected = inventoryItems.get(choice - 1);
            equipItem(selected); // Equip the selected item or perform other actions
        } else {
            System.out.println("Invalid choice.");
        }
    
        // After inventory actions are done, go back to the main lobby
        display();
    }
    
    private void Shop() {
        System.out.println("Shop:");
        // Implement shop feature here
    
        // Display shop items
        System.out.println("1. Sword - 50 runes");
        System.out.println("2. Bow - 50 runes");
        System.out.println("3. Staff - 50 runes");
        System.out.println("4. Back");
    
        // Allow player to select an item to purchase
        int choice = getUserChoice(4); // Assuming there are 4 items for now
    
        // Perform actions based on the selected item
        switch (choice) {
            case 1:
                if (RUNES >= 50) {
                    // Deduct 50 runes
                    RUNES -= 50;
                    // Add sword to inventory or perform other actions
                    System.out.println("You purchased the Sword!");
                } else {
                    System.out.println("You don't have enough runes to purchase the Sword!");
                }
                break;
            case 2:
                if (RUNES >= 50) {
                    // Deduct 50 runes
                    RUNES -= 50;
                    // Add bow to inventory or perform other actions
                    System.out.println("You purchased the Bow!");
                } else {
                    System.out.println("You don't have enough runes to purchase the Bow!");
                }
                break;
            case 3:
                if (RUNES >= 50) {
                    // Deduct 50 runes
                    RUNES -= 50;
                    // Add staff to inventory or perform other actions
                    System.out.println("You purchased the Staff!");
                } else {
                    System.out.println("You don't have enough runes to purchase the Staff!");
                }
                break;
            case 4:
                display(); // Go back to the main lobby
                return; // Return to avoid displaying "Invalid choice." message
            default:
                System.out.println("Invalid choice.");
                Shop(); // Prompt for input again
                return; // Return to avoid displaying "Invalid choice." message
        }
    
        // After shopping actions are done, go back to the main lobby
        display();
    }
    
    
    // Method to display inventory items
    private void displayInventory() {
        for (int i = 0; i < inventoryItems.size(); i++) {
            Item item = inventoryItems.get(i);
            System.out.printf("%d. %s\n", i + 1, item.getName());
        }
    }
    
    // Method to display shop items
    private void displayShopItems() {
        for (int i = 0; i < shopItems.size(); i++) {
            Item item = shopItems.get(i);
            System.out.printf("%d. %s - %d runes\n", i + 1, item.getName(), item.getRuneCost());
        }
    }
    
    // Method to equip an item from inventory
    private void equipItem(Item item) {
        // Implement logic to equip the item
        System.out.printf("Equipped %s\n", item.getName());
    }
    
    // Method to purchase an item from the shop
    private void purchaseItem(Item item) {
        if (RUNES >= item.getRuneCost()) {
            // Deduct runes, add item to inventory, etc.
            RUNES -= item.getRuneCost();
            inventoryItems.add(item);
            System.out.printf("Purchased %s\n", item.getName());
        } else {
            System.out.println("You don't have enough runes to purchase this item.");
        }
    }
    

    private void fastTravel() {
        System.out.println("Fast Travel Options:");
        System.out.println("1. Stormveil Castle");
        System.out.println("2. Raya Lucaria Academy");
        System.out.println("3. The Elden Throne");
        System.out.println("4. Back");
        int choice = getUserChoice(3);

        switch (choice) {
            case 1:
                System.out.println("\nYou are fast travelling to Stormveil Castle...\n");
                area.Floor_1();
                break;
            case 2:
                System.out.println("\nFast Travel to Raya Lucaria Academy coming soon!\n");
                fastTravel();
                break;
            case 3:
                System.out.println("\nThe Elden Throne is currently locked.\n");
                fastTravel();
                break;
            case 4:
                display();
                break;
            default:
                System.out.println("\nInvalid choice.\n");
                fastTravel();
                break;
        }
    }

    AREA_1 area = new AREA_1(NAME, JOB, LEVEL, HEALTH, DEXTERITY, INTELLIGENCE, ENDURANCE, STRENGTH, FAITH);

    private void Level_Up() {
        int runeCost = (LEVEL * 100) / 2;
    
        System.out.println("\t\t\t\t HEALTH: " + HEALTH + "\t ENDURANCE: " + ENDURANCE);
        System.out.println("\t\t\t\t DEXTERITY: " + DEXTERITY + "\t STRENGTH: " + STRENGTH);
        System.out.println("\t\t\t\t INTELLIGENCE: " + INTELLIGENCE + "\t FAITH: " + FAITH);
        System.out.println("\n\t\t\t\t COST: " + runeCost);
        System.out.println("\t\t\t\t RUNES: " + RUNES);
        System.out.println("Choose a stat to LEVEL up");
        System.out.println("\t\t\t\t [1] LEVEL HEALTH");
        System.out.println("\t\t\t\t [2] LEVEL ENDURANCE");
        System.out.println("\t\t\t\t [3] LEVEL DEXTERITYTERITY");
        System.out.println("\t\t\t\t [4] LEVEL STRENGTH");
        System.out.println("\t\t\t\t [5] LEVEL INTELLIGENCE");
        System.out.println("\t\t\t\t [6] LEVEL FAITH");
        System.out.println("\t\t\t\t [7] BACK");
    
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                // For leveling up Health stat
                if (RUNES < runeCost) {
                    System.out.println("You do not have enough runes!");
                    Level_Up();
                } else {
                    if (HEALTH == 50) {
                        System.out.println("Your HEALTH is already maxed!");
                        Level_Up();
                    } else {
                        RUNES -= runeCost;
                        HEALTH++;
                        LEVEL++;
                        System.out.printf("Your HEALTH is now %d!\n", HEALTH);
                        Level_Up();
                    }
                }
                break;
            case 2:
                // For leveling up Endurance stat
                if (RUNES < runeCost) {
                    System.out.println("You do not have enough runes!");
                    Level_Up();
                } else {
                    if (ENDURANCE == 50) {
                        System.out.println("Your ENDURANCE is already maxed!");
                        Level_Up();
                    } else {
                        RUNES -= runeCost;
                        ENDURANCE++;
                        LEVEL++;
                        System.out.printf("Your ENDURANCE is now %d!\n", ENDURANCE);
                        Level_Up();
                    }
                }
                break;
            case 3:
                // For leveling up Dexterity stat
                if (RUNES < runeCost) {
                    System.out.println("You do not have enough runes!");
                    Level_Up();
                } else {
                    if (DEXTERITY == 50) {
                        System.out.println("Your DEXTERITY is already maxed!");
                        Level_Up();
                    } else {
                        RUNES -= runeCost;
                        DEXTERITY++;
                        LEVEL++;
                        System.out.printf("Your DEXTERITY is now %d!\n", DEXTERITY);
                        Level_Up();
                    }
                }
                break;
            case 4:
                // For leveling up Strength stat
                if (RUNES < runeCost) {
                    System.out.println("You do not have enough runes!");
                    Level_Up();
                } else {
                    if (STRENGTH == 50) {
                        System.out.println("Your STRENGTH is already maxed!");
                        Level_Up();
                    } else {
                        RUNES -= runeCost;
                        STRENGTH++;
                        LEVEL++;
                        System.out.printf("Your STRENGTH is now %d!\n", STRENGTH);
                        Level_Up();
                    }
                }
                break;
            case 5:
                // For leveling up DIntelligence stat
                if (RUNES < runeCost) {
                    System.out.println("You do not have enough runes!");
                    Level_Up();
                } else {
                    if (INTELLIGENCE == 50) {
                        System.out.println("Your INTELLIGENCE is already maxed!");
                        Level_Up();
                    } else {
                        RUNES -= runeCost;
                        INTELLIGENCE++;
                        LEVEL++;
                        System.out.printf("Your INTELLIGENCE is now %d!\n", INTELLIGENCE);
                        Level_Up();
                    }
                }
                break;
            case 6:
                // For leveling up Faith stat
                if (RUNES < runeCost) {
                    System.out.println("You do not have enough runes!");
                    Level_Up();
                } else {
                    if (FAITH == 50) {
                        System.out.println("Your FAITH is already maxed!");
                        Level_Up();
                    } else {
                        RUNES -= runeCost;
                        FAITH++;
                        LEVEL++;
                        System.out.printf("Your FAITH is now %d!\n", FAITH);
                        Level_Up();
                    }
                }
                break;
            case 7:
                display();
                break;
            default:
                Level_Up();
                break;
        }
    }
    



    private int getUserChoice(int maxChoice) {
        int choice;
        do {
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            if (choice < 1 || choice > maxChoice) {
                System.out.println("Invalid choice. Please enter a number between 1 and " + maxChoice + ".");
            }
        } while (choice < 1 || choice > maxChoice);
    
        return choice;
    }
    
}
