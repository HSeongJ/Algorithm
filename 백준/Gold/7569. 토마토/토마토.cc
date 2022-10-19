#include <bits/stdc++.h>

using namespace std;

int board[101][101][101];
int dits[101][101][101];
int dx[6] = {1, 0, 0, -1, 0, 0};
int dy[6] = {0, 1, 0, 0, -1, 0};
int dz[6] = {0, 0, 1, 0, 0, -1};

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, m, h;
    tuple<int, int, int> T;
    list<tuple<int,int,int>> list;

    cin >> m >> n >> h;
    for(int i = 1; i <= h; i++) {
        for(int j = 1; j <= n; j++) {
            for(int k = 1; k <= m; k++) {
                cin >> board[i][j][k];

                if(board[i][j][k] == 1) {
                    T = make_tuple(i, j, k);
                    list.push_back(T);
                }

                if(board[i][j][k] == 0)
                    dits[i][j][k] = -1;
            }
        }
    }

    while(!list.empty()) {
        auto cur = list.front();

        list.pop_front();

        for (int dir = 0; dir < 6; dir++) {
            int nz = get<0>(cur) + dz[dir];
            int nx = get<1>(cur) + dx[dir];
            int ny = get<2>(cur) + dy[dir];

            if (nx < 1 || nx > n || ny < 1 || ny > m || nz < 1 || nz > h) continue;
            if (dits[nz][nx][ny] >= 0) continue;

            dits[nz][nx][ny] = dits[get<0>(cur)][get<1>(cur)][get<2>(cur)] + 1;
            list.push_back(make_tuple(nz, nx, ny));
        }
    }

    int ans = 0;
    for(int i = 1; i <= h; i++) {
        for(int j = 1; j <= n; j++) {
            for(int k = 1; k <= m; k++) {
                if(dits[i][j][k] == -1) {
                    cout << -1;
                    return 0;
                }

                ans = max(ans, dits[i][j][k]);
            }
        }
    }

    cout << ans;
    return 0;
}
