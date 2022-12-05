package MODUL2_WAHYU;

public class TransportasiAir {

    protected int jumlahKursi;
    protected int biaya;

    TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public void informasi() {
        System.out.printf(
                "Transportasi Air jenis tidak diketahui dengan kursi berjumlah %d ditetapkan dengan biaya sebesar Rp. %d \n",
                this.jumlahKursi, this.biaya);
    }

    public void berlayar() {
        System.out.print("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar \n");
    }

    public void berlabuh() {
        System.out.print("Transportasi Air dengan jenis yang tidak diketahui berlabuh di pantai \n");
    }

}
