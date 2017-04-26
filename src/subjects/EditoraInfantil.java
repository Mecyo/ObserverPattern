package subjects;

import java.util.Date;
import java.util.Observable;
import model.Revista;

/**
 *
 * @author Emerson
 */
public class EditoraInfantil extends Observable{
    
    public void criarNovaEdicao() {
        Revista nova = new Revista("Turma da Mônica", new Date());
        setChanged();
        notifyObservers(nova);
    }
    
    public String toString() {
        return this.getClass().getSimpleName().replace("Editora", "");
    }
    
}
