package com.myLearning.testPrograms;

import java.util.Scanner;

public class ChessQueenHorse {
	void toCheck(int qr,int qc,int hr,int hc) {
		if(qr>0 && qc>0 && hr>0 && hc>0) {
			if(qr+1==hr) {
				if(qc-2==hc)
					System.out.println("Strike");
				else if(qc+2==hc)
					System.out.println("Strike");
				else
					System.out.println("Will not Strike");
			}
			else if(qr-1==hr) {
				if(qc-2==hc)
					System.out.println("Strike");
				else if(qc+2==hc)
					System.out.println("Strike");
				else
					System.out.println("Will not Strike");
			}
			else if(qr+2==hr) {
				if(qc-1==hc)
					System.out.println("Strike");
				else if(qc+1==hc)
					System.out.println("Strike");
				else
					System.out.println("Will not Strike");
			}
			else if(qr-2==hr) {
				if(qc-1==hc)
					System.out.println("Strike");
				else if(qc+1==hc)
					System.out.println("Strike");
				else
					System.out.println("Will not Strike");
			}
		}
		else
			System.out.println("Enter a positive integer");
	}
	
	public static void main(String args[]) {
		ChessQueenHorse chess=new ChessQueenHorse();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the Queen's row position: ");
		int qr=scanner.nextInt();
		System.out.println("Please enter the Queen's column position: ");
		int qc=scanner.nextInt();
		System.out.println("Please enter the Horse's row position: ");
		int hr=scanner.nextInt();
		System.out.println("Please enter the Horse's row position: ");
		int hc=scanner.nextInt();
		chess.toCheck(qr,qc,hr,hc);
	}

}
