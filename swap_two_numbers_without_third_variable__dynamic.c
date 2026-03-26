#include<stdio.h>
int main()
{
    int a,b;
    printf("Please enter 1st number:");
    scanf("%d",&a);
    printf("Please enter 2nd number:");
    scanf("%d",&b);
    a=a+b;
    b=a-b;
    a=a-b;
    printf("%d,%d",a,b);
    return 0;
}