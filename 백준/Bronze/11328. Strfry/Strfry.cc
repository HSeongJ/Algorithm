#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N;
  cin >> N;

  string a, b;
  while (N--)
  {
    bool isPossible = true;
    vector<int> aCount(26), bCount(26);
    cin >> a >> b;

    for (int i = 0; i < a.length(); i++)
    {
      aCount[a[i] - 'a']++;
    }

    for (int i = 0; i < b.length(); i++)
    {
      bCount[b[i] - 'a']++;
    }

    for (int i = 0; i < aCount.size(); i++)
    {
      if (aCount[i] != bCount[i])
      {
        isPossible = false;
        break;
      }
    }

    if (isPossible)
    {
      cout << "Possible\n";
    }
    else
    {
      cout << "Impossible\n";
    }
  }
}
