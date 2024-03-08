/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas_diseno;

/**
 *
 * @author JRamR
 */
public class Formato {
    private String nombre;
    
    public Formato(String nombre){
    this.nombre=nombre;
    }
    
    public void inscribir(){
        actualizaFormato();
        System.out.println("Se inscribio "+nombre+":");
    }
    
    public void actualizaFormato(){
        System.out.println("Formato Actualizado");
    }
}
