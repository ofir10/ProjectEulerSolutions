#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int max = 0;
    for (int p = 1; p <= 1000; p++) { // 1 - 1000
        int max_p = 0;
        for (int a = 1; a < p/2; a++) { // 1 - p/2
            for (int b = a; b < p/2; b++) { // 1 - p/2
                if (sqrt(pow(a,2) + pow(b, 2)) != (p - a - b)) {
                    continue;
                }
                max_p++;
            }
        }
        if (max < max_p) {
            max = max_p;
            cout << "max = " << max << ", p = " << p << endl;
        }
    }
    return 0;
}
