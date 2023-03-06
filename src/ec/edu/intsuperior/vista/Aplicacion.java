/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import static ec.edu.intsuperior.vista.Aplicacion.Ejercicio1;
import static ec.edu.intsuperior.vista.Aplicacion.Ejercicio2;
import static ec.edu.intsuperior.vista.Aplicacion.Ejercicio3;
import static ec.edu.intsuperior.vista.Aplicacion.Ejercicio4;
import static ec.edu.intsuperior.vista.Ejercicio14.Ejercicio14;
import static ec.edu.intsuperior.vista.Ejercicio15.Ejercicio15;
import static ec.edu.intsuperior.vista.Ejercicio16.Ejercicio16;
import static ec.edu.intsuperior.vista.Ejercicio17.Ejercicio17;
import static ec.edu.intsuperior.vista.Ejercicio18.Ejercicio18;
import static ec.edu.intsuperior.vista.Ejercicio19.Ejercicio19;
import static ec.edu.intsuperior.vista.Ejercicio5.Ejercicio5;
import static ec.edu.intsuperior.vista.Ejercicio6.Ejercicio6;
import static ec.edu.intsuperior.vista.Ejercicio7.Ejercicio7;
import static ec.edu.intsuperior.vista.Ejercicio8.Ejercicio10.Ejercicio10;
import static ec.edu.intsuperior.vista.Ejercicio8.Ejercicio11.Ejercicio11;
import static ec.edu.intsuperior.vista.Ejercicio8.Ejercicio12.Ejercicio12;
import static ec.edu.intsuperior.vista.Ejercicio8.Ejercicio13;
import static ec.edu.intsuperior.vista.Ejercicio8.Ejercicio8;
import static ec.edu.intsuperior.vista.Ejercicio8.Ejercicio9.Ejercicio9;
import java.util.Random;
import java.util.Scanner;



public class Aplicacion {
    public static void main(String[] args) {  
        menu();
    }
 public static void Ejercicio1(){
     //sacar el area de un cuadrado,cierculo,rectangulo y triangulo
       Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Elige una forma para calcular su área:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Circulo");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Introduzca el lado del cuadrado:");
                    double lado = sc.nextDouble();
                    double areaCuadrado = lado * lado;
                    System.out.println("El área del cuadrado es: " + areaCuadrado);
                    break;
                case 2:
                    System.out.println("Introduzca la base del triángulo:");
                    double base = sc.nextDouble();
                    System.out.println("Introduzca la altura del triángulo:");
                    double altura = sc.nextDouble();
                    double areaTriangulo = (base * altura) / 2;
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;
                case 3:
                    System.out.println("Introduzca la altura del rectángulo:");
                    double longitud = sc.nextDouble();
                    System.out.println("Introduzca el base del rectángulo:");
                    double ancho = sc.nextDouble();
                    double areaRectangulo = longitud * ancho;
                    System.out.println("El área del rectángulo es: " + areaRectangulo);
                    break;
                case 4:
                    System.out.println("Introduzca el radio del círculo:");
                    double radio = sc.nextDouble();
                    double areaCirculo = Math.PI * Math.pow(radio, 2);
                    System.out.println("El área del círculo es: " + areaCirculo);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Elección no válida!");
            }
        } while (choice != 5);
    }

  
public static void Ejercicio2() {
    //variables por teclado
		Scanner reader = new Scanner(System.in);
		int numero1 =0;
		int numero2 =0;
		System.out.println("Introduce el número 1:");
		
		numero1 = reader.nextInt();
		System.out.println("Introduce el número 2:");
		numero2 = reader.nextInt();
		int suma=numero1+numero2;
	
		System.out.println("La suma de los dos número es: "+suma);
	
	}

    
public static void Ejercicio3(){{
    //sentencia  – Mayor Que	
    
		Scanner reader = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		System.out.println("Introduce el número 1:");
		
		numero1 = reader.nextInt();
		System.out.println("Introduce el número 2:");
		numero2 = reader.nextInt();
		
		if (numero1 >numero2)System.out.println("Número 1: "+numero1+ " es mayor que Número 2: "+numero2);
		else if (numero1==numero2)System.out.println("El número 1 es igual al número 2");
		else System.out.println("El número 2: "+numero2+" es mayor que el número 1: "+numero1);
	}

}
            

