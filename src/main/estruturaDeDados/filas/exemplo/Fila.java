package br.com.javes.estruturaDeDados.filas.exemplo;

public class Fila {

    private No refNoEntada;

    public Fila(){
        this.refNoEntada = null;
    }

    //METODO ENQUEUE
    public void enqueue (No novoNo){
        novoNo.setRefNo(refNoEntada);
        refNoEntada = novoNo;
    }
    public No fist(){
        if(!this.isEmputy()){
            No primeiroNo = refNoEntada;
            while(true){
                if(primeiroNo.getRefNo()!= null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }return primeiroNo;
        }
        return null;
    }

    // METODO DEQUEUE
    public No dequeue() {
        if (!this.isEmputy()) {
            No primeiroNo = refNoEntada;
            No noAuxiliar = refNoEntada;

            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }return primeiroNo;

        }return null;
    }

    public boolean isEmputy(){
        return refNoEntada == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "";
        No noAuxiliar = refNoEntada;

        if(refNoEntada != null){

            while(true){
                stringRetorno += "[NO{objeto = " +noAuxiliar.getObject() +"}] --->\n";

                if (noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "\nnull\n";
                    break;
                }
            }
        }else{
            stringRetorno = "null\n";
        }
        return "\n-------------INICIO DE PROGRAMA-------------\n\n"
                +stringRetorno;


    }

}
