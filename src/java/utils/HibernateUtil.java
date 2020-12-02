package utils;
import model.Curso;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Dragonous
 */

public class HibernateUtil {
 
    private static SessionFactory sessionFactory;

    public HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            try {
                AnnotationConfiguration db = new AnnotationConfiguration();
                db.addAnnotatedClass(Curso.class);// MOR(Modelo Objeto Relacional)
                sessionFactory = db.configure().buildSessionFactory();

            } catch (Exception e) {
                System.out.println("Erro ao criar conexão: " + e.getMessage());
            }
            return sessionFactory;
        } else {
            return sessionFactory;
        }

    }

}