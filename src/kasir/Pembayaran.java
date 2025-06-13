/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasir;

/**
 *
 * @author rizky
 */
public class Pembayaran {
    private double subTotal, diskon, pajak, totalBayar, uangBayar, uangKembali;
    private String namaPembeli, metode;

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
        
    public void hitungDiskon(int jumlahItem) {
        if (jumlahItem >= 5) {
            this.diskon = 0.1 * subTotal; // diskon 10%
        } else {
            this.diskon = 0;
        }
    }

    public double getDiskon() {
        return diskon;
    }

    public double getPajak() {
        return pajak;
    }
    
    public void hitungPajak() {
        this.pajak = 0.12 * subTotal; // pajak 12%
    }
    
    public double getTotalBayar() {
        return totalBayar;
    }
    
    public void hitungTotalBayar() {
        this.totalBayar = subTotal - diskon + pajak;
    }


    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public double getUangBayar() {
        return uangBayar;
    }

    public void setUangBayar(double uangBayar) {
        this.uangBayar = uangBayar;
    }

    public double getUangKembali() {
        return uangBayar - totalBayar;
    }


    
//    public double hitungKembalian(double uangBayar) {
//        return uangBayar - totalBayar;
//    }
}
