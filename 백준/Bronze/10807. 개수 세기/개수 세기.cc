#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N;
  cin >> N;

  vector<int> arr(201);

  while (N--)
  {
    int n;
    cin >> n;

    arr[n + 100]++;
  }

  int v;
  cin >> v;

  cout << arr[v + 100];
}