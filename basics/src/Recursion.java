public class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(0,1, 7));
    }
    public static int sum(int s, int i, int upto){
        if(i > upto) return s;
        return sum(s+i, i+1, upto);
    }
}
