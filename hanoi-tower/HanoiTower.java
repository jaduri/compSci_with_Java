
public class HanoiTower{
	//declare attributes
	int[] poleA;
	int[] poleB;
	int[] poleC;
	int disks;
	//default constructo
	HanoiTower(){
		this.poleA = init(3);
		this.poleB = new int[3];
		this.poleC = new int[3];
		this.disks = 3;
	}
	//parametrized constructor
	HanoiTower(int dTmp){
		this.disks = dTmp;
		this.poleA = init(dTmp);
		this.poleB = new int[dTmp];
		this.poleC = new int[dTmp];
	}

	//methods
	public void solve(int n, int[] from, int[] aux, int[] to){//solution method
		//when n equals 1
		if(n <= 1){
			to[n-1] = from[n-1];//move disk n to destination array
			from[n-1] = 0;//make source array location zero
			display(this.poleA, this.poleB, this.poleC);//show porgress on screen
			return;
		}
		//recursive function call to move the disk above current disk when n > 1
		solve(n-1, from, to, aux);//moves disks from source to auxiliary pole
		to[n-1] = from[n-1];//move disk
		from[n-1] = 0;//reset previous location of disk to 0
		display(this.poleA, this.poleB, this.poleC);//show porgress on screen
		solve(n-1, aux, from, to);//moves disks from auxiliary to destination pole
	}

	public static int[] init(int n){
		//initialise new array from 1 to n
		int[] arr = new int[n];
		for(int i=1; i<=n; i++){
			arr[i-1] = i;
		}
		return arr;
	}
	public static void display(int[] A,int[] B,int[] C){
		//display arrays to show progress
		for(int i = 0; i < A.length; i++){
			System.out.printf("[%d],[%d],[%d]\n",A[i],B[i],C[i]);
		}
		System.out.println("--------------------");
	}

//============Simple Solution===================//
	// public static void solve(int n, char from, char aux, char to){
	//
	// 	if(n <= 1){
	// 		System.out.println("Move disk "+n+" from pole "+from+" to pole "+to);
	// 		return;
	// 	}
	// 	solve(n-1, from, to, aux);
	// 	System.out.println("Move disk "+n+" from pole "+from+" to pole "+to);
	// 	solve(n-1, aux, from, to);
	// }
}
