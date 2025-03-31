package BehavioralPatterns.Iterator;

class NameIterator implements Iterator {
    private String[] names = {"John", "Jane"};
    private int index;

    public boolean hasNext() {
        return index < names.length;
    }

    public Object next() {
        return hasNext() ? names[index++] : null;
    }
}
