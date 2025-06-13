package kasir;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rizky
 */
public class Kebab {
    private String nama, ukuran, keranjang;
    private int jumlahBeli;
    private double harga, total;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public double getHarga() {
        if (nama.equalsIgnoreCase("Kebab Daging Sapi")) {
            if (ukuran.equalsIgnoreCase("S")) {
                harga = 10000;
            }else if (ukuran.equalsIgnoreCase("M")) {
                harga = 15000;
            }else if (ukuran.equalsIgnoreCase("L")) {
                harga = 21000;
            }else{
                harga = 0;
            }
        }else if (nama.equalsIgnoreCase("Kebab Daging Ayam")) {
            if (ukuran.equalsIgnoreCase("S")) {
                harga = 8000;
            }else if (ukuran.equalsIgnoreCase("M")) {
                harga = 12000;
            }else if (ukuran.equalsIgnoreCase("L")) {
                harga = 18000;
            }else{
                harga = 0;
            }
        }
        return harga;
    }

    public double getTotal() {
        return harga * jumlahBeli;
    }

    public String getKeranjang() {
        return nama + " " + ukuran +  " x " + jumlahBeli + " = Rp. " + getTotal();
    }

}
