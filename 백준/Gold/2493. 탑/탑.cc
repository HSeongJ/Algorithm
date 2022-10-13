#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    stack<pair<int,int>> stack;

    int N;

    cin >> N;

    stack.push({100000001, 0});

    for(int i = 1; i <= N; i++) {
        int height;

        cin >> height;

        while(stack.top().first < height) {
            stack.pop();
        }
        cout << stack.top().second << ' ';
        stack.push({height, i});
    }

    return 0;
}
