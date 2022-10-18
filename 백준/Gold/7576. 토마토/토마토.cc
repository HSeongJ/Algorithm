#include <bits/stdc++.h>

using namespace std;

#define X first
#define Y second

int board[1001][1001];
bool vis[1001][1001];
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, m, res = 0;
    cin >> m >> n;

    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= m; j++) {
            cin >> board[i][j];
        }
    }

    queue<pair<int,int>> Q;

    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= m; j++) {
            if(board[i][j] == 1) {
                vis[i][j] = 1;
                Q.push({i, j});
            }
        }
    }

    while(!Q.empty()) {
        pair<int, int> cur = Q.front();
        Q.pop();

        for(int dir = 0; dir < 4; dir++) {
            int nx = cur.X + dx[dir];
            int ny = cur.Y + dy[dir];

            if(nx < 1 || nx > n || ny < 1 || ny > m) continue;
            if(vis[nx][ny] || board[nx][ny] == -1) continue;

            vis[nx][ny] = 1;
            board[nx][ny] = board[cur.X][cur.Y] + 1;
            Q.push({nx, ny});
        }
    }

    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= m; j++) {
            if(board[i][j] == -1) continue;
            if(board[i][j] == 0) {
                cout << -1;
                return 0;
            }

            res = max(res, board[i][j]);
        }
    }

    cout << res - 1;
    return 0;
}
