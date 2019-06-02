public class ReverseGoldCounter extends GoldCounter{

    private int index;

    @Override
    public boolean hasNext() {
//        return index != -1 * golds.length;
        return index < golds.length;
    }

    @Override
    public Integer next() {
        index++;
        int n = golds.length - index;
        return golds[n];
    }
}
