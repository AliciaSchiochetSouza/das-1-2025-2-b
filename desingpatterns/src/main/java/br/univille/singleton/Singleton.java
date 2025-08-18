package br.univille.singleton;

public class Singleton {
    // parece uma variavel global, static e privada
    private static Singleton instance;

    private Singleton() {
        // construtor privado para evitar instanciação externa
    }
    public static Singleton getInstance() {
       if(instance == null) {
           instance = new Singleton();
       }
       return instance;
    }

}
