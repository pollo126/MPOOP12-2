/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

public class P0OP12 {

    public static void main(String[] args) {
        Contador contadorCompartido = new Contador();

        Hilo hilo1 = new Hilo("primer hilo", contadorCompartido);
        Hilo hilo2 = new Hilo("segundo hilo", contadorCompartido); 
        
        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            System.out.println("El hilo principal fue interrumpido.");
        }

        System.out.println("Termina hilo principal");
        System.out.println("Valor FINAL del Contador Compartido: " + contadorCompartido.getValor());
    }
}