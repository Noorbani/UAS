class Denda {
    private Peminjaman peminjaman;
    private int jumlahDenda;

    public Denda(Peminjaman peminjaman, int jumlahDenda) {
        this.peminjaman = peminjaman;
        this.jumlahDenda = jumlahDenda;
    }

    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public int getJumlahDenda() {
        return jumlahDenda;
    }

    public void setJumlahDenda(int jumlahDenda) {
        this.jumlahDenda = jumlahDenda;
    }
}


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