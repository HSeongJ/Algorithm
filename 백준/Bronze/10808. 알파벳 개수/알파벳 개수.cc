#include <bits/stdc++.h>
using namespace std;

int main() {

    vector<int> test(26);

    char str[101];

    cin >> str;

    for(int i = 0; str[i] != '\0'; i++) {
        test[str[i]-97]++;
    }

    for(int i : test) {
        cout << i << ' ';
    }


    return 0;
}