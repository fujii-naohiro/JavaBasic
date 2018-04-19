package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		
		for(int b = 0; b < 35; b++) {
			System.out.print
			("-");
		}
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int a = 0; a < i; a++) {
				System.out.print("■");
			}

			for(int a = 5; a > i; a--) {
				System.out.print("□");
			}
			System.out.println();
		}

		for(int i = 0; i < 5; i++) {
			for(int a = 5; a > i; a--) {
				System.out.print("■");
			}

			for(int a = 0; a < i; a++) {
				System.out.print("□");
			}
			System.out.println();
		}



		/*
		for(int i = 0; i < 37; i++) {
			if(i < 35) {
				System.out.println("-");
			}else if(i == 35) {
				System.out.println();
			}else {
				for(int a = 0; a < 10; a++) {
					if(a = )

					}
				}
			}

		}
		*/
	}
}
