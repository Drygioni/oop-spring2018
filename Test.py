import unittest
from CoffeeMug import CoffeeMug

class TestCoffeeMug(unittest.TestCase):

    def _testWlevel(self,unit):
        unit.setWlevel(CoffeeMug.WLEVEL_FULL)


    def _testCreamer(self,unit, cream):
        for state in (False, True):
            unit.setCreamer(state)
            self.assertEqual(unit.getCreamer(cream), state, "Creamer" + str(cream) + " should be " + str(state))

    def testCreamers(self):
        unit = CoffeeMug(1);
        self._testCreamer(unit,False)

    if __name__ == '__main__':
        unittest.main()


