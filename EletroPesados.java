public class EletroPesados extends Produto{ //Espero que não seja um eletrodomestico.

    public EletroPesados(int codigo, String descricao, double preco){
        super(codigo, descricao, preco);
    }
    
    @Override
    public double getMargemLucro() {
        if(getPreco() > 999.0)
            return getPreco() * 0.2;
    return super.getMargemLucro();
    }
}

