#include <bits/stdc++.h>
using namespace std;
int board[100002];
int vis[100002];
int N, K;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> N >> K;

  queue<pair<int, int>> Q;
  vis[N] = 1;
  Q.push({N, 0});

  while (true)
  {
    pair<int, int> cur = Q.front();
    Q.pop();

    if (cur.first == K)
    {
      cout << cur.second;
      return 0;
    }

    int pos = cur.first;

    int prevPos = pos - 1;
    int nextPos = pos + 1;
    int mulPos = pos * 2;

    if (prevPos >= 0 && vis[prevPos] == 0)
    {
      vis[prevPos] = 1;
      Q.push({prevPos, cur.second + 1});
    }
    if (nextPos <= 100000 && vis[nextPos] == 0)
    {
      vis[nextPos] = 1;
      Q.push({nextPos, cur.second + 1});
    }
    if (mulPos <= 100000 && vis[mulPos] == 0)
    {
      vis[mulPos] = 1;
      Q.push({mulPos, cur.second + 1});
    }
  }
}