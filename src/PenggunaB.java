public class PenggunaB implements Aksi{
    private Aksi aksi;

    public PenggunaB(Aksi aksi) {
        this.aksi = aksi;
    }
    public String lakukanAksi(String con) {
        return aksi.lakukanAksi(con);
    }
}
