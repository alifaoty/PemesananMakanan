/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PemesananMakanan;

/**
 *
 * @author Lenovo
 */
public class Minuman extends Menu{
    private String ukuran;

    public Minuman(int idMenu, String nama, float harga, int stok, String ukuran) {
        super(idMenu, nama, harga, stok);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }
    
    
}
