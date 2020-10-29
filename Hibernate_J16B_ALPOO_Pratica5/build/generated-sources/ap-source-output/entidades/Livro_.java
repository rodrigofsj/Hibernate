package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Livro.class)
public abstract class Livro_ {

	public static volatile SingularAttribute<Livro, Autor> Autores;
	public static volatile SingularAttribute<Livro, Double> custo;
	public static volatile SingularAttribute<Livro, String> titulo;
	public static volatile SingularAttribute<Livro, Integer> Id;
	public static volatile SingularAttribute<Livro, Integer> edicao;
	public static volatile ListAttribute<Livro, Editoras> editora;

}

