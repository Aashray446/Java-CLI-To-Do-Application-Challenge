package pages;

import java.util.Scanner;

import utils.Utils;

public class Welcome extends Page  {
    private Scanner sc = new Scanner(System.in);

    public Welcome(String title){
        super(title);
    }

    @Override
    public void display() {
        Utils.ClearCLI();
        Utils.HorizontalRule();
        System.out.println("Welcome to TODO APP with JAVA");
        Utils.HorizontalRule();
        Utils.BlankLine(4);
        Utils.InputComponent("continue", "Press anykey to ");
        sc.nextLine();
    }

    
}
