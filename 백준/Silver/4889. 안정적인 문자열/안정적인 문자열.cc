#include <bits/stdc++.h>

using namespace std;

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  int T = 1;
  while (true)
  {
    int count = 0;
    bool isEnd = false;
    string s;
    stack<char> st;

    cin >> s;

    for (char c : s)
    {
      if (c == '-')
      {
        isEnd = true;
        break;
      }

      if (!st.empty() && st.top() == '{' && c == '}')
      {
        st.pop();
      }
      else
      {
        st.push(c);
      }
    }

    if (isEnd)
    {
      break;
    }

    while (!st.empty())
    {
      char first = st.top();
      st.pop();
      char second = st.top();
      st.pop();

      if (first == second)
      {
        count++;
      }
      else
      {
        count += 2;
      }
    }

    cout << T++ << ". " << count << '\n';
  }
}