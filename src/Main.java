import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Equipamento> equipamentos = new ArrayList<>();

        PlacaSolar placa1 = new PlacaSolar("PS01", "Predio A", 30);
        TelhaEolica telha1 = new TelhaEolica("TE01", "Cobertura B", 60);

        equipamentos.add(placa1);
        equipamentos.add(telha1);

        System.out.println("===== ON TOP SISTEMA =====");

        for (Equipamento e : equipamentos) {
            e.exibirInformacoes();
        }
    }
}
