public class Pilha2 {
    String [] vetor ;
    int topo ;
    
    Pilha2(int tamanho){
         vetor = new String[tamanho];
         topo = 0 ;
    }
     boolean cheia(){
        return vetor.length == topo ;
        }
     boolean vazia(){
        if (topo == 0 ){
           return  true ;
    }
     return false ;
    } 
     boolean push(String valor){
        if (cheia()){
            return false ;
        }
        vetor[topo] = valor ;
        topo ++ ;
        return true ;
    }
     String pop(){
        if(vazia()){
            return null;
        }
        topo -- ;
        return vetor[topo];
    }
     void imprimir(){
        for(int i=0;i<vetor.length;i++){
            
            System.out.println(vetor[i]);
        }
     }

}



