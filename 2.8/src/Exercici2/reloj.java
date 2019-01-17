
package Exercici2;


public class reloj {
    int horas;
    int minutos;
    int segundos;
    int ampm;

private boolean comprobarHora() {
    if (horas < 0 || horas > 23) {
        return false;
    }
    if (minutos < 0 || minutos > 59) {
        return false;
    }
    if (segundos < 0 || segundos > 59)  {  
        return false;
    } 
    return true;
}

public reloj() {
    this.horas = 0;
    this.minutos = 0;
    this.segundos = 0;
}

public void mHora() {
    if (horas >= 13) {
        int convertir = horas - 12;
        String hora12;
        if (horas >= 13) {
             hora12 = convertir+":" + minutos+":" + segundos +" "+ "PM";
        } else {
             hora12 = convertir+":" + minutos+":" + segundos +" "+ "AM";
        }
        System.out.println(hora12);
    }
}
public reloj(int horas, int minutos, int segundos){
    if (comprobarHora() == false) {
        System.out.println("Hora incorrecta");
    } else {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
}

void uReloj() {
     segundos = 0;
    System.out.println(horas+":"+minutos+":"+segundos);
    
    
}   

public String format24() {
    String hora12 = null;
    if (horas >= 13) {
        int convertir = horas - 12;
        hora12 = convertir+":" + minutos+":" + segundos +" "+ "PM";
    } else {
        hora12 = horas+":" + minutos+":" + segundos +" "+ "AM";
        }
    return hora12;
}

}



/*public void rellotgeCircular( int  segons ){
    
    int segonsReals = 0 ;
    int minutsReals = 0 ;
    int horesReals = 0 ;
    
    
    
    horesReals = segons / 3600 ;
    
    segons = segons % 3600;
    
    minutsReals = segons / 60 ;
    
    segons = segons % 60;
    
    
    for ( int s = 0 ; s < segons ; s++ ){
        
        if ( s % 60 == 0 )
            minuts++;
        
        if ( minuts % 60 == 0 )
            hores++;
        
        
    }
    */
   
    

    

