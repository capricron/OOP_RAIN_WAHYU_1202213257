package MODUL2_WAHYU;

public class Sampan extends TransportasiAir {

    protected int layar;

    Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi() {
        System.out.printf(
                "Transportasi Air jenis Sampan dengan kursi berjumlah %d ditetapkan dengan biaya sebesar Rp. %d \n",
                this.jumlahKursi, this.biaya);
    }

    @Override
    public void berlayar() {
        System.out.printf("Transportasi Air jenis Sampan sedang berlayar menggunakan %d layar \n", this.layar);
    }

    @Override
    public void berlabuh() {
        System.out.print("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar \n");
    }

    public void berlabuh(int jangkar) {
        System.out.printf("Transportasi Air jenis Sampan berlabuh di pantai menggunakan %d Jangkar \n", jangkar);
    }
}
