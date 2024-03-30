public class TitleScreen {
    public void display() {
        System.out.println("ELDEN ROGUE");
        System.out.println("[1] START");
        System.out.println("[2] EXIT");

        int choice = UserInput.getUserChoice(2);

        switch (choice) {
            case 1:
                CharacterCreation characterCreation = new CharacterCreation();
                characterCreation.createCharacter();
                break;
            case 2:
                System.out.println("Exiting the game. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please input the correct number!");
                display();
        }
    }

}
