/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author yayah
 */
public class EditarPubli2 {
     private String titulo;
    private String queperdio;
    private String imgb64;
    private String luc;
    private String horae;
    private String colors;
    
    public EditarPubli2(String titulo,String queperdio,String imgb64 ,String luc, String horae, String colors) {
        this.titulo = titulo;
        this.queperdio = queperdio;
        this.imgb64 = imgb64;
        this.luc = luc;
        this.horae = horae;
        this.colors = colors;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getQueperdio() {
        return queperdio;
    }

    public void setQueperdio(String queperdio) {
        this.queperdio = queperdio;
    }

    public String getImgb64() {
        return imgb64;
    }

    public void setImgb64(String imgb64) {
        this.imgb64 = imgb64;
    }

    public String getLuc() {
        return luc;
    }

    public void setLuc(String luc) {
        this.luc = luc;
    }

    public String getHorae() {
        return horae;
    }

    public void setHorae(String horae) {
        this.horae = horae;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }
   
    
}
