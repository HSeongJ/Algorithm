#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  vector<int> result(10);
  int A, B, C;
  cin >> A >> B >> C;

  int mul = A * B * C;

  while (mul > 0)
  {
    result[mul % 10]++;

    mul /= 10;
  }

  for (int i = 0; i < result.size(); i++)
  {
    cout << result[i] << '\n';
  }
}