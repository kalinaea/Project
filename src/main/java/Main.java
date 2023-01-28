import app.Application;
import io.github.humbleui.jwm.App;
/**
 * Главный класс
 */
public class Main {
    /**
     * Главный метод
     * @param args - аргументы командной строки
     */
    public static void main(String[] args) {
        App.start(Application::new);


    }
}
