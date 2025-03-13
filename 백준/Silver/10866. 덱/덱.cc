#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  deque<int> d;
  int N;
  cin >> N;
  while (N--)
  {
    string s;
    cin >> s;
    if (s == "push_front")
    {
      int num;
      cin >> num;
      d.push_front(num);
    }
    else if (s == "push_back")
    {
      int num;
      cin >> num;
      d.push_back(num);
    }
    else if (s == "pop_front")
    {
      if (d.empty())
      {
        cout << -1 << '\n';
      }
      else
      {
        cout << d.front() << '\n';
        d.pop_front();
      }
    }
    else if (s == "pop_back")
    {
      if (d.empty())
      {
        cout << -1 << '\n';
      }
      else
      {
        cout << d.back() << '\n';
        d.pop_back();
      }
    }
    else if (s == "size")
    {
      cout << d.size() << '\n';
    }
    else if (s == "empty")
    {
      cout << d.empty() << '\n';
    }
    else if (s == "front")
    {
      if (d.empty())
      {
        cout << -1 << '\n';
      }
      else
      {
        cout << d.front() << '\n';
      }
    }
    else if (s == "back")
    {
      if (d.empty())
      {
        cout << -1 << '\n';
      }
      else
      {
        cout << d.back() << '\n';
      }
    }
  }
}