#include <string>
#include <vector>

using namespace std;

int solution(int slice, int n) {
    int answer = 0;
    while (n > slice * answer){
            answer ++ ;
        }
    return answer;
}
