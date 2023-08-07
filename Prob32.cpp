#include <iostream>
#include <vector>

int isDivOk(double num_4gidits, double num_2digits);
void insertProduct (std::vector<int>& vec, int product);
int insertDigits (int used_digits[], int num);
int allDigitsUsed(int arr[]);
void compareArr(int arr1[], int arr2[]);
int nod(int num);

int ARR_SIZE = 9;
using namespace std;

int main() {
    std::vector<int> good_products;
    for (int num = 1234; num <= 9876; num++) { // 1234-9876
        int used_digits[] = {0,0,0,0,0,0,0,0,0};
        int num_digits[] = {0,0,0,0,0,0,0,0,0};
        if (!insertDigits(used_digits, num)) {
            continue;
        }
        compareArr(num_digits, used_digits);

        for (int factor_one = 2; factor_one <= 98; factor_one++) { // 2 <= 98
            int factor_two = isDivOk(num, factor_one); // 0 if divide is not ok

            if (!factor_two || !insertDigits(used_digits, factor_one) || !insertDigits(used_digits, factor_two) ||
                    !allDigitsUsed(used_digits)) {
                compareArr(used_digits, num_digits);
                continue;
            }
            insertProduct(good_products, num);
        }
    }

    // calc sum
    int counter = 0;
    for (auto& elem : good_products)
    {
        counter += elem;
    }

    std::cout << "sum : " << counter << std::endl;
}

int isDivOk(double num_4gidits, double factor_one) {
    double factor_two = num_4gidits / factor_one;
    if ((factor_two - (int)factor_two != 0)) {
        return false;
    }

    if((nod(factor_one) + nod(factor_two)) != 5) {
        return false;
    }

        return (int)factor_two;
}

int insertDigits (int used_digits[], int num) {
    while(num != 0) {
        int next_digit = num % 10;
        if (next_digit == 0) {
            return 0;
        }
        num /= 10;
        if (used_digits[next_digit-1] == 1) {
            return 0;
        }
        used_digits[next_digit-1] = 1;
    }
    return 1;

}

void insertProduct (std::vector<int>& vec, int num) {

    if(vec.size() == 0 ) {
        vec.push_back(num);
        return;
    }
    for (auto elem : vec)
    {
        if (elem == num) {
            return;
        }
    }
    vec.push_back(num);
}

int allDigitsUsed(int arr[]) {
    for (int i = 0; i < ARR_SIZE; i++) {
        if (arr[i] == 0) {
            return 0;
        }
    }
    return 1;
}

void compareArr(int arr1[], int arr2[]) {
    for(int i = 0; i < ARR_SIZE; i++) {
        arr1[i] = arr2[i];
    }
}

//nog = number of digits
int nod(int num) {
    int counter = 0;
    while(num != 0) {
        num /= 10;
        counter++;
    }
    return counter;
}

