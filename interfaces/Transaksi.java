/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;
import models.Buku;

public interface Transaksi {
    void pinjam(Buku bukuPinjam);
    void kembali(Buku bukuKembali);
}
