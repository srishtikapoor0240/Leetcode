#include<stdio.h>
#include<stdbool.h>

int matching(char ch1, char ch2)
{
    if((ch1=='('&& ch2==')')|| (ch1=='{'&& ch2=='}') || (ch1=='['&& ch2==']'))
        return 1;
    else 
        return 0;

}
bool isValid(char* s) {
    int n=strlen(s);
    char arr[n];
    int top=-1;

    for(int i=0;i<n;i++)
    {
        if(s[i]=='(' ||s[i]=='{' || s[i]=='[')
        {
            arr[++top]=s[i];
        }
        else if(s[i]==')' || s[i]=='}' ||s[i]==']')
        {
            if(top==-1)
                return false;
            
            else if(matching(arr[top--],s[i])==0)
                return false;    
        }
        
    }
    return top==-1;
}