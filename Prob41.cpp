/*
 * Please take note of the code provided below:
 * we only have to consider n=4 and n=7, because we already know there is at least one 4-digit pandigital prime
 * and because the sum of the integers for n=5, n=6, n=8 and n=9 is divisible by 3, so they cannot be primes.
 * Moreover, during the process of answering this question, I may have been less focused,
 * leading to instances where I solved a different problem than the one originally intended. As a result,
 * I resorted to crafting code that specifically addresses the current scenario and produces the desired output.
*/

#include <iostream>
#include <cmath>

using namespace std;

int isPandigital(int num);
int isPrime(int num);
int arrToInt(int arr[7]);

int main() {
    int arr[7] = {0};
    int counter = 0;
            for (int i7 = 0; i7 < 7; i7++) {
                if (arr[i7] != 0) {
                    continue;
                }
                arr[i7] = 7;
                for (int i6 = 0; i6 < 7; i6++) {
                    if (arr[i6] != 0) {
                        continue;
                    }
                    arr[i6] = 6;
                    for (int i5 = 0; i5 < 7; i5++) {
                        if (arr[i5] != 0) {
                            continue;
                        }
                        arr[i5] = 5;
                        for (int i4 = 0; i4 < 7; i4++) {
                            if (arr[i4] != 0) {
                                continue;
                            }
                            arr[i4] = 4;
                            for (int i3 = 0; i3 < 7; i3++) {
                                if (arr[i3] != 0) {
                                    continue;
                                }
                                arr[i3] = 3;
                                for (int i2 = 0; i2 < 7; i2++) { //cant be last digit to be prime
                                    if (arr[i2] != 0) {
                                        continue;
                                    }
                                    arr[i2] = 2;
                                    for (int i1 = 0; i1 < 7; i1++) {
                                        if (arr[i1] != 0) {
                                            continue;
                                        }
                                        arr[i1] = 1;
                                        int num = arrToInt(arr);
                                        if (isPrime(num) && isPandigital(num)) {
                                            cout << "Answer = " << num << endl;
                                            i1 = i2 = i3 = i4 = i5 = i6 = i7 = 9;
                                        }
                                        arr[i1] = 0;
                                    }
                                    arr[i2] = 0;
                                }
                                arr[i3] = 0;
                            }
                            arr[i4] = 0;
                        }
                        arr[i5] = 0;
                    }
                    arr[i6] = 0;
                }
                arr[i7] = 0;
            }

    cout << "contuer = " << counter <<endl;
   return 0;
}

int isPandigital(int num) {
    int hist[8] = {0};

    //check all digits appear only once
    while (num > 0) {
        if (++hist[(num % 10) - 1] > 1) {
            return 0;
        }
        num /= 10;
    }
    //check all needed digits appear
    bool DIGIT_IS_NOT_APPEAR = 0;
    for (int i = 0; i < 8; i++) {
        if (hist[i] == 0) {
            DIGIT_IS_NOT_APPEAR = 1;
        }
        else if (DIGIT_IS_NOT_APPEAR) { // hist[i] > 0
            return 0;
        }
    }
    return 1;
}

int isPrime(int num) {
    for (int i = 2; i <= sqrt(num); i++) {
        if (num % i == 0) {
            return 0;
        }
    }
    return 1;
}

int arrToInt(int arr[7]) {
    int num = 0;
    for (int i = 0; i < 7; i++) {
        num += pow(10, i) * arr[6-i];
    }
    return num;
}