package br.com.javes.estruturaDeDados.filas.exemplo;

public class No {

    private Object object;
    private No refNo;

    public No(){
    }

    public No(Object object){
        this.refNo = null;
        this.object = object;//a referêrencia do primeiro Nó tem que apontar para a
        // saida que é null, isto é, não tem mais referência aos Nós após o primeiro da fila.
        }

    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
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

