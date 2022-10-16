#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    deque<pair<int,int>> d;
    int N, L;
    cin >> N >> L;

    for(int i = 1; i <= N; i++) {
        int num;

        cin >> num;

        while(!d.empty() && d.back().first >= num) {
            d.pop_back();
        }

        d.push_back({num, i});

        if(d.front().second <= i - L) {
            d.pop_front();
        }

        cout << d.front().first << ' ';
    }
    return 0;
}
