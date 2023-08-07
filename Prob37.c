//#include <stdio.h>
//#include<math.h>
//
//int isPrime(int num) {
//	if (num == 1) {
//		return 0;
//	}
//	for (int i = 2; i <= sqrt(num); i++) {
//		if (num % i == 0) {
//			return 0;
//		}
//	}
//	return 1;
//}
//int is_legal(int num) {
//	int old_num = 0;
//	int num_length = 0;
//	if (!isPrime(num)) {
//		return 0;
//	}
//	while (num > 0) {
//		old_num += pow(10, num_length) * (num % 10);
//		num_length++;
//		if (!isPrime(old_num) || !isPrime(num)) {
//			return 0;
//		}
//		num /= 10;
//	}
//	return 1;
//}
//int main() {
//	int count = 0;
//	int sum = 0;
//	int i = 11;
//	while(count != 11) {
//		if (is_legal(i)) {
//			count++;
//			sum += i;
//		}
//		i++;
//	}
//	printf("%d", sum);
//	return 0;
//}