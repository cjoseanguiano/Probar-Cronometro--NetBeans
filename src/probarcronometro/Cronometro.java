/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probarcronometro;

/**
 *
 * @author carlosjoseanguiano
 */
public class Cronometro {

    private double tiempo;

    public Cronometro() {
        ponerAcero();
    }

    public void ponerAcero() {
        tiempo = System.currentTimeMillis();
    }

    public double tiempoPasado() {
        double time;
        time = (System.currentTimeMillis() - tiempo) / 1000;
        return time;
    }
}
