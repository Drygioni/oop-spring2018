#include <iostream>
#include <DrinkeableCoffeeMug.h>

namespace coffeemug{

  DrinkeableCoffeeMug::DrinkeableCoffeeMug(int mugs)
    :CoffeeMug(mugs), isDrinkeable(false)
  {
    std::cout<<((void*) this) << std::endl;
  }
  void DrinkeableCoffeeMug::drink(){
    isDrank = true;
  }
  void DrinkeableCoffeeMug::spitout(){
    isDrank = false;
  }
  bool DrinkeableCoffeeMug::isDrank()  const {return ! isDrank;}

  CoffeeMug DrinkeableCoffeeMug::getMugState(int mug) const{
    return isDrank()? CoffeeMug::getMugState(mug) : MugState::EMPTY;
  }
  DrinkeableCoffeeMug::~DrinkeableCoffeeMug(){
  }   
}
