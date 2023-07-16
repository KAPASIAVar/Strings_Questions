#include <bits/stdc++.h>
using namespace std;

class Solution
{
    public:
    string reverseWords(string S) 
    { 
        // code here 
        if(S.size()==1){
            return S;
        }
        string ans="";
        string st="";
        for(int i=S.size()-1;i>=-1;i--){
            if(S[i]=='.'){
                reverse(st.begin(),st.end());
                ans=ans+st;
                ans=ans+'.';
                st="";
                
            }
            else if(S[i]=='\0'){
                reverse(st.begin(),st.end());
                ans=ans+st;
                break;
            }
            else{
                st+=S[i];
                
            }
        }
        return ans;
        
    } 
};
int main() 
{
    int t;
    cin >> t;
    while (t--) 
    {
        string s;
        cin >> s;
        Solution obj;
        cout<<obj.reverseWords(s)<<endl;
    }
}
