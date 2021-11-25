package com.myLearning.testPrograms;

//import java.net.UnknownServiceException;
import java.util.Scanner;

/* floor=10 lift =6
lift current floor,direction
user floor number, direction*/

public class LiftProgram {
    public static void main(String args[]) {
        int[] lift_floor=new int[6]; 
        int[] nearLift=new int[6];
        int user_floor,tempFloor;
        
        char[] lift_direction=new char[6];
        char user_direction,tempDirection;
        
        Scanner scanner=new Scanner(System.in);
        
        for(int i=0;i<6;i++){
            nearLift[i]=-1;
        }
        
        for(int i=0;i<6;i++){
        	System.out.println("Enter the floor number for lift "+(i+1)+":");
            tempFloor=scanner.nextInt();
            if(tempFloor<10 && tempFloor>=0)
                lift_floor[i]=tempFloor;
            else{
                System.out.println("Enter the floor between 0 to 9");
                i--;
            }
        }
        tempFloor=-1;
        do {
        System.out.println("Enter the user floor number between 0 to 9:");
        user_floor=scanner.nextInt();
        }while(user_floor>9 || user_floor<0);

        for(int i=0;i<6;i++){
        	System.out.println("Enter the direction of the lift(u or d) "+(i+1)+":");
            tempDirection=scanner.next().charAt(0);
            if((tempDirection!='u' && lift_floor[i]!=9) || (tempDirection!='d' && lift_floor[i]!=0)) {
            	if(tempDirection=='u' || tempDirection=='d')
                    lift_direction[i]=tempDirection;
                else{
                    System.out.println("Enter the floor direction as 'u' or 'd'");
                    i--;
                }
            }
            if(lift_floor[i]==0)
            	lift_direction[i]='u';   
            if(lift_floor[i]==9)
            	lift_direction[i]='d';
        }
        System.out.println("Enter the direction of the user(u or d):");
        if(user_floor==0)
        	user_direction='u';
        else if(user_floor==9)
        	user_direction='d';
        else
        	user_direction=scanner.next().charAt(0);
         
        for(int i=0;i<6;i++){
        	if(user_direction==lift_direction[i]) {
        		if(user_direction=='u' && user_floor>=lift_floor[i])
        			nearLift[i]=user_floor-lift_floor[i];
        		else
        			nearLift[i]=(9-lift_floor[i]+9+(user_floor));
        		
        		if(user_direction=='d' && user_floor<=lift_floor[i])
                    nearLift[i]=user_floor-lift_floor[i];  
        		else
        			nearLift[i]=(lift_floor[i]+9+(9-user_floor));
            }
        	else if(user_direction!=lift_direction[i]) {
        		if(user_direction=='u' && user_floor<=)
    				nearLift[i]=user_floor-lift_floor[i];
        		else if(user_direction=='d')
        		d	nearLift[i]=(9-lift_floor[i])+(9-user_floor);   
        	}
        }
        System.out.println("user Floor number and direction: "+user_floor+" "+user_direction);
        for(int i=0;i<6;i++) {
        	System.out.println("Lift "+(i+1)+" Floor Number & Direction: "+lift_floor[i]+" "+lift_direction[i]+" "+nearLift[i]);
        }
        int min=-1,index=-1;
        for(int i=0;i<6;i++) {
        	if(nearLift[i]!=-1) {
        		min=nearLift[i];
        		index=i;
        		break;
        	}
        }
        for(int i=0;i<5;i++){
        	if(nearLift[i]<min && nearLift[i]!=-1){
        		min=nearLift[i];
        		index=i;
        		}
        	}
        System.out.println("The Closest lift: "+(index+1));
        scanner.close();
    }
}