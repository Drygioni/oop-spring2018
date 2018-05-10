#include <iostream>
#include <Drinkeable.h>

namespace coffeemug{
  Drinkeable::Drinkeable() : drinkeable(false){
    std::cout << ((void*) this) << std::endl;
  }
  Drinkeable::~Drinkeable() {}
  void Drinkeable::drink() {drinkeable = true;}
  void Drinkeable::spitout() {drinkeable = false;}
  bool Drinkeable::isDrank() const {return drinkeable;}
  
  
}
