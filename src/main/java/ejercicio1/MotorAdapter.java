package ejercicio1;

public class MotorAdapter implements Motor {
    private final MotorElectrico motorElectrico;

    public MotorAdapter(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String arrancar() {
        return this.motorElectrico.conectarActivar();
    }

    @Override
    public String acelerar() {
        return this.motorElectrico.moverMasRapido();
    }

    @Override
    public String apagar() {
        return this.motorElectrico.desconectarApagar();
    }
}
