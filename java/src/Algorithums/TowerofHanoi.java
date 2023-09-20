package Algorithums;

public class TowerofHanoi {

	public static void main(String[] args) {
		// disc change problem
		towerofHanoi(4,'A','B','C');
		

	}

	private static void towerofHanoi(int n, char src, char aux, char des) {
		// TODO Auto-generated method stub
		if(n==1) {
			System.out.println(src+" --> "+des);
			return;
		}
		towerofHanoi(n-1, src, des, aux);
		towerofHanoi(1, src, aux, des);
		towerofHanoi(n-1, aux, src, des);
		
	}

}
