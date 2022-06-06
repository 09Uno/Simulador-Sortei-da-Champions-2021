package champions;



public class Times {
    //Nessa classe serão criados os atributos e métodos dos times
    private String nomeTime;
    private String pais;
    private int posicaoFG;
    private String grupo;
    
    //contruto com os atributos dos times
    public Times(String nomeTimes, String pais, int PosicaoFG, String grupo){
        this.nomeTime = nomeTimes;
        this.pais = pais;
        this.posicaoFG = PosicaoFG;
        this.grupo = grupo;
    }

    //Construtor para caso não precise ser passado nenhum parametro 
    public Times(){

    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if(!(obj instanceof Times)){
            return false;
        }
        Times objTimes = (Times) obj;
        return this.grupo.equals(objTimes.grupo) || this.pais.equals(objTimes.grupo) || this.posicaoFG == objTimes.posicaoFG;
    }

  
    public String getNomeTime() {
        return nomeTime;
    }

   
    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getPais() {
        return pais;
    }

  
    public void setPais(String pais) {
        this.pais = pais;
    }

    
    public int getPosicaoFG() {
        return posicaoFG;
    }

   
    public void setPosicaoFG(int posicaoFG) {
        this.posicaoFG = posicaoFG;
    }

  
    public String getGrupo() {
        return grupo;
    }
  
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

}