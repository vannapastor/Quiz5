/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz5;

import doublylinkedlist.DNode;

/**
 *
 * @author user
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNode<String> registered1 = new DNode<>(null, "EVA", null);
        DNode<String> registered2 = new DNode<>(null, "ADAN", null);
        DNode<String> registered3 = new DNode<>(null, "PETER", null);
        DNode<String> registered4 = new DNode<>(null, "NOAH", null);
        DNode<String> registered5 = new DNode<>(null, "JOHN", null);

        DequeList<DNode> transaction = new DequeList<>();
        transaction.addFirst(registered1);
        transaction.addLast(registered2);
        transaction.addLast(registered3);
        transaction.addLast(registered4);
        transaction.addLast(registered5);


        try {
            System.out.println("List Transaction: ");
            transaction.showDeque();

            System.out.println();
            System.out.println("First Remove:  " + transaction.removeFirst().getElement());
            System.out.println("After Remove: ");
            transaction.showDeque();

            System.out.println();
            System.out.println("First Remove:  " + transaction.removeFirst().getElement());
            System.out.println("After Remove: ");
           transaction.showDeque();

            System.out.println();
            System.out.println("Last Remove:  " + transaction.removeLast().getElement());
            System.out.println("After Remove: ");
            transaction.showDeque();

            System.out.println();
            System.out.println("Last Remove:  " + transaction.removeLast().getElement());
            System.out.println("After Remove: ");
           transaction.showDeque();

            System.out.println();
            System.out.println("Remove Last:  " + transaction.removeLast().getElement());
            System.out.println("After Remove: ");
            transaction.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + transaction.removeLast().getElement());
            
            transaction.showDeque();
        } catch (EmptyDequeException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

