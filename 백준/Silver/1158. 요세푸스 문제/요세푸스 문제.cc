#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N, K;
  cin >> N >> K;

  list<int> arr;
  for (int i = 1; i <= N; i++)
  {
    arr.push_back(i);
  }

  auto it = arr.begin();

  vector<int> results;
  while (!arr.empty())
  {
    for (int i = 0; i < K - 1; i++)
    {
      if (next(it) == arr.end())
      {
        it = arr.begin();
      }
      else
      {
        it++;
      }
    }

    results.push_back(*it);
    it = arr.erase(it);
    if (it == arr.end())
      it = arr.begin();
  }

  cout << '<';
  auto resultIt = results.begin();

  while (resultIt != results.end())
  {
    cout << *resultIt;

    if (next(resultIt) != results.end())
      cout << ", ";

    resultIt++;
  }

  cout << '>';
}