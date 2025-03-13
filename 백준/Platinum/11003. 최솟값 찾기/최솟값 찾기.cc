#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N, L;
  cin >> N >> L;

  deque<pair<int, int>> d;
  for (int i = 1; i <= N; i++)
  {
    int n;
    cin >> n;

    while (!d.empty() && d.back().first > n)
    {
      d.pop_back();
    }

    d.push_back({n, i});

    if (d.front().second <= i - L)
    {
      d.pop_front();
    }

    cout << d.front().first << ' ';
  }
}