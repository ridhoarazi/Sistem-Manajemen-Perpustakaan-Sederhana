/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Perpus;
import java.util.Scanner;
import models.*;
/**
 *
 * @author Lenovo
 */
public class PerpusMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Buku[] buku = new Buku[10];
        Anggota[] anggota = new Anggota[10];
        int jBuku = 0, jAnggota = 0;

        while (true) {
            System.out.println("\n=== Sistem Perpustakaan Mini ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Daftar Buku");
            System.out.println("6. Daftar Anggota");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 0) break;

            switch (pilih) {
                case 1:
                    System.out.print("Judul buku: ");
                    buku[jBuku++] = new Buku(input.nextLine());
                    System.out.println("Buku ditambahkan!");
                    break;

                case 2:
                    System.out.print("Nama anggota: ");
                    anggota[jAnggota++] = new Anggota(input.nextLine());
                    System.out.println("Anggota ditambahkan!");
                    break;

                case 3:
                    if (jBuku == 0 || jAnggota == 0) {
                        System.out.println("Tambahkan buku dan anggota dulu!");
                        break;
                    }
                    System.out.println("Pilih anggota:");
                    for (int i = 0; i < jAnggota; i++)
                        System.out.println((i + 1) + ". " + anggota[i].getNama());
                    int a = input.nextInt() - 1;

                    System.out.println("Pilih buku:");
                    for (int i = 0; i < jBuku; i++)
                        System.out.println((i + 1) + ". " + buku[i].getJudul());
                    int b = input.nextInt() - 1;

                    if (a >= 0 && a < jAnggota && b >= 0 && b < jBuku)
                        anggota[a].pinjam(buku[b]);
                    else
                        System.out.println("Pilihan tidak valid!");
                    break;

                case 4:
                    if (jBuku == 0 || jAnggota == 0) {
                        System.out.println("Tidak ada data!");
                        break;
                    }
                    System.out.println("Pilih anggota:");
                    for (int i = 0; i < jAnggota; i++)
                        System.out.println((i + 1) + ". " + anggota[i].getNama());
                    int a2 = input.nextInt() - 1;

                    System.out.println("Pilih buku:");
                    for (int i = 0; i < jBuku; i++)
                        System.out.println((i + 1) + ". " + buku[i].getJudul());
                    int b2 = input.nextInt() - 1;

                    if (a2 >= 0 && a2 < jAnggota && b2 >= 0 && b2 < jBuku)
                        anggota[a2].kembali(buku[b2]);
                    else
                        System.out.println("Pilihan tidak valid!");
                    break;

                case 5:
                    System.out.println("Daftar Buku:");
                    for (int i = 0; i < jBuku; i++)
                        buku[i].info();
                    break;
                    
                case 6:
                    System.out.println("Daftar Anggota:");
                    for (int i = 0; i < jAnggota; i++)
                        anggota[i].info();
                    break;

                default:
                    System.out.println("Pilihan tidak dikenal!");
            }
        }

        System.out.println("Terima kasih telah menggunakan sistem ini!");
        input.close();
    }
}
