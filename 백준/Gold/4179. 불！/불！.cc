#include <bits/stdc++.h>
using namespace std;
#define X first
#define Y second

char board[1002][1002];
int vis[1002][1002];
int Jvis[1002][1002];
int R, C;
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  queue<pair<string, pair<int, int>>> Q;
  int startJX, startJY;
  queue<pair<int, int>> startFQ;

  cin >> R >> C;
  for (int i = 0; i < R; i++)
  {
    string s;
    cin >> s;
    for (int j = 0; j < s.length(); j++)
    {
      board[i][j] = s[j];

      if (board[i][j] == 'J')
      {
        startJX = i;
        startJY = j;
      }
      else if (board[i][j] == 'F')
      {
        startFQ.push({i, j});
      }
    }
  }

  while (!startFQ.empty())
  {
    pair<int, int> F = startFQ.front();
    startFQ.pop();

    vis[F.X][F.Y] = -1;
    Q.push({"F", F});
  }
  Q.push({"J", {startJX, startJY}});

  int lastJX, lastJY;
  while (!Q.empty())
  {
    pair<string, pair<int, int>> cur = Q.front();
    Q.pop();

    if (cur.first == "J")
    {
      pair<int, int> J = cur.second;

      if (J.X == 0 || J.Y == 0 || J.X == R - 1 || J.Y == C - 1)
      {

        cout << Jvis[J.X][J.Y] + 1;
        return 0;
      }

      for (int dir = 0; dir < 4; dir++)
      {
        int nx = J.X + dx[dir];
        int ny = J.Y + dy[dir];

        if (nx < 0 || ny < 0 || nx >= R || ny >= C)
        {
          continue;
        }
        if (board[nx][ny] == '#' || vis[nx][ny] != 0)
        {
          continue;
        }

        Jvis[nx][ny] = Jvis[J.X][J.Y] + 1;
        vis[nx][ny] = 1;
        Q.push({"J", {nx, ny}});
      }
    }
    else
    {
      pair<int, int> F = cur.second;

      for (int dir = 0; dir < 4; dir++)
      {
        int nx = F.X + dx[dir];
        int ny = F.Y + dy[dir];

        if (nx < 0 || ny < 0 || nx >= R || ny >= C)
        {
          continue;
        }
        if (board[nx][ny] == '#' || vis[nx][ny] == -1)
        {
          continue;
        }

        vis[nx][ny] = -1;
        Q.push({"F", {nx, ny}});
      }
    }
  }

  cout << "IMPOSSIBLE";
}