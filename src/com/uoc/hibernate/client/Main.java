/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uoc.hibernate.client;

import com.uoc.hibernate.eao.CustomerEao;
import com.uoc.hibernate.eao.CustomerEaoImpl;
import com.uoc.hibernate.eao.GenreEao;
import com.uoc.hibernate.eao.GenreEaoImpl;
import com.uoc.hibernate.eao.MovieEao;
import com.uoc.hibernate.eao.MovieEaoImpl;
import com.uoc.hibernate.eao.ReviewEao;
import com.uoc.hibernate.eao.ReviewEaoImpl;
import com.uoc.hibernate.entity.Customer;
import com.uoc.hibernate.entity.Genre;
import com.uoc.hibernate.entity.Movie;
import com.uoc.hibernate.entity.Review;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ruzbihan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Movies
        MovieEao movieEao = new MovieEaoImpl();
        Movie movie1 = new Movie("Avatar", "James Cameron", "2h 42min", "Zoe Saldana, Sam Worthington");
        Movie movie2 = new Movie("The Conjuring", "James Wan", "1h 52min", "Vera Farmiga, Patrick Wilson");
        Movie movie3 = new Movie("Asuran", "Vetrimaran", "2h 19min", "Dhanush, Manju Warrier");
        Movie movie4 = new Movie("24", "Vikram Kumar", "2h 44min", "Suriya, Samantha");
        Movie movie5 = new Movie("World War Z", "Marc Forster", "2h 3min", "Brad Pitt, Mireille Enos");

        //Genres and save them in DB
        GenreEao genreEao = new GenreEaoImpl();
        Genre genre1 = new Genre("Action");
        genreEao.create(genre1);
        Genre genre2 = new Genre("Adventure");
        genreEao.create(genre2);
        Genre genre3 = new Genre("Animation");
        genreEao.create(genre3);
        Genre genre4 = new Genre("Comedy");
        genreEao.create(genre4);
        Genre genre5 = new Genre("Crime");
        genreEao.create(genre5);
        Genre genre6 = new Genre("Drama");
        genreEao.create(genre6);
        Genre genre7 = new Genre("Family");
        genreEao.create(genre7);
        Genre genre8 = new Genre("Fantacy");
        genreEao.create(genre8);
        Genre genre9 = new Genre("History");
        genreEao.create(genre9);
        Genre genre10 = new Genre("Horror");
        genreEao.create(genre10);
        Genre genre11 = new Genre("Mystery");
        genreEao.create(genre11);
        Genre genre12 = new Genre("Romance");
        genreEao.create(genre12);
        Genre genre13 = new Genre("Sci-Fi");
        genreEao.create(genre13);
        Genre genre14 = new Genre("Sport");
        genreEao.create(genre14);
        Genre genre15 = new Genre("Thriller");
        genreEao.create(genre15);
        Genre genre16 = new Genre("War");
        genreEao.create(genre16);

        //Customers
        CustomerEao cusEao = new CustomerEaoImpl();
        Customer cus1 = new Customer("Ruzbihan", "0772488972", "No.54, Wattala", "ruzbihan@gmail.com", "1234");
        Customer cus2 = new Customer("Harshana", "0772405923", "No.35, Minuwangoda", "harshana@gmail.com", "1234");
        Customer cus3 = new Customer("Tharangi", "0766873954", "No.25, Homagama", "tharangi@gmail.com", "1234");
        Customer cus4 = new Customer("Peter", "0765895544", "No.72, Colombo 03", "peter@gmail.com", "1234");
        Customer cus5 = new Customer("Vidushan", "0712564435", "No.03, Kaluthara", "vidushan@gmail.com", "1234");

        //Genres for movie1
        List<Genre> genreMovie1 = new ArrayList<>();
        genreMovie1.add(genre1); //Action
        genreMovie1.add(genre2); //Adventure
        genreMovie1.add(genre8); //Fantacy
        genreMovie1.add(genre13);//Sci-Fi

        //Genres for movie2
        List<Genre> genreMovie2 = new ArrayList<>();
        genreMovie2.add(genre1); //Action
        genreMovie2.add(genre10);//Horror
        genreMovie2.add(genre11);//Mystery
        genreMovie2.add(genre15);//Thriller

        //Genres for movie3
        List<Genre> genreMovie3 = new ArrayList<>();
        genreMovie3.add(genre1); //Action
        genreMovie3.add(genre6); //Drama

        //Genre for movie4
        List<Genre> genreMovie4 = new ArrayList<>();
        genreMovie4.add(genre1); //Action
        genreMovie4.add(genre12); //Romance
        genreMovie4.add(genre13); //Sci-Fi
        genreMovie4.add(genre15); //Thriller

        //Genre for movie5
        List<Genre> genreMovie5 = new ArrayList<>();
        genreMovie5.add(genre1); //Action
        genreMovie5.add(genre6); //Drama
        genreMovie5.add(genre10); //Horror
        genreMovie5.add(genre15); //Thriller

        //Save movies with genres in DB
        movie1.setGenres(genreMovie1);
        movieEao.create(movie1);

        movie2.setGenres(genreMovie2);
        movieEao.create(movie2);

        movie3.setGenres(genreMovie3);
        movieEao.create(movie3);

        movie4.setGenres(genreMovie4);
        movieEao.create(movie4);

        movie5.setGenres(genreMovie5);
        movieEao.create(movie5);

        // Customer1 -> Movie Purchase
        List<Movie> movieCus1 = new ArrayList<>();
        movieCus1.add(movie1);
        movieCus1.add(movie5);

        // Customer2 -> Movie Purchase
        List<Movie> movieCus2 = new ArrayList<>();
        movieCus2.add(movie2);
        movieCus2.add(movie3);

        // Customer3 -> Movie Purchase
        List<Movie> movieCus3 = new ArrayList<>();
        movieCus3.add(movie3);
        movieCus3.add(movie4);
        movieCus3.add(movie5);

        // Customer4 -> Movie Purchase
        List<Movie> movieCus4 = new ArrayList<>();
        movieCus4.add(movie3);
        movieCus4.add(movie5);

        // Customer5 -> Movie Purchase
        List<Movie> movieCus5 = new ArrayList<>();
        movieCus5.add(movie1);
        movieCus5.add(movie2);
        movieCus5.add(movie3);
        movieCus5.add(movie4);
        movieCus5.add(movie5);

        //save customers with movies in DB
        cus1.setMovies(movieCus1);
        cusEao.create(cus1);

        cus2.setMovies(movieCus2);
        cusEao.create(cus2);

        cus3.setMovies(movieCus3);
        cusEao.create(cus3);

        cus4.setMovies(movieCus4);
        cusEao.create(cus4);

        cus5.setMovies(movieCus5);
        cusEao.create(cus5);

        //Review Object
        ReviewEao revEao = new ReviewEaoImpl();

        //Reviews by customers
        Review r1 = new Review("Perfect!!", 9.0);
        r1.setCustomer(cus1);
        r1.setMovie(movie1);
        revEao.create(r1);

        Review r2 = new Review("Good!!", 8.6);
        r2.setCustomer(cus2);
        r2.setMovie(movie2);
        revEao.create(r2);

        Review r3 = new Review("Nice!!", 7.5);
        r3.setCustomer(cus3);
        r3.setMovie(movie3);
        revEao.create(r3);

        Review r4 = new Review("Awsome!!", 8.2);
        r4.setCustomer(cus4);
        r4.setMovie(movie3);
        revEao.create(r4);

        Review r5 = new Review("Great one!!", 7.9);
        r5.setCustomer(cus5);
        r5.setMovie(movie3);
        revEao.create(r5);

        Review r6 = new Review("Awsome Movie!!", 8.0);
        r6.setCustomer(cus5);
        r6.setMovie(movie1);
        revEao.create(r6);

        Review r7 = new Review("Super movie!!", 8.5);
        r7.setCustomer(cus4);
        r7.setMovie(movie1);
        revEao.create(r7);

        System.out.println("Welcome to GMDB NETFLIX!!");
        System.out.println("*************************************************");

        home();

    }

    public static void home() {

        System.out.println("1. Admin Login");
        System.out.println("2. Customer Login");
        System.out.println("3. Customer Signup");

        System.out.println("*************************************************");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter option number: ");

        String option = myObj.nextLine();

        if (null == option) {
            System.out.println("Invalid Option!!");
            home();
        } else {
            switch (option) {
                case "1":
                    System.out.println("Welcome to Admin Login!!");
                    System.out.println("*************************************************");
                    adminLogin();
                    break;
                case "2":
                    System.out.println("Welcome to Customer Login!!");
                    System.out.println("*************************************************");
                    customerLogin();
                    break;
                case "3":
                    System.out.println("Welcome to Customer Signup!!");
                    System.out.println("*************************************************");
                    customerSignUp();
                    break;
                default:
                    System.out.println("Invalid Option!!");
                    System.out.println("*************************************************");
                    home();
                    break;
            }
        }

    }

    ////////////////////////////////// ADMIN ///////////////////////////////////////////
    public static void adminLogin() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
        String adminUserName = sc.nextLine();

        System.out.println("Enter password");
        String adminPassword = sc.nextLine();

        if (adminUserName.equals("admin") && adminPassword.equals("admin")) {
            System.out.println("*************************************************");
            System.out.println("Admin login successful!!");
            adminOptions();
        } else {
            System.out.println("*************************************************");
            System.out.println("Invalid username or password!!");
            adminLogin();
        }

    }

    public static void adminOptions() {

        System.out.println("1. Add a movie");
        System.out.println("2. Search Movies");
        System.out.println("3. Customers");
        System.out.println("4. Movies purchased by a customer");
        System.out.println("5. Reviews and rating for a movie");
        System.out.println("6. Delete a movie");
        System.out.println("7. Logout");
        System.out.println("*************************************************");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter option: ");
        String option = sc.nextLine();

        if (null == option) {
            System.out.println("Invalid Option!!");
            adminOptions();
        } else {
            switch (option) {
                case "1":
                    System.out.println("*************************************************");
                    System.out.println("Add a Movie");
                    addMovie();
                    break;
                case "2":
                    System.out.println("*************************************************");
                    System.out.println("Search movies");
                    searchMovie();
                    break;
                case "3":
                    System.out.println("*************************************************");
                    System.out.println("Customers");
                    showCustomers();
                    break;
                case "4":
                    System.out.println("*************************************************");
                    System.out.println("Movies Purchased by Customers");
                    moviesByCustomers();
                    break;
                case "5":
                    System.out.println("*************************************************");
                    System.out.println("Reviews and Ratings");
                    reviewsAndRatings();
                    break;

                case "6":
                    System.out.println("*************************************************");
                    System.out.println("Delete a Movie");
                    deleteMovie();
                    break;

                case "7":
                    System.out.println("*************************************************");
                    System.out.println("Logout");
                    adminLogout();
                    break;
                default:
                    System.out.println("*************************************************");
                    System.out.println("Add a movie");
                    addMovie();
                    break;
            }
        }
    }

    //Add a movie
    public static void addMovie() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Movie name: ");
        String mName = sc.nextLine();

        System.out.println("Directors: ");
        String mDirectors = sc.nextLine();

        System.out.println("Run time: ");
        String mRunTime = sc.nextLine();

        System.out.println("Actors: ");
        String mActors = sc.nextLine();

        MovieEao movieEao = new MovieEaoImpl();
        Movie m = new Movie(mName, mDirectors, mRunTime, mActors);

        System.out.println("Genres: ");

        //Genres and save them in DB
        GenreEao genreEao = new GenreEaoImpl();
        Genre genre1 = new Genre("Action");
        genreEao.create(genre1);
        Genre genre2 = new Genre("Adventure");
        genreEao.create(genre2);
        Genre genre3 = new Genre("Animation");
        genreEao.create(genre3);
        Genre genre4 = new Genre("Comedy");
        genreEao.create(genre4);
        Genre genre5 = new Genre("Crime");
        genreEao.create(genre5);
        Genre genre6 = new Genre("Drama");
        genreEao.create(genre6);
        Genre genre7 = new Genre("Family");
        genreEao.create(genre7);
        Genre genre8 = new Genre("Fantacy");
        genreEao.create(genre8);
        Genre genre9 = new Genre("History");
        genreEao.create(genre9);
        Genre genre10 = new Genre("Horror");
        genreEao.create(genre10);
        Genre genre11 = new Genre("Mystery");
        genreEao.create(genre11);
        Genre genre12 = new Genre("Romance");
        genreEao.create(genre12);
        Genre genre13 = new Genre("Sci-Fi");
        genreEao.create(genre13);
        Genre genre14 = new Genre("Sport");
        genreEao.create(genre14);
        Genre genre15 = new Genre("Thriller");
        genreEao.create(genre15);
        Genre genre16 = new Genre("War");
        genreEao.create(genre16);

        System.out.println("Enter number of genres!");
        int noOfGenres = sc.nextInt();

        List<Genre> genreMovie = new ArrayList<>();
        for (int i = 0; i < noOfGenres; i++) {

            System.out.println("Enter genre");
            Scanner sc2 = new Scanner(System.in);
            String genre = sc2.nextLine();

            if (null == genre) {
                System.out.println("Invalid genre!!");
                addMovie();
            } else {
                switch (genre) {
                    case "Action":
                        System.out.println("*************************************************");
                        genreMovie.add(genre1);
                        System.out.println("Action genre added");
                        break;

                    case "Adventure":
                        System.out.println("*************************************************");
                        genreMovie.add(genre2);
                        System.out.println("Adventure genre added");
                        break;

                    case "Animation":
                        System.out.println("*************************************************");
                        genreMovie.add(genre3);
                        System.out.println("Animation genre added");
                        break;

                    case "Comedy":
                        System.out.println("*************************************************");
                        genreMovie.add(genre4);
                        System.out.println("Comedy genre added");
                        break;

                    case "Crime":
                        System.out.println("*************************************************");
                        genreMovie.add(genre5);
                        System.out.println("Crime genre added");
                        break;

                    case "Drama":
                        System.out.println("*************************************************");
                        genreMovie.add(genre6);
                        System.out.println("Drama genre added");
                        break;

                    case "Family":
                        System.out.println("*************************************************");
                        genreMovie.add(genre7);
                        System.out.println("Family genre added");
                        break;

                    case "Fantacy":
                        System.out.println("*************************************************");
                        genreMovie.add(genre8);
                        System.out.println("Fantacy genre added");
                        break;

                    case "Hsitory":
                        System.out.println("*************************************************");
                        genreMovie.add(genre9);
                        System.out.println("History genre added");
                        break;

                    case "Horror":
                        System.out.println("*************************************************");
                        genreMovie.add(genre10);
                        System.out.println("Horror genre added");
                        break;

                    case "Mystery":
                        System.out.println("*************************************************");
                        genreMovie.add(genre11);
                        System.out.println("Mystery genre added");
                        break;

                    case "Romance":
                        System.out.println("*************************************************");
                        genreMovie.add(genre12);
                        System.out.println("Romance genre added");
                        break;

                    case "Sci-Fi":
                        System.out.println("*************************************************");
                        genreMovie.add(genre13);
                        System.out.println("Sci-Fi genre added");
                        break;

                    case "Sport":
                        System.out.println("*************************************************");
                        genreMovie.add(genre14);
                        System.out.println("Sport genre added");
                        break;

                    case "Thriller":
                        System.out.println("*************************************************");
                        genreMovie.add(genre15);
                        System.out.println("Thriller genre added");
                        break;

                    case "War":
                        System.out.println("*************************************************");
                        genreMovie.add(genre16);
                        System.out.println("War genre added");
                        break;

                    default:
                        System.out.println("*************************************************");
                        System.out.println("No genre added");
                        addMovie();
                        break;
                }
            }

        }

        m.setGenres(genreMovie);
        movieEao.create(m);

        System.out.println("Movie Added Successfully !!");
        System.out.println("*************************************************");

        System.out.println("Add another movie?? (y/n)");
        Scanner sc2 = new Scanner(System.in);
        String response = sc2.nextLine();
        switch (response) {
            case "y":
                addMovie();
                break;
            case "n":
                adminOptions();
                break;
            default:
                System.out.println("Invalid response!!");
                addMovie();
                break;
        }

    }

    //Get all the customers
    public static void showCustomers() {

        CustomerEao cusEao = new CustomerEaoImpl();
        Customer tempCus = cusEao.getCustomer(1);
        System.out.println("Customer name: " + tempCus.getCustomerName());
        System.out.println("Customer contact: " + tempCus.getContact());
        System.out.println("Customer email: " + tempCus.getEmail());
        System.out.println("Customer address: " + tempCus.getAddress());

        System.out.println("Do you need to search another customer?? (y/n)");
        Scanner sc2 = new Scanner(System.in);
        String response = sc2.nextLine();
        switch (response) {
            case "y":
                showCustomers();
                break;
            case "n":
                adminOptions();
                break;
            default:
                System.out.println("Invalid response!!");
                showCustomers();
                break;
        }
    }

    //get purchased movie list by a customer
    public static void moviesByCustomers() {

        System.out.println("Enter customer ID: ");
        Scanner sc = new Scanner(System.in);
        int cusId = sc.nextInt();

        CustomerEao cusEao = new CustomerEaoImpl();
        Customer tempCus = cusEao.getCustomer(cusId);
        System.out.println(tempCus.getCustomerName() + " has purchased following movies:");
        List<Movie> movies = tempCus.getMovies();

        movies.forEach((m) -> {
            System.out.println(m.getMovieId() + " : " + m.getMovieName());
        });
        System.out.println("Do you need to search another customer?? (y/n)");
        Scanner sc2 = new Scanner(System.in);
        String response = sc2.nextLine();
        switch (response) {
            case "y":
                moviesByCustomers();
                break;
            case "n":
                adminOptions();
                break;
            default:
                System.out.println("Invalid response!!");
                moviesByCustomers();
                break;
        }
        System.out.println("Thank You!!!");
        System.out.println("*************************************************");

    }

    public static void deleteMovie() {

        System.out.println("*************************************************");
        System.out.println("Enter movie ID: ");

        Scanner sc = new Scanner(System.in);
        int movieId = sc.nextInt();

        MovieEao movEao = new MovieEaoImpl();
        movEao.delete(movieId);
        System.out.println("Movie Deleted successfully!!");

        System.out.println("Want to delete another movie?? (y/n)");
        Scanner sc2 = new Scanner(System.in);
        String response = sc2.nextLine();

        switch (response) {
            case "y":
                deleteMovie();
                break;
            case "n":
                adminOptions();
                break;
            default:
                System.out.println("Invalid Response!!");
                adminOptions();
                break;
        }

    }

    public static void adminLogout() {

        System.out.println("Are sure want to logout?? (y/n)");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();

        switch (response) {
            case "y":
                System.out.println("Logout Successfully!!");
                home();
                break;
            case "n":
                adminOptions();
                break;
            default:
                System.out.println("Invalid Response!!");
                adminLogout();
                break;
        }
    }

    ////////////////////////////// CUSTOMER /////////////////////////////////
    public static void customerSignUp() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String cName = sc.nextLine();

        System.out.println("Contact No: ");
        String cContact = sc.nextLine();

        System.out.println("Address: ");
        String cAddress = sc.nextLine();

        System.out.println("Email: ");
        String cEmail = sc.nextLine();

        System.out.println("Password: ");
        String cPass = sc.nextLine();

        CustomerEao cusEao = new CustomerEaoImpl();
        Customer cus = new Customer(cName, cContact, cAddress, cEmail, cPass);
        cusEao.create(cus);

        System.out.println("Sign Up Successfull!!!");
        System.out.println("Welcome to Netflix!!!");
        home();
    }

    public static void customerLogin() {

        System.out.println("Welcome to Customer Login!!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
        String adminUserName = sc.nextLine();

        System.out.println("Enter password");
        String adminPassword = sc.nextLine();

        if (adminUserName.equals("customer") && adminPassword.equals("customer")) {
            System.out.println("*************************************************");
            System.out.println("Customer login successful!!");
            customerOptions();
        } else {
            System.out.println("*************************************************");
            System.out.println("Invalid username or password!!");
            customerLogin();
        }
    }

    public static void customerOptions() {

        System.out.println("1. Search a movie");
        System.out.println("2. Purchase Movies");
        System.out.println("3. Add Review");
        System.out.println("4. Reviews and rating for a movie");
        System.out.println("5. Logout");
        System.out.println("*************************************************");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter option: ");
        String option = sc.nextLine();

        if (null == option) {
            System.out.println("Invalid Option!!");
            customerOptions();
        } else {
            switch (option) {
                case "1":
                    System.out.println("*************************************************");
                    System.out.println("Search a movie");
                    searchMovie();
                    break;
                case "2":
                    System.out.println("*************************************************");
                    System.out.println("Purchase Movies");
                    purchaseMovies();
                    break;
                case "3":
                    System.out.println("*************************************************");
                    System.out.println("Add Review");
                    addReview();
                    break;

                case "4":
                    System.out.println("*************************************************");
                    System.out.println("Reviews and Ratings");
                    reviewsAndRatings();
                    break;

                case "5":
                    System.out.println("*************************************************");
                    System.out.println("Logout");
                    customerLogout();
                    break;
                default:
                    System.out.println("*************************************************");
                    System.out.println("Search a movie");
                    searchMovie();
                    break;
            }
        }
    }

    public static void searchMovie() {

        System.out.println("*************************************************");
        System.out.println("Search Your Favourite Movie!!");
        System.out.println("*************************************************");
        System.out.println("Enter movie ID: ");

        Scanner sc = new Scanner(System.in);
        int movieId = sc.nextInt();

        MovieEao movEao = new MovieEaoImpl();
        Movie tempMovie = movEao.getMovie(movieId);
        System.out.println("Movie Id: " + tempMovie.getMovieId());
        System.out.println("Movie Name: " + tempMovie.getMovieName());
        System.out.println("Directors: " + tempMovie.getDirectors());
        System.out.println("Actors: " + tempMovie.getActors());
        System.out.println("RunTime: " + tempMovie.getRuntime());
        System.out.println("Genres: " + tempMovie.getGenres());

        System.out.println("Search another movie?? (y/n)");
        Scanner sc2 = new Scanner(System.in);
        String response = sc2.nextLine();

        switch (response) {
            case "y":
                searchMovie();
                break;
            case "n":
                home();
                break;
            default:
                System.out.println("Invalid Response!!");
                home();
                break;
        }

    }

    public static void purchaseMovies() {

        // Customer -> Movie Purchase
        List<Movie> movieCus = new ArrayList<>();
        System.out.println("Enter movie ID to purchase");
        Scanner sc = new Scanner(System.in);
        int movieId = sc.nextInt();

        MovieEao movEao = new MovieEaoImpl();
        Movie tempMovie = movEao.getMovie(movieId);

        System.out.println("*************************************************");
        System.out.println("Movie Name: " + tempMovie.getMovieName());
        System.out.println("Movie Directors: " + tempMovie.getDirectors());
        System.out.println("Movie RunTime: " + tempMovie.getRuntime());
        System.out.println("Movie Actors: " + tempMovie.getActors());
        System.out.println("*************************************************");

        Movie m = new Movie(tempMovie.getMovieName(), tempMovie.getDirectors(), tempMovie.getRuntime(), tempMovie.getActors());
        movieCus.add(m);

        System.out.println("Enter user ID");
        Scanner sc2 = new Scanner(System.in);
        int cusId = sc2.nextInt();

        CustomerEao cusEao = new CustomerEaoImpl();
        Customer cus = cusEao.getCustomer(cusId);

        System.out.println("*************************************************");
        System.out.println("User Name: " + cus.getCustomerName());
        System.out.println("*************************************************");

        Customer thisCus = new Customer(cus.getCustomerName(), cus.getContact(), cus.getAddress(), cus.getEmail(), cus.getPassword());
        thisCus.setMovies(movieCus);

        System.out.println("Movie purchased successfully!!!");

        System.out.println("Purchase another movie?? (y/n)");
        Scanner sc3 = new Scanner(System.in);
        String response = sc3.nextLine();

        switch (response) {
            case "y":
                purchaseMovies();
                break;
            case "n":
                customerOptions();
                break;
            default:
                System.out.println("Invalid Response!!");
                customerOptions();
                break;
        }

    }

    public static void addReview() {

        System.out.println("Enter movie ID to review");
        Scanner sc = new Scanner(System.in);
        int movieId = sc.nextInt();

        MovieEao movEao = new MovieEaoImpl();
        Movie tempMovie = movEao.getMovie(movieId);

        System.out.println("*************************************************");
        System.out.println("Movie Name: " + tempMovie.getMovieName());
        System.out.println("Movie Directors: " + tempMovie.getDirectors());
        System.out.println("Movie RunTime: " + tempMovie.getRuntime());
        System.out.println("Movie Actors: " + tempMovie.getActors());
        System.out.println("*************************************************");

        Movie m = new Movie(tempMovie.getMovieName(), tempMovie.getDirectors(), tempMovie.getRuntime(), tempMovie.getActors());

        System.out.println("Enter user ID");
        Scanner sc2 = new Scanner(System.in);
        int cusId = sc2.nextInt();

        CustomerEao cusEao = new CustomerEaoImpl();
        Customer cus = cusEao.getCustomer(cusId);

        System.out.println("*************************************************");
        System.out.println("User Name: " + cus.getCustomerName());
        System.out.println("*************************************************");

        Customer thisCus = new Customer(cus.getCustomerName(), cus.getContact(), cus.getAddress(), cus.getEmail(), cus.getPassword());

        System.out.println("Enter review");
        Scanner sc3 = new Scanner(System.in);
        String review = sc3.nextLine();

        System.out.println("Enter rating");
        Scanner sc4 = new Scanner(System.in);
        double rating = sc4.nextDouble();

        //Reviews by customers
        Review r = new Review(review, rating);
        r.setCustomer(thisCus);
        r.setMovie(m);

        //Review Object
        ReviewEao revEao = new ReviewEaoImpl();
        revEao.create(r);

        System.out.println("Movie reveiwed successfully!!!");

        System.out.println("Review another movie?? (y/n)");
        Scanner sc5 = new Scanner(System.in);
        String response = sc5.nextLine();

        switch (response) {
            case "y":
                addReview();
                break;
            case "n":
                customerOptions();
                break;
            default:
                System.out.println("Invalid Response!!");
                customerOptions();
                break;
        }

    }

    public static void customerLogout() {

        System.out.println("Are sure want to logout?? (y/n)");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();

        switch (response) {
            case "y":
                System.out.println("Logout Successfully!!");
                home();
                break;
            case "n":
                customerOptions();
                break;
            default:
                System.out.println("Invalid Response!!");
                customerLogout();
                break;
        }
    }

    public static void reviewsAndRatings() {

        //Average review for a movie
        System.out.println("*************************************************");
        System.out.println("Enter Movie Id:");
        Scanner sc = new Scanner(System.in);
        int movieId = sc.nextInt();

        MovieEao movieEao = new MovieEaoImpl();
        Movie tempMovie = movieEao.getMovie(movieId);
        List<Review> reviews = tempMovie.getReviews();
        System.out.println("*************************************************");
        System.out.println(tempMovie.getMovieName() + " has following reviews and ratings");
        reviews.forEach((r) -> {
            System.out.println("Review: " + r.getDescription() + " , Rating : " + r.getRating());
        });

        double avgRate;
        double sumRate = 0;
        for (Review rev : reviews) {
            sumRate = sumRate + rev.getRating();
        }
        avgRate = (sumRate / reviews.size());
        double roundedAvgRate = Math.round(avgRate * 10.0) / 10.0;

        System.out.println(tempMovie.getMovieName() + " has " + roundedAvgRate + " of average rate.");
        System.out.println("*************************************************");
        System.out.println("Search for another movie? (y/n)");
        Scanner sc2 = new Scanner(System.in);
        String response = sc2.nextLine();

        switch (response) {
            case "y":
                reviewsAndRatings();
                break;
            case "n":
                home();
                break;
            default:
                System.out.println("Invalid Response!!");
                home();
                break;
        }
    }

}
