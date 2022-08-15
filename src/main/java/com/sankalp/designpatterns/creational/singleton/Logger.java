package com.sankalp.designpatterns.creational.singleton;

import java.util.Objects;

public class Logger {

    private static int counter = 0;
    private static Logger instance;

    private Logger(){
        counter++;
        System.out.println("Logger Initialized");
        System.out.println("No of logger instances: " + counter);
    }

    //Prevent Copy Constructor by making it private
    private Logger(Logger l){
        instance = l;
    }
    
    public void log(String s){
        System.out.println(s);
    }

    synchronized public static Logger getInstance() {
        if(Objects.isNull(instance)){
            synchronized (Logger.class) {
                if(Objects.isNull(instance)){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public static int getCounter() {
        return counter;
    }

}
