/**
 * Your champion. Change the class name, the name field, and make it yours!
 */
public class MyChampion extends Champion {
    public static final String NAME = "My Champion";

    public MyChampion() {
        super("My Champion", 40, 5, 5, new ConsoleChampionController());
    }

    @Override
    public List<Action> getActions() {
        List<Action> actions = new ArrayList<>(super.getActions());
        actions.add(new Jab()); // Replace with your custom actions
        return actions;
    }
}
