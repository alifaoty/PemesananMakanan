/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PemesananMakanan;

/**
 *
 * @author Lenovo
 */
public class Pembayaran {
    private String nomorPesanan;
    private String metodePembayaran;
    private float jumlahBayar;
    private String statusPembayaran;

    public Pembayaran(String nomorPesanan, String metodePembayaran, float jumlahBayar, String statusPembayaran) {
        this.nomorPesanan = nomorPesanan;
        this.metodePembayaran = metodePembayaran;
        this.jumlahBayar = jumlahBayar;
        this.statusPembayaran = statusPembayaran;
    }

    public String getNomorPesanan() {
        return nomorPesanan;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public float getJumlahBayar() {
        return jumlahBayar;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }
    
    
}
