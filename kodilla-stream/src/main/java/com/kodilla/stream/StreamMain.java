package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifierRef;
import com.kodilla.stream.forumuser.ForumList;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.world.MyWorld;
import com.kodilla.stream.world.continents.africa.Africa;
import com.kodilla.stream.world.continents.africa.countries.RPA;
import com.kodilla.stream.world.interfaces.World;

import java.util.Date;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

/*        RPA rpa = new RPA();
        System.out.println("RPA people: " + rpa.getPeopleQuantity());
        System.out.println("Beautifier: " + PoemBeautifierRef.bigNumberStyle(
                "" + rpa.getPeopleQuantity()));
        Africa africa = new Africa();
        System.out.println("Africa people: " + africa.getPeopleQuantity());
        System.out.println("Beautifier: " + PoemBeautifierRef.bigNumberStyle(
                "" + africa.getPeopleQuantity()));
        World world = new MyWorld();
        System.out.println("World people: " + world.getPeopleQuantity());*/
        //System.out.println("Beautifier: " + PoemBeautifierRef.bigNumberStyle(
        //        "" + world.getPeopleQuantity()));

        Date date = new Date();
        ForumList forumList = new ForumList();
        Map<Integer, ForumUser> selectedUsers = forumList.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> (date.getYear() + 1900) - forumUser.getBirthDate().getYear() >= 20)
                .filter(forumUser -> forumUser.getPostsSharedCounter() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println(selectedUsers.size());
        selectedUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);



    }
}
