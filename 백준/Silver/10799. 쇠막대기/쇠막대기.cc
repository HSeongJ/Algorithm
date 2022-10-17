#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    string s;
    stack<char> stack;
    long long res = 0;

    cin >> s;

    for(int i = 0; i < s.size(); i++) {
        if(s[i] == '(') {
            stack.push('(');
        } else if(s[i] == ')' && s[i-1] == '(') {
            stack.pop();
            res += stack.size();
        } else {
            res++;
            stack.pop();
        }
    }

    cout << res;
    return 0;
}
