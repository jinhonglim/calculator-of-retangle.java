import java.util.Scanner;
public class MyRetangle {


    public static void main(String[] args)
    {
      //setup
      Scanner input = new Scanner(System.in);
      double width = 0, height = 0 , area = 0 , Perimeter = 0 ;



      //read width
      System.out.print("please input the width :");
      width = input.nextDouble();

      //read height
      System.out.print("please input the height :");
      height = input.nextDouble();


      //process
      //calculate area
      area = width * height;
      Perimeter = 2 * width + 2 * height;

    

      //output print area
      System.out.println("area = " +area);
      System.out.println(" Perimeter= " +Perimeter);



    }
    
}
