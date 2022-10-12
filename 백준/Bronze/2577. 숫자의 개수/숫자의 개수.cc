#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int a, b, c, num;
    int res[10];

    cin >> a >> b >> c;

    num = a*b*c;

    fill(res, res+10, 0);

    while(num > 0) {
        res[num%10]++;

        num /= 10;
    }

    for(int i = 0; i < 10; i++) {
        cout << res[i] << '\n';
    }

    return 0;
}
