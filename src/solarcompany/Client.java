/*Mohau Tshukudu
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarcompany;

/**
 *
 * @author tshuk
 */
public class Client {
    private int idNo;
    private String name;
    private String surname;
    private String gender;
    private int houseNo;
    private String cellNo;
    private String email;

    public Client(int iN, String nm, String snm, String gen, int hNo, String cNo, String em) {
        idNo = iN;
        name = nm;
        surname = snm;
        gender = gen;
        houseNo = hNo;
        cellNo = cNo;
        email = em;
    }

    public int getIdNo() {
        return idNo;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public String getCellNo() {
        return cellNo;
    }

    public String getEmail() {
        return email;
    }

    public void setIdNo(int iN) {
        idNo = iN;
    }

    public void setName(String nm) {
        name = nm;
    }

    public void setSurname(String snm) {
        surname = snm;
    }

    public void setGender(String gen) {
        gender = gen;
    }

    public void setHouseNo(int hNo) {
        houseNo = hNo;
    }

    public void setCellNo(String cNo) {
        cellNo = cNo;
    }

    public void setEmail(String em) {
        email = em;
    }

    @Override
    public String toString() {
        return "Client{" + "idNo=" + idNo + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", houseNo=" + houseNo + ", cellNo=" + cellNo + ", email=" + email + '}';
    }
    
    
    
    
}
