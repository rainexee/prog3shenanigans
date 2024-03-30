public class CharacterCreation {
    public String NAME = "";
    public String JOB = "";
    public int LEVEL = 1;
    public int HEALTH = 0, DEXTERITY = 0, INTELLIGENCE = 0, ENDURANCE = 0, STRENGTH = 0, FAITH = 0;

    public void createCharacter() {
        TitleScreen title = new TitleScreen();
        GameLobby lobby = new GameLobby(NAME, JOB, LEVEL, HEALTH, DEXTERITY, INTELLIGENCE, ENDURANCE, STRENGTH, FAITH);

        System.out.println("\n========================================================");
        System.out.printf("NAME: %s\n", NAME);
        System.out.printf("JOB CLASS: %s\n", JOB);
        System.out.printf("LEVEL: %d\n", LEVEL);
        System.out.printf("HEALTH: %d\n", HEALTH);
        System.out.printf("DEXTERITY: %d\n", DEXTERITY);
        System.out.printf("INTELLIGENCE: %d\n", INTELLIGENCE);
        System.out.printf("ENDURANCE: %d\n", ENDURANCE);
        System.out.printf("STRENGTH: %d\n", STRENGTH);
        System.out.printf("FAITH: %d\n", FAITH);
        System.out.println("========================================================\n");

        System.out.println("[1] CREATE YOUR NAME");
        System.out.println("[2] SELECT YOUR JOB CLASS");
        System.out.println("[3] CONFIRM");
        System.out.println("[4] BACK\n");

        int choice = UserInput.getUserChoice(4);

        switch (choice) {
            case 1:
                ChooseName chooseName = new ChooseName();
                chooseName.chooseName(this);
                break;
            case 2:
                ChooseJob chooseJob = new ChooseJob();
                chooseJob.chooseJob(this);
                break;
            case 3:
                if (NAME.isEmpty() || JOB.isEmpty()) {
                    System.out.println("Missing inputs to proceed");
                    createCharacter();
                } else {
                    lobby.display();
                }
                break;
            case 4:
                title.display();
                break;
            default:
                createCharacter();
                break;
        }
    }
}
