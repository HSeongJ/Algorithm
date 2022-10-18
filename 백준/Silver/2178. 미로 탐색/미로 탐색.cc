#include <bits/stdc++.h>

using namespace std;

#define X first
#define Y second

int board[101][101];
bool vis[101][101];
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, m;
    cin >> n >> m;

    for(int i = 1; i <= n; i++) {
        string s;
        cin >> s;
        for(int j = 1; j <= m; j++) {
            board[i][j] = s[j-1] - 48;
        }
    }

    queue<pair<int,int>> Q;

    Q.push({1, 1});
    vis[1][1] = 1;

    while(!Q.empty()) {
        pair<int, int> cur = Q.front();
        Q.pop();

        for(int dir = 0; dir < 4; dir++) {
            int nx = cur.X + dx[dir];
            int ny = cur.Y + dy[dir];

            if(nx < 1 || nx > n || ny < 1 || ny > m) continue;
            if(vis[nx][ny] || board[nx][ny] == 0) continue;

            if(board[nx][ny] == 1 || board[nx][ny] > board[cur.X][cur.Y] + 1) {
                board[nx][ny] = board[cur.X][cur.Y] + 1;
            }
            vis[nx][ny] = 1;
            Q.push({nx, ny});
        }
    }

    cout << board[n][m];
    return 0;
}
