package pe.edu.upeu.asistencia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AsistenciaApplication extends Application {

    private ConfigurableApplicationContext applicationContext;
    private Parent parent;

    public static void main(String[] args) {
        launch(args); // solo JavaFX, Spring se inicializa en init()
    }

    @Override
    public void init() throws Exception {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(AsistenciaApplication.class);
        builder.application().setWebApplicationType(WebApplicationType.NONE);
        applicationContext = builder.run(getParameters().getRaw().toArray(new String[0]));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main_asistencia.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        parent = loader.load();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        stage.setScene(new Scene(parent, bounds.getWidth(), bounds.getHeight() - 100));
        stage.setTitle("Asistencia Example");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        applicationContext.close();
    }
}
