package pe.edu.upeu.asistencia.control;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import org.springframework.stereotype.Controller;

@Controller
public class MainguiController {

    @FXML
    private BorderPane bp;

    @FXML
    private MenuBar menuBar;

    @FXML
    private TabPane tabPane;

    @FXML
    private Menu menu1;

    @FXML
    private MenuItem menuItem1;

    @FXML
    public void initialize(){
        MenuListener menuListener=new MenuListener();
        MenuItemListener menuItemListener=new MenuItemListener();
        menuItem1.setOnAction(menuItemListener::handle);
    }

    class MenuItemListener{
        public void handle(ActionEvent e){
            System.out.println(menuItem1.getText());

            if(e.getSource() == menuItem1){
                System.out.println(menuItem1.getText());

            }

        }


    }

    class MenuListener{
        public void menuSelected(Event e){

        }

    }


}
