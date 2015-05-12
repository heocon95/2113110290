package buoi4;

import java.util.InputMismatchException;
import java.util.Scanner;

// Nhap so nguyen nho hon 999 999

public class vidu11 {
	public static void main(String[] args) {
		int n, i = 0, y, chon = 0;
		int mang[];
		mang = new int[6];
		String mangchu[];
		mangchu = new String[6];

		mangchu[0] = " ";
		mangchu[1] = " muoi ";
		mangchu[2] = " tram ";
		mangchu[3] = " ngan ";
		mangchu[4] = " muoi ";
		mangchu[5] = " tram ";

		Scanner sc = new Scanner(System.in);
		try {
			do {
				System.out.println("Nhap vao day so: ");
				n = sc.nextInt();

				while (n > 0) {
					y = n % 10;
					mang[i] = y;
					n = n / 10;
					i++;
				}

				i = 5;
				while (i >= 0) {
					switch (mang[i]) {
					case 0:
						System.out.print("khong");
						break;
					case 1:
						System.out.print("Mot");
						break;
					case 2:
						System.out.print("Hai");
						break;
					case 3:
						System.out.print("Ba");
						break;
					case 4:
						System.out.print("Bon");
						break;
					case 5:
						System.out.print("Nam");
						break;
					case 6:
						System.out.print("Sau");
						break;
					case 7:
						System.out.print("Bay");
						break;
					case 8:
						System.out.print("Tam");
						break;
					case 9:
						System.out.print("Chin");
					}
					System.out.print(mangchu[i]);
					i--;
				}
				System.out.println("\n\nNhap vao phim khac de tiep tuc\nNhap vao 0 de thoat");
				chon = sc.nextInt();
			} while (chon != 0);

			while (chon != 0)
				;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Ban da nhap qua du lieu");
		} catch (InputMismatchException e) {
			System.err.println("Nhap lieu sai");
		}
	}
}
