import java.util.ArrayList;
import java.util.List;

    interface Produto{}

    class Estoque<T extends Produto> {

        private List<T> listaProdutos = new ArrayList<>();

        public boolean adicionar(T produto){
            if(produto != null){
                listaProdutos.add(produto);
                return true;
            }
            return false;
        }

        public boolean remove(T produto){
            if(produto != null){
                listaProdutos.add(produto);
                return true;
            }
            return false;
        }
    }
