/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Maxi
 */
public class Cafetera {
    
    private int CapMax;
    private int CapAct;
    
    public Cafetera(){
    
}
    public Cafetera(int CapMax, int CapAct){
    this.CapAct=CapAct;
    this.CapMax=CapMax;
    
}

    public int getCapMax() {
        return CapMax;
    }

    public void setCapMax(int CapMax) {
        this.CapMax = CapMax;
    }

    public int getCapAct() {
        return CapAct;
    }

    public void setCapAct(int CapAct) {
        this.CapAct = CapAct;
    }
    
    
    
}
