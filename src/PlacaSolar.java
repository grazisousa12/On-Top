import java.time.LocalDate;

public class PlacaSolar extends Equipamento {

    private int intervaloLimpezaDias;

    public PlacaSolar(String id, String localizacao, int intervaloLimpezaDias) {
        super(id, localizacao);
        this.intervaloLimpezaDias = intervaloLimpezaDias;
    }

    public boolean precisaLimpeza() {
        return ultimaManutencao.plusDays(intervaloLimpezaDias)
                .isBefore(LocalDate.now());
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Placa Solar ID: " + id);
        System.out.println("Localização: " + localizacao);
        System.out.println("Status: " + status);
        System.out.println("----------------------");
    }
}
