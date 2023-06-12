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
public class dstransaksiuangmasuk {
     private ArrayList<Integer> id;
    private ArrayList<String> idjenisuangmasuk;
    private ArrayList<String> idsiswa;
    private ArrayList<String> jumlahuang;
    private ArrayList<String> tanggalmasuk;
    private ArrayList<String> updateterakhir;
    
     public dstransaksiuangmasuk(){
     id= new ArrayList<Integer>();
     idjenisuangmasuk= new ArrayList<String>();
     idsiswa= new ArrayList<String>();
     jumlahuang= new ArrayList<String>();
     tanggalmasuk= new ArrayList<String>();
     updateterakhir= new ArrayList<String>();
     }
     public void id (Integer value) {
        id.add(value);
    }
    public ArrayList<Integer> getDatasetId(){
        return this.id;
    }
    public void idjenisuangmasuk (String value) {
        idjenisuangmasuk.add(value);
    }
    public ArrayList<String> getDatasetIdjenisuangmasuk(){
        return this.idjenisuangmasuk;
    }
    public void idsiswa (String value) {
        idsiswa.add(value);
    }
    public ArrayList<String> getDatasetIdsiswa(){
        return this.idsiswa;
    }
    public void jumlahuang (String value) {
        jumlahuang.add(value);
    }
    public ArrayList<String> getDatasetJumlahuang(){
        return this.jumlahuang;
    }
    public void tanggalmasuk (String value) {
        tanggalmasuk.add(value);
    }
    public ArrayList<String> getDatasetTanggalmasuk(){
        return this.tanggalmasuk;
    }
    public void updateterakhir (String value) {
        updateterakhir.add(value);
    }
    public ArrayList<String> getDatasetUpdateterakhir(){
        return this.updateterakhir;
    }
     public void tambahData(int Id, String Idjenisuangmasuk, String Idsiswa, String Jumlahuang, String Tanggalmasuk, String Updateterakhir){
     this.id.add(Id);
     this.idjenisuangmasuk.add(Idjenisuangmasuk);
     this.idsiswa.add(Idsiswa);
     this.jumlahuang.add(Jumlahuang);
     this.tanggalmasuk.add(Tanggalmasuk);
     this.updateterakhir.add(Updateterakhir);
     
      }
    
}
