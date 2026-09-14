#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string my_string) {
    reverse(my_string.begin(), my_string.end());
    return my_string;
}


  //  return string(my_string.rbegin(), my_string.rend()); 이러한 방법도 있음