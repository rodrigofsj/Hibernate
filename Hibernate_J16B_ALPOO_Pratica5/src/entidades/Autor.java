package entidades;
/**
 *
 * @author Daniel Felipe e Rodrigo Felipe
 */

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Autores")
public class Autor{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Autores", nullable = true)
    Integer Id;
    
    @Column(name="Nome", length=100, nullable=false)
    public String nome;
    
    @OneToMany(
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    @JoinColumn(name="IDFK_Email_Autores")
    
    public List<Email> email = new ArrayList();
    
    @OneToMany(
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
 
    public List<Livro> Livros; 

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Email> getEmail() {
        return email;
    }

    public void setEmail(List<Email> email) {
        this.email = email;
    }

    public List<Livro> getLivros() {
        return Livros;
    }

    public void setLivros(List<Livro> Livros) {
        this.Livros = Livros;
    }
}