#include <stdio.h>
#include <limits.h>

int main() {
    int N;
    scanf("%d", &N);

    int ans = INT_MAX;

    for (int i = 0; i <= 20000; ++i) {
        int remain = N - 5 * i;
        if (remain < 0) continue;
        if (remain % 2 == 0) {
            int temp = i + remain / 2;
            if (temp < ans) {
                ans = temp;
            }
        }
    }

    if (ans == INT_MAX) {
        printf("-1\n");
    } else {
        printf("%d\n", ans);
    }

    return 0;
}
