/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.synchronizedt;

/**
 *
 * @author ansmironov
 */

class Caller {
    public synchronized void callConsole(String name){
        try {
            System.out.print("[" + name);
            Thread.sleep(500);
            System.out.print("]");
           
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class MyThread implements Runnable {
    
    Caller cal;
    String name;
    Thread t;
    
    public MyThread(Caller cal, String name){
        this.name = name;
        this.cal = cal;
        t =new Thread(this);
    }
    
    public void run() {
        cal.callConsole(name);
    }
}

public class SynchronizedT {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Caller c = new Caller();
        
        MyThread m1 = new MyThread(c, "Child1");
        MyThread m2 = new MyThread(c, "Child2");
        MyThread m3 = new MyThread(c, "Child3");
        m1.t.start();
        m2.t.start();
        m3.t.start();
        
        
    }
}
