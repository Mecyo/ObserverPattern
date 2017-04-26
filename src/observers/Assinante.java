package observers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Observable;
import java.util.Observer;
import model.Revista;

/**
 *
 * @author Emerson
 */
public class Assinante implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        
        if (arg != null) {
            Revista revista = (Revista) arg;
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Editora: " + o.toString());
            System.out.println("Revista: " + revista.getTitulo() + ". Publicada em: " + format.format(revista.getDataPublicacao()));
        }
    }
    
}
