/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PemesananMakanan;

/**
 *
 * @author Lenovo
 */
public class Menu {
    private int idMenu;
    private String nama;
    private double harga;
    private int stok;

    public Menu(int idMenu, String nama, double harga, int stok) {
        this.idMenu = idMenu;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
    
    
}
