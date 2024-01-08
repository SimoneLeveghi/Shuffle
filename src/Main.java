public class Main {
    public static void main(String[] args) {
        String s1 = " casa ";
        String s2 = " scatola   ";

        s1 = s1.trim();
        s2 = s2.trim();

        while(s1.contains("  ")) {
            s1 = s1.replaceAll("  ", " ");
        }

        while(s2.contains("  ")) {
            s2 = s2.replaceAll("  ", " ");
        }
        System.out.println(shuffle(s1, s2));
    }

    public static String shuffle(String s1, String s2) {
        String ret = "";
        int length = Math.min(s1.length(), s2.length());
        for(int i = 0; i < length; ++i) {
            ret += s1.charAt(i);
            ret += s2.charAt(i);
        }
        ret += s1.substring(length) + s2.substring(length);

        return ret;
    }
}