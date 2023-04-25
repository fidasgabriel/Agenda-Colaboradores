import javax.management.ObjectName;
import java.util.List;

public class Agenda {
    private List agenda;

    public Agenda(List agenda) {
        this.agenda = agenda;
    }

    public Object getAgenda() {
        for(int i = 0; i < this.agenda.size(); i++){
            return agenda.get(i).getClass();
        }
        return "Não tem registros nessa lista";
    }

    public void setAgenda(List agenda) {
        this.agenda = agenda;
    }
}
