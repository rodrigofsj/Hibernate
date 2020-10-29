package main;

import entidades.Autor;
import entidades.Editoras;
import entidades.Email;
import entidades.Livro;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Daniel Felipe e Rodrigo Felipe
 */
public class main {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate_J16B_ALPOO_Pratica5PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();  
        
        //<INSERINDO INFORMAÇÕES DOS AUTORES>//
        Autor A1 = new Autor();
        A1.setNome("Friedrich Nietzsch");
        A1.email = new ArrayList<Email>();
        A1.email.add(new Email("friedrichnietzsche@martinclaret.com"));
        
        Autor A2 = new Autor();
        A2.setNome("Nicholas Sparks");
        A2.email = new ArrayList<Email>();
        A2.email.add(new Email("nicholassparks@arqueiro.com"));
        
        Autor A3 = new Autor();
        A3.setNome("Clarice Lispector");
        A3.email = new ArrayList<Email>();
        A3.email.add(new Email("claricelispector@rocco.com")); 
        
        Autor A4 = new Autor();
        A4.setNome("Augusto Cury");
        A4.email = new ArrayList<Email>();
        A4.email.add(new Email("augustocury@saraiva.com"));
        
        Autor A5 = new Autor();
        A5.setNome("Daniel");
        A5.email = new ArrayList<Email>();
        A5.email.add(new Email("daniel@hotmailc.om"));
        
        Autor A6 = new Autor();
        A6.setNome("Felipe");
        A6.email = new ArrayList<Email>();
        A6.email.add(new Email("felipe@hotmail.com"));
        
        Autor A7 = new Autor();
        A7.setNome("Mizan");
        A7.email = new ArrayList<Email>();
        A7.email.add(new Email("mizan@hotmail.com"));
        
        Autor A8 = new Autor();
        A8.setNome("Rodrigo");
        A8.email = new ArrayList<Email>();
        A8.email.add(new Email("rodrigo@hotmail.com")); 
        
        Autor A9 = new Autor();
        A9.setNome("Silva");
        A9.email = new ArrayList<Email>();
        A9.email.add(new Email("silva@gmail.com"));
        
        Autor A10 = new Autor();
        A10.setNome("Jesus");
        A10.email = new ArrayList<Email>();
        A10.email.add(new Email("jesus@gmail.com"));
        
        Autor A11 = new Autor();
        A11.setNome("Murilo");
        A11.email = new ArrayList<Email>();
        A11.email.add(new Email("murilo@yahoo.com"));
        
        Autor A12 = new Autor();
        A12.setNome("Guilherme");
        A12.email = new ArrayList<Email>();
        A12.email.add(new Email("guilherme@hotmail.com"));
        
        Autor A13 = new Autor();
        A13.setNome("Keila");
        A13.email = new ArrayList<Email>();
        A13.email.add(new Email("keila@gmail.com")); 
        
        Autor A14 = new Autor();
        A14.setNome("Helen");
        A14.email = new ArrayList<Email>();
        A14.email.add(new Email("helen@gmail.com"));
        
        Autor A15 = new Autor();
        A15.setNome("Julia");
        A15.email = new ArrayList<Email>();
        A15.email.add(new Email("julia@hotmail.com"));
        
        Autor A16 = new Autor();
        A16.setNome("Jullie");
        A16.email = new ArrayList<Email>();
        A16.email.add(new Email("jullie@hotmail.com"));
        
        Autor A17 = new Autor();
        A17.setNome("Binho");
        A17.email = new ArrayList<Email>();
        A17.email.add(new Email("binho@gmail.com"));
        
        Autor A18 = new Autor();
        A18.setNome("João");
        A18.email = new ArrayList<Email>();
        A18.email.add(new Email("joao@gmail.com")); 
        
        Autor A19 = new Autor();
        A19.setNome("Emerson");
        A19.email = new ArrayList<Email>();
        A19.email.add(new Email("emerson@hotmail.com"));
        
