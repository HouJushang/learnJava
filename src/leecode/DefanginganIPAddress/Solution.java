package leecode.DefanginganIPAddress;

public class Solution {
    public static void main(String[] args) {
        String demo = "1.1.1.1"; // => 1[.]1[.]1[.]1

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            fn(demo);
        }
        long time2 = System.currentTimeMillis();

        System.out.println(time2 -time1);

        for (int i = 0; i < 1000000; i++) {
            fn2(demo);
        }
        long time3 = System.currentTimeMillis();
        System.out.println(time3 -time2);

        for (int i = 0; i < 1000000; i++) {
            fn3(demo);
        }
        long time4 = System.currentTimeMillis();
        System.out.println(time4 -time3);

        for (int i = 0; i < 1000000; i++) {
            fn4(demo);
        }
        long time5 = System.currentTimeMillis();
        System.out.println(time5 -time4);




    }

    public static String fn(String address) {
        return address.replace(".", "[.]");
    }

    public static String fn2(String address) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char indexChar = address.charAt(i);
            if(indexChar == '.'){
                newString.append("[.]");
            }else{
                newString.append(indexChar);
            }
        }
        return newString.toString();
    }

    public static String fn3(String address){
        int len = address.length() ;
        char[] ret = new char[len+6] ;
        int idx = 0 ;
        for( int i = 0 ; i < len ; i++ )
        {
            char c = address.charAt(i) ;
            if( c == '.' )
            {
                ret[idx++] = '[' ;
                ret[idx++] = '.' ;
                ret[idx++] = ']' ;
            }
            else
            {
                ret[idx++] = c ;
            }
        }
        return new String(ret) ;
    }

    // split + join
    public static String fn4(String address) {
        if (address == null) {
            return "Invalid address provided.";
        }

        if (address.isEmpty()) {
            return "";
        }

        String [] p = address.split("\\.");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < p.length - 1; i++) {
            sb.append(p[i]);
            sb.append("[.]");
        }

        sb.append(p[p.length - 1]);

        return sb.toString();
    }
}
