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
