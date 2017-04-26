package model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Emerson
 */
public class Revista {
    
    private String titulo;
    private Date dataPublicacao;

    public Revista(String titulo, Date dataPublicacao) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
}
