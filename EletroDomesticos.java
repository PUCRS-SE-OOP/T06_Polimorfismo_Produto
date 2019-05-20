public class EletroDomesticos extends Produto{
    private boolean dvv; //Duzentos e Vinte Volts = DVV

    public EletroDomesticos(int codigo, String descricao, double preco, boolean dvv){
        super(codigo, descricao, preco);
        this.dvv = dvv;
    }
    
    public boolean isDvv(){ return dvv; }
    
}