package generic.test.ex2;

public class Pair<K, V> {

    private K first;
    private V second;
    public void setFirst(K data) {
        this.first = data;
    }

    public void setSecond(V data) {
        this.second = data;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
