package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador(){
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public Jugador(String nombre, int edad, String posicion, int golesMarcados, int dorsal){
        super(nombre, edad,posicion);
        this.golesMarcados = (short) golesMarcados;
        this.dorsal = (byte) dorsal;
    }

    @Override
    public String toString() {
        return "El futbolista " + super.getNombre() + " tiene " + super.getEdad() +
                " y juega de posicion   " + super.getPosicion() +
                " con dorsal =" + dorsal +
                ". Ha marcado " + golesMarcados;
    }



}
