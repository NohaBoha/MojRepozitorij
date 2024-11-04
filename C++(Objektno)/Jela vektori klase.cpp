#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Jelo {

private:
    
    vector<string> Namirnica;
    vector<int> Kolicina;
    int Cijena;
    string ImeJela;

public:
    
    Jelo()
        : Namirnica(NULL), Kolicina(0), Cijena(0)
    {
        
    }

    void setImeJela(string x) {
        ImeJela = x;
    }

    void setCijena(int x) {
        Cijena = x;
    }
    void Upis(string x, int y) {
        Namirnica.push_back(x);
        Kolicina.push_back(y);
    }
    
    void Ispis() {
        cout << "Ime namirnice: " << ImeJela << endl;
        for (int i = 0; i < Namirnica.size(); i++)  
        {
            cout << Namirnica[i] << ", " << Kolicina[i] << endl;
        }
        cout << "Ukupna cijena je: " << Cijena << "kn " << endl;
    } 
};

int main()
{
    Jelo j;
    string namirnica, a, imeJela;
    int kolicina, cijena;

    cout << "Upisi ime jela: " << endl;
    cin >> imeJela;
    j.setImeJela(imeJela);
    do {
        cout << "Upisi namirnicu i kolicinu u g: " << endl;
        cin >> namirnica;
        cin >> kolicina;
        j.Upis(namirnica, kolicina);
        cout << "Jos namirnica? (DA ili NE)" << endl;
        cin >> a;
    } while(a != "NE");
    cout << "Upisi cijenu: " << endl;
    cin >> cijena;
    j.setCijena(cijena);
    
    j.Ispis();
}
