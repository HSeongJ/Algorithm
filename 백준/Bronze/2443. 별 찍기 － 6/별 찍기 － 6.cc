#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int a, i, j;

    cin >> a;

    for(i = a - 1; i >= 0; i--) {
        for(j = 0; j < a - i - 1; j++) {
            cout << " ";
        }
        
        for(j = 0; j < 1 + (2*i); j++) {
            cout << "*";
        }

        cout << '\n';
    }

    return 0;
}
