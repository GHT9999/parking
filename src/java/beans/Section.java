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
public class Section {

    private int id;
    private String reference;
    static int cmp = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Section(String reference) {
        this.id = cmp++;
        this.reference = reference;
    }

    public Section(int id, String reference) {
        this.id = id;
        this.reference = reference;
    }

}
