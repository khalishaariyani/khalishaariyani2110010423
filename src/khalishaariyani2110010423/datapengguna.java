/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalishaariyani2110010423;

/**
 *
 * @author windows 10
 */
public class datapengguna {
    private int id;
    private String username;
    private String password;
    private String namalengkap;
    private String email;
    private String updateterakhir;
    
    public datapengguna(){
        
    }
      public void setid (int id) {
        this.id=id;
    }
    public int getid(){
        return this.id; 
    }
    public void setpassword (String password) {
        this.password=password;
    }
    public String getpassword(){
        return this.password;
    }
    public void setnamalengkp (String namalengkap) {
        this.namalengkap=namalengkap;
    }
    public String getnamlengkap(){
        return this.namalengkap;
    }
    public void setemail (String email) {
        this.email=email;
    }
    public String getemail(){
        return this.email;
    }
     public void setupdateterakhir(String updateterakhir){
        this.updateterakhir=updateterakhir;
    }
    public String getupdateterakhir(){
        return this.updateterakhir;
    }
}
