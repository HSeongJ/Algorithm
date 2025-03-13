#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  while (true)
  {
    bool isError = false;
    stack<char> st;
    string s;

    getline(cin, s);

    if (s == ".")
      break;

    for (char c : s)
    {
      if (c == '(')
      {
        st.push('(');
      }
      else if (c == '[')
      {
        st.push('[');
      }
      else if (c == ')')
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
      else if (c == ']')
      {
        if (st.empty() || st.top() != '[')
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
      cout << "no\n";
    }
    else
    {
      cout << "yes\n";
    }
  }
}
