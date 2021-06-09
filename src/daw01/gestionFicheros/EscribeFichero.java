//package daw01.gestionFicheros;
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//
//public class EscribeFichero {
//    // Escribiremos 5 números por línea en un campo de 5 y separados por espacios
//    public static void main(String[] args) {
//        FileInputStream fichero = null;
//        if (args.length == 1){
//            fichero = new File(args[0]);
//            if (!fichero.exists())
//                try(BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]))){
//                    for (int n=1; n<=50; n++){
//                        bw.write(String.format("%5d", n));
//                        if (n%5==0)
//                            bw.newLine();
//                    }
//                }catch (Exception e){
//                    System.out.println(e.getMessage());
//                }
//            else{
//                System.out.println("El fichero " + args[0] + " ya existe");
//                System.out.println("Bórrelo antes de proseguir");
//            }
//        }
//        else{
//            System.out.println("Se esperaba como parámetro el nombre del");
//            System.out.println("fichero a crear");
//        }
//    }
//}
//