public static void Ejercicio4() {
     //Realiza un programa en Java que lea dos números pasados por teclado en un proceso repetitivo. 
     //Este proceso terminará cuando los números leídos sean iguales.    
        
		Scanner reader = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		do {
		System.out.println("Introduce el número 1:");
		numero1 = reader.nextInt();
		System.out.println("Introduce el número 2:");
		numero2 = reader.nextInt();
		}while(numero1!=numero2);
		System.out.println("Has terminado, los números son iguales");
	}

}
        
public class Ejercicio5 {
public static void Ejercicio5() {
    // realizar un ejercicio en java que sume dos numeros
    
		Scanner reader = new Scanner(System.in);
		int contador=0;
		int suma=0;
		int A = 0;
		do {
		System.out.println("Introduce el número A:");
		
		A = reader.nextInt();
		
		contador=contador+1;
		suma=suma+A;
		}while(contador<10);
		System.out.println("La suma es: "+suma);
		
	}

}
               
public class Ejercicio6{
public static void Ejercicio6() {
    //Realizar un codigo en java que sume dos numeros
		Scanner reader = new Scanner(System.in);
		int cuenta = 0;
		int suma = 0;
		int A = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un Número:");
			A = reader.nextInt();
			suma = suma + A;
		}

		System.out.println("La suma es: " + suma);

	}
}

public class Ejercicio7 {
public static void Ejercicio7() {
    //Si el número leído es 1 visualizará Lunes, si es 2 visualizará Martes, si es 3 visualizará Miércoles, y así sucesivamente
		Scanner reader = new Scanner(System.in);
		int N = 0;

		System.out.println("Introduce un Número: ");
		N = reader.nextInt();

    switch (N) {
        case 1:
            System.out.println("Hoy es Lunes");
            break;
        case 2:
            System.out.println("Hoy es Martes");
            break;
        case 3:
            System.out.println("Hoy es Miércoles");
            break;
        case 4:
            System.out.println("Hoy es Jueves");
            break;
        case 5:
            System.out.println("Hoy es Viernes");
            break;
        case 6:
            System.out.println("Hoy es Sábado");
            break;
        case 7:
            System.out.println("Hoy es Domingo");
            break;
        default:
            System.out.println("Número no válido");
            break;
    }

	}
}

public class Ejercicio8 {
public static void Ejercicio8() {
    //Dias de la semana            
       
		Scanner leo = new Scanner(System.in);
		int N;
		System.out.println("Qué día de la semana quieres:");
		N = leo.nextInt();
		switch (N) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Juernes");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Número no válido, saliendo...");
			return;
	}
}
        
public class Ejercicio9 {
public static void Ejercicio9(){
      //Realiza un programa en Java que pida 10 números por teclado, haga la suma de esos 10 números pasados por teclado, 
    //cuente los números positivos y cuente los números negativos       
        
		int cuenta = 0;
		int suma = 0;
		int positivos = 0;
		int negativos = 0;
		int A = 0;

		Scanner reader = new Scanner(System.in);

		do {
			System.out.println("Escribe un número: ");
			A = reader.nextInt();
			cuenta++; 
			if (A >= 0)
				positivos++; 
			else
				negativos--;
			suma = suma + A;

		} while (cuenta < 10);
		System.out.println("La suma es: " + suma);
		System.out.println("El número de positivos es: " + positivos);
		System.out.println("El número de negativos es: " + negativos);
	}

}
        
        
public class Ejercicio10 {
public static void Ejercicio10(){
    //Suma de numeros que de negativo o positivo
		int suma = 0;
		int positivos = 0;
		int negativos = 0;
		int A = 0;

		Scanner reader = new Scanner(System.in);

		for(int i=0;i<10;i++) {
			System.out.println("Escribe un número: ");
			A = reader.nextInt();
			if (A >= 0)
				positivos++;
			else
				negativos--;
			suma = suma + A;

		} 
		System.out.println("La suma es: " + suma);
		System.out.println("El número de positivos es: " + positivos);
		System.out.println("El número de negativos es: " + negativos);
	}

}


