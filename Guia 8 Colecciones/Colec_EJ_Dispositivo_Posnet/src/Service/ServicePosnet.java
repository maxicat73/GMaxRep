
package Service;

import Entidad.Posnet;
import Entidad.TarjetaDeCredito;
import Entidad.Ticket;
import java.util.Scanner;


public class ServicePosnet {
    
    ServiceTarjetaDeCredito sTarjeta = new ServiceTarjetaDeCredito();
    ServiceTicket sTicket = new ServiceTicket();
    Posnet posnet = new Posnet();
    
    public void iniciarProcesoDePago(){
    
        Scanner leer = new Scanner(System.in);
        
        posnet.setTarjetaCredito(sTarjeta.crearTarjetaDeCredito());
        System.out.print("Ingrese el monto a abonar: ");
        posnet.setMontoAbonar(leer.nextDouble());
        System.out.print("Ingrese la cantidad de cuotas: ");
        posnet.setCantCuotas(leer.nextInt());
        
        if(sTarjeta.tieneSaldo(posnet)){
            
            System.out.println("******************************\nPAGO REALIZADO CON EXITO");
            sTicket.crearTicket(posnet).mostrarDatosTicket();
        }else{
        
            System.out.println("******************************\nSALDO INSUFICIENTE");
        
        }
        
        
    }
    
    
}
