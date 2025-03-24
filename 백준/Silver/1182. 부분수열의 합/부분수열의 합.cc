#include <bits/stdc++.h>

using namespace std;

int N, S;
int arr[30];
int result = 0;

void func(int cur, int total)
{
  if (cur == N)
  {
    if (total == S)
    {
      result++;
    }
    return;
  }

  func(cur + 1, total);
  func(cur + 1, total + arr[cur]);
}

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> N >> S;
  for (int i = 0; i < N; i++)
  {
    cin >> arr[i];
  }
  func(0, 0);

  if (S == 0)
    result--;
  cout << result;
}
