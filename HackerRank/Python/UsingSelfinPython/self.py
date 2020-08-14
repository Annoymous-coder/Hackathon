import math
class Rectangle(object):
    a,b=0,0
    def __init__(self,a,b):
        self.a = a
        self.b = b
    def area(self):
        return self.a*self.b
class Circle(object):
    r=0
    def __init__(self,r):
        self.r=r
    def area(self):
        return math.pi*self.r*self.r

def main():
    sideA=10
    sideB=20
    radius=10
    Rectangleshape = Rectangle(sideA, sideB)
    Circleshape = Circle(radius)
    print("area of rectangle",Rectangleshape.area())
    print("area of cirlce",Circleshape.area())

if __name__ == "__main__":
    main()