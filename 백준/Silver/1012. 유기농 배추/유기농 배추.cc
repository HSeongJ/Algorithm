#include <bits/stdc++.h>
using namespace std;
#define X first
#define Y second

int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  int T;
  cin >> T;
  while (T--)
  {
    int board[52][52] = {};
    int vis[52][52] = {};

    int N, M, C;
    cin >> N >> M >> C;

    while (C--)
    {
      int X, Y;
      cin >> X >> Y;

      board[X][Y] = 1;
    }

    int count = 0;
    queue<pair<int, int>> Q;
    for (int i = 0; i < N; i++)
    {
      for (int j = 0; j < M; j++)
      {
        if (board[i][j] == 1 && vis[i][j] == 0)
        {
          count++;
          vis[i][j] = 1;
          Q.push({i, j});
        }

        while (!Q.empty())
        {
          pair<int, int> cur = Q.front();
          Q.pop();

          for (int dir = 0; dir < 4; dir++)
          {
            int nx = cur.X + dx[dir];
            int ny = cur.Y + dy[dir];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M)
            {
              continue;
            }

            if (board[nx][ny] == 0 || vis[nx][ny] == 1)
            {
              continue;
            }

            vis[nx][ny] = 1;
            Q.push({nx, ny});
          }
        }
      }
    }

    cout << count << '\n';
  }
}