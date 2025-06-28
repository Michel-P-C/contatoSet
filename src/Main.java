//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Michel",  812222222);
        agendaContatos.adicionarContato("Adriana",  818858565);
        agendaContatos.adicionarContato("Adriana Ana",  815896324);
        agendaContatos.adicionarContato("Adriana Dio",  928965324);
        agendaContatos.adicionarContato("Adriana",  90578);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Michel"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Michel", 818560712));

        agendaContatos.exibirContatos();
    }
}