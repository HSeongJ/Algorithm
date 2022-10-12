#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, x, res = 0;

    cin >> n;

    vector<int> a(n+1);

    int a_x[2000001] = {};

    for(int i = 1; i < a.size(); i++) {
        cin >> a[i];
    }

    cin >> x;


    for(int i = 1; i < a.size(); i++) {
        if(x-a[i] >= 1) {
            if(a_x[x-a[i]] == 1) {
                res++;
            }

            a_x[a[i]] = 1;
        }
    }

    cout << res;

    return 0;
}
