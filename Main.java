public class Main {
    public static void main(String[] args) {
        int[] a = {3,1,4,1,5};
        int sum = 0;
        for (int v :a )sum+=v;
        double avg = sum/a.length;      
        System.out.println(avg);
    }
}