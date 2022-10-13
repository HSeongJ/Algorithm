#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    stack<int> stack;

    cin >> N;

    while (N--) {
        int input;
        string com;

        cin >> com;

        if(com == "push") {
            cin >> input;
            stack.push(input);
        } else if(com == "pop") {
            if(stack.empty()) {
                cout << -1 << '\n';
            } else {
                cout << stack.top() << '\n';
                stack.pop();
            }
        } else if(com == "size") {
            cout << stack.size() << '\n';
        } else if (com == "empty") {
            if(stack.empty()) {
                cout << 1 << '\n';
            } else {
                cout << 0 << '\n';
            }
        } else if (com == "top") {
            if(stack.empty()) {
                cout << -1 << '\n';
            } else {
                cout << stack.top() << '\n';
            }
        }
    }
    return 0;
}
