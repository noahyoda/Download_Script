package download_script;

import java.util.Scanner;

public class Main_download {

	/*
	 * Steps
	 * -check directory for download folder
	 * -go to given url
	 * -find amount of episodes
	 * -download episodes to folder
	 * -print completion (and stats?)
	 */
	
	public static void main(String[] args) {
		System.out.println("Welcome to my show download script!\nPlease paste your show link");
		Scanner in = new Scanner(System.in);
		String link = in.nextLine();
		System.out.println("Do you want the whole season (y/n)?");
		String eps = in.next();
		int start = 0;
		if(eps == "n") {
			System.out.println("First ep number: ");
			start = in.nextInt();
			System.out.println("Last ep number");
			int fin = in.nextInt();
		}
		
	}

}
