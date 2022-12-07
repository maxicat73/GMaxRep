
package coleccionesej4;

import Service.ServiceAlumno;

public class ColeccionesEJ3 {

    
    public static void main(String[] args) {
       
        ServiceAlumno serv=new ServiceAlumno();
        serv.crearAlumno();
        serv.mostrarLista();
        serv.notaFinal();
    }
    
}
