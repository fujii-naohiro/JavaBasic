package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください

		int avg = 0;
		
		for(int a = 0; a < array[0].length; a++) {
				avg += array[0][a];
			}
		
		for(int b = 0; b < array[1].length; b++) {
				avg += array[1][b];
			}
		System.out.println(avg / (array[0].length + array[1].length));
	}
}
