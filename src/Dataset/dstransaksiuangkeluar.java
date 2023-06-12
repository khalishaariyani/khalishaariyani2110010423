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
public class dstransaksiuangkeluar {
    private ArrayList<Integer> id;
    private ArrayList<String> idjenisuangkeluar;
    private ArrayList<String> jumlahuang;
    private ArrayList<String> tanggalkeluar; 
    private ArrayList<String> updateterakhir;
    
     public dstransaksiuangkeluar (){
     id= new ArrayList<Integer>();
     idjenisuangkeluar= new ArrayList<String>();
     jumlahuang= new ArrayList<String>();
     tanggalkeluar= new ArrayList<String>();
     updateterakhir= new ArrayList<String>();
     
    }
    public void id (Integer value) {
        id.add(value);
    }
    public ArrayList<Integer> getDatasetId(){
        return this.id;
    }
     public void idjenisuangkeluar (String value) {
        idjenisuangkeluar.add(value);
    }
    public ArrayList<String> getDatasetIdjenisuangkeluar(){
        return this.idjenisuangkeluar;
    }
    public void jumlahuang (String value) {
        jumlahuang.add(value);
    }
    public ArrayList<String> getDatasetJumlahuang(){
        return this.jumlahuang;
    }
    public void tanggalkeluar (String value) {
        tanggalkeluar.add(value);
    }
    public ArrayList<String> getDatasetTanggalkeluar(){
        return this.tanggalkeluar;
    }
     public void updateterakhir (String value) {
        updateterakhir.add(value);
    }
    public ArrayList<String> getDatasetUpdateterakhir(){
        return this.updateterakhir;
    }
    public void tambahData(int Id, String Idjenisuangkeluar, String Jumlahuang, String Tanggalkeluar, String Updateterakhir){
     this.id.add(Id);
     this.idjenisuangkeluar.add(Idjenisuangkeluar);
     this.jumlahuang.add(Jumlahuang);
     this.tanggalkeluar.add(Tanggalkeluar);
     this.updateterakhir.add(Jumlahuang);
      }
   
}
