package ru.detskiostrov.addresses;

import java.sql.Date;

/**
 * This class is used for storing clients list from magazin-integral.ru
 * Author: Grigorii Andreev
 * Data: 11 March 2011
 */
public class ClientsAddressBook {

    int id;
    String email;
    String telephone;
    String purchasesNumber;
    Date lastPurchase;

    public ClientsAddressBook(int id, String email, String telephone, String purchasesNumber, Date lastPurchase) {
        this.id = id;
        this.email = email;
        this.telephone = telephone;
        this.purchasesNumber = purchasesNumber;
        this.lastPurchase = lastPurchase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPurchasesNumber() {
        return purchasesNumber;
    }

    public void setPurchasesNumber(String purchasesNumber) {
        this.purchasesNumber = purchasesNumber;
    }

    public Date getLastPurchase() {
        return lastPurchase;
    }

    public void setLastPurchase(Date lastPurchase) {
        this.lastPurchase = lastPurchase;
    }
}
