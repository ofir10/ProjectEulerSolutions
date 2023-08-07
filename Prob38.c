//#include <stdio.h>
//#include <math.h>
//
//int isPandigital(long num) {
//
//	int arr[9] = { 0 };
//
//	for (int i = 0; i < 9; i++) {
//		int dstCell = (num % 10) - 1;
//		if (dstCell < 0) {
//			return 0;
//		}
//		arr[dstCell] += 1;
//		num /= 10;
//	}
//	for (int i = 0; i < 9; i++) {
//		if (arr[i] != 1) {
//			return 0;
//		}
//	}
//	return 1;
//}
//
//int numLength(long num) {
//	int count = 0;
//	while (num > 0) {
//		count++;
//		num /= 10;
//	}
//	return count;
//}
//
//
//int main() {
//	int max = 0;
//	int concatenating = 0;
//
//	for (int i = 2; i < 10000 ; i++) {
//		for (int k = 1; numLength(concatenating) < 9; k++) {
//			int adding = i * k;
//			int adding_length = numLength(adding);
//			concatenating = ((long)pow(10,adding_length)*concatenating) + (adding);
//			if (numLength(concatenating) == 9 && isPandigital(concatenating)) {
//				if (concatenating > max) {
//					max = concatenating;
//				}
//			}
//		}
//		concatenating = 0;
//	}
//	printf("%d\n", max);
//	return 0;
//}