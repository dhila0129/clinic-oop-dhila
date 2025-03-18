/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_4;

/**
 *
 * @author ACER
 */
public class LibraryBook {
    private String title;
    private String author;
    private Boolean isBorrowed;
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setIsBorrowed(Boolean bool) {
        this.isBorrowed = bool;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public Boolean getStatus(){
        return isBorrowed;
    }
    
    public static void main(String args[]) {
        LibraryBook lb = new LibraryBook();
        lb.setTitle("Petualangan Ramzi");
        lb.setAuthor("Julio");
        lb.setIsBorrowed(true);
        System.out.println("Title: " + lb.title);
        System.out.println("Author: " + lb.author);
        System.out.println("Is Borrowed: " + lb.isBorrowed);
    }
}
