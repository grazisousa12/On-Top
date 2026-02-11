public class TelhaEolica extends Equipamento {

    private int cicloManutencao;

    public TelhaEolica(String id, String localizacao, int cicloManutencao) {
        super(id, localizacao);
        this.cicloManutencao = cicloManutencao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Telha Eolica ID: " + id);
        System.out.println("Localização: " + localizacao);
        System.out.println("Status: " + status);
        System.out.println("----------------------");
    }
}
