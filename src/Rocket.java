public class Rocket {

    public static void main(String[] args) {
        Engine e = new Engine();

        Engine e2 = e;

        e.operate();
        e.debug();

        // Make a snapshot
        Engine.Memento m = e.save();

        e.operate();
        e.debug();

        // Restore a snapshot
        e.restore(m);
        e.debug();
    }

}
