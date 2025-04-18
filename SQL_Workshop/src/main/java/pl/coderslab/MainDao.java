package pl.coderslab;
import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainDao {

    public static void main(String[] args) {

        // Tworzenie Dao
        UserDao userDao = new UserDao();

        /*
        // Tworzenie nowego uzytkownika z klasy User
        User user = new User();
        user.setUserName("janek123");
        user.setEmail("janek@example.com");
        user.setPassword("superHaslo123");



        // Zapisanie uzytkownika do bazy
        User savedUser = userDao.create(user);


        // Sprawdzenie wyniku
        if (savedUser != null && savedUser.getId() != 0) {
            System.out.println("Uzytkownik zapisany z ID: " + savedUser.getId());
        } else {
            System.out.println("Nie udalo sie zapisac uzytkownika");
        }


        // Test uzytkownik istnieje
        User user1 = userDao.read(1);
        if (user1 != null) {
            System.out.println("Uzytkownik zapisany z ID: " + user1.getId());
            System.out.println("Username: " + user1.getUserName());
            System.out.println("Email: " + user1.getEmail());
            System.out.println("Password hash: " + user1.getPassword());
        } else {
            System.out.println("Nie znaleziono uzytkownika o podanym ID");
        }

        System.out.println("========================================");

        // Test uzytkownik nie istnieje
        User user2 = userDao.read(99999);
        if (user2 == null) {
            System.out.println("Poprawnie zwrocono NULL dla nieistniejacego uzytkownika");
        } else {
            System.out.println("Blad, nie znaleziono uzytkownika");
        }
        */
        /*
        User user = userDao.read(1);

        if (user != null) {
            user.setUserName("nowy_username");
            user.setEmail("nowy_email@example.com");
            user.setPassword("noweBezpieczneHaslo123");

            userDao.update(user);

            User updatedUser = userDao.read(user.getId());
            System.out.println("Zaktualizowany użytkownik:");
            System.out.println("Username: " + updatedUser.getUserName());
            System.out.println("Email: " + updatedUser.getEmail());
            System.out.println("Password hash: " + updatedUser.getPassword()); // hash się zmieni

        } else {
            System.out.println("Nie znaleziono użytkownika o podanym ID.");
        }
        */

        /*
        // Usuwanie uzytkownika
        int userIdToDelete = 1;

        userDao.delete(userIdToDelete);

        User deletedUser = userDao.read(userIdToDelete);
        if (deletedUser == null) {
            System.out.println("Uzytkownik zostal usuniety");
        } else {
            System.out.println("Uzytkownik nie zostal usuniety");
        }
        */

        // Wyszukiwanie wszystkich
        User[] users = userDao.findAll();

        System.out.println("Liczba użytkowników: " + users.length);

        for (User user : users) {
            System.out.println("ID: " + user.getId());
            System.out.println("Username: " + user.getUserName());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Hasło (hash): " + user.getPassword());
            System.out.println("---------------");
        }
    }

}

