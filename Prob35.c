//#include <stdio.h>
//#include <math.h>
//#define LIMIT 1000000
//
//int numLength(int num) {
//	int length = 0;
//	while (num > 0) {
//		num /= 10;
//		length++;
//	}
//	return length;
//}
//
//int isPrime(int num) {
//	for (int i = 2; i <= sqrt(num); i++) {
//		if (num % i == 0) {
//			return 0;
//		}
//	}
//	return 1;
//}
//
//int changeOneRotation(int num) {
//	int temp = num % 10;
//	num /= 10;
//	num = ((int)pow(10, numLength(num)) * temp) + num;
//	return num;
//}
//
//int main() {
//	int count = 0; 
//	for (int i = 2; i < LIMIT; i++) {
//		if (!isPrime(i)) {
//			continue;
//		}
//		int num = i;
//		int all_are_primes = 1;
//		for (int k = 0; k < numLength(i); k++) {
//			int newNum = changeOneRotation(num);
//			if (newNum == num) {
//				break;
//			}
//			else {
//				num = newNum;
//				if (!isPrime(num)) {
//					all_are_primes = 0;
//					break;
//				}
//			}
//		}
//		if (all_are_primes) {
//			count++;
//		}
//	}
//	printf("\n");
//	printf("count: %d\n", count);
//	return 0;
//}