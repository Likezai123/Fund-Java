package pe.edu.upeu.asistencia.enums;

public enum Carrera {
    SISTEMAS(Facultad.FIA),
    CIVIL(Facultad.FIA),
    ADMINISTRACION(Facultad.FCE),
    NUTRICION(Facultad.FCE),
    EDUCACION(Facultad.FCS),


GENERAL(Facultad.GENERAL);
private Facultad facultad;


private Carrera(Facultad facultad){
    this.facultad=facultad;

}
public Facultad getFacultad() {
    return facultad;

}
}
