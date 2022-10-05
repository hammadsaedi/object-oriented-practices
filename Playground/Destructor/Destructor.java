package Playground.Destructor;

import java.time.Instant;

public class Destructor {
    long time;

    public Destructor () {
        this.time = Instant.now().getEpochSecond();
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Object created on " + this.time + " is being destructed now at " + Instant.now().getEpochSecond());
        } finally{
            super.finalize();
        }
    }
}