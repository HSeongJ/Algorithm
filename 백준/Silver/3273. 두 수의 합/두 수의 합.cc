#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  int result = 0;
  int n;
  cin >> n;

  bool a[1000001] = {};
  while (n--)
  {
    int num;
    cin >> num;

    a[num] = true;
  }

  int x;
  cin >> x;

  for (int i = 0; i < 1000001; i++)
  {
    if (x <= i)
      continue;
    if (abs(x - i) > 1000000)
      continue;
    if (i == x - i)
      continue;

    if (a[i] && a[x - i])
    {
      a[i] = false;
      a[x - i] = false;

      result++;
    }
  }

  cout << result;
}