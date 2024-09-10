/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.startthread;

/**
 *
 * @author ansmironov
 */
public class StartThread {

    public static void main(String[] args) {
       MyThread3000 mt3000 = new MyThread3000("chield1");
       MyThread3000 mt3001 = new MyThread3000("chield2");
       MyThread3000 mt3002 = new MyThread3000("chield3");
       
       mt3000.name.start();
       mt3001.name.start();
       mt3002.name.start();
    }
}

class MyThread3000 implements Runnable {
    Thread name;
    MyThread3000(String threadName){
        name = new Thread(this, threadName);
    }
    
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                name.sleep(500);
                System.out.println("Дочерний поток " + name.getName());
            } 
        } catch(InterruptedException e) {
            System.out.println("Дочерний поток " + name + " прерван");
        }
        
    }        
}
