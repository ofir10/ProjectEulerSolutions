#include <iostream>
using namespace std;

int isNdigitEqual(int Ndigit, int numerator);

int main() {
    double product = 1;
    for (int denominator = 11; denominator <= 99; denominator++) { // 11 - 99
        int firstNdigit = (denominator / 10) % 10;
        int secondNdigit = denominator % 10;
        if (secondNdigit == 0) {
            continue;
        }
        for (int numerator = 11; numerator < denominator; numerator++) { //11 - 99
            int isFirstNdigitEqual = isNdigitEqual(firstNdigit, numerator); // 1 where the digit in the first place equal to the first numerator's digit
            if (isFirstNdigitEqual) {
                if (isFirstNdigitEqual >= 10) {
                    double newdenominator = denominator % 10; // save the second digit
                    double newDenomirator = numerator % 10; // save the second digit

                    if(newdenominator/newDenomirator == (double)denominator/numerator) {
                       product *= (double)numerator / denominator;
                    }
                } else {
                    double newdenominator = denominator % 10; // save the second digit
                    double newDenomirator = numerator / 10; // save the first digit

                    if(newdenominator/newDenomirator == (double)denominator/numerator) {
                        product *= (double)numerator / denominator;
                    }
                }
            }
           int isSecondNdigitEqual = isNdigitEqual(secondNdigit, numerator); // 1 where the digit in the second place equal to the first numerator's digit
            if (isSecondNdigitEqual) {
                if (isSecondNdigitEqual >= 10) {
                    double newdenominator = denominator / 10; // save the first digit
                    double newDenomirator = numerator % 10; // save the second digit

                    if(newdenominator/newDenomirator == (double)denominator/numerator) {
                        product *= (double)numerator / denominator;
                    }
                } else {
                    double newdenominator = denominator / 10; // save the first digit
                    double newDenomirator = numerator / 10; // save the first digit

                    if(newdenominator/newDenomirator == (double)denominator/numerator) {
                        product *= (double)numerator / denominator;
                    }
                }
            }
        }
    }
    cout << "Result = " << product << endl;
    return 0;
}

int isNdigitEqual(int Ndigit, int numerator) {
    int result = 00;
    if (Ndigit == numerator% 10) {
        result += 1;
    }
    if (Ndigit == (numerator / 10) % 10) {
        result += 10;
    }
    return result;
}