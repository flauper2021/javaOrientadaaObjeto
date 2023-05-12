package br.com.javes.estruturaDeDados.filas.refatorandoUsandoGenerics;

//public class No{ foi refatorado

public class No <T> {

    //privata Object object;
    //private No refNo;

    private T object;
    private No<T> refNo;

    public No(){
    }
    //public No(Object object)

    public No(T object){
        this.refNo = null;
        this.object = object;//a referêrencia do primeiro Nó tem que apontar para a
        // saida que é null, isto é, não tem mais referência aos Nós após o primeiro da fila.
        }

    //public Object getObject() {
    public T getObject(){
        return object;
    }
    //public void setObject(Object object) {
    public void setObject(T object){
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }
    public void setRefNo(No refNo){
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "\nNo{" +
                "object= " + object +
                "}\n";
    }
}

