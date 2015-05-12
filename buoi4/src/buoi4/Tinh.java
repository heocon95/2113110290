package buoi4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tinh {
	public static void main(String[] args) {
		int a, b, kq = 0;
		int chon;

		Scanner sc = new Scanner(System.in);

		try {
			do {
				System.out.println("1. Phep cong");
				System.out.println("2. Phep tru");
				System.out.println("3. Phep nhan");
				System.out.println("4. Phep chia");
				System.out.println("Nhap vao phep tinh muon hien thi: ");
				chon = sc.nextInt();

				System.out.println("Nhap vao gia tri a: ");
				a = sc.nextInt();
				System.out.println("Nhap vao gia tri b: ");
				b = sc.nextInt();

				switch (chon) {
				case 1:
					kq = a + b;
					break;
				case 2:
					kq = a - b;
					break;
				case 3:
					kq = a * b;
					break;
				case 4:
					kq = a / b;
					break;
				default:
					break;
				}
				System.out.println("Ket qua: " + kq);
				System.out
						.println("Nhap vao phim khac de tiep tuc\nNhap vao 0 de thoat");
				chon = sc.nextInt();
			} while (chon != 0);

		} catch (ArithmeticException e) {
			System.err.println("Loi chia cho 0");
		} catch (InputMismatchException e) {
			System.err.println("Nhap lieu sai");
		}
	}
}

// ArithmeticException: loi toan hoc
// InputMismatchException