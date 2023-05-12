package br.com.javes.estruturaDeDados.filas.refatorandoUsandoGenerics;

//public class Fila {
public class Fila <T>{

    //private No refNoEntrada;
    private No <T> refNoEntrada;

    public Fila(){
        this.refNoEntrada = null;
    }

    //METODO ENQUEUE

    //public void enqueue (Object obj){
    public void enqueue (T object){
         No novoNo = new No(object);
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }
    //public Object fist(){
    public T fist(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntrada;
            while(true){
                if(primeiroNo.getRefNo()!= null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }return (T) primeiroNo.getObject();
            //return primeiroNo.getObject();
        }
        return null;
    }

    // METODO DEQUEUE
    //public Object dequeue() {
    public T dequeue(){
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntrada;
            No noAuxiliar = refNoEntrada;

            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }return (T) primeiroNo.getObject();
            // return primeiroNo.getObject();

        }return null;
    }

    public boolean isEmpty(){
        return refNoEntrada == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "";
        No noAuxiliar = refNoEntrada;

        if(refNoEntrada != null){

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
