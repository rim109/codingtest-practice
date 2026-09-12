#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    for (int i = 0; i < arr.size(); i++){
        if(i == 0 || arr[i] != arr[i-1]){
            answer.push_back(arr[i]);
        }
    }

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    cout << "Hello Cpp" << endl;

    return answer;
    
    // 참고
    // arr.erase(unique(arr.begin(), arr.end()), arr.end()) 로 하면 간단하게 해결할 수 있음
        
}