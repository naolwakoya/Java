#include <iostream>
#include <string>
#include "test.h"

using namespace std;

int main() {

	string name;
	int height;
	double weight;


	cout <<"Enter your name: " ;
	cin >> name;
	cout << "Enter your height(in centimeters)" ;
	cin >> height;
	cout << "Enter your weight(in kilograms): " ;
	cin >> weight;


	test Student_1(name, height, weight);


	cout << endl <<"Paitent Name: " << Student_1.getName() << endl <<

		"Height: " << Paitent_1.getHeight() << endl <<
		"Wight: " << Paitent_1.getWeight() << endl;

	return 0;
}
