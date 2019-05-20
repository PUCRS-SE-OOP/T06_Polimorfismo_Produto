public class Telefonia extends Produto{
    private boolean imported;

    public Telefonia(int codigo, String descricao, double preco, boolean imported) {
        super(codigo, descricao, preco);
        this.imported = imported;
    }

    public boolean isImported(){ return imported; }

    @Override
    public double getImposto() {
        if(imported)
            return getPreco() * 0.5;
    return super.getImposto();
    }
}