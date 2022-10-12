#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N, a_ary[26], b_ary[26], check;

    cin >> N;

    string a, b;

    for (int i = 0; i < N; i++) {
        check = 0;
        fill(a_ary, a_ary + 26, 0);
        fill(b_ary, b_ary + 26, 0);

        cin >> a >> b;

        for (int j = 0; j < a.size(); j++) {
            a_ary[a.at(j) - 'a']++;
        }

        for (int j = 0; j < b.size(); j++) {
            b_ary[b.at(j) - 'a']++;
        }

        for (int j = 0; j < 26; j++) {
            if(a_ary[j] != b_ary[j]) {
                check = 1;
                break;
            }
        }

        if(check == 1) {
            cout << "Impossible\n";
        } else {
            cout << "Possible\n";
        }
    }

    return 0;
}
