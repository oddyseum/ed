package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

import java.awt.event.ActionEvent;


public class Controller {
    @FXML private TableView<Persona> tableView;
    @FXML private Label label1;
    @FXML ObservableList<Persona> personas = FXCollections.observableArrayList(
            new Persona("Aaron","689 251 348"),
            new Persona("Pedrito","655 422 188"),
            new Persona("Charlie","644 472 531")
    );

    public void initialize(){
        System.out.println("Hola");
        label1.setText("Cambiando en initialize");
        tableView.setItems(personas);
    }

    @FXML private void onButtonAction(ActionEvent actionEvent){

    }

    public static class Persona{
        private String nombre;
        private String telefono;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public Persona(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }
    }
}
