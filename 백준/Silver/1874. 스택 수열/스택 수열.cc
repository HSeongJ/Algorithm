#include <bits/stdc++.h>

using namespace std;

int input[100001];
int p[100001];

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    stack<int> stack;

    int n;

    cin >> n;

    for(int i = 1; i <= n; i++) {
        cin >> input[i];
    }

    p[input[1]] = 1;

    for(int i = 1; i < n; i++) {
        if(input[i] > input[i+1]) {
            for(int j = input[i] - 1; j > input[i + 1]; j--) {
                if(p[j] == 0) {
                    cout << "NO";
                    return 0;
                }
            }
        }

        p[input[i + 1]] = 1;
    }

    int cnt = 0;

    for(int i = 1; i <= n; i++) {
        if(cnt < input[i]) {
            for(int j = cnt+1; j <= input[i]; j++) {
                stack.push(j);
                cout << "+\n";
                cnt++;
            }
            i--;
        } else {
            cout << "-\n";
            stack.pop();
        }
    }

    return 0;
}