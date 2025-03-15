#include <bits/stdc++.h>
using namespace std;
#define X first
#define Y second

vector<vector<char>> board;
int N;
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};

int bfs(bool isNormal)
{
  int count = 0;
  vector<vector<int>> vis(N, vector<int>(N, 0));

  queue<pair<int, int>> Q;
  for (int i = 0; i < N; i++)
  {
    for (int j = 0; j < N; j++)
    {
      if (vis[i][j] == 0)
      {
        count++;
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

          if (nx < 0 || ny < 0 || nx >= N || ny >= N)
          {
            continue;
          }

          if (isNormal)
          {
            if (vis[nx][ny] || board[nx][ny] != board[cur.X][cur.Y])
            {
              continue;
            }
          }
          else
          {
            if (vis[nx][ny])
            {
              continue;
            }

            if (board[cur.X][cur.Y] == 'B' && board[nx][ny] != board[cur.X][cur.Y])
            {
              continue;
            }
            if ((board[cur.X][cur.Y] == 'R' || board[cur.X][cur.Y] == 'G') && board[nx][ny] == 'B')
            {
              continue;
            }
          }

          vis[nx][ny] = 1;
          Q.push({nx, ny});
        }
      }
    }
  }

  return count;
}

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> N;
  board.resize(N, vector<char>(N, ' '));

  for (int i = 0; i < N; i++)
  {
    string s;
    cin >> s;
    for (int j = 0; j < s.length(); j++)
    {
      board[i][j] = s[j];
    }
  }

  cout << bfs(true) << ' ' << bfs(false);
}