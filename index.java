import pages.Home;
import pages.Welcome;

class index{
    public static void main(String[] args) {
        //TODO: You can implement router here and navigate between different pages
        // HINT : add a global variable  to store the current page

        //Intitalizing Pages
        Home page = new Home("Home Page");
        Welcome welcomePage = new Welcome("Welcome Page");
        
        while (true) {
            welcomePage.display();
            page.display();
        }

     
        

    }
}
