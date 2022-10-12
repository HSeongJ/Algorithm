#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    string s;
    list<char> list;
    int M;
    char input;

    cin >> s;

    for(char a : s) {
        list.push_back(a);
    }

    cin >> M;

    auto pos = list.end();

    while(M > 0) {
        cin >> input;

        switch(input) {
            case 'L':
                if(pos != list.begin()) pos--;
                break;
            case 'D':
                if(pos != list.end()) pos++;
                break;
            case 'P':
                cin >> input;
                list.insert(pos, input);
                break;
            case 'B':
                if(pos != list.begin()) {
                    pos = list.erase(--pos);
                }
                break;
        }


        M--;
    }

    for(char l : list) {
        cout << l;
    }

    return 0;
}
