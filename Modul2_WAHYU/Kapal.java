package Modul2_WAHYU;

public class Kapal extends TransportasiAir {

    protected String mesin;

    Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    @Override
    public void informasi() {
        System.out.printf(
                "Transportasi Air jenis Kapal dengan kursi berjumlah %d ditetapkan dengan biaya sebesar Rp. %d \n",
                this.jumlahKursi, this.biaya);
    }

    @Override
    public void berlayar() {
        System.out.printf(
                "Transportasi Air jenis Kapal sedang berlayar menggunakan mesin %s dengan kecepatan yang tidak stabil \n",
                this.mesin);
    }

    public void berlayar(int kecepatan) {
        System.out.printf(
                "Transportasi Air jenis Kapal sedang berlayar menggunakan mesin %s dengan kecepatan stabil di kisaran %d knot \n",
                this.mesin, kecepatan);
    }

    @Override
    public void berlabuh() {
        System.out.print("Transportasi Air jenis Kapal berlabuh di pantai \n");
    }
}
