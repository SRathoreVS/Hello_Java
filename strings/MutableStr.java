package strings;

public class MutableStr {
    public static void main(String[] args) {
        // since STRINGS are Immutable by nature ,

        // STRING BUFFER is Thread Safe || STRING BUILDER is not : rest all same

        // how can we achieve Mutable Str :
        // STRING buffer || String Builder

        StringBuffer strBuff = new StringBuffer("Satyam");
        // 6 + 16
        System.out.println(strBuff.capacity());

        // 16 space is extra || 22
        System.out.println(strBuff.capacity());

        // 6
        System.out.println(strBuff.length());

        // change or Append data
        strBuff.append("Rathore");

        // SatyamRathore
        System.out.println(strBuff);

        // change to string
        String str = strBuff.toString();
        System.out.println(str);

        // to delete a character at index SatyaRathore
        strBuff.deleteCharAt(5);
        System.out.println(strBuff);

        // to insert
        strBuff.insert(5, "Priya");
        System.out.println(strBuff);

        // substring , specify start and end
        strBuff.substring(5);
        System.out.println(strBuff);

    }
}
