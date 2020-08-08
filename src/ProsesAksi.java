public class ProsesAksi implements Aksi{
    private String data;

    public ProsesAksi(String data) {
        this.data = data;
    }

    public String lakukanAksi(String con) {
        if(con.contains(data)) {
            return "Melakukkan aksi "+data;
        } else {
            return "Tidak melakukkan aksi";
        }
    }
}
