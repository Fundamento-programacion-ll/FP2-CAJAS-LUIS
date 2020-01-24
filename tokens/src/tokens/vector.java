/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Cajas
 */
public class vector {
    
    private int vector[];

    public vector(int[] vector) {
        super();//contructor
        this.vector = vector;
        
    }
    
     public vector(int dimension) {
        super();
        vector =new int[dimension];
        this.setVector();
    }
     public vector() {
       
    }


    public int[] getVector() {
        return vector;
    }

    public void setVector() {
//        this.vector = vector;
        String datosVector;
        datosVector = JOptionPane.showInputDialog(null,"INGRESE LOS VALORES SEPARADOS POR COMA");
        StringTokenizer tokkens = new
            StringTokenizer(datosVector,",");//datos, separador
        
        for (int i = 0; i < this.vector.length&&tokkens.hasMoreTokens(); i++) {
            
            this.vector[i] = Integer.parseInt(tokkens.nextToken());
        }
    }

    public boolean esprimo(int nume){
        int aux=2;
//        System.out.println(nume);
// for (int i = 2; i < nume; i++) {
//            aux=nume%i;
//            if(aux==0){
//            return true;
//        }
//        }
      while(aux!=nume){
            if(nume%aux==0){
            return false;
           
        }
            aux++;
      }
       
        return true;
    }
    public String contararreglo(){
        String cont="";
        
        for (int i = 0; i < this.vector.length; i++) {
//            esprimo(this.vector[i]);
//            cont+="Numero Primo: "+ this.vector[i];
            if(esprimo(this.vector[i])){
                 cont+="\n"+"Numero Primo: "+ this.vector[i]+"\n";
            }
        }
        return cont;
    }
    @Override
    public String toString() {
        return "vector: "+Arrays.toString(vector);
    }
    
    
}
