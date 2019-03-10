


package love.programming;

public class BasicControlFlow {

    public static void main(String[] args) {


        boolean myBoolean = true;
        if(myBoolean==true){
            System.out.println("myBoolean value is true");
        }
        if(myBoolean){
            System.out.println("myBoolean value is true 2");
        }
        else {
           System.out.println("myBoolean value is false");
        }

        int x= 1;

        if(x==1){
            System.out.println("this works");
        };
        if (x==1)
        {System.out.println("this works");
        };

        int testScore = 76;
        char grade;

        if(testScore>=90){ //nester if else statment
            grade = 'A';
            System.out.println(grade);
        } else if(testScore>=80){
            grade = 'B';
            System.out.println(grade);
        } else if(testScore>=70){
            grade = 'C';
            System.out.println(grade);
        } else if (testScore>=60){
            grade = 'D';
            System.out.println(grade);
        } else if(testScore>=50){
            grade = 'E';
            System.out.println(grade);
        } else{
            grade ='F';
            System.out.println(grade);
        }


        int x1 = 10;
        int y = 20;

        if(x>5){
            y = 2*x;
        }else{
            y = 4*x;
        }

        System.out.println("value of y ="+y);

        //Terenary operator

        y = (x>5)?(2*x):(4*x);

        System.out.println("value of y using Terenary operator is= "+y);


        //Switch case

        int daysOfWeek = 0;

        switch (daysOfWeek){
            case 0:
                System.out.println("Monday");
               break;
            case 1:
                System.out.println("Tuesday");
              break;
            case 2:
                System.out.println("Wednesday");
               break;
            case 3:
                System.out.println("Thursday");
               break;
            case 4:
                System.out.println("Friday");
               break;
            default:
                System.out.println("WeekEnd");
        }

        //While loop

        int countDown = 10;
        System.out.println("CountDown starts from"+countDown);
        while(countDown>0){
            System.out.println(countDown--);
            ;
        }

        //for loop

        System.out.println("For loop CountDown starts from 10");
        for(int i=10;i>0;i--){
            System.out.println(i);
//            break;
        }

    }}