class Queues:
    def __init__(self):
        self.a = []
    def isEmpty(self):
        if len(self.a) == 0:
            return True
        else:
            return False
    def enqueue(self,element):
        self.a.append(element)
        print(self.a)
    def dequeue(self):
        self.a.remove(0)
        print(self.a)
    def peek(self):
        print(self.a[0])
        print(self.a)

        

 
