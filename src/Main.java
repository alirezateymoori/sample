import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("enter number members");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] members = new int[n];
        System.out.println("choice you want to members");
        System.out.println("1:add member");
        System.out.println("2:edit member");
        System.out.println("3:delete member");
        System.out.println("4:show members");
        System.out.println("5:exit");
        String[]names=new String[n];
        int[]ages=new int[n];
        char[]genders=new char[n];
        int i=0;

        int choice = sc.nextInt();
        while(choice != 5){
            switch(choice){
                case 1:System.out.println("enter name member");
                names[i]=sc.next();
                System.out.println("enter age member");
                ages[i]=sc.nextInt();
                System.out.println("enter gender member");
                genders[i]=sc.next().charAt(0);
                System.out.println("user idea");
                System.out.println(i);

                i++;
                System.out.println("saved");break;
                case 2:System.out.println("member's number ");
                int s=sc.nextInt();
                System.out.println("enter name member");
                names[s]=sc.next();
                System.out.println("enter age member");
                ages[s]=sc.nextInt();
                System.out.println("enter gender member");
                genders[s]=sc.next().charAt(0);break;
                case 3:System.out.println("member's number ");
                int d=sc.nextInt();
                names[d]=null;
                ages[d]=0;
                genders[d]=';';break;
                case 4:System.out.println("member's number ");
                int e=sc.nextInt();
                System.out.println(names[e]);
                System.out.println(ages[e]);
                System.out.println(genders[e]);break;
                default:System.out.println("ha");










            }
            choice = sc.nextInt();
        }
        sc.close();
        System.out.println("have good time");



    }
}
