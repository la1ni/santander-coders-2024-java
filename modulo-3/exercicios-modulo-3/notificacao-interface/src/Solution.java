public class Solution {
    record Cliente() {
    }

    class NotificacaoWhatsApp implements Notificacao {

        @Override
        public boolean notificar(Cliente cliente, String mensagem) {
            return true;
        }
    }

    class NotificacaoEmail implements Notificacao {
        @Override
        public boolean notificar(Cliente cliente, String mensagem) {
            return true;
        }
    }

    class NotificacaoSms implements Notificacao {
        @Override
        public boolean notificar(Cliente cliente, String mensagem) {
            return true;
        }

    }

    interface Notificacao {
        boolean notificar(Cliente cliente, String mensagem);
    }

    class NotificadorService {
        boolean notificaClient(Cliente cliente, Notificacao notificacao) {
            return notificacao.notificar(cliente, "Movimentação realizada em sua conta corrente.");
        }
    }
}