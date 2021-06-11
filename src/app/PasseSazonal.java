package app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PasseSazonal extends Epass{
    private String chaveValida;

    public PasseSazonal(){
        super();
    }

    public String getChaveValida() {
        return chaveValida;
    }

    public void setChaveValida(String chaveValida) {
        this.chaveValida = chaveValida;
    }

}
