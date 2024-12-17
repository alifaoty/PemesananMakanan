/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PemesananMakanan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Pesanan {
    private String nomorPesanan;
    private List<Menu> menuItem;
    private float totalHarga;
    private String statusPesanan;

    public Pesanan(String nomorPesanan,  float totalHarga, String statusPesanan) {
        this.nomorPesanan = nomorPesanan;
        this.menuItem = new ArrayList<>();
        this.totalHarga = totalHarga;
        this.statusPesanan = statusPesanan;
    }

    public String getNomorPesanan() {
        return nomorPesanan;
    }

    public List<Menu> getMenuItem() {
        return menuItem;
    }

    public float getTotalHarga() {
        return totalHarga;
    }

    public String getStatusPesanan() {
        return statusPesanan;
    }

    public void setNomorPesanan(String nomorPesanan) {
        this.nomorPesanan = nomorPesanan;
    }

    public void setMenuItem(List<Menu> menuItem) {
        this.menuItem = menuItem;
    }

    public void setTotalHarga(float totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void setStatusPesanan(String statusPesanan) {
        this.statusPesanan = statusPesanan;
    }
    
    
}
