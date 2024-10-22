package DSA;
//string doesn't allow to update the value. It is immutable.
public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            series +=ch;
        }
        //System.out.println(series);


        //using STRING BUILDER
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
