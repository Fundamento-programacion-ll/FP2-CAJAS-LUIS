/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

/**
 *
 * @author Luis Cajas
 */
public class serie {
     int n;

    serie() {
        
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public serie(int n) {
        this.n = n;
    }
    
    public int Calcuarserie(){
        int acum=1;
        for (int i = 0; i < n; i++) {
            acum=acum*2;
//            acum*=2;
        }
        return acum;
    }
}
