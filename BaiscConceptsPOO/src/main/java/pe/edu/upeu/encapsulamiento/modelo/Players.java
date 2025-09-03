package pe.edu.upeu.encapsulamiento.modelo;


import lombok.*;

//@Setter
//@Getter

@NoArgsConstructor
@AllArgsConstructor
@Data //genera todos los metodos get y set
//@ToString
public class Players {

    //atributo
    private String nombre;
    private String apellido;
    private int edad;
    private String posicion;
    private int numCamiseta;

    @Override
    public String toString() {
        return "El jugador tiene las siguientes caracteristicas:\n" +
                "Nombre: "+nombre+"\n"
                +"Apellido: "+apellido + "\n"
                +"Edad: "+edad + "\n"
                +"Posicion: "+posicion + "\n"
                +"Camiseta N°: "+numCamiseta;
    }
}
