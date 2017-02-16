public class testsAds {
    public static void main(String[] args){
        System.out.println(yMethod(90));
    }

    public static double yMethod(double n){
        if (n == 0){
            return 1;
        }
        else{
            return (2 * yMethod(n-1));
        }
    }
}
