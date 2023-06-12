/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalishaariyani2110010423;

/**
 *
 * @author windows 10
 */
public class kategoriuangmasuk {
    private int idjenisuangmasuk;
    private String namajenis;
    private String terkaitsiswa;
    private String updateterakhir;
    
    public kategoriuangmasuk(){
        
    }
      public void setidjenisuangmasuk (int idjenisuangmasuk) {
        this.idjenisuangmasuk=idjenisuangmasuk;
    }
    public int getidjenisuangmasuk(){
        return this.idjenisuangmasuk;
    }
    public void setnamajenis (String namajenis) {
        this.namajenis=namajenis;
    }
    public String getnamajeinis(){
        return this.namajenis;
    }
     public void setterkaitsiswa (String terkaitsiswa) {
        this.terkaitsiswa=terkaitsiswa;
    }
    public String getterkaitsiswa(){
        return this.terkaitsiswa;
    }
    public void setupdateterakhir(String updateterakhir){
        this.updateterakhir=updateterakhir;
    }
    public String getupdateterakhir(){
        return this.updateterakhir;
    }
    
    
}


