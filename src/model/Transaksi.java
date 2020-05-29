/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class Transaksi {    
    private int no;
    private String tanggal;
    private String pelanggan;
    private String total;
    
    public Transaksi(int n, String tgl, String pel, String jml){
        no = n;
        tanggal = tgl;
        pelanggan = pel;
        total = jml;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }
        
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
}