        Autor A20 = new Autor();
        A20.setNome("Ronaldo");
        A20.email = new ArrayList<Email>();
        A20.email.add(new Email("ronaldo@yahoo.com"));
        
        Autor A21 = new Autor();
        A21.setNome("Maria");
        A21.email = new ArrayList<Email>();
        A21.email.add(new Email("maria@hotmail.com"));
        
        Autor A22 = new Autor();
        A22.setNome("Juliana");
        A22.email = new ArrayList<Email>();
        A22.email.add(new Email("juliana@hotmail.com"));
        
        Autor A23 = new Autor();
        A23.setNome("Sandra");
        A23.email = new ArrayList<Email>();
        A23.email.add(new Email("sandra@yahoo.com")); 
        
        Autor A24 = new Autor();
        A24.setNome("Alberto");
        A24.email = new ArrayList<Email>();
        A24.email.add(new Email("alberto@hotmail.com"));
        
        Autor A25 = new Autor();
        A25.setNome("Milena");
        A25.email = new ArrayList<Email>();
        A25.email.add(new Email("milena@hotmail.com"));
        
        //<INSERINDO INFORMAÇÕES DE LIVROS>//  
        Livro L1 = new Livro();
        L1.setAutores(A1);
        L1.setEdicao(1);
        L1.setCusto(139.30);
        L1.setTitulo("Assim Falou Zaratustra");
        
        Livro L2 = new Livro();
        L2.setAutores(A2);
        L2.setEdicao(2);
        L2.setCusto(99.99);
        L2.setTitulo("No Seu Olhar");
        
        Livro L3 = new Livro();
        L3.setAutores(A3);
        L3.setEdicao(3);
        L3.setCusto(79.00);
        L3.setTitulo("A Hora da Estrela");
    
        Livro L4 = new Livro();
        L4.setAutores(A4);
        L4.setEdicao(4);
        L4.setCusto(98.00);
        L4.setTitulo("Fogo & Sangue – Vol. 1");
        
        Livro L5 = new Livro();
        L5.setAutores(A5);
        L5.setEdicao(5);
        L5.setCusto(76.30);
        L5.setTitulo("Como Enfrentar o Mal do Século");
        
        Livro L6 = new Livro();
        L6.setAutores(A6);
        L6.setEdicao(6);
        L6.setCusto(10.00);
        L6.setTitulo("Java");
        
        Livro L7 = new Livro();
        L7.setAutores(A7);
        L7.setEdicao(7);
        L7.setCusto(12.00);
        L7.setTitulo("Python");
        
        Livro L8 = new Livro();
        L8.setAutores(A8);
        L8.setEdicao(8);
        L8.setCusto(80.00);
        L8.setTitulo("C++");
    
        Livro L9 = new Livro();
        L9.setAutores(A9);
        L9.setEdicao(9);
        L9.setCusto(15.00);
        L9.setTitulo("SQL");
        
        Livro L10 = new Livro();
        L10.setAutores(A10);
        L10.setEdicao(10);
        L10.setCusto(100.00);
        L10.setTitulo("Banco de Dados");
        
        Livro L11 = new Livro();
        L11.setAutores(A11);
        L11.setEdicao(11);
        L11.setCusto(50.00);
        L11.setTitulo("HTML");
        
        Livro L12 = new Livro();
        L12.setAutores(A12);
        L12.setEdicao(12);
        L12.setCusto(20.00);
        L12.setTitulo("CSS");
        
        Livro L13 = new Livro();
        L13.setAutores(A13);
        L13.setEdicao(13);
        L13.setCusto(67.00);
        L13.setTitulo("JavaScript");
    
        Livro L14 = new Livro();
        L14.setAutores(A14);
        L14.setEdicao(14);
        L14.setCusto(19.00);
        L14.setTitulo("Programação Orientada a Objetos");
        
        Livro L15 = new Livro();
        L15.setAutores(A15);
        L15.setEdicao(15);
        L15.setCusto(15.00);
        L15.setTitulo("Programação Estruturada");
        
