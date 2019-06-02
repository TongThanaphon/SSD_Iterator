import java.util.Random;

public class Engine {

    private int varA;
    private int varB;
    private int varC;

    public void operate(){
        Random random = new Random();
        varA = random.nextInt(100);
        varB = random.nextInt(100);
        varC = random.nextInt(100);
    }

    public void debug(){
        System.out.println(varA + ", " + varB + ", " + varC);
    }

    public Memento save(){
        return new Memento(varA, varB, varC);
    }

    public void restore(Memento m){
        this.varA = m.varA;
        this.varB = m.varB;
        this.varC = m.varC;
    }

    static class Memento{
        private int varA;
        private int varB;
        private int varC;

        private Memento(int varA, int varB, int varC){
            this.varA = varA;
            this.varB = varB;
            this.varC = varC;
        }
    }

}
