package entidades;
/**
 *
 * @author Daniel Felipe e Rodrigo Felipe
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Editora")
public class Editoras{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Editora", nullable = true)
    Integer Id;
    
    @Column(name="Nome", length=100, nullable = false)
    private String nome;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="IDFK_Editora_Livros")
    public Livro Livros;
    
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

    public Livro getLivros() {
        return Livros;
    }

    public void setLivros(Livro Livros) {
        this.Livros = Livros;
    }
}