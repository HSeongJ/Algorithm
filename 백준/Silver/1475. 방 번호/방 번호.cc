#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, cnt[10], res = 0;

    fill(cnt, cnt+10, 0);

    cin >> n;

    while(n > 0) {
        cnt[n%10]++;

        n /= 10;
    }

    for(int i = 0; i < 10; i++) {
        if(i == 6 || i == 9) continue;

        res = max(res, cnt[i]);
    }

    res = max(res, (cnt[6]+cnt[9]+1)/2);

    cout << res;
    return 0;
}
