/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

public class Hilo extends Thread {
    private Contador contador;

    public Hilo (String name, Contador contador) {
        super(name);
        this.contador = contador;
    }

    @Override
    public void run() {
        System.out.println("Inicia el " + getName());
        
        for (int i = 0; i < 10; i++) {
            contador.incrementar(); 
            System.out.println("Iteracion " + (i+1) + " de " + getName() + 
                               " | Contador actual: " + contador.getValor());
        }

        System.out.println("Termina el " + getName() + 
                           " | Valor final esperado: " + contador.getValor());
    }
}