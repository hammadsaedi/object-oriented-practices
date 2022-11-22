package Lab_Tasks.Lab_8.Task_4;

import java.util.Objects;

public class NameCollection implements Enumeration {
    String[] collection = new String[10];
    
    public boolean push(String data){
        int availableIndex = lastIndex() + 1;
        if (availableIndex >= collection.length) throw new IndexOutOfBoundsException();
        collection[availableIndex] = data;
        return true;
    }

    @Override
    public boolean hasNext(int index) {
        if (index >= (lastIndex() + 1)) throw new IndexOutOfBoundsException();
        return Objects.nonNull(collection[index + 1]);
    }

    @Override
    public Object getNext(int index) {
        if (index >= (lastIndex() + 1)) throw new IndexOutOfBoundsException();
        return collection[index];
    }

    private int lastIndex(){
        int i = 0;
        for (; i < collection.length; i++){
            if (Objects.isNull(collection[i])) break;
        }
        return i - 1;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder("Collection [ ");
        for (int i = 0; i < collection.length; i++) {
            if (collection[i] == null) break;
            buffer.append(collection[i]);
            buffer.append(", ");
        }
        buffer.append(" ]");
        return buffer.toString();
    }
}
