#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int first[26] = {}, second[26] = {}, res = 0;
    string str;

    cin >> str;

    for(char i : str) {
        first[i - 'a']++;
    }

    str.clear();

    cin >> str;

    for(char i : str) {
        second[i - 'a']++;
    }

    for(int i = 0; i < 26; i++) {
        res += abs(first[i] - second[i]);
    }

    cout << res;
    return 0;
}
