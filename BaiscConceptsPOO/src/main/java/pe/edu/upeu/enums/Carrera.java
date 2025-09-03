package pe.edu.upeu.enums;

enum FALCULTAD{
    FIA,
    FCE,
    FACIHED,
    FCS
}

public enum Carrera {
    Sistemas(FALCULTAD.FIA),
    Civil(FALCULTAD.FIA),
    Ambiental(FALCULTAD.FIA),
    Arquitectura(FALCULTAD.FIA),

    Administracion(FALCULTAD.FCE),
    Contabilidad(FALCULTAD.FCS);

    FALCULTAD falcultad;
    Carrera(FALCULTAD facultad) {
       this.falcultad = facultad;
    }
}
