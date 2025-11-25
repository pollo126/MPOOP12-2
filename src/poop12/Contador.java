/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public synchronized void incrementar() {
        this.valor++;
        try {
            Thread.sleep(10); 
        } catch (InterruptedException e) {
            System.out.println("Error en el sleep");
        }
    }

    public int getValor() {
        return valor;
    }
}