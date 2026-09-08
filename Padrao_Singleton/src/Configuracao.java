public class Configuracao {
    private static String nomeSistema;
    private static String ambiente;
    private static Configuracao instancia;

    private Configuracao(){
        nomeSistema = "Ubuntu";
        ambiente = "Linux";

    }

    public static Configuracao getInstancia(){
        if (instancia == null) {
           instancia = new Configuracao();
        }

        return instancia;
    }

    public String getNomeSistema() {
        return nomeSistema;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public static void main(String[] args) {
        Configuracao config1 = getInstancia();
        Configuracao config2 = getInstancia();
        System.out.println(nomeSistema);
        System.out.println(ambiente);
        System.out.println(config1 == config2);
    }
}

