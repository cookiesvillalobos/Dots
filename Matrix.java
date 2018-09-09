package Clases.Lists;

/**
 * Esta es la clase que crea la matriz para modelar el tablero
 */
public class Matrix {
    /**
     * Constructor por defecto
     */
    public Matrix() {
    }

    /**
     * Método que devuelve lo que se va a poner en la pantalla
     */
    public void board1() {
        LinkList<LinkList> FinalList = new LinkList<>();
        for (int i = 0; i<10; i++){
            LinkList<Integer> Column = new LinkList<>();
            for (int j = 0; j <10;j++){
                if ( (j%2)==0){
                    Column.addPrev(1);
                }
                else {
                    Column.addPrev(0);
                }
            }
            FinalList.addPrev(Column);
        }
        LinkList<Integer> prueba = new LinkList<>();
        prueba.addPrev(1);
        prueba.addPrev(0);

        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                if (prueba.see(0)== FinalList.see(0).see(0)){
                    System.out.print(prueba.see(0));
                    System.out.println(" el otro " + FinalList.see(0).see(0));
                    System.out.println("Es igual a 0");
                }
                else {
                    System.out.print(prueba.see(0));
                    System.out.println(" el otro " + FinalList.see(0).see(0));
                    System.out.println("No entró");
                }
            }
        }
    }
}

