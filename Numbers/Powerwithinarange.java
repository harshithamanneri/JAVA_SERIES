public class Powerwithinarange {public static void main(String[] args) {
        int base = 2;
        int start = 1;
        int end = 100;

        System.out.println("Powers of " + base + " within the range " + start + " to " + end + ":");
        int power = 1;
        while (power <= end) {
            if (power >= start) {
                System.out.println(power);
            }
            power *= base;
        }
    }
    
}
