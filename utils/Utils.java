package utils;

public class Utils {

    public static void BlankLine(int numberOfTime) {
        for  (int i = 0; i < numberOfTime; i++) {
            System.out.println();
        }
    }

    public static void HorizontalRule() {
        System.out.println("------------------------------------------------");
    }
    

    // Optional parameter hint
    public static void InputComponent(String fieldName) {
        InputComponent(fieldName, "Enter your ");
    }
    
    public static void InputComponent(String fieldName, String hint) {
        System.out.print(hint + fieldName + ": ");
    }

    public static void ClearCLI() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                // Clear console for Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Clear console for Unix-based systems
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // If there is an error, fall back to printing multiple blank lines
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }
        
    
}
