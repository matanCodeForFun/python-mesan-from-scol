#include <iostream>
#include <string>

int main() {
    std::string name1;
    std::cout << "Enter name 1: ";
    std::cin >> name1;

    if (name1 == "maayan") {
        std::cout << "Hello Maayan!" << std::endl;
    } else if (name1 == "Matan") {
        std::cout << "Hello Matan." << std::endl;
    } else if (name1 == "Yarden") {
        std::cout << "Hello Yardan." << std::endl;
    }

    return 0;
}