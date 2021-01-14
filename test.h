#include <iostream>
#include <string>


 using namespace std;

 #ifndef TEST_H
 #define TEST_H

 class test{
	public:
		//default constructor
		test();

		//overload constructor
		test(string, int, double);

		//Destructor
		~test();

		//Accessor Functions
		string getName() const;
			//getName - return name of patient

		int getHeight() const;
			//getHeight  - return height of patient

		double hetWeight() const;
			//getWeight - return weight of patient


	private:
		//member variables
		string newName;
		int newHeight;
		double newWeight;


 };

 #endif
