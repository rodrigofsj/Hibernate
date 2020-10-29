package entidades;
/**
 *
 * @author Daniel Felipe e Rodrigo Felipe
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Email")
public class Email{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Email", nullable = true)
    Integer Id;
    
    private String Email;
    
    public Integer getId() {
        return Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Email(String Email) {
        this.Email = Email;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
