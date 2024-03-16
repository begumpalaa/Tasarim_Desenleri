package org.example;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton modelde constructor içinden yazıldı.");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void SNGLTN_METHOD() {
        System.out.println("Singleton modelde metod içinden yazdırıldı.");
    }
}
