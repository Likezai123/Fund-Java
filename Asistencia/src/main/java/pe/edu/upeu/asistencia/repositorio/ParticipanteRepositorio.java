package pe.edu.upeu.asistencia.repositorio;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;
import pe.edu.upeu.asistencia.modelo.Participante;

import java.util.ArrayList;
import java.util.List;

public abstract class ParticipanteRepositorio {
   public List<Participante> listaParticipantes = new ArrayList<>();

   public List<Participante> findAllEntidades() {

      listaParticipantes.add(
              new Participante(
                      new SimpleStringProperty("71184714"),
                      new SimpleStringProperty("Piero"),
                      new SimpleStringProperty("Ccari"),
                      new SimpleBooleanProperty(true), Carrera.SISTEMAS,
                      TipoParticipante.ASISTENTE
              )
      );
      listaParticipantes.add(
              new Participante(
                      new SimpleStringProperty("1"),
                      new SimpleStringProperty("a"),
                      new SimpleStringProperty("e"),
                      new SimpleBooleanProperty(true), Carrera.SISTEMAS,
                      TipoParticipante.ASISTENTE
              )
      );


      return listaParticipantes;
   }
}
