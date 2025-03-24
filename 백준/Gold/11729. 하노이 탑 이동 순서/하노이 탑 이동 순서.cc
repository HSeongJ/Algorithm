#include <bits/stdc++.h>

// 재귀 하노이탑

using namespace std;

void func(int a, int b, int c)
{
  if (c == 1)
  {
    cout << a << ' ' << b << '\n';
    return;
  }

  func(a, 6 - a - b, c - 1);
  cout << a << ' ' << b << '\n';
  func(6 - a - b, b, c - 1);
}

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  int k;
  cin >> k;

  cout << (1 << k) - 1 << '\n';
  func(1, 3, k);
}