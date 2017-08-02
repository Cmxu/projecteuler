package projecteuler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p042 {
	public static void main(String[] args){
		ArrayList<Integer> tri = tg(1000);
		ArrayList<String> words = new ArrayList<String>();
		try (Scanner scanner = new Scanner(new File("rsrc/p042.txt"))) {

			String[] spl = scanner.nextLine().replaceAll("\"", "").split(",");
			words.addAll(Arrays.asList(spl));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		int c = 0;
		for(String i: words){
			if(itw(i, tri)){
				c++;
			}
		}
		System.out.println(c);
	}
	public static boolean itw(String s, ArrayList<Integer> t){
		return t.contains(wv(s));
	}
	public static int wv(String s){
		int t = 0;
		for(int i = 0; i < s.length(); i++){
			t += s.charAt(i) - 64;
		}
		return t;
	}
	public static ArrayList<Integer> tg(int n){
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++){
			l.add(i*(i+1)/2);
		}
		return l;
	}
}
