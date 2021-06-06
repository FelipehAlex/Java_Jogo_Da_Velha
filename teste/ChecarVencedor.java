package teste;

public abstract class ChecarVencedor {
    
    public static String desenhoTabela(String[] desenho){
        String jogoDaVelha = "";
        for (int i=0; i<desenho.length; i++){
            if (i == 2 || i == 5 || i == 8){
                jogoDaVelha += " " + desenho[i] + " \n";
            }else{
                jogoDaVelha += " " + desenho[i] + " |";
            }
        }
        return jogoDaVelha;
    }
    
    
    public static boolean verificaVitoria(String[] vect, String jogador){
        boolean resultado = false;
        
        for (int i=0; i<vect.length; i++){
            
            //linha
            if (vect[0].equals(jogador) && vect[1].equals(jogador) && vect[2].equals(jogador)){
                resultado = true;
            }
            else if (vect[3].equals(jogador) && vect[4].equals(jogador) && vect[5].equals(jogador)){
                resultado = true;
            }
            else if(vect[6].equals(jogador) && vect[7].equals(jogador) && vect[8].equals(jogador)){
                resultado = true;
            }
            
            //coluna
            else if(vect[0].equals(jogador) && vect[3].equals(jogador) && vect[6].equals(jogador)){
                resultado = true;
            }
            else if(vect[1].equals(jogador) && vect[4].equals(jogador) && vect[7].equals(jogador)){
                resultado = true;
            }
            else if(vect[2].equals(jogador) && vect[5].equals(jogador) && vect[8].equals(jogador)){
                resultado = true;
            }
            
            //vertical
            else if(vect[0].equals(jogador) && vect[4].equals(jogador) && vect[8].equals(jogador)){
                resultado = true;
            }
            else if(vect[6].equals(jogador) && vect[4].equals(jogador) && vect[2].equals(jogador)){
                resultado = true;
            }
            
        }
        return resultado;
    }
    
    public static boolean verificaTabela(String[] vect, int posicao){
        boolean resultado = false;
        
        for(int i=0; i<vect.length; i++){
            if (vect[posicao].equals("_")){
                resultado = true;
            }
        }  
        return resultado;   
    }
    
    public static boolean verificaEmpate(String[] vect){
        boolean resultado = true;
        for (int i=0; i<vect.length; i++){
            if (vect[i].equals("_")){
                resultado = false;
            }
        }  
        return resultado;
    }
    
}
