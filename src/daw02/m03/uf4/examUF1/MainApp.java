package m03.uf4.examUF1;

public class MainApp {
    public static void main(String[] args) {
        TelefonMobil tel1 = new TelefonMobil("Samsung", "A70", 200, false, false, "Android", "4G");
        TelefonMobil tel2 = new TelefonMobil("iPhone", "11", 700, true, true, "iOS", "5G");
        Altres rellotjeIntel = new Altres("Xiaomi", "miWatch", 100, "Rellotje inteligent de 100 euros");
        Tablets tablet = new Tablets("Xiaomi", "miPad", 400, 9.1);
        Altres auriculars = new Altres("Huawei", "freeBudsPro", 70, "Nous auricuars Huawei de 70 euros");

        System.out.println(tel2.precio());
        //System.out.println("\n" + tel1 + "\n" + tel2 + "\n" + rellotjeIntel + "\n" + tablet + "\n" + auriculars);
    }
}
