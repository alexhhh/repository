package com.intern.alexx.test1;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
    LocalTime currentTime =new LocalTime();
    System.out.println(":))) Ora exacta este :" + currentTime);
       TestSmth x = new TestSmth() ;
       x.printSmth();
    }
}
