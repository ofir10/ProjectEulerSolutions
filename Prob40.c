#include <stdio.h>
int length(int num);

int main() {
	return 0;
}

int length(int num) {
	int length = 0;
	while (num > 0) {
		num /= 10;
		length++;
	}
	return length;
}

int get_approximation(int num) {
	int current_ten = 1;
	int next_ten = 10;
	int num_of_values = next_ten - current_ten;
	int num_of_digits = length(next_ten - current_ten);
	int counter = 0;
	while (next_ten <= num) {
		int next_index = num_of_digits * (next_ten - current_ten);
		counter += next_index;
		current_ten = next_ten;
		next_ten *= 10;
		num_of_values = next_ten - current_ten - 1;
		num_of_digits = length(next_ten - current_ten);
	}
	printf("index of %d: %d", num, counter);
}

int find_value_by_position(int index) {

}
