package clases.ListaEnlada.ja;


public class Prueba {
    public static void main(String[] args) {

        ColaDinamica<Integer> fila1 = new ColaDinamica<>();
        ColaDinamica<Integer> fila2 = new ColaDinamica<>();
        ColaDinamica<Object> lista = new ColaDinamica<>();


        for (int i =0; i<6; i++){
            if ((i%2)==0){
                fila1.enqueue(1);
                fila2.enqueue(1);
            }
            else {
                fila1.enqueue(0);
                fila2.enqueue(0);
            }
        }

        lista.enqueue(fila1);
        lista.enqueue(fila2);
        System.out.println(lista.size());
        Object x = lista.dequeue();
        System.out.println(x);



        int tamaño1 = fila1.size();
        int tamaño2 = fila2.size();
        int i = 0;
        while (i<tamaño1){
            System.out.print(fila1.dequeue() + ",");
            i++;
        }
        System.out.println();
        i = 0;
        while (i<tamaño2){
            System.out.print(fila2.dequeue() + ",");
            i++;
        }


    }

}

