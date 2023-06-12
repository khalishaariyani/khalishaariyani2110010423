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
public class dsorangtua {
    private ArrayList<Integer> id;
    private ArrayList<String> idsiswa;
    private ArrayList<String> namaayah;
    private ArrayList<String> namaibu;
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> updateterakhir;
    
     public dsorangtua(){
     id= new ArrayList<Integer>();
     idsiswa= new ArrayList<String>();
     namaayah= new ArrayList<String>();
     namaibu= new ArrayList<String>();
     username= new ArrayList<String>();
     password= new ArrayList<String>();
     updateterakhir= new ArrayList<String>();
     }
     public void id (Integer value) {
        id.add(value);
    }
    public ArrayList<Integer> getDatasetId(){
        return this.id;
    }
     public void idsiswa (String value) {
        idsiswa.add(value);
    }
    public ArrayList<String> getDatasetIdsiswa(){
        return this.idsiswa;
    }
    public void namaayah (String value) {
        namaayah.add(value);
    }
    public ArrayList<String> getDatasetNamaayah(){
        return this.namaayah;
    }
    public void namaibu (String value) {
        namaibu.add(value);
    }
    public ArrayList<String> getDatasetNamaibu(){
        return this.namaibu;
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
     public void updateterakhir (String value){
        updateterakhir.add(value);
    }
    public ArrayList<String> getDatasetUpdateterakhir(){
        return this.updateterakhir;
    }
    public void tambahData(int Id, String Idsiswa, String Namaayah,String Namaibu, String Password, String Updateterakhir){
     this.id.add(Id);
     this.idsiswa.add(Idsiswa);
     this.namaibu.add(Namaibu);
     this.namaayah.add(Namaayah);
     this.password.add(Password);
     this.updateterakhir.add(Updateterakhir);
     
    }
    
}
    

