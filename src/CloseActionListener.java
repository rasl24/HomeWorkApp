import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// класс реализует метод интерфейса ActionListener
public class CloseActionListener implements ActionListener {
    @Override
    //реализация метода из интерфейса
    public void actionPerformed(ActionEvent e) {
        // прописывается логика завершения приложения полностью
        System.exit(0);
    }
}
