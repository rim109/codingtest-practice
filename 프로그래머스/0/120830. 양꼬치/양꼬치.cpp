#include <string>
#include <vector>

using namespace std;

int solution(int n, int k) {
    int food = 12000 * n;
    int drink = 2000*k;
    int m = (n/10) * 2000;
    return food+drink - m;
}