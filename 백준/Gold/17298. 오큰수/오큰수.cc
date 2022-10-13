#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int a[1000000] = {};
    int ans[1000000] = {};

    int n;

    cin >> n;

    for(int i = 0; i < n; i++) {
        cin >> a[i];
    }

    stack<int> stack;

    for(int i = n - 1; i >= 0; i--) {
        while(!stack.empty() && stack.top() <= a[i]) {
            stack.pop();
        }

        if(stack.empty()) {
            ans[i] = -1;
        } else {
            ans[i] = stack.top();
        }

        stack.push(a[i]);
    }

    for(int i = 0; i < n; i++) {
        cout << ans[i] << ' ';
    }
    return 0;
}
