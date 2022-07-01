public class Reverse
{
    public static void main(String[] args)
    {

        System.out.println(isExactReverse("ba", "a"));
        System.out.println(isExactReverse("desserts", "stressed"));
        System.out.println(isExactReverse("apple", "apple"));
        System.out.println(isExactReverse("regal", "lager"));
        System.out.println(isExactReverse("war", "raw"));
        System.out.println(isExactReverse("pal", "slap"));
        System.out.println(isExactReverse("pfls", "slap"));

    }

    public static boolean isExactReverse(String x, String y) {

        if (x.length() != y.length()) {
            return false;
        }
        int count = 0;
        int endOfString = x.length() - 1;
        boolean result = false;

        for (int i = 0; i < y.length(); i++) {
            if (x.charAt(endOfString) == y.charAt(i)) {
                count++;
            }
            endOfString--;
        }
        if (count == y.length()) {
            result = true;
        }
        return result;

    }
}

