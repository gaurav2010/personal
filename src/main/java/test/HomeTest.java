package test;

/**
 * Created by malinni on 13/10/2016.
 */
public class HomeTest {

    /**
     * Provide description what this method does;
     * <B>
     * Solution - This loops over upto the point 'a' is greater than 'b'. At each loop it reduces 'a' by 'b'
     * Please refer to unit-test "testquestion_1" where 3 test cases are provided
     * PLease note that when 'b'=0, the code goes to infinite loop
     * </B>
     * suggest better implementation
     * <B>
     *     Refer to question_1_Better. This will also covers scenario where 'b' is 0
     * </B>
     */
    public int question_1(int a, int b)
    {
        while (a > b)
        {
            a -= b;
        }
        return a;
    }

    /**
     * Better Solution for Question-1
     * @param a
     * @param b
     * @return
     */
    public int question_1_Better(int a, int b){
        if (a <= b)
            return a;
        if(b == 0)
            return a;
        int c = a % b;
        if (c == 0 )
            return b;
        else
            return c;
    }

    /**
     * Returns {@code true} if exactly two of input parameters are {@code true}
     */
    public boolean question_2(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean b6)
    {
        int counter = 0;
        if(b1)
            counter++;
        if(b2)
            counter++;
        if(b3)
            counter++;
        if(b4)
            counter++;
        if(b5)
            counter++;
        if(b6)
            counter++;
        if(counter ==2)
            return true;
        else
            return false;


    }


    /**
     * Returns {@code true} if the input is a square of some prime number.
     * For example:<br>
     * {@code question_3(2)} is {@code false}<br>
     * {@code question_3(4)} is {@code true}<br>
     * {@code question_3(5)} is {@code false}<br>
     * {@code question_3(9)} is {@code true}<br>
     * {@code question_3(10)} is {@code false}<br>
     * {@code question_3(16)} is {@code false}<br>
     * {@code question_3(25)} is {@code true}<br>
     */
    public boolean question_3(int num)
    {
        int sq = (int)(Math.sqrt(num)+.5);
        if(num == sq*sq){

            //Below logic checks for Prime Number
            if(sq ==2)
                return true;

            //check prime
            if(sq%2==0)
                return false;

            int i =3;
            while(i < sq){
                if(sq%i == 0)
                    return false;
                i +=2;
            }
            return true;
        }
        return false;
    }


    /**
     * Returns number of different bytes that have specified number of bits set to 1.
     * For example:<br>
     * {@code question_4(0)} is {@code 1}.
     * {@code question_4(1)} is {@code 8}.
     * {@code question_4(2)} is {@code 28}.
     *
     * I.e. these are the only bytes that have exactly one bit set to 1:
     * 00000001, 00000010, 00000100, 00001000, 00010000, 00100000, 01000000, 10000000
     */
    public int question_4(int bits)
    {
        int count = 1;
        int intSize = 8;
        for(int i = 0; i < bits; i++){
            count = (count * (intSize-i))/ (i+1);
        }
        return count;
    }



    /**
     * Returns number of numbers which are greater than 0 and lesser than {@code num} and are divisible either by 3 or by 5.
     * For example:<br>
     * {@code question_5(5)} is {@code 1}<br>
     * {@code question_5(6)} is {@code 2}<br>
     * {@code question_5(25)} is {@code 11}<br>
     */
    public int question_5(int num)
    {
        int count = 0;
        for(int i =3;i < num; i++){
            if(i%3 == 0 || i%5 == 0 )
                count++;
        }
        return count;

    }


    /**
     * Defines following sequence fi(n):<br>
     * fi(0) = 0;<br>
     * fi(1) = 0;<br>
     * fi(2) = 1;<br>
     * fi(n) = fi(n-1) + fi(n-2) - fi(n-3)
     * Returns nth number of the sequence.
     * For example:<br>
     * {@code question_6(1)} is {@code 0}<br>
     * {@code question_6(2)} is {@code 1}<br>
     * {@code question_6(3)} is {@code 1}<br>
     * {@code question_6(4)} is {@code 2}<br>
     */
    public int question_6(int num)
    {
        if(num == 0 || num == 1)
            return 0;

        if(num == 2)
            return 1;

        return question_6(num-1) + question_6(num-2) - question_6(num-3);
    }



    /**
     * Takes comma-separated list of email addresses and returns comma-separated list of names with proper capitalisation,
     * assuming that local-part of the email address consists of dot-separated name parts.
     * For example:<br>
     * {@code question_7("han.solo@gmail.com")} is {@code "Han Solo"}<br>
     * {@code question_7("CHEWBACCA@gmail.com, obi.wan.kenobi@gmail.com,")} is {@code "Chewbacca, Obi Wan Kenobi"}<br>
     */
    public String question_7(String emails)
    {
        StringBuffer retNames = new StringBuffer();
        String[] splits = emails.split(",");
        boolean startName = true;
        for(String email : splits){
            if(startName)
                startName = false;
            else
                retNames.append(", ");

            String fullName = email.substring(0, email.indexOf("@")).trim();
            String[] names = fullName.split("\\.");
            boolean firstName = true;
            for(String name : names){
                if(firstName)
                    firstName = false;
                else
                    retNames.append(" ");

                retNames.append(name.substring(0,1).toUpperCase());
                retNames.append(name.substring(1).toLowerCase());

            }

        }
        return retNames.toString();
    }

}
