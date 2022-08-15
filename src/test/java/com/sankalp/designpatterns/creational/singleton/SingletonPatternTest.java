package com.sankalp.designpatterns.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonPatternTest {

    @Test
    public void testThreadSafeSingleton() {
        Thread t1 = new Thread(() -> {
            Logger log1 = Logger.getInstance();
            log1.log("Hello");
            assertEquals(1, Logger.getCounter());
        });

        Thread t2 = new Thread(() -> {
            Logger log2 = Logger.getInstance();
            log2.log("World");
            assertEquals(1, Logger.getCounter());
        });

        t1.start();
        t2.start();

    }

}
