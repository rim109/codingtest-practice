#include <string>
#include <vector>

using namespace std;

string solution(string my_string) {
    string answer = "";
    for (char c : my_string) {
        if (c != 'a' && c != 'e' && c != 'o'&& c != 'u'&& c != 'i') {
        answer += c;
        }
    }
    return answer;
}