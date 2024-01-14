public class Main {

    public static void main(String[] args) {

        System.out.println("Programe started!");
        int arr[]={1,5,6,7,8,10};
        int a=showarr(arr);
        System.out.println(a);

    }
    public static int showarr(int[] abc){
        int sum=0;
        for(int i=0; i<abc.length; i++){
            sum=sum+abc[i];
        }
        sum=sum+25;
        return sum;
    }
}