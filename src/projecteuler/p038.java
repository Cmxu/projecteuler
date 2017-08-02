package projecteuler;

import java.util.TreeSet;

public class p038 {
	public static void main(String[] args){
		int m = 0;
		for(int i = 2; i <= 7; i++){
			for(int j = 1; j <= 99999; j++){
				int t = gp(j,i);
				if(t != -1){
					if(t > m){
						m = t;
					}
				}
			}
		}
		System.out.println(m);
	}
	public static int gp(int a, int n){
		String b = "";
		for(int i = 1; i <= n; i++){
			b += (a*i) + "";
		}
		return pd(b)?Integer.parseInt(b):-1;
	}
	public static boolean pd(String a){
		if(a.length() != 9){
			return false;
		}
		if(a.contains("0")){
			return false;
		}
		TreeSet<Character> set = new TreeSet<Character>();
		for(int i = 0; i < a.length(); i++){
			set.add(a.charAt(i));
		}
		return set.size() == 9;
	}
}
