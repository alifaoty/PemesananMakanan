/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PemesananMakanan;

/**
 *
 * @author Lenovo
 */
public class Makanan extends Menu{
    private String kategori;

    public Makanan(int idMenu, String nama, float harga, int stok, String kategori) {
        super(idMenu, nama, harga, stok);
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }
    
    
}
