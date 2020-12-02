package model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Dragonous
 */

@Entity
public class Curso 
{
    @Id
    @GeneratedValue
    private long curs_Id;
    private String curs_Nome;
    private Double curs_Credito;

    
    public Curso()
    {
        
    }

    public Curso(long curs_Id, String curs_Nome, Double curs_Credito) {
        this.curs_Id = curs_Id;
        this.curs_Nome = curs_Nome;
        this.curs_Credito = curs_Credito;
    }

    //000000000000000000000000000000000000000000

    public long getCurs_Id() {
        return curs_Id;
    }

    public void setCurs_Id(long curs_Id) {
        this.curs_Id = curs_Id;
    }

    public String getCurs_Nome() {
        return curs_Nome;
    }

    public void setCurs_Nome(String curs_Nome) {
        this.curs_Nome = curs_Nome;
    }

    public Double getCurs_Credito() {
        return curs_Credito;
    }

    public void setCurs_Credito(Double curs_Credito) {
        this.curs_Credito = curs_Credito;
    }
    
}
    