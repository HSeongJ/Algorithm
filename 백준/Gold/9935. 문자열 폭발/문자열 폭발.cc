#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    stack<pair<char, int>> stack;
    string str, pok;

    cin >> str >> pok;

    for(int i = 0; i < str.size(); i++) {
        if(!stack.empty()) {
            if (str.at(i) == pok.at(stack.top().second)) {
                stack.push({str.at(i), stack.top().second + 1});
            } else if (str.at(i) == pok.at(0)) {
                stack.push({str.at(i), 1});
            } else {
                stack.push({str.at(i), 0});
            }
        } else {
            if(str.at(i) == pok.at(0)) {
                stack.push({str.at(i), 1});
            } else {
                stack.push({str.at(i), 0});
            }
        }

        if (stack.top().second == pok.size()) {
            for (int j = 0; j < pok.size(); j++) {
                stack.pop();
            }
        }
    }

    if(!stack.empty()) {
        vector<char> res;
        while(!stack.empty()) {
            res.push_back(stack.top().first);
            stack.pop();
        }

        for(int i = res.size()-1; i >= 0; i--) {
            cout << res[i];
        }
    } else {
        cout << "FRULA";
    }

    return 0;
}
