#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  queue<int> q;

  int N;
  cin >> N;
  while (N--)
  {
    string s;
    cin >> s;

    if (s == "push")
    {
      int num;
      cin >> num;
      q.push(num);
    }
    else if (s == "pop")
    {
      if (q.empty())
      {
        cout << -1;
      }
      else
      {
        cout << q.front();
        q.pop();
      }

      cout << '\n';
    }
    else if (s == "size")
    {
      cout << q.size() << '\n';
    }
    else if (s == "empty")
    {
      cout << q.empty() << '\n';
    }
    else if (s == "front")
    {
      if (q.empty())
      {
        cout << -1;
      }
      else
      {
        cout << q.front();
      }

      cout << '\n';
    }
    else
    {
      // back
      if (q.empty())
      {
        cout << -1;
      }
      else
      {
        cout << q.back();
      }

      cout << '\n';
    }
  }
}