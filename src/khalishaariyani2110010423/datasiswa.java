/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khalishaariyani2110010423;

/**
 *
 * @author windows 10
 */
public class datasiswa {
    private int idsiswa;
    private String namasiswa;
    private String namalengkap;
    private String jeniskelamin;
    private String nohp;
    private String updateterakhir;
    
    public datasiswa(){
        
    }
     public void setidsiswa (int idsiswa) {
        this.idsiswa=idsiswa;
    }
    public int getidsiswa(){
        return this.idsiswa;
    }
    public void setnamasiswa (String namasiswa) {
        this.namasiswa=namasiswa;
    }
    public String getnamasiswa(){
        return this.namasiswa;
    }
      public void setnamalengkap (String namalengkap) {
        this.namalengkap=namalengkap;
    }
    public String getnamalengkap(){
        return this.namalengkap;
    }
     public void setjeniskelamin (String jeniskelamin) {
        this.jeniskelamin=jeniskelamin;
    }
    public String getjeniskelamin(){
        return this.jeniskelamin;
    }
      public void setnohp (String nohp) {
        this.nohp=nohp;
    }
    public String getnohp(){
        return this.nohp;
    }
        public void setupdateterakhir(String updateterakhir){
        this.updateterakhir=updateterakhir;
    }
    public String getupdateterakhir(){
        return this.updateterakhir;
    }
    
}
