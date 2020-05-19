
package bt2;

public class main2 {

    public static void main(String[] args) {
       MyStringBuilder str = new MyStringBuilder.Builder()
                                    .addStr("trong java")
                                    .addFloat(2020)
                                    .addBool(true)
                                    .build();
       
        System.out.println(str.toString());
    }
}
