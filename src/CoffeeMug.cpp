#include "CoffeeMug.h"
#include <iostream>
#include <sstream>
#include <stdexcept>

namespace coffeemug{
  CoffeeMug::CoffeeMug(int _mugs)
    :mugs(_mugs > 0 ? _mugs : 0), mugStates(mugs, MugState::EMPTY), creamer(Creamer::NOCREAMER)
  {
    std::cout<< "made CoffeeMug@ " << ((void*) this) <<std::endl;

    if (mugs<=0) {
      std::ostringstream oss;
      oss << "mugs (" << mugs << ") must be positive";
      throw std::out_of_range(oss.str());
    }
  }

  int CoffeeMug::getMugs() const {
    return mugs;
  }

  void CoffeeMug::setCreamer(Creamer _creamer) const{
    creamer = _creamer;
  }

  Creamer CoffeeMug::getCreamer() const{
    return creamer;
  }

  void CoffeeMug::mugOK(int mug) const {
    if (mug < 0 || mug >= mugs) {
      std::ostringstream oss:
	oss <<"mug not in range";
      throw std::out_of_range(oss.str());
    }
  }

  void CoffeeMug::setMugState(int mug, MugState state){
    mugOK(mug);
    mugStates[mug]=state;
  }

  MugState CoffeeMug::getMugState(int mug) const{
    mugOK(mug);
    return mugStates[mug];
  }

  
  
}
