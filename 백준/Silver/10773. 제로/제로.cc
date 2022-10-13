#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int K, res = 0;
    stack<int> stack;

    cin >> K;

    while(K--) {
        int input;

        cin >> input;

        switch (input) {
            case 0:
                if(!stack.empty()) stack.pop();
                break;
            default:
                stack.push(input);
        }
    }

    while(!stack.empty()) {
        res += stack.top();
        stack.pop();
    }

    cout << res;
    return 0;
}
