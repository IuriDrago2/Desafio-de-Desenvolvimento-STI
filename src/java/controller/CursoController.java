package controller;
import dao.CrudFaculdade;
import dao.CursoDao;
import model.Curso;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Dragonous
 */
//------------------------------------------------------------------------

@ManagedBean(name = "cursoController", eager = true)
@SessionScoped
public class CursoController implements Serializable{
    
    private Curso curso;
    private DataModel listarCursos;
    private CrudFaculdade dao;
    
    public CursoController()
    {
        this.dao = new CursoDao();
    }
    
    /**
     * Carrega o formulário para adicionar um novo curso
     * contendo todos os campos populados para serem
     * alterados pelo usuário
     * @return manterCurso.html
     */
    public String actionAlterar() {
        curso = (Curso) (listarCursos.getRowData());
        return "manterCurso";
    }
    
    /**
     * Exclui do banco de dados o curso selecionado no GRID
     * da dataTable, retornando para a página principal
     * carregando novamente os dados da dataTable atualizados.
     * @return index.html
     */
    public String actionExcluir() {
        Curso objTemporario = (Curso) (listarCursos.getRowData());
        dao.deletar(objTemporario);
        return "index";
    }
    
    public String actionManterCurso(){
        curso = new Curso();
        return "manterCurso";
    }
    /**
     * Salva um novo curso no banco de dados
     * e retorna para a página principal
     * @return index.html
     */
    public String actionGravarNovo(){
        dao.salvar(curso);
        return "index";
    }
    /**
     * Salva os dados do curso com as alterações 
     * e retorna para a página principal atualizado a dataTable.
     * @return index.html
     */
    public String actionSalvarAlteracao(){
        dao.alterar(curso);
        return "index";
    }
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public DataModel getListarCursos() {
        List<Curso> lista = new CursoDao().listar();
        listarCursos = new ListDataModel(lista);
        return listarCursos;
    }

    public void setListarCursos(DataModel listarCursos) {
        this.listarCursos = listarCursos;
    }
    
}