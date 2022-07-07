package myscala.programs.dsa.programs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Santosh Buganna Ganapa (sganapa2)
 * Written on 7/6/2022 5:51 pm
 * Make the Message Class immutable.
 */

// class is declared final
 final public class Message {

    // private class members
        private final Long id;
        private final List<String> text;

    // class members are initialized using constructor
    Message(Long id, List<String> text) {
        this.id = id;
        this.text = text;
    }

    // getter method returns the copy of class members
    public Long getId() {
            return id;
        }

    // Deep copy of list elements
        public List<String> getText() {
        List<String> tempList = new ArrayList<>();
            tempList.addAll(text);
            return tempList;
        }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text=" + text +
                '}';
    }

    public static void main(String[] args) {

        System.out.println("Immutable message class example");
        List<String> stringList = new ArrayList<>();
        stringList.add("Message1");
        stringList.add("Message2");
        // create object of Message
        Message immutableMessageObject = new Message(100L, stringList);

        //Uncommenting below lines causes error
        // immutableMessageObject.text = new ArrayList<>();
        //immutableMessageObject.id = 101L;

        immutableMessageObject.getText().add("Message3");// It has no impact on original text list

        System.out.println("immutableMessageObject: " + immutableMessageObject);
    }
    }
