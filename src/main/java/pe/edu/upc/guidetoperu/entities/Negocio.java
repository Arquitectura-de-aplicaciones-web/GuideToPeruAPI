package pe.edu.upc.guidetoperu.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name="negocios")
public class Negocio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNegocio;
    @Column(name = "nameBusiness", length = 60, nullable = false)
    private String nameNegocio;
    @Column(name = "addressNegocio", length = 40, nullable = false)
    private String addressNegocio;
    @Column(name = "phoneNegocio", length = 40, nullable = false)
    private String phoneNegocio;
    @Column(name = "emailNegocio", length = 40, nullable = false)
    private String emailNegocio;
    @Column(name = "guyNegocio", length = 40, nullable = false)
    private String guyNegocio;

    public Negocio() {
    }

    public Negocio(int idNegocio, String nameNegocio, String addressNegocio, String phoneNegocio, String emailNegocio, String guyNegocio) {
        this.idNegocio = idNegocio;
        this.nameNegocio = nameNegocio;
        this.addressNegocio = addressNegocio;
        this.phoneNegocio = phoneNegocio;
        this.emailNegocio = emailNegocio;
        this.guyNegocio = guyNegocio;
    }

    public int getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(int idNegocio) {
        this.idNegocio = idNegocio;
    }

    public String getNameNegocio() {
        return nameNegocio;
    }

    public void setNameNegocio(String nameNegocio) {
        this.nameNegocio = nameNegocio;
    }

    public String getAddressNegocio() {
        return addressNegocio;
    }

    public void setAddressNegocio(String addressNegocio) {
        this.addressNegocio = addressNegocio;
    }

    public String getPhoneNegocio() {
        return phoneNegocio;
    }

    public void setPhoneNegocio(String phoneNegocio) {
        this.phoneNegocio = phoneNegocio;
    }

    public String getEmailNegocio() {
        return emailNegocio;
    }

    public void setEmailNegocio(String emailNegocio) {
        this.emailNegocio = emailNegocio;
    }

    public String getGuyNegocio() {
        return guyNegocio;
    }

    public void setGuyNegocio(String guyNegocio) {
        this.guyNegocio = guyNegocio;
    }

}
