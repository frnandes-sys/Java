public class if {
    public static void main(String[] args) {
        String produto = "Tênis";
        String cor = "Azul";
        int quantidade = 2;
        float preco = 50f;
        if(cor == "Azul" && quantidade == 2){
            float total = preco - 5;
            System.out.println("Desconto aplicado, valor atual: R$" + total);
        }
        else{
            System.out.println("Sem desconto");
        }
    
    }
}
