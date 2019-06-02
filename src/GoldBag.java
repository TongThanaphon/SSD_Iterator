import java.util.Iterator;

public class GoldBag implements Iterable<Integer>{

    private int[] golds = {34, 1, 48, 26};

    @Override
    public Iterator<Integer> iterator() {
//        NormalGoldCounter n = new NormalGoldCounter();
//        n.setGold(golds);
//        return n;

        ReverseGoldCounter r = new ReverseGoldCounter();
        r.setGold(golds);
        return r;

//        InfiniteGoldCounter i = new InfiniteGoldCounter();
//        i.setGold(golds);
//        return i;
    }

    public static void main(String[] args) {
        GoldBag gb = new GoldBag();
        for(int gold : gb){
            System.out.println(gold);
        }
    }
}
