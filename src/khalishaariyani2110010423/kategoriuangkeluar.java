/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalishaariyani2110010423;

/**
 *
 * @author windows 10
 */
public class kategoriuangkeluar {
   private int id;
    private String namajenis;
    private String updateterakhir;

    
    public kategoriuangkeluar(){
        
    }
    public void setid (int id) {
        this.id=id;
    }
    public int getid(){
        return this.id; 
    }
     public void setnamajenis (String namajenis) {
        this.namajenis=namajenis;
    }
    public String getnamajenis(){
        return this.namajenis;
    }
    public void setupdateterakhir(String updateterakhir){
        this.updateterakhir=updateterakhir;
    }
    public String getupdateterakhir(){
        return this.updateterakhir;
    }
}
