package Playground.RecursiveConstructor;

public class RecursiveConstructor {
    public int x;

    public RecursiveConstructor(int x) { 
        // Constructor call must be the first statement in a constructorJava(1207959691)
        
        // if (x > 0) this(--x);

        // Base condition has to be first statement; Else, there will no ending point
        // So Recursion is not possible
    }

    public RecursiveConstructor(byte x, byte y) { 
        if (x > y) new RecursiveConstructor(--x, y); // allocating new space in heap; Cannot say it's recursive constructor
        System.out.println("RecursiveConstructor.RecursiveConstructor()");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("RecursiveConstructor.finalize()");
        super.finalize();
    }
}
