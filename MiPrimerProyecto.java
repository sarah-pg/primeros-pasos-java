import java.util.Scanner;
/**
 *
 * @author sarah
 */
public class MiPrimerProyecto {

    public static void main(String[] args) {
      //ej1(); //Los ej* y el main son métodos. Esto es "llamada a métodos". El main es el único que se ejecuta
      //Para apagar la llamada a un método, utilizamos las dos barras para convertirlo en comentario
      //ej2();
      //ej3();
      //ej4();
      //ej5();
      //ej6();
      menu();
        
    }
    
    public static void ej1(){
    Scanner lector= new Scanner (System.in);
        System.out.println("Teclea tu nombre: ");
        String nombre= new String ();
        nombre=lector.nextLine();
        System.out.println(nombre.toUpperCase());    
    }

    public static void ej2(){
    Scanner lector= new Scanner (System.in);
        System.out.println("Teclea tu nombre: ");
        String nombre= new String ();
        nombre=lector.nextLine();
        System.out.println("Teclea tu edad: ");
        int edad; //Al ser un tipo primitivo no hay que meter un new
        edad=lector.nextInt();
        if (edad >= 18) { //Abreviatura "ife" tabulador
            //Acciones que desencadena si es true
            System.out.println(nombre.toUpperCase() + " eres mayor de EDAD"); 
        } else {
            //Acciones que desencadena si es false
            //A veces puede existir true y no false
            System.out.println(nombre.toUpperCase() + " eres menor de EDAD");
        }
    }
    
    public static void ej3(){
        Scanner lector= new Scanner (System.in);
        System.out.println("Introduce el número: ");
        int numero;
        numero=lector.nextInt();
        if (numero >= 0) { 
            System.out.println(numero + " es POSITIVO"); 
        } else {
            System.out.println(numero + " es NEGATIVO");
        }
    //Hay gente que cierra el Scanner, pero no es necesario. Solo es necesario cuando se programa directamente en el main
    
    }
    
    public static void ej4(){
        Scanner lector= new Scanner (System.in);
        System.out.println("Introduce el número: ");
        int numero;
        numero=lector.nextInt();
        if (numero%2==0) {
            //El igual comparativo en Java siempre es doble, por el simple está reservado para la asignación
            System.out.println(numero + " es PAR"); 
        } else {
            System.out.println(numero + " es IMPAR");
        }
        
    }
    
    public static void ej5(){
        Scanner lector= new Scanner (System.in);
        System.out.println("Introduce el número: ");
        int numero;
        numero=lector.nextInt();
        if ((numero/2.0)==(int)(numero/2.0)) { 
            //Debo indicar el .0 para que tenga en cuenta los decimales en la ecuacion
            System.out.println(numero + " es PAR"); 
        } else {
            System.out.println(numero + " es IMPAR");
        }
        
    }
    
    public static void ej6(){
        Scanner lector= new Scanner (System.in);
        System.out.println("Teclea un día de la semana número: ");
        int dia;
        dia=lector.nextInt();
            switch (dia) { //Abreviatura sw tabulador
                case 1:System.out.println(dia + " es Lunes");
                    break;
                case 2:System.out.println(dia + " es Martes");
                    break;
                case 3:System.out.println(dia + " es Miercoles");
                    break;
                case 4:System.out.println(dia + " es Jueves");
                    break;
                case 5:System.out.println(dia + " es Viernes");
                    break;
                case 6:System.out.println(dia + " es Sabado");
                    break;
                case 7:System.out.println(dia + " es Domingo");
                    break;
                default: System.out.println("Dia incorrecto");
                    break;
            //Java te ofrece transformarlo a un Switch más compacto donde no sale el break
                
            }
    }
    
    public static void menu(){
        System.out.println("\n\n\n\t\t\tMENU DE OPCIONES");//la n salta linea la t tabula
        System.out.println("\t\t\t----------------");
        System.out.println("\t\t\t1. AÑADIR CONTACTO");
        System.out.println("\t\t\t2. ELIMINAR CONTACTO");
        System.out.println("\t\t\t3. MODIFICAR CONTACTO");
        System.out.println("\t\t\t4. BUSCAR CONTACTO");
        System.out.println("\t\t\t5. MOSTRAR CONTACTOS");
        System.out.println("\n\t\t\t6. SALIR");
        Scanner lector= new Scanner (System.in);
        System.out.println("Teclea una opcion: ");
        int opcion;
        opcion=lector.nextInt();
            switch (opcion) {
                case 1 -> añadirContacto();
                case 2 -> borrarContacto();
                case 3 -> modificarContacto();
                case 4 -> buscarContacto();
                case 5 -> mostrarContactos();
                default -> System.out.println("Seleccion Incorrecta");
                            
            }
                        
    }

    private static void añadirContacto() {
        System.out.println("Estas en el método para añadir contactos");
    }

    private static void borrarContacto() {
        System.out.println("Estas en el método para borrar contactos");
    }

    private static void modificarContacto() {
        System.out.println("Estas en el método para modificar contactos");
    }

    private static void buscarContacto() {
        System.out.println("Estas en el método para buscar contactos");
    }

    private static void mostrarContactos() {
        System.out.println("Estas en el método para mostrar contactos");
    }
}
