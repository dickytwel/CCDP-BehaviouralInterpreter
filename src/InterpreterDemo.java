public class InterpreterDemo {
    public static void main(String[] args) {
        Aksi aksiA = new ProsesAksi("Pinjam Buku");
        Aksi penggunaA = new PenggunaA(aksiA);

        Aksi aksiB = new ProsesAksi("Baca Buku");
        Aksi penggunaB = new PenggunaB(aksiB);

        System.out.println("Pengguna A");
        System.out.println(penggunaA.lakukanAksi("Pinjam Buku"));
        System.out.println(penggunaA.lakukanAksi("Kembalikan Buku"));

        System.out.println("Pengguna B");
        System.out.println(penggunaB.lakukanAksi("Baca Buku"));
        System.out.println(penggunaB.lakukanAksi("Pinjam Buku"));

    }
}
