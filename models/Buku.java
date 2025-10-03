/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Lenovo
 */
public class Buku {
    private String judul;
    private boolean dipinjam;

    public Buku(String judul) {
        this.judul = judul;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public void info() {
        System.out.println(judul + " (" + (dipinjam ? "Dipinjam" : "Tersedia") + ")");
    }
}
