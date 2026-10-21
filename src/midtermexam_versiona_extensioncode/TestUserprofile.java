/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author John, 2026
 */
public class TestUserprofile {
    public static void main(String[] args){
        
        UserProfile[] profile = new UserProfile[1];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter username: ");
        String user = input.nextLine();
        
        System.out.println("Welcome "+ user);
        System.out.println("Please enter your favourite movie genre: ");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++){
            System.out.println(genres[i]);
        }
        String genre = input.nextLine();
        
        profile[1] = new UserProfile(user, genre);
        
        System.out.println("User Created!");
        System.out.println(profile[0]);
        System.out.println(profile[1]);
    }
}
