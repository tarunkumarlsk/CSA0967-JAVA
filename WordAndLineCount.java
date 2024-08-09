import java.util.Scanner;

public class WordAndLineCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the text (enter an empty line to finish):");

        
        StringBuilder sb = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            sb.append(line).append("\n");
        }

        
        String text = sb.toString().trim(); // Remove trailing newline

        
        int wordCount = countWords(text);

       
        int lineCount = countLines(text);

        
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);

        scanner.close();
    }

    
    private static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        
        String[] words = text.split("\\s+");
        return words.length;
    }

    
    private static int countLines(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        
        String[] lines = text.split("\r\n|\r|\n");
        return lines.length;
    }
}