#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    stack<pair<int, int>> stack;
    int N, cnt;
    long long res = 0;

    stack.push({1000000001, 0});

    cin >> N;

    vector<int> ary(N);

    for(int i = 0; i < N; i++) {
        cin >> ary[i];
    }

    for(int i = N-1; i >= 0; i--) {
        cnt = 0;
        while(stack.top().first < ary[i]) {
            cnt = cnt + stack.top().second + 1;
            stack.pop();
        }

        stack.push({ary[i], cnt});
        res += cnt;
    }

    cout << res;

    return 0;
}
