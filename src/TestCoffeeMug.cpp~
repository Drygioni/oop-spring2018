#include <gtest/gtest.h>
#include <stdexcept>

#include "CoffeeMug.h"

using namespace coffeemug;

TEST(CoffeeMug, CreamerFull) {
  int mugs = 2;
  coffeemug::CoffeeMug ps(mugs);
  ps.setCreamer(coffeemug::CreamerLevel::FULL);
  for (int  mug = 0; mug < ps.getMugs(); ++mug)
    {
      ASSERT_EQ(coffeemug::CreamerLevel::FULL,ps.getCreamer(creamer));
    }
  

}