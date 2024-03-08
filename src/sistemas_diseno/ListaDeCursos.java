/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas_diseno;

import java.util.Arrays;

/**
 *
 * @author JRamR
 */
public class ListaDeCursos {
    
    private final String[] materias;
    
    public  ListaDeCursos(String[] materias){
       this.materias=materias;
    }
    
    public void updateEstudiante(){
        System.out.println("Estudiante inscrito en las materias: "+Arrays.toString(materias));
    }
}
