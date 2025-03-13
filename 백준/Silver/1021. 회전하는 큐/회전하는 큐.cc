#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    deque<int> d;
    int N, M, res = 0;

    cin >> N;

    for(int i = 1; i <= N; i++) {
        d.push_back(i);
    }

    cin >> M;

    while(M--) {
        bool right = false;
        int a;

        cin >> a;

        for(int i = 0; i <= (d.size() - 1) / 2; i++) {
            if(d[i] == a) {
                right = true;
                break;
            }
        }

        if(right) {
            while(true) {
                if(d.front() == a) {
                    d.pop_front();
                    break;
                } else {
                    int tmp = d.front();
                    d.pop_front();
                    d.push_back(tmp);
                    res++;
                }
            }
        } else {
            while(true) {
                if(d.front() == a) {
                    d.pop_front();
                    break;
                } else {
                    int tmp = d.back();
                    d.pop_back();
                    d.push_front(tmp);
                    res++;
                }
            }
        }
    }

    cout << res;
    return 0;
}
