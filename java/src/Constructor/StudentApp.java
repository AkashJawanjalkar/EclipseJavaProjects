package Constructor;

class Encrypte {
    String name;
    char NewS[];
    int c = 0;

    Encrypte(String name) {
        this.name = name;
        char ch[] = name.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            c = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    c++;
                }
            }
            System.out.print(ch[i] + "" + c);
        }
    }

    void BeforeEnc() {
        System.out.println("\nOriginal String: " + name);
    }

    void AfterEnc() {
        // Add your encryption or transformation logic here
        // This method will be called after character frequency counting
    }
}

public class StudentApp {

    public static void main(String[] args) {
        String n = "abcdabcdccddaabb";
        Encrypte e = new Encrypte(n);
        e.BeforeEnc();
        e.AfterEnc(); // Call your encryption or transformation method
    }
}

