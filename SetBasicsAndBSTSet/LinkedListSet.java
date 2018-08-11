package SetBasicsAndBSTSet;

import LinkedList.LinkedList;

import java.util.ArrayList;

/**
 * @ Description:
 * @ Date: Created in 21:19 20/07/2018
 * @ Author: Anthony_Duan
 */
public class LinkedListSet<E> implements Set<E> {


    private LinkedList<E> list;

    public LinkedListSet() {
        list = new LinkedList<E>();
    }

    //O(n)
    @Override
    public void add(E e) {
        if (!list.contains(e)) {
            list.addFirst(e);
        }
    }

    //O(n)
    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    //O(n)
    @Override
    public void remove(E e) {
        list.removeElement(e);
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }


    public static void main(String[] args) {

        System.out.println("Pride and Prejudice");

        ArrayList<String> words1 = new ArrayList<>();
        if (FileOperation.readFile("/Users/duanjiaxing/IdeaProjects/Data-Structure/data-structure/src/SetBasicsAndBSTSet/pride-and-prejudice.txt", words1)) {
            System.out.println("Total words: " + words1.size());

            LinkedListSet<String> set1 = new LinkedListSet<>();
            for (String word : words1)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }

        System.out.println();


        System.out.println("A Tale of Two Cities");

        ArrayList<String> words2 = new ArrayList<>();
        if (FileOperation.readFile("/Users/duanjiaxing/IdeaProjects/Data-Structure/data-structure/src/SetBasicsAndBSTSet/a-tale-of-two-cities.txt", words2)) {
            System.out.println("Total words: " + words2.size());

            LinkedListSet<String> set2 = new LinkedListSet<>();
            for (String word : words2)
                set2.add(word);
            System.out.println("Total different words: " + set2.getSize());
        }
    }
}
