import java.util.Scanner;
// Warning, a lot of crutches and bicycles
// Developed by the king of castes

class Reverse{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the text - ");
        String text = in.nextLine();
        char rev_text[] = new char[text.length()-1];
        int j = text.length()-1;
        for (int i = 0; i < text.length() - 1; i++){
            rev_text[i] = text.toCharArray()[j];
            j--;
        }
        System.out.println("Reversed text - " + rev_text.toString());
        in.close();
    }
}