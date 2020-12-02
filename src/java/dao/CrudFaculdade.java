package dao;
import java.util.List;

/**
 *
 * @author Dragonous
 */
public interface CrudFaculdade<T> 
{
    
    public void salvar(T obj);

    public T getById(long id);

    public List<T> listar();

    public void deletar(T obj);

    public void alterar(T obj);
}