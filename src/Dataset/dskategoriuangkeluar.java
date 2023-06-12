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
public class dskategoriuangkeluar {
    private ArrayList<Integer> id;
    private ArrayList<String> namajenis;
    private ArrayList<String> updateterakhir;
    
    public dskategoriuangkeluar (){
     id= new ArrayList<Integer>();
     namajenis= new ArrayList<String>();
     updateterakhir= new ArrayList<String>();
    }
    public void id (Integer value) {
        id.add(value);
    }
    public ArrayList<Integer> getDatasetId(){
        return this.id;
    }
    public void namajenis (String value) {
        namajenis.add(value);
    }
    public ArrayList<String> getDatasetNamajenis(){
        return this.namajenis;
    }
    public void updateterakhir (String value) {
        updateterakhir.add(value);
    }
    public ArrayList<String> getDatasetUpdateterakhir(){
        return this.updateterakhir;
    }
      public void tambahData(int Id, String Namajenis, String Updateterakhir){
     this.id.add(Id);
     this.namajenis.add(Namajenis);
     this.updateterakhir.add(Updateterakhir);
    
}
}
    
    

