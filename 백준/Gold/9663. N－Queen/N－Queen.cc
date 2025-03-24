#include <bits/stdc++.h>

using namespace std;

int N;
int result = 0;
int isusedY[40];
int isusedDiagonalLeft[40];
int isusedDiagonalRight[40];

void func(int k)
{
  if (k == N)
  {
    result++;
    return;
  }

  for (int i = 1; i <= N; i++)
  {
    int diagonalLeft = k + i;
    int diagonalRight = k - i + N - 1;

    if (!(isusedY[i] || isusedDiagonalLeft[diagonalLeft] || isusedDiagonalRight[diagonalRight]))
    {
      isusedY[i] = 1;
      isusedDiagonalLeft[diagonalLeft] = 1;
      isusedDiagonalRight[diagonalRight] = 1;
      func(k + 1);
      isusedY[i] = 0;
      isusedDiagonalLeft[diagonalLeft] = 0;
      isusedDiagonalRight[diagonalRight] = 0;
    }
  }
}

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> N;
  func(0);
  cout << result;
}