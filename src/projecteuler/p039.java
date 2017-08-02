package projecteuler;

public class p039 {
	public static void main(String[] args){
		int[] p = new int[1001];
		for(int a = 1; a <= 1000; a++){
			for(int b = a; b <= 1000; b++){
				for(int c = b; c <= 1000-a-b; c++){
					if(pt(a,b,c)){
						p[a+b+c]++;
					}
				}
			}
		}
		int m = 0;
		int idx = 0;
		for(int i = 0; i < p.length; i++){
			if(p[i] > m){
				m = p[i];
				idx = i;
			}
		}
		System.out.println(m + " " + idx);
	}
	public static boolean pt(int a, int b, int c){
		return a*a + b*b == c*c;
	}
}
