public class Voo implements Cloneable{
    private String aeronave;
    private String horario;
    private String data;
    private String codigoVoo;
    private  String poltrona;

    public Voo(String aeronave, String horario, String data, String codigoVoo,String poltrona) {
        this.aeronave = aeronave;
        this.horario = horario;
        this.data = data;
        this.codigoVoo = codigoVoo;
        this.poltrona = poltrona;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    public String getAeronave() {
        return aeronave;
    }

    public void setAeronave(String aeronave) {
        this.aeronave = aeronave;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCodigoVoo() {
        return codigoVoo;
    }

    public void setCodigoVoo(String codigoVoo) {
        this.codigoVoo = codigoVoo;
    }

    @Override
    public Voo clone() throws CloneNotSupportedException{
        return (Voo) super.clone();
    }

    @Override
    public String toString(){
        return " Voo : { " +
                " aeronave: " + aeronave +
                " horario: " +horario +
                " data: " + data +
                " codigoVoo: " + codigoVoo+
                " poltrona: "+ poltrona+
                "}";
    }
}