        Livro L16 = new Livro();
        L16.setAutores(A16);
        L16.setEdicao(16);
        L16.setCusto(30.00);
        L16.setTitulo("Programação Web");
        
        Livro L17 = new Livro();
        L17.setAutores(A17);
        L17.setEdicao(17);
        L17.setCusto(35.00);
        L17.setTitulo("Inteligencia Artificial");
        
        Livro L18 = new Livro();
        L18.setAutores(A18);
        L18.setEdicao(18);
        L18.setCusto(47.00);
        L18.setTitulo("Hardware");
    
        Livro L19 = new Livro();
        L19.setAutores(A19);
        L19.setEdicao(19);
        L19.setCusto(26.00);
        L19.setTitulo("Software");
        
        Livro L20 = new Livro();
        L20.setAutores(A20);
        L20.setEdicao(20);
        L20.setCusto(21.00);
        L20.setTitulo("Redes de Computadores");
        
        Livro L21 = new Livro();
        L21.setAutores(A21);
        L21.setEdicao(21);
        L21.setCusto(57.00);
        L21.setTitulo("Universidade Paulista");
        
        Livro L22 = new Livro();
        L22.setAutores(A22);
        L22.setEdicao(22);
        L22.setCusto(32.00);
        L22.setTitulo("Matemática Discreta");
        
        Livro L23 = new Livro();
        L23.setAutores(A23);
        L23.setEdicao(23);
        L23.setCusto(41.00);
        L23.setTitulo("Física para Computação");
    
        Livro L24 = new Livro();
        L24.setAutores(A24);
        L24.setEdicao(24);
        L24.setCusto(92.00);
        L24.setTitulo("Interface Homem Computador");
        
        Livro L25 = new Livro();
        L25.setAutores(A25);
        L25.setEdicao(25);
        L25.setCusto(50.00);
        L25.setTitulo("Título");
        
        //<INSERINDO INFORMAÇÕES DE EDITORAS>// 
        Editoras E1 = new Editoras();
        E1.setLivros(L1);
        E1.setNome("Martin Claret");
        
        Editoras E2 = new Editoras();
        E2.setLivros(L2);
        E2.setNome("Arqueiro");
        
        Editoras E3 = new Editoras();
        E3.setLivros(L3);
        E3.setNome("Rocco");
        
        Editoras E4 = new Editoras();
        E4.setLivros(L4);
        E4.setNome("Suma");
        
        Editoras E5 = new Editoras();
        E5.setLivros(L5);
        E5.setNome("Saraiva");
        
        Editoras E6 = new Editoras();
        E6.setLivros(L6);
        E6.setNome("Laranja");
        
        Editoras E7 = new Editoras();
        E7.setLivros(L7);
        E7.setNome("Verde");
        
        Editoras E8 = new Editoras();
        E8.setLivros(L8);
        E8.setNome("Azul");
        
        Editoras E9 = new Editoras();
        E9.setLivros(L9);
        E9.setNome("Branco");
        
        Editoras E10 = new Editoras();
        E10.setLivros(L10);
        E10.setNome("Preto");
        
        Editoras E11 = new Editoras();
        E11.setLivros(L11);
        E11.setNome("Saranca");
        
        Editoras E12 = new Editoras();
        E12.setLivros(L12);
        E12.setNome("Brasil");
        
        Editoras E13 = new Editoras();
        E13.setLivros(L13);
        E13.setNome("Marshmallow");
        
        Editoras E14 = new Editoras();
        E14.setLivros(L14);
        E14.setNome("LerVida");
        
        Editoras E15 = new Editoras();
        E15.setLivros(L15);
        E15.setNome("Apocasd");
        
        Editoras E16 = new Editoras();
        E16.setLivros(L16);
        E16.setNome("Sereint");
        
        Editoras E17 = new Editoras();
        E17.setLivros(L17);
        E17.setNome("Acolsk");
        
        Editoras E18 = new Editoras();
        E18.setLivros(L18);
        E18.setNome("Testing");
        
