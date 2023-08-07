#include <iostream>
#include <vector>
using namespace std;

vector<int>& toBinary (int num);
int isPolindrom (vector<int>& vec);
std::vector<int>& toVec (int num);

int main() {
    int sum = 0;
   for (int i = 1; i < 1000001; i += 2) { // only odd numbers
        if (isPolindrom(toVec(i)) && isPolindrom(toBinary(i))) {
            sum += i;
        }
    }
   cout << "sum = " << sum <<endl;

    return 0;
}

int isPolindrom (vector<int>& vec) {
    int j = vec.size()-1;
    int i = 0;
    while (i < j) {
        if (vec[i] != vec[j]) {
            return 0;
        }
        i++;
        j--;
    }
    return 1;
}

std::vector<int>& toVec (int num) {
    std::vector<int>* vec = new vector<int>;
    while (num > 0) {
        vec->push_back(num % 10);
        num /= 10;
    }
    return *vec;
}

vector<int>& toBinary (int num) {
    int res = 0;
    vector<int>* vec = new vector<int>;
    while (num > 0) {
        if (num % 2 == 1) {
            vec->push_back(1);
        } else
            vec->push_back(0);

        num /= 2;
    }
    return *vec;
}
