#include <math.h>
#include <stdio.h>
int fill_arr(int arr[1000]);
int isPrime(int num);
void printarr(int arr[1000]);


int main() {
	int is_prime[1000] = { 0 };
	fill_arr(is_prime);
	printarr(is_prime);

	return 0;
}

// filling the array. if 1 - is prime
int fill_arr(int arr[1000]) {
	int  i = 2;
	for (int j = 2; j <= (1000/i); j++) {
		for (; j*i < 1000; i++) {
			if (isPrime(j)) {
				arr[j] = 1;
				arr[j * i] = 0;
			}
			else {
				arr[j] = 0;
				continue;
			}
		}
	}
	return 1;
}

int isPrime(int num) {
	//return 1 if num is prime
	for (int i = 2; i <= sqrt(num); i++) {
		if (num % i == 0) {
			return 0;
		}
	}
	return 1;
}

void printarr(int arr[1000]) {
	//print the array
	for (int i = 0; i < 100; i++) {
		printf("%d: %d\n", i, arr[i]);
	}
}
