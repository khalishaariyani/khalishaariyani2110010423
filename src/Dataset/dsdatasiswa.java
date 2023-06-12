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
public class dsdatasiswa {
    private ArrayList<Integer> idsiswa;
    private ArrayList<String> namasiswa;
    private ArrayList<String> namalengkap;
    private ArrayList<String> jeniskelamin;
    private ArrayList<String> nohp; 
    private ArrayList<String> updateterakhir;
    
     public dsdatasiswa (){
     idsiswa= new ArrayList<Integer>();
     namasiswa= new ArrayList<String>();
     namalengkap= new ArrayList<String>();
     jeniskelamin= new ArrayList<String>();
     nohp= new ArrayList<String>();
     updateterakhir= new ArrayList<String>();
     
    }
    public void idsiswa (Integer value) {
        idsiswa.add(value);
    }
    public ArrayList<Integer> getDatasetIdsiswa(){
        return this.idsiswa;
    }
    public void namasiswa (String value) {
        namasiswa.add(value);
    }
    public ArrayList<String> getDatasetNamasiswa(){
        return this.namasiswa;
    }
     public void namalengkap (String value) {
        namalengkap.add(value);
    }
    public ArrayList<String> getDatasetNamalengkap(){
        return this.namalengkap;
    }
      public void jeniskelamin (String value) {
        jeniskelamin.add(value);
    }
    public ArrayList<String> getDatasetJenskelamin(){
        return this.jeniskelamin;
    }
    public void nohp (String value) {
        nohp.add(value);
    }
    public ArrayList<String> getDatasetNohp(){
        return this.nohp;
    }
     public void updateterakhir (String value){
        updateterakhir.add(value);
    }
    public ArrayList<String> getDatasetUpdateterakhir(){
        return this.updateterakhir;
    }
    public void tambahData(int Idsiswa, String Namasiswa, String Namalengkap, String Jeniskelamin, String Nohp, String Updateterakhir){
     this.idsiswa.add(Idsiswa);
     this.namasiswa.add(Namasiswa);
     this.namalengkap.add(Namalengkap);
     this.jeniskelamin.add(Jeniskelamin);
     this.nohp.add(Nohp);
     this.updateterakhir.add(Updateterakhir);
    
}
}

    


