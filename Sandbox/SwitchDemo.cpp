#include <iostream>
#include <cstdlib>

void SwitchDemo() {
    for (int i=0; i<10; i++) {
        switch (i) {
            case 0: std::cout << "0\n"; break;
            case 1: std::cout << "1\n"; break;
            case 2: std::cout << "2\n"; break;
            case 3: std::cout << "3\n"; break;
            case 4: std::cout << "4\n"; break;
            case 5: std::cout << "5\n"; break;
            case 6: std::cout << "6\n"; break;
            case 7: std::cout << "7\n"; break;
            case 8: std::cout << "8\n"; break;
            case 9: std::cout << "9\n"; break;
        }   
    }
}