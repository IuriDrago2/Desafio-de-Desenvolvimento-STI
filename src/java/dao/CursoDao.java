package dao;
import model.Curso;
import utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Dragonous
 */
public class CursoDao implements CrudFaculdade<Curso> 
{

    @Override
    public void salvar(Curso obj) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction operacaoSQL = session.beginTransaction();
        session.save(obj);
        operacaoSQL.commit();
    }

    @Override
    public Curso getById(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Curso) session.load(Curso.class, id);
    }

    @Override
    public List<Curso> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction operacaoSQL = session.beginTransaction();
        List objetos = session.createQuery("from Curso").list();
        operacaoSQL.commit();
        return objetos;
    }

    @Override
    public void deletar(Curso obj) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction operacaoSQL = session.beginTransaction();
        session.delete(obj);
        operacaoSQL.commit();
    }

    @Override
    public void alterar(Curso obj) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction operacaoSQL = session.beginTransaction();
        session.update(obj);
        operacaoSQL.commit();
    }

}