public class Ejercicio11 {
public static void Ejercicio11(){
    //Realiza un programa en Java que realice la correspondencia entre nota y valor.
    
		int nota=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la nota: ");
		nota = scanner.nextInt();
		
		switch (nota) {
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
				System.out.println("Notable bajo");
				break;
			case 8:
				System.out.println("Notable alto");
				break;
			case 9:
				System.out.println("Sobresaliente");
				break;
			case 10:
				System.out.println("Matricula de honor");
				break;
			default:
				if(nota<5) System.out.println("Suspenso");
				else System.out.println("Nota");
		
		}
	}
}

public class Ejercicio12 {
 
    
public static void Ejercicio12() {
     //Realizar un ejercicio en java sobre la obtencion de la calificacion aprueba, aprobado,bien,y etc.
     
		float nota;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la nota: ");
		nota = scanner.nextFloat();
		
		while(nota<0||nota>10) {
			System.out.println("La nota no es válida, introduce otra:");
			nota=scanner.nextFloat();
		}
		
		if(nota<5)
			System.out.println("Reprueba");
		else if(nota>=5 && nota<6)
			System.out.println("Aprobado");
		else if(nota>=6 && nota<7)
			System.out.println("Bien");
		else if(nota>=7 && nota<8)
			System.out.println("Notable bajo");
		else if(nota>=8 && nota<9)
			System.out.println("Notable alto");
		else if(nota>=9 && nota<10)
			System.out.println("Sobresaliente");
		else System.out.println("Matrícula de honor");
	}
}

public static void Ejercicio13() {
 //Realiza un programa en Java que lea dos números procedentes de teclado y muestre el menor de ellos. 
    //Si los dos números son iguales, debe mostrar un mensaje indicándolo.
    
		int num1, num2;
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Introduce el primer número:");
        num1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo número:");
        num2 = scanner.nextInt();
        
        if(num1 < num2) System.out.println(num1 + " es menor");
        else if(num1 > num2) System.out.println(num2 + " es menor");
        else System.out.println("Son iguales");
    }

	}
}

public class Ejercicio14 { 
public static void Ejercicio14() {
            
    //Realiza un programa en Java al que le introduzcas 10 números por teclado. Cuente el número de números positivos introducidos por teclado, 
    //cuente el número de números negativos introducidos por teclado y realice la suma de todos ellos.
	int cuenta=0;
	int suma=0;
	int positivos=0;
	int negativos=0;
	int A=0;
	
	Scanner reader = new Scanner(System.in);
	

	do {
		System.out.println("Escribe un número: ");
		A=reader.nextInt();
		cuenta++;
		if(A>=0) positivos++;
		else negativos--;
		suma=suma+A;

	}while(cuenta <10);
	System.out.println("La suma es: "+suma);
	System.out.println("El número de positivos es: "+positivos);
	System.out.println("El número de negativos es: "+negativos);
        }
}

public class Ejercicio15 {
public static void Ejercicio15() {
    //Cálculo del área y perímetro de un círculo    
   
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }
}

public class Ejercicio16{  
public static void Ejercicio16() {
        //Cálculo del factorial de un número
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }

        System.out.println(n + "! = " + resultado);
    }
}

public class Ejercicio17 {
public static void Ejercicio17() {
    //Cálculo del máximo común divisor de dos números
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        int mcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                mcd = i;
            }
        }

        System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + mcd);
    }
}

public class Ejercicio18 {       
public static void Ejercicio18() {
     //Cálculo del mínimo común múltiplo de dos números    
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        int mcm = a * b;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        mcm /= (a + b);

        System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + mcm);
    }
}

public class Ejercicio19 {
public static void Ejercicio19() {
    //Cálculo de la raíz cuadrada de un número    
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double n = sc.nextDouble();

        double raiz = Math.sqrt(n);

        System.out.println("La raíz cuadrada de " + n + " es: " + raiz);
    }
}

