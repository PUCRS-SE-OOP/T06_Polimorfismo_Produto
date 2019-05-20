import java.util.ArrayList;
public class Interface{
    private ArrayList<Produto> produtos;

    public Interface(){
        produtos = new ArrayList<Produto>();

        produtos.add(new EletroDomesticos(0, "Fogaozera 4 bocal autofire", 99.9, true));
        produtos.add(new EletroDomesticos(1, "Geladera Frozen", 379.72, false));
        produtos.add(new EletroPesados(2, "Na verdade nem sei o que e um eletropesado, o google diz que e uma assistencia veicular", 2490.677));
        produtos.add(new Telefonia(3, "Galaxy Fold some times", 9999.9, true));
        produtos.add(new Telefonia(4, "Multilaser nem tao multi assim.", 499.99, false));
    }

    public void call(){

        for(Produto p : produtos){
        String line = "\n";
            line += "Produto codigo: " + p.getCodigo();
            line += "; Descricao: " + p.getDescricao();
            line += "; Valor para o consumidor: " + p.calculaPrecoConsumidor();
            
            if(p instanceof EletroDomesticos)
                line += "; 220V: " + String.valueOf(((EletroDomesticos) p).isDvv());
            if(p instanceof Telefonia)
                line += "; Importado: " + String.valueOf(((Telefonia) p).isImported());

        System.out.println(line);
        }
    }

}