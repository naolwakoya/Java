#include "test.h";


test::test() {
	newHeight = 0;
	newWeight = 0.1;

}
	
test::test(sting name, int height, double weight){
	newName = name;
	newHeight = height;
	newWeight = weight;

}
test::~test() {
}

string test::getName() const {
	return newName;
}

int test::getHeight() const{
	return newHeight;
}

double test:: getWeight() const{
	return newWeight;
}


