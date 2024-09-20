import java.util.Comparator;

public class Solution {

    record Saldo(Double valor) {
    }

    record ContaDevedora(Saldo saldo) {
    }

    class ContaDevedoraComparator implements Comparator<ContaDevedora> {

        @Override
        public int compare(ContaDevedora o1, ContaDevedora o2) {
            int compare = Double.compare(o1.saldo().valor(), o2.saldo().valor());
            return compare;
        }

        @Override
        public Comparator<ContaDevedora> reversed() {
            return Comparator.super.reversed();
        }
    }
}
