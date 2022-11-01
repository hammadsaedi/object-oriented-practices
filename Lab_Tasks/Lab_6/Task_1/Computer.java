package Lab_Tasks.Lab_6.Task_1;

public class Computer {
    private final int wordSize;
    private final int memorySize;
    private final int storageSize;
    private final int size;

    public Computer(){
        this(0, 0, 0, 0);
    }

    public Computer(final int wordSize, final int memorySize, final int storageSize, final int size) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.size = size;
    }

    public int getWordSize() {
        return wordSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getStorageSize() {
        return storageSize;
    }


    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Computer [Word Size: " + wordSize + ", Memory Size: " + memorySize + ", Storage Size: " + storageSize
                + ", Size: " + size + "]";
    }
}
