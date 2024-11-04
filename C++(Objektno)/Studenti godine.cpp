
#include <iostream>
using namespace std;

class Student {
public:
    int godina;
    string razina;
};

int main()
{
    string a;
    Student s1;
    Student s2;

    cout << "Godinu i razinu prvog: " << endl;
    cin >> s1.godina;
    cin >> s1.razina;

    cout << "Godinu i razinu drugog: " << endl;
    cin >> s2.godina;
    cin >> s2.razina;

    do {
        if ((s1.razina == "D") && (s1.razina == "P")) {
            cout << 1 << endl;
        }
        else if ((s2.razina == "D") && (s1.razina == "P")) {
            cout << 2 << endl;
        }
        else if (s1.godina > s2.godina) {
            cout << 1 << endl;
        }
        else {
            cout << 2 << endl;
        }
        cout << "Os opet bokt? " << endl;
        cin >> a;
    } while (a != "NE");
    
}

