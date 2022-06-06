package champions;


public class Jogos {
    
    //Construtor
    public Jogos(){
    }
    
    /*Método que vai imprimir na tela os jogos, a estrutura de repetição foi montada na classe "ajudante" para 
    que seja sorteado de uma vez só os 8 jogos*/
    public void RodarJogos(Times t1, Times t2){
        
         
        
             
          System.out.println("******* Confronto numero: "  );
          System.out.println( t1.getNomeTime() + " X " +t2.getNomeTime() );
          System.out.println("__________________________________________________________________");
          System.out.println("------------------------------------------------------------------");
          
    }
}