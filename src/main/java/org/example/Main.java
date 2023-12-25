package org.example;
public class Main {
    public static void main(String[] args) {
        StringArray testArray = new StringArray();
        testArray.addElement("TheLongestWord");
        testArray.addElement("LongerWord");
        testArray.addElement("Word");
        testArray.addInElement();
        testArray.printArray();
        System.out.println(testArray.getMaxElement());
        System.out.println(testArray.getAverageLen());
    }
}