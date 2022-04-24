class Stacks:
    def __init__(self):
        self.a = []

    def add(self,element):
        self.a.append(element)
        print(self.a)

    def delete(self):
        return self.a.pop()

    def getStack(self):
        print(self.a)
	
   

