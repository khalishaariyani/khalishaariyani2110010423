/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;

/**
 *
 * @author windows 10
 */
public class dsdatapengguna {
    private ArrayList<Integer> id;
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> namalengkap;
    private ArrayList<String> email;
    private ArrayList<String> updateterakhir;
    
    public dsdatapengguna (){
     id= new ArrayList<Integer>();
     username= new ArrayList<String>();
     password= new ArrayList<String>();
     namalengkap= new ArrayList<String>();
     email= new ArrayList<String>();
     updateterakhir= new ArrayList<String>();
     
    }
    public void id (Integer value) {
        id.add(value);
    }
    public ArrayList<Integer> getDatasetId(){
        return this.id;
    }
    public void username (String value){
        username.add(value);
    }
    public ArrayList<String> getDatasetUsername(){
        return this.username;
    }
    public void password (String value){
        password.add(value);
    }
    public ArrayList<String> getDatasetPassword(){
        return this.password;
    }
      public void namalengkap (String value){
        namalengkap.add(value);
    }
    public ArrayList<String> getDatasetNamalengkap(){
        return this.namalengkap;
    }
      public void email (String value){
        email.add(value);
    }
    public ArrayList<String> getDatasetEmail(){
        return this.email;
    }
    public void updateterakhir (String value){
        updateterakhir.add(value);
    }
    public ArrayList<String> getDatasetUpdateterakhir(){
        return this.updateterakhir;
    }
    public void tambahData(int Id, String Username, String Password, String Namalengkap, String Email, String Updateterakhir){
     this.id.add(Id);
     this.username.add(Username);
     this.password.add(Password);
     this.email.add(Email);
     this.namalengkap.add(Namalengkap);
     this.updateterakhir.add(Updateterakhir);
    
    }
}
