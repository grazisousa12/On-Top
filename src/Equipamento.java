import java.time.LocalDate;

public abstract class Equipamento {

    protected String id;
    protected String localizacao;
    protected LocalDate ultimaManutencao;
    protected String status;

    public Equipamento(String id, String localizacao) {
        this.id = id;
        this.localizacao = localizacao;
        this.ultimaManutencao = LocalDate.now();
        this.status = "Operacional";
    }

    public abstract void exibirInformacoes();
}
