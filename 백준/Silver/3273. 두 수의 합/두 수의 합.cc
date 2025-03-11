#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  int result = 0;
  int n;
  cin >> n;

  vector<bool> a(1000001);
  while (n--)
  {
    int num;
    cin >> num;

    a[num] = true;
  }

  int x;
  cin >> x;

  for (int i = 1; i < (x + 1) / 2; i++)
    if (a[i] && a[x - i])
      result++;

  cout << result;
}