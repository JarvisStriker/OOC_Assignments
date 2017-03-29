// C++ program to execute a function before main function
#include <iostream>
using namespace std;
// works only with g++ and gcc compilers
void beforeMain() __attribute__((constructor));
// similarly if constructor is replaced with word destructor, function gets executed after main fuction automatically
void beforeMain()
{
  cout<<"Gets Executed before Main function"<<endl;
}
int main ()
{
  cout<<"\nInside main"<<endl;
  return 0;
}
