#include <bits/stdc++.h>
using namespace std;
#define X first
#define Y second

int board[1002][1002];
int vis[1002][1002];
int N, M;
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> M >> N;
  for (int i = 0; i < N; i++)
  {
    for (int j = 0; j < M; j++)
    {
      cin >> board[i][j];
    }
  }

  queue<pair<int, int>> Q;

  for (int i = 0; i < N; i++)
  {
    for (int j = 0; j < M; j++)
    {
      if (board[i][j] == 1)
      {
        vis[i][j] = 1;
        Q.push({i, j});
      }
    }
  }

  int lastX, lastY;
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
      if (board[nx][ny] == -1 || vis[nx][ny] != 0)
      {
        continue;
      }

      vis[nx][ny] = vis[cur.X][cur.Y] + 1;
      Q.push({nx, ny});
    }

    if (Q.empty())
    {
      lastX = cur.X;
      lastY = cur.Y;
    }
  }

  bool isNotAll = false;
  for (int i = 0; i < N; i++)
  {
    for (int j = 0; j < M; j++)
    {
      if (vis[i][j] == 0 && board[i][j] == 0)
      {
        isNotAll = true;
        break;
      }
    }

    if (isNotAll)
    {
      break;
    }
  }

  if (isNotAll)
  {
    cout << -1;
  }
  else
  {
    cout << vis[lastX][lastY] - 1;
  }
}