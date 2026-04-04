#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    double a = (double)num2;
    double answer = num1 / a *1000;
    int b = (int)answer;
    return b;
}