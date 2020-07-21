
package arreglo;

import utils.leer;

public class CRUD {
    public static String[] pais = new String[100];
    public static String[] ciudad = new String[100];
    public static String[] universidad = new String[100];
    public static String[] carrera = new String[100];
    public static String[] ciclo = new String[100];
    public static String[] edad = new String[100];
    public static int pos=-1;
    
    
    public static void agregarestudiante(){
        String continuar;
        do{
         pos ++;
         System.out.println("Agregar Datos de los Estudiantes Universitarios");
         System.out.print("Pais de origen: ");
         pais[pos] = leer.cadena();
         
         System.out.print("Ciudad Actual: ");
         ciudad[pos] = leer.cadena();
         
         System.out.print("Universidad: ");
         universidad[pos] = leer.cadena();
         
         System.out.print("Carrera Profesional: ");
         carrera[pos] = leer.cadena();
         
         System.out.print("Ciclo: ");
         ciclo[pos] = leer.cadena();
         
         System.out.print("Edad: ");
         edad[pos] = leer.cadena();
         
            System.out.println("Deseas agregar otro? (SI/NO)");
            continuar = leer.cadena();
        }while(continuar.equalsIgnoreCase("SI")); 
    }
    
    public static void listarestudiante(){
         System.out.println("Listado:");
         System.out.println("N°\tUNIVERSIDAD\t\tCARRERA\t\tCICLO\t\tPAIS\t\tCIUDAD\t\tEDAD");
         for (int i = 0; i <=pos; i++) {
             System.out.println((i+1)+"\t"+universidad[i]+"\t\t\t"+carrera[i]+"\t"+ ciclo[i]+"\t\t"+pais[i]+"\t\t"+ciudad[i]+"\t\t"+edad[i]);
            
        }
    }
    
    public static void eliminarestudiante(){
        String continuar;
        do{ 
            listarestudiante();
             System.out.println("Ingrese el numero de la persona a eliminar: ");
             int numero = leer.entero();
             numero--;
             for (int i = numero; i < pos; i++) {
                pais[i] = pais[i+1];
                ciudad[i] = ciudad[i+1];
                universidad[i] = universidad[i+1];
                carrera[i] = carrera[i+1];
                ciclo[i] = ciclo[i+1];
                edad[i] = edad[i+1];
                
            }
             pais[pos]="";
             ciudad[pos]="";
             universidad[pos]="";
             carrera[pos]="";
             ciclo[pos]="";
             edad[pos]="";
             
             pos--; 
             System.out.println("Deseas agregar otro? (SI/NO)");
             continuar = leer.cadena();
        }while(continuar.equalsIgnoreCase("SI"));
    }
    
    public static void editarestudiante(){
         String continuar;
        do{ 
        listarestudiante();
        System.out.print("Ingresar el numero de la persona que voy a editar: ");
        int numero=leer.entero();
        numero--;
        System.out.print("Nuevo pais: ");
        pais[numero]= leer.cadena();
        System.out.print("Nuevo ciudad: ");
        ciudad[numero] = leer.cadena();
        System.out.print("Nueva universidad: ");
        universidad[numero] = leer.cadena();
        System.out.print("Nuevo carrera: ");
        carrera[numero]= leer.cadena();
        System.out.print("Nuevo ciclo: ");
        ciclo[numero]= leer.cadena();
        System.out.print("Nuevo edad: ");
        edad[numero]= leer.cadena();
         System.out.println("Deseas agregar otro? (SI/NO)");
            continuar = leer.cadena();
        }while(continuar.equalsIgnoreCase("SI"));
    }
    
    public static void salir(){
        System.out.println("Programa finalizado");
         
    }
    
    public static void error(){
        System.out.println("Error, vuelva a digitar");
         
    }
    
    public static void menu(){
         System.out.println("Menu principal");
         System.out.println("1. Designar Estudiante");
         System.out.println("2. Eliminar Estudiante");
         System.out.println("3. Editar Estudiante");
         System.out.println("4. Listar Estudiante");
         System.out.println("5. Salir");
         System.out.print("opc. ");
    }
    
    public static void inicio(){
         int opcion;
         do{
             menu();
             opcion = leer.entero();
             switch(opcion){
                 case 1: agregarestudiante();
                         break;
                 case 2: eliminarestudiante();
                         break;
                 case 3: editarestudiante();
                         break;
                 case 4: listarestudiante();
                         break;
                 case 5: salir();
                         break;
                 default:  error();
             }
             
         }while(opcion != 5);
    }
    
    public static void main(String[] args) {
        inicio();
    }
}