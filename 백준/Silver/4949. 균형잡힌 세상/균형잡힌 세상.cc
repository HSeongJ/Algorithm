#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    while(true) {
        bool valid = true;
        string s;
        stack<char> stack;

        getline(cin, s);
        if(s == ".") break;
        
        for(int i = 0; i < s.size(); i++) {

            if(s[i] == '(' || s[i] == '[') {
                stack.push(s[i]);
            } else if(s[i] == ')') {
                if(stack.empty() || stack.top() == '[') {
                    valid = false;
                    break;
                }
                stack.pop();
            } else if(s[i] == ']') {
                if(stack.empty() || stack.top() == '(') {
                    valid = false;
                    break;
                }
                stack.pop();
            }
        }

        if(!stack.empty()) valid = false;

        if(valid) cout << "yes\n";
        else cout << "no\n";
    }
}
