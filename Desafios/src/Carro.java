public class Carro {
    
        String cor;
        String modelo;
        int capaciadadeTanque;

        Carro (){

        }

        Carro(String cor, String modelo, int capaciadadeTanque){
            this.cor = cor;
            this.modelo = modelo;
            this.capaciadadeTanque = capaciadadeTanque;    
        }
        
        void setCor(String cor){
            this.cor = cor;
        }
        
        String getCor(){
            return cor;
        }

        void setModelo(String modelo){
            this.modelo = modelo;
        }

        String getModelo(){
            return modelo;                                
        }

        void setCapacidadeTanque(int capaciadadeTanque){
            this.capaciadadeTanque = capaciadadeTanque;
        }

        int getCapacidadeTanque(){
            return capaciadadeTanque;
        }

        double totalValorTanque(double valorCombustivel){
            return capaciadadeTanque * valorCombustivel;
        }
}
