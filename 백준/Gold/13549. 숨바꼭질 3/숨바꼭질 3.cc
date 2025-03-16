#include <bits/stdc++.h>
using namespace std;

#define POS first
#define COUNT second

const int MAX = 100000;
int board[100002];
int vis[MAX + 2];
int N, K;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> N >> K;

  fill(vis, vis + MAX + 2, -1);
  deque<pair<int, int>> Q;

  vis[N] = 0;
  Q.push_back({N, 0});

  while (!Q.empty())
  {
    pair<int, int> cur = Q.front();
    Q.pop_front();

    int pos = cur.POS;
    int cnt = cur.COUNT;

    // 동생을 찾으면 즉시 출력
    if (pos == K)
    {
      cout << cnt;
      return 0;
    }

    int nextPos = cur.POS + 1;
    int prevPos = cur.POS - 1;
    int telPos = cur.POS * 2;
    if (telPos <= MAX && (vis[telPos] == -1 || vis[telPos] > cnt))
    {
      vis[telPos] = cnt;
      Q.push_front({telPos, cnt});
    }
    if (prevPos >= 0 && (vis[prevPos] == -1 || vis[prevPos] > cnt))
    {
      vis[prevPos] = cnt;
      Q.push_back({prevPos, cnt + 1});
    }
    if (nextPos <= MAX && (vis[nextPos] == -1 || vis[nextPos] > cnt))
    {
      vis[nextPos] = cnt;
      Q.push_back({nextPos, cnt + 1});
    }
  }
}