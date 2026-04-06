#include <stdio.h>

#define MAX 1000

int n, m, k;
int li[MAX][MAX];
int dp[MAX+1][MAX+1];

void Input() {
    scanf("%d %d", &n, &m);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            scanf("%d", &li[i][j]);
        }
    }
    scanf("%d", &k);
}

void Solution() {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            dp[i][j] = li[i-1][j-1] + dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1];
        }
    }

    for (int query = 0; query < k; query++) {
        int i, j, x, y;
        scanf("%d %d %d %d", &i, &j, &x, &y);
        printf("%d\n", dp[x][y] - dp[x][j-1] - dp[i-1][y] + dp[i-1][j-1]);
    }
}

int main() {
    Input();
    Solution();
    return 0;
}
