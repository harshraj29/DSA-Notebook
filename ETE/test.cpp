#include <iostream>
using namespace std;
#include<bits/stdc++.h>

int main() {
    // Write C++ code here
    int n;
    cin>>n;
    vector<string>arr;
     cin.ignore();
    while(n--){
        string str;
        getline(cin,str);
        arr.push_back(str);
        
    }
    string x;
    cin>>x;
    string s1="";
    string s2="";
    int index=-1;
    int count=0;
    for(auto it:arr){
        string str=it;
        string ans="";
        for(auto j:str){
            if(j==' '){
                break;
            }
            else{
                ans.push_back(j);
            }
        }
        if(ans==x){
            index=count;
            break;
        }
        count++;
    }
    string res=arr[index];
    count=0;
    string ans="";
    int p=0;
    for(auto it:res){
        if(it==' '){
            count++;
            if(count==2){
                s1=ans;
                
            }
            ans="";
            
        }
        else if(p==res.length()-1){
            s2=p;
        }
        p++;
    }
    cout<<s1<<" "<<s2;
    

    return 0;
}