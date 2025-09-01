package pe.edu.upeu.asistencia.servicio;

import org.springframework.stereotype.Service;
import pe.edu.upeu.asistencia.modelo.Participante;
import pe.edu.upeu.asistencia.repositorio.ParticipanteRepositorio;

import java.util.List;

@Service
public class ParticipanteServicioImp implements ParticipanteServicioI {

    private final ParticipanteRepositorio participanteRepositorio = new ParticipanteRepositorio() {};

    @Override
    public void save(Participante participante) {
        participanteRepositorio.listaParticipantes.add(participante);
    }

    @Override
    public List<Participante> findAll() {
        if (participanteRepositorio.listaParticipantes.isEmpty()) {
            return participanteRepositorio.findAllEntidades();
        }
        return participanteRepositorio.listaParticipantes;
    }

    @Override
    public void update(Participante participante, int index) {
        participanteRepositorio.listaParticipantes.set(index, participante);
    }

    @Override
    public void delete(int index) {
        participanteRepositorio.listaParticipantes.remove(index);
    }

    @Override
    public Participante findById(int index) {
        return participanteRepositorio.listaParticipantes.get(index);
    }
}
