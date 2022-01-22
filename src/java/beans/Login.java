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
public class Login {
    private int id;
    private String user;
    private String Pass;
    static int cmp = 0;

    public Login(int id, String user, String Pass) {
        this.id = id;
        this.user = user;
        this.Pass = Pass;
    }

    public Login( String user, String Pass) {
        this.id = cmp++;
        this.user = user;
        this.Pass = Pass;
    }

    public Login() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
    
}
