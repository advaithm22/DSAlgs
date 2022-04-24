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
    def dequeue(self):
        self.a.pop(0)
    def peek(self):
        print(self.a[0])
        

 
