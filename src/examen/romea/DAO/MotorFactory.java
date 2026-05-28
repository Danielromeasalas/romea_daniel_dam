package
public class MotorFactory.java{
    public static final String POSTGRE = "POSTGRE";

    public MotorFactor(MotorSQL motor){
    switch (motor){
        case POSTGRE:
            return new PostgreMotorSQL();
        default:
            throw new IllegalArgumentException("Motor no soportado");
    }
    }
}