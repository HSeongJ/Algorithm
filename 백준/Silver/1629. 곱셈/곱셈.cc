#include <bits/stdc++.h>

using namespace std;
using ll = long long;

int pow(int a, int b, int m)
{
  if (b == 1)
    return a % m;

  ll val = pow(a, b / 2, m);
  val = val * val % m;
  if (b % 2 == 0)
    return val;
  return val * a % m;
}

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);
  int A, B, C;

  cin >> A >> B >> C;

  cout << pow(A, B, C);
}