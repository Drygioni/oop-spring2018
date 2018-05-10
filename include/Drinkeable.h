#pragma once

namespace coffeemug{
  class Drinkeable{
  protected: bool drinkeable;
  public: Drinkeable();
  public: virtual void drink();
  public: virtual void spitout();
  public: virtual bool isDrank() const;
  public: virtual ~Drinkeable();
  };
}