        Editoras E19 = new Editoras();
        E19.setLivros(L19);
        E19.setNome("WorkStation");
        
        Editoras E20 = new Editoras();
        E20.setLivros(L20);
        E20.setNome("DDRLAM");
        
        Editoras E21 = new Editoras();
        E21.setLivros(L21);
        E21.setNome("Meritec");
        
        Editoras E22 = new Editoras();
        E22.setLivros(L22);
        E22.setNome("Kilmo");
        
        Editoras E23 = new Editoras();
        E23.setLivros(L23);
        E23.setNome("Abcdario");
        
        Editoras E24 = new Editoras();
        E24.setLivros(L24);
        E24.setNome("Oplaco");
        
        Editoras E25 = new Editoras();
        E25.setLivros(L25);
        E25.setNome("Opção");
    
        try{
            
            em.persist(A1);
            em.persist(A2);
            em.persist(A3);
            em.persist(A4);
            em.persist(A5);
            em.persist(A6);
            em.persist(A7);
            em.persist(A8);
            em.persist(A9);
            em.persist(A10);
            em.persist(A11);
            em.persist(A12);
            em.persist(A13);
            em.persist(A14);
            em.persist(A15);
            em.persist(A16);
            em.persist(A17);
            em.persist(A18);
            em.persist(A19);
            em.persist(A20);
            em.persist(A21);
            em.persist(A22);
            em.persist(A23);
            em.persist(A24);
            em.persist(A25);
            
            em.persist(L1);
            em.persist(L2);
            em.persist(L3);
            em.persist(L4);
            em.persist(L5);
            em.persist(L6);
            em.persist(L7);
            em.persist(L8);
            em.persist(L9);
            em.persist(L10);
            em.persist(L11);
            em.persist(L12);
            em.persist(L13);
            em.persist(L14);
            em.persist(L15);
            em.persist(L16);
            em.persist(L17);
            em.persist(L18);
            em.persist(L19);
            em.persist(L20);
            em.persist(L21);
            em.persist(L22);
            em.persist(L23);
            em.persist(L24);
            em.persist(L25);
            
            em.persist(E1);
            em.persist(E2);
            em.persist(E3);
            em.persist(E4);
            em.persist(E5);
            em.persist(E6);
            em.persist(E7);
            em.persist(E8);
            em.persist(E9);
            em.persist(E10);
            em.persist(E11);
            em.persist(E12);
            em.persist(E13);
            em.persist(E14);
            em.persist(E15);
            em.persist(E16);
            em.persist(E17);
            em.persist(E18);
            em.persist(E19);
            em.persist(E20);
            em.persist(E21);
            em.persist(E22);
            em.persist(E23);
            em.persist(E24);
            em.persist(E25);
            
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            
        }

            //<Consulta HQL ex 2>//
            Editoras editoraBusca = em.find(Editoras.class, 0);
        
            String consulta1 = "from Editoras";
            Query q1 = em.createQuery(consulta1);
            List resultado1 = q1.getResultList();
            
            for(Object ob: resultado1){
            }
            
            // Find Object
            Editoras edi = em.find(Editoras.class, 0);
            System.out.println("**************************************************************************");;
            System.out.println("NOME DA EDITORA: " + E25.getNome());
            System.out.println("ID DA EDITORA: " + E25.getId());  
            System.out.println("**************************************************************************");
            
            //------------------<Consulta HQL ex 1>------------------//
            Autor autorBusca = em.find(Autor.class, 0);

            String consulta0 = "from Autor";
            Query q0 = em.createQuery(consulta0);
            List<Object> resultado0 = q0.getResultList();

            for(Object ob: resultado0){
                A1 = (Autor)ob;
                System.out.println("**************************************************************************");
                System.out.println("NOME: " + A1.nome);
                System.out.println("ID: " + A1.getId());
                System.out.println("**************************************************************************");
            }
        
            em.close();
            emf.close();    
        }
}  
