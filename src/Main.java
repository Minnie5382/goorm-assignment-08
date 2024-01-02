//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import MyLinkedList.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("let's dive in!!!\n");

        // MyLinkedList 만들어서 데이터 넣기
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

        System.out.println("==== MyLinkedList ====");

        myLinkedList.add("element_00");
        myLinkedList.add("element_01");
        myLinkedList.add("element_02");
        myLinkedList.add("element_03");
        myLinkedList.add("element_04");
        myLinkedList.add("element_05");

        // get() 테스트
        System.out.println("< get() 테스트 >");
        System.out.println("myLinkedList.get(2) : "+ myLinkedList.get(2));
        System.out.println("myLinkedList.get(5) : "+ myLinkedList.get(5));

        myLinkedList.delete(2);
        System.out.println("< delete() 테스트 >");
        System.out.println("element list after myLinkedList.delete(2) : ");
        for (int i=0 ; i<5 ; i++) {
            System.out.println(myLinkedList.get(i));
        }

        System.out.println();
        System.out.println("< Iterator 테스트 >");
        myLinkedList.forEach(System.out::println);

        System.out.println();
        System.out.println("==== MyQueue ====");
        MyQueue<String> myQueue = new MyQueue<String>();
        myQueue.add("queue element_00");
        myQueue.add("queue element_01");
        myQueue.add("queue element_02");
        myQueue.add("queue element_03");
        myQueue.add("queue element_04");

        myQueue.forEach(System.out::println);
        System.out.println();

        System.out.println("< pop() 테스트 >");

        myQueue.pop();


        System.out.println("myQueue after myQueue.pop()");
        myQueue.forEach(System.out::println);

        System.out.println();

        System.out.println("==== MyStack ====");
        MyStack<String> myStack = new MyStack<String>();
        myStack.add("stack_element_00");
        myStack.add("stack_element_01");
        myStack.add("stack_element_02");
        myStack.add("stack_element_03");

        myStack.forEach(System.out::println);
        System.out.println();

        System.out.println("< pop() 테스트 >");
        myStack.pop();

        System.out.println("myStack after myStack.pop()");
        myStack.forEach(System.out::println);






    }
}