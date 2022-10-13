#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    long long res = 0;
    int N, same;

    cin >> N;

    stack<pair<int,int>> stack;

    while(N--) {
        same = 1;
        long long h;
        cin >> h;

        while(!stack.empty() && stack.top().first < h) {
            res += stack.top().second;
            stack.pop();
        }

        if(!stack.empty()) {
            if(stack.top().first == h) {
                res += stack.top().second;
                same = stack.top().second+1;

                if(stack.size() > 1) res++;

                stack.pop();
            } else {
                res++;
            }
        }

        stack.push({h, same});
    }

    cout << res;
    return 0;
}
