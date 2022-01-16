package com.Assignment1;
 
public class MT implements Runnable
{
       public static void main(String[] args) {
        Thread MT1 = new Thread("MultiThread1");
        Thread MT2 = new Thread("MultiThread");
        MT1.start();
        MT2.start();
        System.out.println("Thread names are following:");
        System.out.println(MT1.getName());
        System.out.println(MT2.getName());
    }
    @Override
    public void run() {
    }
}
