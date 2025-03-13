#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  int T;
  cin >> T;

  while (T--)
  {
    stack<char> st;
    string s;
    cin >> s;

    bool isError = false;
    for (char c : s)
    {
      if (c == '(')
      {
        st.push(c);
      }
      else
      {
        if (st.empty() || st.top() != '(')
        {
          isError = true;
          break;
        }
        else
        {
          st.pop();
        }
      }
    }

    if (!st.empty() || isError)
    {
      cout << "NO\n";
    }
    else
    {
      cout << "YES\n";
    }
  }
}