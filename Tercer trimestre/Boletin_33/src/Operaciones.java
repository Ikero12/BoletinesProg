import javax.swing.*;

public class Operaciones <T extends Number>{


    public T calcularMinimo(T[] array){

        T minimo = array[0];
        for(int i=0;i<array.length;i++){
           if(array[i].doubleValue()<minimo.doubleValue()){
               minimo=array[i];
           }
        }
        return minimo;
    }

    public T calcularMaximo(T[] array){

        T max= array[0];
        for(int i=0;i<array.length;i++){
            if(array[i].doubleValue()>max.doubleValue()){
                max=array[i];
            }
        }
        return max;
    }

    public int searchPos(T[]array){
        String q = JOptionPane.showInputDialog("Introducir busqueda en Array");
        int pos=0;
        for (int i = 0;i< array.length;i++){
            if(q.equals(array[i].toString())){
                pos=i;
                break;
            }
            else{
                pos=-1;
            }


        }

        return pos;
    }
    public T[] deletePos(T[]array){
        String q = JOptionPane.showInputDialog("Introducir la eliminación deseada en Array");
        T []newArray=array;
        int pos=0;
        for (int i = 0;i< array.length;i++) {
            if (q.equals(array[i].toString())) {
                pos = i;
                break;
            } else {
                pos = -1;
            }

        }
            if (pos!=-1){
                for (int i=0,j=0;i<array.length;i++,j++){
                    if (i != pos) {
                        newArray[j] = array[i];
                        System.out.println(newArray[j]);
                    }
                }
            }
            if(pos==-1){
                return null;
            }
        return newArray;
        }
}
