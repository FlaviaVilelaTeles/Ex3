import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaInsereProduto {
public static void main(String[] args)
{ EntityManagerFactory factory =
Persistence.createEntityManagerFactory("EcommerceDB");
EntityManager em = factory.createEntityManager();
Produto p = new Produto();
p.setNome("Sandalias");
p.setPreco(15.00);
Produto p1 = new Produto();
p1.setNome("brincos");
p1.setPreco(1.00);
em.getTransaction().begin();
em.persist(p);
em.persist(p1);
em.getTransaction().commit();
}
}