package Lab_Tasks.Lab_6.Task_1;

public class Laptop extends Computer {
    private final int length;
    private final int width;
    private final int height;
    private final int weight;

    public Laptop() {
        this(0, 0, 0, 0, 0, 0, 0, 0);
    }

    public Laptop(final int wordSize, final int memorySize, final int storageSize, final int size, final int length, final int width, final int height,
    final int weight) {
        super(wordSize, memorySize, storageSize, size);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString() +  " [Length: " + length + ", Width: " + width + ", Height: " + height + ", Weight: " + weight + "]";
    }    
}
