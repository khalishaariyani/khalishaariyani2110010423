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
public class dskategoriuangmasuk {
     private ArrayList<Integer> idjenisuangmasuk;
    private ArrayList<String> namajenis;
    private ArrayList<String> terkaitsiswa;
    private ArrayList<String> updateterakhir;
    
     public dskategoriuangmasuk (){
     idjenisuangmasuk= new ArrayList<Integer>();
     namajenis= new ArrayList<String>();
     terkaitsiswa= new ArrayList<String>();
     updateterakhir= new ArrayList<String>();
     
     }
     public void idjenisuangmasuk (Integer value) {
        idjenisuangmasuk.add(value);
    }
    public ArrayList<Integer> getDatasetIdjenisuangmasuk(){
        return this.idjenisuangmasuk;
    }
    public void namajenis (String value) {
        namajenis.add(value);
    }
    public ArrayList<String> getDatasetNamajenis(){
        return this.namajenis;
    }
    public void terkaitsiswa (String value) {
        terkaitsiswa.add(value);
    }
    public ArrayList<String> getDatasetTerkaitsiswa(){
        return this.terkaitsiswa;
    }
    public void updateterakhir (String value){
        updateterakhir.add(value);
    }
    public ArrayList<String> getDatasetUpdateterakhir(){
        return this.updateterakhir;
    }
    public void tambahData(int Idjenisuangmasuk, String Namajenis, String Terkaitsiswa, String Updateterakhir){
     this.idjenisuangmasuk.add(Idjenisuangmasuk);
     this.namajenis.add(Namajenis);
     this.updateterakhir.add(Updateterakhir);
}
}