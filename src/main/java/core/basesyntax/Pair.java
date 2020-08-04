package core.basesyntax;

class Pair<T, W> {
    private T first;
    private W second;

    private Pair(T first, W second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public W getSecond() {
        return second;
    }

    public static <T, W> Pair of(T first, W second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(Pair.class)) {
            return false;
        }
        Pair pair = (Pair) obj;

        return first != null
                ? first.equals(pair.getFirst()) : first == pair.getFirst()
                && (second != null && pair.second != null)
                ? second.equals(pair.second) : second == pair.second;
    }

    @Override
    public int hashCode() {
        int result = 61;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}
