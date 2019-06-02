public class InfiniteGoldCounter extends GoldCounter {

    private int index;

    @Override
    public boolean hasNext() {
        if(index > golds.length - 1){
            index = 0;
        }

        return true;
    }

    @Override
    public Integer next() {
        return golds[index++];
    }
}
