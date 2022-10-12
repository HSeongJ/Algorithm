#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int T;
    string s;
    list<char> list;

    cin >> T;

    while(T > 0) {
        s.clear();
        list.clear();

        auto pos = list.end();

        cin >> s;

        for(char c : s) {
            switch(c) {
                case '<':
                    if(pos != list.begin()) pos--;
                    break;
                case '>':
                    if(pos != list.end()) pos++;
                    break;
                case '-':
                    if(pos != list.begin()) {
                        pos = list.erase(--pos);
                    }
                    break;
                default:
                    list.insert(pos, c);
                    break;
            }
        }

        for(char l : list) {
            cout << l;
        }

        cout << '\n';
        T--;
    }

    return 0;
}
