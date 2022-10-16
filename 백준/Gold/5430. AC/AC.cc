#include <bits/stdc++.h>

using namespace std;



int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int T;

    cin >> T;

    while(T--) {
        deque<int> d;
        string p, x;
        int n, i;
        bool left = false, error = false;

        cin >> p >> n >> x;

        x.pop_back();

        int tmp = 0, ja = 1;
        while(!x.empty() && n != 0) {
            if(x.back() == '[' || x.back() == ',') {
                d.push_back(tmp);
                tmp = 0;
                ja = 1;
            } else {
                tmp = tmp + (ja * (x.back()-48));
                ja *= 10;
            }
            x.pop_back();
        }

        for(i = 0; i < p.size(); i++) {
            if(p.at(i) == 'R') {
                if(left) left = false;
                else left=true;
            } else {
                if(d.empty()) {
                    cout << "error" << '\n';
                    error = true;
                    break;
                }

                if(left) d.pop_front();
                else d.pop_back();
            }
        }


        if(!error) {
            cout << "[";

            if(!d.empty()) {
                if(left) {
                    cout << d[0];
                    for(i = 1; i < d.size(); i++) {
                        cout << ',' << d[i];
                    }
                } else {
                    cout << d[d.size()-1];
                    for(i = d.size()-2;   i >= 0; i--) {
                        cout << ',' << d[i];
                    }
                }
            }
            cout << "]\n";
        }

    }
    return 0;
}
