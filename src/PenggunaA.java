public class PenggunaA implements Aksi {
    private Aksi aksi;

    public PenggunaA(Aksi aksi) {
        this.aksi = aksi;
    }
    public String lakukanAksi (String con) {
        return aksi.lakukanAksi(con);
    }
}
