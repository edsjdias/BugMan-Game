import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Grid globalGameGrid = new Grid();
        Game game = new Game(globalGameGrid);
    }

}
