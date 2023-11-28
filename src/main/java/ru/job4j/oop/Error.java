package ru.job4j.oop;

public class Error {
   private boolean active;
   private int status;
   private String message;

    public Error() {
        active = false;
        status = 5;
        message = "Yes";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void showInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 2, "No");
        Error error3 = new Error(true, 3, "No, Yes");
        error1.showInfo();
        System.out.println();
        error2.showInfo();
        System.out.println();
        error3.showInfo();
    }
}
