public class MainApp {

    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Adata", 2, 1.80F);
        perangkat.informasi();
        System.out.println("");
        Laptop seagate = new Laptop("Seagate", 8, 2.40F, true);
        seagate.webcam = true;
        seagate.informasi();
        seagate.bukaGame("Dota 2");
        seagate.kirimEmail("niceyuk@gmail.com");
        seagate.kirimEmail("aanarji@gmail.com", "rusmangc@gmail.com");
        System.out.println("");
        Handphone handisk = new Handphone("Sandisk", 3, 2.20F, false);
        handisk.informasi();
        handisk.telfon(628122122);
        handisk.kirimSMS(62852112);
        handisk.kirimSMS(628122122, 629292211);
    }

}
