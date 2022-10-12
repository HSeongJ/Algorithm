#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    list<int> list;
    int N, K;

    cin >> N >> K;

    for(int i = 1; i <= N; i++) {
        list.push_back(i);
    }

    auto pos = list.begin();

    cout << "<";

    for(int i = 0; i < K - 1; i++) {
        pos++;
        if(pos == list.end()) pos = list.begin();
    }

    cout << *pos;
    pos = list.erase(pos);
    if(pos == list.end()) pos = list.begin();

    while(!list.empty()) {
        cout << ", ";
        for(int i = 0; i < K - 1; i++) {
            pos++;
            if(pos == list.end()) pos = list.begin();
        }

        cout << *pos;
        pos = list.erase(pos);
        if(pos == list.end()) pos = list.begin();
    }

    cout << ">";
    return 0;
}
