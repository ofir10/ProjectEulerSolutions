//#include <stdio.h>
//
//int main() {
//
//	int sum = 0;
//	for (int i = 3; i < 9999999; i++) { // 7 * 9! < 9999999
//		if (returnFactorialSum(i) == i) {
//			sum += i;
//		}
//	}
//	printf("sum: %d", sum);
//	return 0;
//}
//
//int returnFactorialSum(int num) {
//	int sum = 0;
//	while (num != 0) {
//		sum += factorial(num % 10);
//		num /= 10;
//	}
//
//	return sum;
//}
//
//int factorial(int num) {
//	int sum = 1;
//	for (int i = 2; i <= num; i++) {
//		sum *= i;
//	}
//	return sum;
//}