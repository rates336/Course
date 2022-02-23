package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.lambda.*;
import forumuser.ForumList;
import forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        //ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        /*      {expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::subBFromA);
        /PoemBeautifier pb = new PoemBeautifier();
        pb.beautify("Pizza", text -> "Good  " + text + " !!!" );
        pb.beautify("Burger", text -> "VGood " + text + " ..." );
        pb.beautify("Kebab", text -> "Not Bad " + text + " ???" );
        pb.beautify("Sushi", text -> "It's OK " + text + " > <" );
        pb.beautify("Fries", text -> text.toLowerCase(Locale.ROOT) );
        pb.beautify("L o L", text -> text.length() + " " + text);

        expressionExecutor.executeBeautify("Pizza", PoemBeautifierRef::bStyle1);
        expressionExecutor.executeBeautify("Pizza", PoemBeautifierRef::bStyle2);
        expressionExecutor.executeBeautify("Pizza", PoemBeautifierRef::bStyle3);
        expressionExecutor.executeBeautify("Pizza", PoemBeautifierRef::bStyle4);
        NumbersGenerator.generateEven(10);

            People.getList().stream()
                    .map(String::toUpperCase)                             // [1]
                    .filter(s -> s.length() > 11)                         // [2]
                    .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")   // [3]
                    .filter(s -> s.charAt(0) == 'M')           // [4]
                    .forEach(System.out::println);                        // [5]
}*/
        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(book -> '\t' + " " + book.getTitle() + " nr: " + book.getSignature())
                .collect(Collectors.joining(",\n","<<\t\t\t\t\t\t\t\t\t>>\n",
                        "\n<<\t\t\t\t\t\t\t\t\t>>"));

        System.out.println(theResultStringOfBooks);*/
        ForumList forumList = new ForumList();
        Map<Integer, ForumUser> selectedUsers = forumList.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> 2022 - forumUser.getBirthDate().getYear() >= 20)
                .filter(forumUser -> forumUser.getPostsSharedCounter() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println(selectedUsers.size());
        selectedUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);




    }
}
