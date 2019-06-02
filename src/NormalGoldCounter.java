public class NormalGoldCounter extends GoldCounter {

    private int index;

    @Override
    public boolean hasNext() {
        return index < golds.length;
    }

    @Override
    public Integer next() {
        return golds[index++];
    }
}
