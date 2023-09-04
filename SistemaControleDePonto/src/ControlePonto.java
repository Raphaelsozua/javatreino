import java.text.SimpleDateFormat;
import java.util.Date;

public class ControlePonto {
    public void registrarEntrada(Funcionario f){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("ENTRADA: "+ f.getCodigo());
        System.out.println("DATA "+ sdf.format(agora));
    }
    public void registrarSaida(Funcionario f){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("ENTRADA: "+ f.getCodigo());
        System.out.println("DATA "+ sdf.format(agora));
    }
}
