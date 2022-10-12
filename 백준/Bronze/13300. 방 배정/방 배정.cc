#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N, K, S, Y, res = 0;

    cin >> N >> K;

    int a[2][6] = {};

    for(int i = 0; i < N; i++) {
        cin >> S >> Y;

        a[S][Y-1]++;
    }

    for(int i = 0; i < 2; i++) {
        for(int j = 0; j < 6; j++) {
            res += (a[i][j]+K-1) / K;
        }
    }

    cout << res;

    return 0;
}
