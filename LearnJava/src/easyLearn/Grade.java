package easyLearn;

import java.util.*;

public class Grade {

	public static void main(String[] args) {
    int count, i;
    float totalMarks = 0, percentage;
    
   Scanner scanner = new Scanner(System.in);
    System.out.println("enter number of subject");
    count = scanner.nextInt();
    System.out.println("enter marks of" + count+ "subject");
    for(i=0;i<count;i++) {
    	totalMarks +=scanner.nextInt();
    }
    System.out.println("total marks:" +totalMarks);
    
    percentage = (totalMarks/(count*100))*100;
    
    switch((int)percentage/10){
    	
    	case 9:
    		System.out.println("grade: A");
    		break;
    	case 8:
    	case 7:
    		System.out.println("grade: B");
    		break;
    	case 6:
    		System.out.println("grade : C");
    		break;
    	case 5:
    		System.out.println("grade : D");
    		break;
    	default:
    		System.out.println("fail F");
    		break;
    }
    
    
	}

}
