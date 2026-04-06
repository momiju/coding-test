#include <stdio.h>
#include <string.h>

#define MAX_LEN 4001

int LCS[MAX_LEN][MAX_LEN];

int main(void) {
    char str1[MAX_LEN], str2[MAX_LEN];
    int answer = 0;

    scanf("%s %s", str1, str2);

    int len1 = strlen(str1);
    int len2 = strlen(str2);

    for (int i = 1; i <= len1; i++) {
        for (int j = 1; j <= len2; j++) {
            if (str1[i - 1] == str2[j - 1]) {
                LCS[i][j] = LCS[i - 1][j - 1] + 1;
            }
            if (LCS[i][j] > answer) {
                answer = LCS[i][j];
            }
        }
    }

    printf("%d\n", answer);

    return 0;
}
