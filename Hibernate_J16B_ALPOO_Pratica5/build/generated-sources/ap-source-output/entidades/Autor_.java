package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Autor.class)
public abstract class Autor_ {

	public static volatile ListAttribute<Autor, Livro> Livros;
	public static volatile SingularAttribute<Autor, String> nome;
	public static volatile SingularAttribute<Autor, Integer> Id;
	public static volatile ListAttribute<Autor, Email> email;

}

