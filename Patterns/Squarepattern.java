package Patterns;
public class Squarepattern {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			for(int i=1;i<=6;i++) {
				if(i==1||i==6) {
					for(int k=1;k<=6;k++) {
						System.out.print("* ");
					}
				}
				else {
					for(int j=1;j<=6;j++) {
						if(j==1||j==6) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}
	          
		}

	}

