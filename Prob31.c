#include <stdio.h>
#define SIZE 8
#define BIGGEST 200
int calc(int currencies[], int current, int sum);
int counter = 0;

int main() {
	int currencies[] = { 200, 100, 50, 20, 10, 5, 2, 1 };
	
	calc(currencies, 0, 0);
	printf("Answer: %d",counter);
}

int calc(int currencies[], int current, int sum) {
	if (current >= SIZE) {
		return 0;
	}
	if (sum == BIGGEST) {
		counter++;
		return 1;
	}
	else if (sum > BIGGEST) {
		return 0;
	}
	calc(currencies, current+1, sum);
	return calc(currencies, current, sum + currencies[current]);
}
