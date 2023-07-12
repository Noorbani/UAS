public class Main {
    public static void main(String [] args) {
        
        Buku buku1 = new Buku("0001", "Pemrogramman Java");
        Buku buku2 = new Buku("0002", "Pemrogramman C++");
        BukuLuar buku3 = new BukuLuar("0003", "Pemrogramman Python");
    
        Petugas petugas1 = new Petugas("Alex", "P001");
        Peminjam peminjam1 = new Mahasiswa();
        peminjam1.setNamaPeminjam("Adam");
        peminjam1.setKodePeminjam("M001");
        
       peminjam1.doLogin();
       //peminjam1.doLogout();

       try {
        Peminjaman peminjaman1 = new Peminjaman(peminjam1, petugas1, buku3);
    
        System.out.println("Nama Peminjam: " + peminjaman1.getPeminjam().getNamaPeminjam());
        System.out.println("Kode Peminjam: " + peminjaman1.getPeminjam().getKodePeminjam());
        System.out.println("Nama Petugas: " + peminjaman1.getPetugas().getNamaPetugas());
        System.out.println("Nama Buku: " + peminjaman1.getBuku().getNamaBuku());
    
        Denda denda1 = new Denda(peminjaman1, 5000);
        System.out.println("Jumlah Denda: " + denda1.getJumlahDenda());
    
        // Menambahkan tarif denda 10.000
        denda1.setJumlahDenda(10000);
        System.out.println("Jumlah Denda (Setelah Diperbarui): " + denda1.getJumlahDenda());
    } catch (Exception e) {
        System.out.println("Terjadi Kesalahan: " + e.getMessage());
    } finally {
        System.out.println("Program Selesai");
    }
    }
}

