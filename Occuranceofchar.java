
public class Occuranceofchar {
    static final int MAX_CHAR =256;
    static void getOccuringChar(String str) {
        //creating an
        int count[] = new int[MAX_CHAR];

        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <=; j++) {
                if (str.charAt(i) == ch[j])
                    find++;

            }
            if (find == 1)
                System.out.println("occurrance" + str.charAt(i) + "is" + count[str.charAt(i)]);
        }
    }

}