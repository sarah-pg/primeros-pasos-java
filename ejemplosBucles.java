import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Ejemplosbucles {

    public static void main(String[] args) {
        //Bucles de Java: FOR WHILE DO-WHILE    
        //Para recorrer catálogos de datos potentes FOREACH  ITERATOR
        //ej1();
        //ej2();
        //ej3();
        //ej4();
        //ej5();
        //ej6();
        //ej7();
        //ej8();
        //ej9();
        //ej10();
        //ej11();
        //ej12();
        //ej13();
        //ej14();
        ej15();
    }

    private static void ej1() {
    //Bucle que realiza 10 veces una acción
    //abreviatura de FOR -> fori
        for (int i = 1; i <=10; i++) { //La i solo es nombre de variable, puede ser cualquier letra
            System.out.println("Hola");
        }
    }

    private static void ej2() {
        for (int i = 0; i <=10; i+=2) {
           System.out.println(i+" ");
        }
    }

    private static void ej3() {
    //En el while el indice tiene que ir antes
    //while "pregunta antes de entrar" solo si la condición se cumple
        int i = 1;
        while (i <=10){
            System.out.println(i+ " ");
            i++;
        }
    }

    private static void ej4() {
    //En el do-while siempre va a entrar una vez. 
    //En este caso ejecutaría como mínimo lo declarado en la variable i
    //Se utiliza para Menús por ejemplo
        int i = 11;
        do {
            System.out.println(i+ " ");
            i++;
        } while (i <=10);
    }
    
    private static void ej5() {
    //Solicitamos un número por teclao y debemos imprimir los num desde el 1 hasta ese.
        Scanner lector = new Scanner (System.in);
        System.out.println("\nTeclea el número al que hay que llegar: ");
        int num=lector.nextInt();
        System.out.println("Números desde 1 hasta " + num);
        for (int i=1;i<=num;i++){
            System.out.print(i + " ");
        }
    }
    private static void ej6() {
    //Ahora, usando el while, queremos imprimir los num entre dos determinados que demos
        Scanner lector = new Scanner (System.in);
        System.out.println("\nTeclea el número al que hay que llegar: ");
        int num=lector.nextInt();
        System.out.println("\nTeclea el número de partida: ");
        int num1=lector.nextInt();
        int i=num1;
        while (i <=num){
            System.out.println(i+ " ");
            i++;
            }
    }
    
    private static void ej7() {
    //Solicitamos un número por teclao y debemos imprimir los num desde ese hasta el 1.
        Scanner lector = new Scanner (System.in);
        System.out.println("\nTeclea el número de partida: ");
        int num=lector.nextInt();
        System.out.println("Números desde " + num + " hasta 1");
        for (int i=num;i>=1;i--){
            System.out.print(i + " ");
        }
    }
    
    private static void ej8() {
    //Ahora, usando el while, queremos imprimir los num desde uno determinado hasta 0
        Scanner lector = new Scanner (System.in);
        System.out.println("\nTeclea el número de partida: ");
        int num=lector.nextInt();
        int i=num;
        while (i >=0){
            System.out.println(i + " ");
            i--;
            }
    }
    
    private static void ej9() {
    //Ahora, usando for, imprime los numeros pares, desde 0 hasta uno determinado
        Scanner lector = new Scanner (System.in);
        System.out.println("\nTeclea el número final: ");
        int num=lector.nextInt();
        System.out.println("Números pares desde 0 hasta " + num);
        for (int i=0;i<=num;i+=2){
            System.out.print(i + " ");
        }
    } 
    
    private static void ej10() {
    //Usando while, imprime los numeros pares, desde 0 hasta uno determinado
        Scanner lector = new Scanner (System.in);
        System.out.println("\nTeclea el número final: ");
        int num=lector.nextInt();
        System.out.println("Números pares desde 0 hasta " + num);
        int i=0;
        while (i<=num) {
            System.out.println(i + " ");
            i+=2;          
        }
    }
    
    private static void ej11() {
    //Ahora, usando for, imprime los numeros pares, entre dos numeros definidos por teclado
        Scanner lector = new Scanner (System.in);
        System.out.println("\nTeclea el número de partida: ");
        int num1=lector.nextInt();
        System.out.println("\nTeclea el número final: ");
        int num2=lector.nextInt();
        System.out.println("Números pares desde " + num1 + " hasta " + num2);
        for (int i = num1; i <= num2; i++) {
            if (i%2==0) {
               System.out.print(i + "");
            }
        }
    }
  
    private static void ej12() {
    //Usando while, imprime los numeros pares, entre dos numeros definidos por teclado
        Scanner lector = new Scanner (System.in);
        System.out.println("\nTeclea el número de partida: ");
        int num1=lector.nextInt();
        System.out.println("\nTeclea el número final: ");
        int num2=lector.nextInt();
        System.out.println("Números pares desde " + num1 + " hasta " + num2);
        int i=num1;
        while (i<=num2) {
            if (i%2==0) {
                System.out.print(i + "");
            }
            i++;
             
        }
    }
    
    private static void ej13() {
    //Usando do-while, imprime los numeros pares, entre dos numeros definidos por teclado
        Scanner lector = new Scanner (System.in);
        System.out.println("\nTeclea el número de partida: ");
        int num1=lector.nextInt();
        System.out.println("\nTeclea el número final: ");
        int num2=lector.nextInt();
        System.out.println("Números pares desde " + num1 + " hasta " + num2);
        int i=num1;
        do {
            if (i%2==0) {
            System.out.print(i + "");
            }
            i++;
        } while (i<=num2);
    }

    private static void ej14() {
        //El bucle se repite mientras el total sumado sea inferior a 100
        Scanner lector = new Scanner (System.in);
        int num;
        int total=0;
        while (total<=100) {
            System.out.println("Teclea un número: ");
            num=lector.nextInt();
            total+=num;
        }
    }
    
    private static void ej15() {
        //El bucle se repite mientras el total sumado sea inferior a 100 y no permite dar más de 10 vueltas
        Scanner lector = new Scanner (System.in);
        int num;
        int total=0;
        int i=1;
        while (total<=100 && i<=10) {
            System.out.println("Teclea un número: ");
            num=lector.nextInt();
            total+=num;
            i++;
        }
    }
}
