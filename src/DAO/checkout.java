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
public class checkout {
    private int moneyBack;
    private int total;
    private int money;
    

    public int getTotal() {
        return total;
    }

    public int setTotal(int total) {
        this.total = total;
        return total;
    }

    public int getMoney() {
        return money;
    }

    public int setMoney(int money) {
        this.money = money;
        return total;
    }

    public int getMoneyBack() {
        return moneyBack;
    }

    public void setMoneyBack(int moneyBack) {
        this.moneyBack = moneyBack;
    }
    
    public int checkoutMethod(int money, int total) {
        moneyBack = money - total;
        this.setMoneyBack(moneyBack);
        return moneyBack;
    }
}
