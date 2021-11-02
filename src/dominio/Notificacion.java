/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Equipo 6
 */
public class Notificacion {
    private List<Usuario> usuariosEtiquetados;
    private String mensaje;
    private Date fechaHora;

    public Notificacion() {
        
    }    
    
    public Notificacion(List<Usuario> usuariosEtiquetados, String mensaje, Date fechaHora) {
        this.usuariosEtiquetados = usuariosEtiquetados;
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
    }

    public Notificacion(List<Usuario> usuariosEtiquetados, Date fechaHora) {
        this.usuariosEtiquetados = usuariosEtiquetados;
        this.fechaHora = fechaHora;
    }
    
    public List<Usuario> getUsuariosEtiquetados() {
        return usuariosEtiquetados;
    }

    public void setUsuariosEtiquetados(List<Usuario> usuariosEtiquetados) {
        this.usuariosEtiquetados = usuariosEtiquetados;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    
}
