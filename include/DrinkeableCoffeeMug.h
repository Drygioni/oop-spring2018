#pragma once

#include "CoffeeMug.h"
#include "Drinkeable.h"

namespace coffeemug{
  class DrinkeableCoffeeMug : public CoffeeMug,public virtual Drinkeable{
  protected: bool isDrank;
  public: DrinkeableCoffeeMug(int mugs);
  public: virtual void drink();
  public: virtual void spitout();
  public: virtual MugState getMugState(int mug) const override;
  public: virtual ~DrinkeableCoffeeMug();
  };
}
