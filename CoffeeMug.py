class CoffeeMug:
    WLEVEL_EMPTY = 0
    WLEVEL_FULL = 1
    HAS_CREAMER = False

    def __init__(self, wlevel):
        self.WlevelOk(wlevel)
        self._wlevel = wlevel

    def getWLevel(self):
        return self._wlevel

    def WlevelOk(self,wlevel):
        if not isinstance(wlevel,int):
            raise ValueError("Water Level must be an integer")

    def CreamerOK(self, cream):
        if not isinstance(cream,bool):
            raise ValueError("Creamer must be bool")

    def setWLevel(self,wlevel):
        self.WlevelOk(wlevel)
        self._wlevel = wlevel

    def getCreamer(self,cream):
        self.CreamerOK(cream)
        return self._cream

    def setCreamer(self,cream):
        self.CreamerOK(cream)
        self._cream = cream
