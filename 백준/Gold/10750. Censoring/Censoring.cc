#include<bits/stdc++.h>
using namespace std;
int main(){
	string s,t;
	cin>>s>>t;
	int n = t.length();
	vector<char>st;
	for(int i=0; s[i]; i++){
		st.push_back(s[i]);
		if(st.size()<n) continue;
		bool same = true;
		for(int j=0; j<n; j++){
			if(t[n-1-j]!=st[st.size()-1-j]){
				same = false;
				break;
			}
		}		
		if(same) for(int i=0; i<n; i++) st.pop_back();
	}
	//if(st.empty()) cout<<"FRULA";
	for(int i=0; i<st.size(); i++) cout<<st[i];
}