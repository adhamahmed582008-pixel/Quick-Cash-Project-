import java.util.*;
public class Quick_Cash_Project{
    //1) MAIN COMPONENTS 
    static Scanner input = new Scanner(System.in);
    static final int START_SIZE = 100;
    static final int START_FAVORITES = 5; 
    static int MAX_FAVORITE = 100;
    static int Max_USERS = 100000;
    static int MAX_TRANSACTIONS = 5000000;
    //2) ADMAIN INFO AND SETTINGS
    static long MAX_MONEY = 1000000;
    static int CURRENT_YEAR = 26;
    static int CURRENT_MONTH = 10;
    static final String ADMIN_USERNAME = "admin";
    static final String ADMIN_PASSWORD = "admin6767";
    static final long INVALID_AMOUNT = -99999999999999999L;
    //2) USERS DATA ARRAYS 
    static String[] UsersIds = new String[START_SIZE];
    static String[] Names = new String[START_SIZE];
    static String[] Emails = new String[START_SIZE];
    static String[] Passwords = new String[START_SIZE];
    static String[] Phones = new String[START_SIZE];
    static String[] VisaNumbers = new String[START_SIZE];
    static String[] visaExpiries = new String[START_SIZE];
    static long[] balances = new long[START_SIZE];
    static boolean[] UsersBlocked = new boolean[START_SIZE];
    static int ActiveUsers = 0; 
    //3) USERS FAVORITES ARRAY  
    static int[][] Favorites = new int[START_SIZE][];//INDEX OF FAVORITES
    static int[] FavoratesCounts = new int[START_SIZE];//NUMBER OF FAVORITES 
    //4) TRANSACTIONS DATA ARRAY 
    static int[] Tid = new int[START_SIZE];
    static int[] Tsender = new int[START_SIZE];//User index 
    static int[] Treciver = new int[START_SIZE];//reciver index
    static long[] Tamount = new long[START_SIZE];//$$ in paisters 
    static String[] Tstautes = new String[START_SIZE];//successed or failed 
    static String[] Tnotes = new String[START_SIZE];//leave a reason for TRANSACTION or details 
    static int Tcounter = 0; 
    //======================================================================================//
                                    //MAIN PROGRAM//
    //======================================================================================//
public static void main(String[] args) {
    boolean running = true ;
    System.out.println("===== WELCOME TO QUICK CASH =====");
    while (running) {
        System.out.println("\n Welcome to the main menu ");
        System.out.println("1) Sign in ");
        System.out.println("2) Login for Users ");
        System.out.println("3) Login as Admin ");
        System.out.println("4) Exit ");
        System.out.println("Choose an operation ");
        int operation = input.nextInt();
    }




}
}