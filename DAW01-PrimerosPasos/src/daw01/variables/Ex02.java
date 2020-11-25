package daw01.variables;

public class Ex02 {
    public static void main(String[] args) {

        //true
        boolean fetaResarva = true;
        boolean plou = false;
        String diaSetmana = "Diumenge";
        int persones = 7;
        int coches = 3;

        boolean femBarbacoa = fetaResarva == true && !plou && diaSetmana.equals("Dissapte") || diaSetmana.equals("Diumenge") && persones / coches <= 5;
        System.out.println(femBarbacoa);
    }
}
