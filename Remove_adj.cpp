#include<bits/stdc++.h>
using namespace std;
string
removeDuplicates (string s)
{
  string temp;
  for(auto i:s){
      if(temp.empty() || temp.back()!=i){
          temp.push_back(i);
      }
      else temp.pop_back();
  }
  return temp;
}

int
main ()
{
  string st;
  getline (cin, st);
  string s=removeDuplicates(st);
  cout<<s;
}
