/* I began by observing that the number of rectangles contained in an m*n grid is: (LATEX CODE)
  \sum_{i=1}^m{\sum_{j=1}^n{(m - i + 1)(n - j + 1)}}.
 * */
#include <iostream>
using namespace std;

int NUM_DEST = 2000000;

int main() {
    int result = 0;
    int min = 2 * NUM_DEST;
    int min_m = 0;
    int min_n = 0;
    int N = 2000;
    int M = 1;
    while (N >= 1 && M <= N) { // N >=1001 && M <= 999
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                result += (N-i+1)*(M-j+1);
            }
        }
        int current = result - NUM_DEST;
        result = 0;
        if (abs(current) < min) {
            min = abs(current);
            min_m = M;
            min_n = N;
        }
        if (current < 0) {
            M++;
        }
        else {
            N--;
        }
    }


    cout << "result = " << min_n * min_m << endl;
    return 0;
}
