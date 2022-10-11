#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int a, i, j;

    cin >> a;

    for(i = 1; i <= a; i++) {
        for(j = 1; j <= i; j++) {
            cout << "*";
        }
        for(j = 1; j <= (a-i)*2; j++) {
            cout << " ";
        }
        for(j = 1; j <= i; j++) {
            cout << "*";
        }
        cout << "\n";
    }


    for(i = a-1; i >= 1; i--) {
        for(j = 1; j <= i; j++) {
            cout << "*";
        }
        for(j = 1; j <= (a-i)*2; j++) {
            cout << " ";
        }
        for(j = 1; j <= i; j++) {
            cout << "*";
        }
        cout << "\n";
    }



    return 0;
}
