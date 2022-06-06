package champions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ajudante {
   private Set<Times> noRepeat = new HashSet<>();
    public ajudante(){

    }
    //metodo ajudante que vai fazer todo o trabalho a ser executado na classe main.
    public void executarTudo(){
        
    //criação dos Objetos times na forma de um Array, limitado a 16 objetos, ou 16 Times.
        Times t[] = new Times[16];
    
        t[0]=new Times("Manchester City", "inglaterra", 1, "grupo A");
        t[1]=new Times("Paris Saint Germain", "França", 2, "grupo A");
        t[2]=new Times("Liverpool", "Inglaterra", 1, "grupo B");
        t[3]=new Times("Atletico de Madrid", "Espanha", 2, "grupo B");
        t[4]=new Times("Ajax", "Holanda", 1, "grupo C");
        t[5]=new Times("Sporting", "Protugal", 2, "grupo C");
        t[6]=new Times("Real Madrid", "Espanha", 1, "grupo D");
        t[7]=new Times("Inter de Milão", "Italia", 2, "grupo D");
        t[8]=new Times("Bayern de Munique", "Alemanha" , 1, "grupo E");
        t[9]=new Times("Benfica", "Portugal" , 2, "grupo E");
        t[10]=new Times("Mancheter United", "Inglaterra", 1, "grupo F");
        t[11]=new Times("Villareal", "Espanha", 2, "grupo F");
        t[12]=new Times("Lille", "França", 1 ,  "grupo G");
        t[13]=new Times("RB Salzburg", "Austria" , 2, "grupo G");
        t[14]=new Times("Juventus" , "Italia" , 1, "grupo H");
        t[15]=new Times("Chelsea", "Inglaterra", 2, "grupo H");
    int i=0;
    
            /*Repetição para sortear os 8 jogos de uma única vez
            (Posso criar um método para fazer o sorteio de cada jogo separadamente
                mas não é o caso ainda)*/
        
       do{
            //Dois métodos Random para escolher o numero dos Times.
            Random aleatorio = new Random();
            Random aleatorio2 = new Random();
            int numeroTime1 = aleatorio.nextInt(16);
            int numeroTime2 = aleatorio2.nextInt(16);
            

            //Verificação pra saber se os clubes podem se enfrentar, de acordo com as regras da UEFA.
            if(!(t[numeroTime1].equals(t[numeroTime2]))){
                
            //verificação para saber se os Times já foram sorteados.
                if(!(this.noRepeat.contains(t[numeroTime1]) || this.noRepeat.contains(t[numeroTime2]))){
                  

                  

                    Jogos j = new Jogos();
                    j.RodarJogos(t[numeroTime1], t[numeroTime2]);
                      this.noRepeat.add(t[numeroTime1]);
                      this.noRepeat.add(t[numeroTime2]);
                      
                    i++;

                }
            }
        }while(i<=8);

    }
}
       
