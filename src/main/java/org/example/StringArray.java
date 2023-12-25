package org.example;
public class StringArray {
    String[] array;
    public StringArray() {
        this.array = new String[]{};
    }
    public void printArray(){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void addElement(String Element){
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        array[array.length-1] = Element;

        //Сразу после добавления элемента в массив начинается сортировка (пузырьком) по возрастанию длины строк
        for (int i = 0; i < (array.length-1); i++){
            for (int j = 0; j < (array.length-i-1); j++){
                if (array[j+i+1].length() < array[i].length()){
                    String temp = array[i];
                    array[i] = array[j+i+1];
                    array[j+i+1] = temp;
                }
            }
        }
    }

    public String getMaxElement(){
        String maxEl = "";
        int lenMaxEl = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].length() > lenMaxEl){
                maxEl = array[i];
                lenMaxEl = array[i].length();
            }
        }
        return maxEl;
    }

    public double getAverageLen(){
        int count = 0;
        double averageLen = 0;
        for (int i = 0; i < array.length; i++){
            count+=1;
            averageLen+=array[i].length();
        }
        averageLen = averageLen / count;
        return averageLen;
    }
}
