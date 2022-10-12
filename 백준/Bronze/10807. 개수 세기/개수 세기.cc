#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N, v, num[201] = {}, input;

    cin >> N;

    //-100 => 0
    // 0 => 100
    // 100 => 200
    for(int i = 0; i < N; i++) {
        cin >> input;
        num[input+100]++;
    }

    cin >> v;

    cout << num[v+100];

    return 0;
}
