package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

public class p041 {
	public static void main(String[] args){
		ArrayList<Integer> ps = pg(1000000);
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.addAll(Arrays.asList(7,6,5,4,3,2,1));
		int[] a = new int[7];
		for(int i = 0; i < 1000000; i++){
			String t = pdg(a, 0, n);
			if(p(Integer.parseInt(t), ps)){
				System.out.println(t);
				break;
			}
			n.addAll(Arrays.asList(7,6,5,4,3,2,1));
			a = inc(a);
		}
	}
	public static int[] inc(int[] a){
		for(int i = a.length-1; i >= 0; i--){
			if(a[i] != a.length-1-i){
				a[i] ++;
				break;
			}
			a[i] = 0;
		}
		return a;
	}
	public static String pdg(int[] a, int i, ArrayList<Integer> n){
		if(i==a.length-1){
			int t = n.get(0);
			n.remove(0);
			return t + "";
		}
		int t = n.get(a[i]);
		n.remove(a[i]);
		return t + pdg(a, i+1, n);
	}
	public static ArrayList<Integer> pg(int n){
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(2);
		for(int i = 3; i < n; i+=2){
			if(p(i,l)){
				l.add(i);
			}
		}
		return l;
	}
	public static boolean p(int n, ArrayList<Integer> p){
		for(int i = 0; i < p.size(); i++){
			int j = p.get(i);
			if(j > Math.sqrt(n)){
				return true;
			}
			if(n%j == 0){
				return false;
			}
		}
		return true;
	}
}
