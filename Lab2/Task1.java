
/**
 *  01. Write java program that Declares 5 floating numbers and print their total sum and average.
 * 
 * 
 * 
 * 
 */





public class Task1 {
    public static void main(String[] args) {
        float x1 = 5.2f;
        float x2 = 22.4f;
        float x3 = 123.44f;
        float x4 = 12.213f;
        float x5 = 234.2312f;

        float sum = x1 + x2 + x3 + x4 + x5;
        float average = sum /5;
        System.out.println("Sum is = " + sum);
        System.out.println("Average is = " + average);

    }
}