public class Ejercicio20 {   
public static void Ejercicio20(){ 
     //Suma de dos números    
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
    }


public static void menu(){
        Scanner leer=new Scanner(System.in);
        int op=0;
        do {
            System.out.println("Ingrese una opcion \n"
                    + "******************************\n\n"
                    + "1.-Ejercicio1\n"
                    + "2.-Ejercicio2\n"
                    + "3.-Ejercicio3\n"
                    + "4.-Ejercicio4\n"
                    + "5.-Ejercicio5\n"
                    + "6.-Ejercicio6\n"
                    + "7.-Ejercicio7\n"
                    + "8.-Ejercicio8\n"
                    + "9.-Ejercicio9\n"
                    + "10.-Ejercicio10\n"
                    + "11.-Ejercicio11\n"
                    + "12.-Ejercicio12\n"
                    + "13.-Ejercicio13\n"
                    + "14.-Ejercicio14\n"
                    + "15.-Ejercicio15\n"
                    + "16.-Ejercicio16\n"
                    + "17.-Ejercicio17\n"
                    + "18.-Ejercicio18\n"
                    + "19.-Ejercicio19\n"
                    + "20.-Ejercicio20\n"
                    + "0.-Salir del Menu\n");
                    
        op=leer.nextInt();
        switch(op){
            case 1:
                Ejercicio1();
                break;
            case 2:
                Ejercicio2();
                break;
            case 3:
                Ejercicio3();
                break;
            case 4:
                Ejercicio4();
                break;
            case 5:
                Ejercicio5();
                break;
            case 6:
                Ejercicio6();
                break;
            case 7:
                Ejercicio7();
                break;
            case 8:
                Ejercicio8();
                break;
            case 9:
                Ejercicio9();
                break;
            case 10:
               Ejercicio10();
                break;
            case 11:
                Ejercicio11();
                break;
            case 12:
                Ejercicio12();
                break;
            case 13:
                Ejercicio13();
                break;
            case 14:
                Ejercicio14();
                break;
            case 15:
                Ejercicio15();
                break;    
            case 16:
                Ejercicio16();
                break;
            case 17:
                Ejercicio17();
                break;
            case 18:
                Ejercicio18();
                break;
            case 19:
                Ejercicio19();
                break;
            case 20:
               Ejercicio20();
                break;
        }
                
                
                 } while(op!=0);
    }

    


//EXAMEN 

//EJERCICIO 1

public static void ordena(int a, int b, int c) {
    if (a > b) {
        int temp = a;
        a = b;
        b = temp;
    }
    if (a > c) {
        int temp = a;
        a = c;
        c = temp;
    }
    if (b > c) {
        int temp = b;
        b = c;
        c = temp;
    }
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
}


//EJERCICIO 2

   public class DadoAleatorio {
      
        int n = 4;
        int lanzamientos = dado_aleatorio(n);
        System.out.println( "Se necesitaron " +  lanzamientos  + "  lanzamientos para obtener el número  " +  n);}
    
    public static int dado_aleatorio(int n) {
        Random rnd = new Random();
        int lanzamientos = 0;
        
        while (true) {
            lanzamientos++;
            int resultado = rnd.nextInt(6) + 1;
            if (resultado == n) {
                break;
            }
        }
        
        return lanzamientos;
    }
    
//EJERCICIO 3
    
import java.util.Scanner;

public class ProgresionGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pedir al usuario los valores de a, n y r
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el valor de r: ");
        double r = scanner.nextDouble();

        // validar que r sea diferente de 1
        while (r == 1) {
            System.out.println("El valor de r debe ser diferente de 1. Inténtelo de nuevo.");
            System.out.print("Ingrese el valor de r: ");
            r = scanner.nextDouble();
        }

        // calcular la suma de los términos de la progresión geométrica
        double s = a * (1 - Math.pow(r, n + 1)) / (1 - r);

        // mostrar el resultado por pantalla
        System.out.println("La suma de los términos de la progresión geométrica es: " + s);
    }
}


        }
    
    

