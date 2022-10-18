#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    string s;

    cin >> s;

    stack<char> s_valid;
    bool valid = true;
    for(int i = 0; i < s.size(); i++) {
        if(s[i] == '(' || s[i] == '[') {
            s_valid.push(s[i]);
        } else if(!s_valid.empty() && s[i] == ']') {
            if(s_valid.top() == '[')
                s_valid.pop();
            else {
                valid = false;
                break;
            }
        } else if(!s_valid.empty() && s[i] == ')') {
            if(s_valid.top() == '(')
                s_valid.pop();
            else {
                valid = false;
                break;
            }
        } else {
            valid = false;
            break;
        }
    }

    if(!s_valid.empty()) valid = false;
    if(!valid) {
        cout << 0;
        return 0;
    }

    stack<char> s_cnt;
    stack<pair<int,int>> res;

    for(int i = 0; i < s.size(); i++) {
        int tmp = -1, pos= -1;
        if(s[i] == '(' || s[i] == '[') {
            s_cnt.push(s[i]);
            continue;
        } else if(s[i] == ')') {
            s_cnt.pop();
            tmp = 2;
            pos = s_cnt.size();
        } else if(s[i] == ']') {
            s_cnt.pop();
            tmp = 3;
            pos = s_cnt.size();
        }

        while(!res.empty() && (res.top().second == pos || res.top().second == pos + 1)) {
            if(res.top().second == pos) {
                tmp += res.top().first;
            } else {
                tmp *= res.top().first;
            }
            res.pop();
        }

        res.push({tmp, pos});
    }

    cout << res.top().first;
    return 0;
}
