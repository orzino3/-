import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //AxisSystem axisSystem = new AxisSystem(); //this line displays the initial axis

    }

    public static void first(){
        AxisSystem axisSystem = new AxisSystem();

        int x = 100;
        int y = 150;
        String color = "Black";

        axisSystem.addSinglePoint(x,y,color);
    }

    public static void second(){
        AxisSystem axisSystem = new AxisSystem();

        int x = 200;
        int y = -200;
        String color = "Black";

        axisSystem.addSinglePoint(x,y,color);
    }

    public static void third()
    {
        AxisSystem axisSystem = new AxisSystem();
        int x=50;
        int y=50;
        String color = "Black";

        do{
          axisSystem.addSinglePoint(x,y,color);
          x+=10;
          y+=10;

        }while(x<=70);
    }


    public static void fourth(){
        Scanner scanner = new Scanner(System.in);
        AxisSystem axisSystem = new AxisSystem();

        int x,y;
        String color = "Black";

        System.out.println("Enter Your wanted coordinate");
        System.out.println("Enter X");
        x= scanner.nextInt();
        while(x < -250 || x>250){
            System.out.println("Out of limit. enter x again");
            x= scanner.nextInt();
        }
        System.out.println("Enter Y");
        y= scanner.nextInt();

        while(y< -250 || y>250){
            System.out.println("Out of limit. enter y again");
            y= scanner.nextInt();
        }

        axisSystem.addSinglePoint(x,y,color);
    }
    public static void fifth(){
        Scanner scanner = new Scanner(System.in);
        AxisSystem axisSystem = new AxisSystem();
        Random random = new Random();
        int userChoice,x,y;
        String color;

        System.out.println("Please Enter Color, and How Many Coordinates You Want" +
                " to Draw");


        color= scanner.nextLine();
        userChoice= scanner.nextInt();


        for(int i=0; i < userChoice;i++)
        {
            x= random.nextInt(-250,251);
            y= random.nextInt(-250,251);
            axisSystem.addSinglePoint(x,y,color);
        }
    }

   public static void sixth()
    {
        AxisSystem axisSystem = new AxisSystem();
        int[] data = new int[1000];
        int x=-250;
        int y;

        for(int i = 0;i< data.length;i+=2)
        {
            data[i]=x;
            data[i+1]=2*x+100;
            x++;
        }

        axisSystem.addMultiplePoints(data,"blue");

    }

    public static void seventh()
    {
        AxisSystem axisSystem = new AxisSystem();
        Scanner scanner = new Scanner(System.in);
        int m,freeNum;

        System.out.println("Please enter the slope and free number");
        m= scanner.nextInt();
        freeNum=scanner.nextInt();

        int[] data = new int[1000];
        int x=-250;
        int y;

        for(int i = 0;i< data.length;i+=2)
        {
            data[i]=x;
            data[i+1]=m*x+freeNum;
            x++;
        }
        axisSystem.addMultiplePoints(data,"blue");

    }

    public static void eight()
    {
        AxisSystem axisSystem = new AxisSystem();
        Scanner scanner = new Scanner(System.in);


        int[] data = new int[1000];
        int x=-250;
        int y;

        for(int i = 0;i< data.length;i+=2)
        {
            data[i]=x;
            data[i+1]=2*x*x-3*x+50;
            x++;
        }
        axisSystem.addMultiplePoints(data,"blue");

    }

}
