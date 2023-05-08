/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author nural
 */
public class order {
    private int total;
    private int qty;
    private int harga;

    public int getQty() {
        return qty;
    }

    public int setQty(int qty) {
        this.qty = qty;
        return qty;
    }

    public int getHarga() {
        return harga;
    }

    public int setHarga(int harga) {
        this.harga = harga;
        return harga;
    }    
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
     
    public int orderMenu(int harga, int qty) {
       total = qty * harga;
       return total;
    }
}
