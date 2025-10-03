/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import interfaces.Transaksi;
/**
 *
 * @author Lenovo
 */
public class Anggota implements Transaksi{
    private String nama;

    public Anggota(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public void pinjam(Buku bukuPinjam) {
        if (!bukuPinjam.isDipinjam()) {
            bukuPinjam.setDipinjam(true);
            System.out.println(nama + " meminjam buku \"" + bukuPinjam.getJudul() + "\"");
        } else {
            System.out.println("Buku \"" + bukuPinjam.getJudul() + "\" sedang dipinjam!");
        }
    }

    @Override
    public void kembali(Buku bukuKembali) {
        if (bukuKembali.isDipinjam()) {
            bukuKembali.setDipinjam(false);
            System.out.println(nama + " mengembalikan buku \"" + bukuKembali.getJudul() + "\"");
        } else {
            System.out.println("Buku \"" + bukuKembali.getJudul() + "\" belum dipinjam.");
        }
    }
    
    public void info() {
        System.out.println(nama);
    }
}
