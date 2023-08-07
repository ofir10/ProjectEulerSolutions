//#include <stdio.h>
//#include <math.h>
//
//int isPrime(int num);
//int isPandigital(int num);
//
//int main() {
//
//	int max = 1;
//	for (long i = 1; i <= 987654321; i++) {
//		//if (isPrime(i) && isPandigital(i)) {
//		//	max = i;
//		//}
//
//		//if (i % 1000000 == 0) {
//		//	printf("num: %d\n", i);
//
//		//}
//	}
//	printf("final max: %d\n", max);
//
//
//
//	//int max = 1;
//	//int isFound = 0;
//	//for (int numLength = 9; numLength > 0; numLength--) {
//	//	int num = 1;
//	//	for (int digit = 2; digit <= numLength; digit++) {
//	//		num = num*10 + digit;
//	//	}
//	//	for (int i = 0; i < numLength; i++) {
//	//		int lastDigit = num % 10;
//	//		num /= 10;
//	//		num = (lastDigit * (int)pow(10, numLength-1)) + num;
//	//		printf("num: %d\n", num);
//
//	//		if (isPrime(num)) {
//	//			if (num > max) {
//	//				isFound = 1;
//	//				max = num;
//	//			}
//	//		}
//	//		if (i == numLength - 1 && isFound) {
//	//			printf("max: %d\n", max);
//	//			return 0;
//	//		}
//	//	}
//	//}
//	//printf("final max: %d\n", max);
//
//	return 0;
//}
//
//int isPrime(long num) {
//	if (num == 1) {
//		return 1;
//	}
//
//	for (int i = 2; i <= sqrt(num); i++) {
//		if (num % i == 0) {
//			return 0;
//		}
//	}
//
//	return 1;
//}
//
//int isPandigital(long num) {
//	int arr[10] = { 0 };
//	int numLength = 0;
//
//	while (num > 0) {
//		numLength++;
//		arr[num % 10] = 1;
//		num /= 10;
//	}
//	for (int i = 1; i <= numLength; i++) {
//		if (arr[i] != 1) {
//			return 0;
//		}
//	}
//	return 1;
//}
