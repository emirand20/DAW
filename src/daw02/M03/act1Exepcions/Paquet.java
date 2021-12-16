package M03.act1Exepcions;

import java.time.LocalDate;

/**
 *
 * @author Juanma Sánchez
 */
public class Paquet {
    
    private int id;
    private LocalDate dataExpedicio;

    public Paquet(int id, LocalDate dataExpedicio) {
        this.id = id;
        this.dataExpedicio = dataExpedicio;
    }

    @Override
    public String toString() {
        return "Paquet{" + "id=" + id + ", dataExpedicio=" + dataExpedicio + '}';
    }   
    
}