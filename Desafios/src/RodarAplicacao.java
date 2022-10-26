public class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("Impala67");
        carro1.setCapacidadeTanque(65);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.5));

        Carro carro2 = new Carro("Amarelo", "Mustang", 58);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5.8));
    }
}
