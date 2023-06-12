/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalishaariyani2110010423;

/**
 *
 * @author windows 10
 */
public class transaksiuangkeluar {
    private int id;
    private String idjenisuangkeluar;
    private String jumlahuang;
    private String tanggalkeluar;
    private String updateterakhir;
    
    public transaksiuangkeluar(){
        
    }
    public void setid (int id) {
        this.id=id;
    }
    public int getid(){
        return this.id; 
    }
    public void setidjenisuangkeluar (String idjenisuangkeluar) {
        this.idjenisuangkeluar=idjenisuangkeluar;
    }
    public String getidjenisuangkeluar(){
        return this.idjenisuangkeluar;
    }
    public void setjumlahuang (String jumlahuang) {
        this.jumlahuang=jumlahuang;
    }  
    public String getjumlahuang(){
        return this.jumlahuang; 
     }
    public void settanggalkeluar (String tanggalkeluar) {
        this.tanggalkeluar=tanggalkeluar;
    }  
    public String gettanggalkeluar(){
        return this.tanggalkeluar; 
     }
    public void setupdateterakhir(String updateterakhir){
        this.updateterakhir=updateterakhir;
    }
    public String getupdateterakhir(){
        return this.updateterakhir;
    }
    
}
