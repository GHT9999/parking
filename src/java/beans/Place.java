/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author OTTO
 */
public class Place {

    private int idPlace;
    private int numero;
    private Boolean etat;
    private int idSection;
    static int cmp = 0;

    public Place(int idPlace, int numero, Boolean etat, int idSection) {
        this.idPlace= idPlace;
        this.numero = numero;
        this.etat = etat;
        this.idSection = idSection;
    }

    public Place(int numero, Boolean etat, int idSection) {
        this.idPlace = cmp++;
        this.numero = numero;
        this.etat = etat;
        this.idSection = idSection;
    }

    public int getId() {
        return idPlace;
    }

    public void setId(int idPlace) {
        this.idPlace = idPlace;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public int getIdSection() {
        return idSection;
    }

    public void setIdSection(int idSection) {
        this.idSection = idSection;
    }

    @Override
    public String toString() {
        return "Place{" + "id=" + idPlace + ", numero=" + numero + ", etat=" + etat + ", idSection=" + idSection + '}';
    }
    
    

}
