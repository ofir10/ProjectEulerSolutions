#include <iostream>
#include <vector>

using namespace std;

int recurring(int num);
int recurring_aux(int num, vector<int> rests, int last_rest, int counter);
int isFound(int num, vector<int> rests);

int main() {
	int max_recurring = 2;
	int max_index = 0;
	for (int i = 1; i < 1000; i++) {
		int current = recurring(i);
		if (current > max_recurring) {
			max_recurring = current;
			max_index = i;
		}
	}
	cout << "max: " << max_index << endl;
    return 0;
}

int recurring(int num) {
    vector<int> rests;
    return recurring_aux(num, rests, 1, 0);
}

int recurring_aux(int num, vector<int> rests, int last_rest, int counter) {
    last_rest *= 10;
    if (last_rest == 0) {
        return 0;
    }
    if (isFound(last_rest, rests)) {
        return counter;
    }
    rests.push_back(last_rest);
    int temp = last_rest / num;
    return recurring_aux(num, rests, last_rest - (temp * num), counter + 1);
}

int isFound(int num, vector<int> rests) {
    for (auto i = rests.begin(); i != rests.end(); ++i)
        if (*i == num) {
            return true;
        }
    return false;
}