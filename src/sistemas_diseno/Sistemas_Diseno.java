package sistemas_diseno;

public class Sistemas_Diseno {

    public static void main(String[] args) {
        DashBoard dashboard=new DashBoard();
      
        System.out.println("Despliega mediciones de sensores");
        
        dashboard.updateData();
        dashboard.updateDisplay();
            
        
        // Simulacion 2
        System.out.println("Inscripcion de estudiante");
        
        String[] materias={"Matematicas","Ingles","Espanol","Ciencia"};
        Formato formatoDeInscripcion= new Formato("Juan ");
        ListaDeCursos tiraDeMaterias= new ListaDeCursos(materias);
        
        formatoDeInscripcion.inscribir();
        tiraDeMaterias.updateEstudiante();
    }
    
}
