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
public class Item {
    private int id;
    private String nama;
    private int harga;

    public Item(int no, String nm, int hrg){
        id = no;
        nama = nm;
        harga = hrg;
    }
    
    public Item(String nm, int hrg){
        nama = nm;
        harga = hrg;
    }
    
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    @Override
    public String toString() {
        return nama;
    }
    
}
