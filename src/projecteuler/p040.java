package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

public class p040 {
	public static void main(String[] args){
		ArrayList<Integer> w = new ArrayList<Integer>();
		w.addAll(Arrays.asList(1,10,100,1000,10000,100000,1000000));
		int j = 0;
		int l = 0;
		int i = 1;
		int p = 1;
		while(l < 1000001){
			l += Math.log10(i)+1;
			if(l >= w.get(j)){
				int t = l - w.get(j);
				String b = i + "";
				//System.out.println(l + " " + t + " " + b);
				//System.out.println(b.charAt(b.length() - t - 1));
				p*=b.charAt(b.length() - t - 1)-48;
				j++;
				if(j == w.size()){
					break;
				}
			}
			i++;
		}
		System.out.println(p);
	}
}
