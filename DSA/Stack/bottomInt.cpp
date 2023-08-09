#include <bits/stdc++.h>
using namespace std;
void insert(stack<int> &st, int n)
{
    if (st.empty())
    {
        st.push(n);
        return;
    }
    int num = st.top();
    st.pop();
    insert(st,  n);
  
}
int main()
{
    stack<int> st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);
    int number;
    cin >> number;
  
    insert(st, number);

    while(!st.empty()){
        cout<<st.top()<<endl;
        st.pop();
    }
    return 0;
}