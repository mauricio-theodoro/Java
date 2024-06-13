public class Main {
    public static void main(String[] args) {
        Moradores morador1 = new Moradores();
        Apartamentos ap1 = new Apartamentos();
        Pagamentos pag1 = new Pagamentos();
        Garagem garagem1 = new Garagem();
        Portaria portaria1 = new Portaria();

        morador1.setId(1);
        morador1.setNome("José Alberto");
        morador1.setCpf("124.225.265.89");
        morador1.setEmail("joseabertino@gmail.com");
        morador1.setNdecarro(1);
        morador1.setTelefone("(31) 9 8564-8890");
        ap1.setId(1);
        ap1.setAndar("1º Andar");
        ap1.setNquartos(2);
        ap1.setTipo("Padrão");
        ap1.setNplaca("GZN-8C90");
        ap1.setNapartamento(101);
        portaria1.setId(1);
        portaria1.setNvisitante("Ana Claudia");
        portaria1.setPorteiro("Allan Roberto");
        portaria1.setPlaca("GZN-8C90");
        pag1.setId(1);
        pag1.setNapartamento(101);
        pag1.setMulta(10.00);
        pag1.setValorCond(400.25);
        pag1.setTaxaExtra(20);
        garagem1.setId(1);
        garagem1.setNgaragem(001);
        garagem1.setNapartamento(101);

        System.out.println("---------------Morador---------------");
        morador1.Imprimir();
        System.out.println("---------------Apartamento-----------");
        ap1.Imprimir();
        System.out.println("---------------Portaria--------------");
        portaria1.Imprimir();
        System.out.println("---------------Pagamentos------------");
        pag1.Imprimir();
        System.out.println("---------------Garagem---------------");
        garagem1.Imprimir();
        System.out.println("--------------------------------------");




    }
}