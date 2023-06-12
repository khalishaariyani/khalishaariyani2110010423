/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalishaariyani2110010423;

/**
 *
 * @author windows 10
 */
public class orangtua {
    private int id;
    private String idsiswa;
    private String namaayah;
    private String namaibu;
    private String username;
    private String password;
    private String updateterakhir;
    
    public orangtua(){
        
    }
    public void setid (int id) {
        this.id=id;
    }
    public int getid(){
        return this.id; 
    }
    public void setnamaayah (String namaayah) {
        this.namaayah=namaayah;
    }
    public String getnamaayah(){
        return this.namaayah;
    }
    public void setnamaibu (String namaibu) {
        this.namaibu=namaibu;
    }  
    public String getnamaibu(){
        return this.namaibu;
    }
    public void setusername (String username) {
        this.username=username;
    }
    public String getusername(){
        return this.username;
    }
    public void setpassword (String password) {
        this.password=password;
    }  
    public String getpassword(){
        return this.password;
    }
    public void setupdateterakhir(String updateterakhir){
        this.updateterakhir=updateterakhir;
    }
    public String getupdateterakhir(){
        return this.updateterakhir;
    }
}
