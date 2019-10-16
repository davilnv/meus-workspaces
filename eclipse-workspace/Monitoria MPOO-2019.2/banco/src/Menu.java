public class Menu {
    public void menu_principal(){
        System.out.println(" === MENU PRINCIPAL === ");
        System.out.println(" 1 - Controlador Admnistrativo");
        System.out.println(" 2 - Caixa Eletrônico");
        System.out.println(" 0 - Sair");
    }

    public void menu_admin(){
        System.out.println(" --- Menu Admin ---");
        System.out.println(" 1 - Cadastrar Conta");
        System.out.println(" 2 - Listar Contas");
        System.out.println(" 3 - Buscar conta por CPF");
        System.out.println(" 0 - Sair");
    }

    public void menu_caixa() {
        System.out.println(" *** Caixa Eletrônico *** ");
        System.out.println(" 1 - Ver saldo");
        System.out.println(" 0 - Sair");
    }
}
