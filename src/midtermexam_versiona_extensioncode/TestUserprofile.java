/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author Bonita
 */
public class TestUserprofile {
    public static void main (String[]arg){
        Scanner indata = new Scanner(System.in);
        UserProfile profile = new UserProfile();
        System.out.println("Enter your name and choose your favourite genre from the list: ");
        for(int i=0;i < UserProfile.genres().length; i++){
            System.out.println(UserProfile.genres[i]);
        }
        String name = indata.nextLine();
        String genre = indata.nextLine();
        profile.setUserID(name);
        profile.setGenre(genre);
        System.out.println("User profile has been created.");
        
    }
    
}
