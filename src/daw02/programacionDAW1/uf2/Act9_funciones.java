package programacionDAW1.uf2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Act9_funciones{
    static int len(String cad){
        return cad.length();
    }
    static String normalitza(String nom){
        return nom.toUpperCase();
    }
    static int trucada(double x){
        int valor = (int) Math.round(x);
        return valor;
    }
    static long multiple3Proper(long x){
        long multiplo = 0;   
        if((x%3) == 0){
            return x;
        }else if(!((x%3) == 0)){
            multiplo = (x) % 3;
        }
            return multiplo;
    }
    static void permuta(int v[]){
        int aux = v[0];
        v[0] = v[1];
        v[1] = aux;
    }
    static int aleatori(int n1, int n2){
        int aleatori = 0;
        if(n1>n2){
           return aleatori = (int) (Math.random() * (n2 - n1 +1)) + n1;
        }else if(n1<n2){
            System.out.println("ERROR");
        }
        return aleatori;        
    }
    static int dau(){
        int dado = (int) (Math.random() * (7 - 1)) + 1;
        return dado;
    }
    static int dosDaus(){
        int x = dau();
        //System.out.println(x);
        int y = dau();
        //System.out.println(y);
        int z = x + y;
        return (int) ((Math.random() * 12 - 1) + z);
        //no seria equivalente porque repetimos el random de nuevo y generamos un nuevo numero
    }
    static int lenNum(int num){
        String s = Integer.toString(num);
        System.out.println(s.length()); 
        int n = Integer.parseInt(s);
        return n;
        }
    static boolean esParell(int x){
        boolean valor = false;
        if((x%2) == 0){
            valor = true;
        }else if((x%2) == 1){
            valor = false;
        }
        return valor;
    }
    static String nif(int x){
        String dniLetra = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra;
        String dni = " ";
        for (int i = 0; i < dniLetra.length(); i++) {
            letra = dniLetra.charAt(i % 23);
            return dni = x + " " + letra;
        }
        return dni;
    }  
    static int[] ordenaTres(int n1, int n2, int n3){
        int[] orden = {n1, n2, n3};
        Arrays.sort(orden);
        return orden;
    }
    static void pedraPaperTisora(){
        Scanner s = new Scanner(System.in);
        System.out.println("\t" + "JUEGO PIEDRA PAPEL O TIJERA");
        int eleccion = (int)(Math.random() * 3) + 1;
		System.out.println("\n"+"Empieza el juego");
        System.out.println("Elige un numero: 1. Piedra 2. Papel 3. Tijera");
        int x = s.nextInt();
        System.out.print("He escogido: ");
		switch (eleccion)
		{
			case 1:
				System.out.println("Piedra");
				switch (x){
					case 1: System.out.println("Empate!"); break;
					case 2: System.out.println("Ganaste!"); break;
					case 3: System.out.println("Perdiste!"); break;
				}
				break;
			case 2:
				System.out.println("Papel");
				switch (x){
					case 1: System.out.println("Perdiste"); break;
					case 2: System.out.println("Empate!"); break;
					case 3: System.out.println("Ganaste!"); break;
				}
				break;
			case 3:
				System.out.println("Tijera");
				switch (x){
					case 1: System.out.println("Ganaste!"); break;
					case 2: System.out.println("Perdiste"); break;
					case 3: System.out.println("Empate!"); break;
				}
				break;
		}
    }
    static void aleatoriCent(){
        //ArrayList<String> items = new ArrayList<String>();
        int[] num = new int [100];
        System.out.println("\t" + "Generació de 100 valors aleatoris entre 1 i 6"); 
        for (int i = 0; i < 100; i++) {
            num[i] = dau();
            System.out.print(" " + num[i]);
        
            //if(i == 100){
                // for (int j = 0; j < num.length; j++) {
                //     switch(num[j]){
                //         case 1:
                //         System.out.println("Apariciones del valor 1: " + j++);
                //     }
                // }
            //}
        }        
        System.out.println();
}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Act1
        //System.out.println(len("hola javi"));
        //Act2
        //System.out.println(normalitza("javi"));
        //Act3
        //System.out.println(trucada(95.7));
        //Act4
        //System.out.println(multiple3Proper(24));
        //Act5
        // int v[] = {10, 20};
        // permuta(v);
        // System.out.println(java.util.Arrays.toString(v));
        //Act6
        // System.out.println("Dame dos numeros enteros");
        // int x = s.nextInt();
        // int y = s.nextInt();
        // System.out.println(aleatori(x, y));
        //Act7
        //System.out.println(dau());
        //Act8
        //System.out.println(dosDaus());
        //Act9
        //System.out.println(lenNum(500));
        //Act10
        //System.out.println(esParell(27));
        //Act11
        // System.out.println("Introuce el numero del DNI del que quieres saber e NIF: ");
        // int z = s.nextInt();
        // if(z > 9999999 && z <= 99999999){
        //     System.out.println("NIF con la letra; " + nif(z));
        // }else if(z >= 100000000){
        //     System.out.println("Los numeros de NIF han de tener minimo 8 cifras.");
        // }
        //Act 12
        //System.out.println(Arrays.toString(ordenaTres(8, 4, 10)));
        //Act 13
        //pedraPaperTisora();
        //Act 14
        aleatoriCent();
   }
}