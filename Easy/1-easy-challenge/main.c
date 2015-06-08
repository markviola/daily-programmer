#include <stdio.h>
#include <stdlib.h>

int main()
{
    char name[50], username[50];
    int age;

    FILE *fptr;
    fptr=fopen("user_log.txt","w");
    if(fptr == NULL){
      printf("Error!");   
      exit(1);             
   }

    printf("Enter your name: ");
    scanf("%s", &name);
    fprintf(fptr, "%s ", &name);

    printf("Enter your username: ");
    scanf("%s", &username);
    fprintf(fptr, "%s ", &username);

    printf("Enter your age: ");
    scanf("%d", &age);
    fprintf(fptr, "%d\n", age);

    printf("your name is %s, you are %d years old, and your username is %s", &name, age, &username);

    fclose(fptr);
    return 0;
}
