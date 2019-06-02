import java.util.Iterator;

public abstract  class GoldCounter implements Iterator<Integer> {

    protected int[] golds;

    public void setGold(int[] golds){
        this.golds = golds;
    }

}
