#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  string N;
  cin >> N;

  list<char> str(N.begin(), N.end());

  int M;
  cin >> M;

  list<char>::iterator it = str.end();
  while (M--)
  {
    char command;
    cin >> command;

    if (command == 'L')
    {
      if (it != str.begin())
        it--;
    }
    else if (command == 'D')
    {
      if (it != str.end())
        it++;
    }
    else if (command == 'B')
    {
      if (it != str.begin())
        it = str.erase(prev(it));
    }
    else
    {
      char text;
      cin >> text;
      str.insert(it, text);
    }
  }

  for (char c : str)
  {
    cout << c;
  }
}