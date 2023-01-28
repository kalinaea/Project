package app;

import io.github.humbleui.jwm.*;

import java.util.function.Consumer;

/**
 * Класс приложения
 */
public class Application implements Consumer<Event> {
    /**
     * Окно приложения
     */
    private final Window window;
    /**
     * Конструктор класса
     */
    public Application() {
        window = App.makeWindow();
        window.setEventListener(this);
        window.setVisible(true);
    }

    /**
     *
     * @param e the input argument
     */
    @Override
    public void accept(Event e) {
        if (e instanceof EventWindowClose) {
            App.terminate();
        }else if (e instanceof EventWindowCloseRequest) {
            window.close();
        }
    }
}