import math

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self):
        return math.hypot(self.x, self.y)

    def distance_to(self, other):
        return math.hypot(self.x - other.x, self.y - other.y)


def main():
    x = float(input("Enter x coordinate: "))
    y = float(input("Enter y coordinate: "))

    p = Point(x, y)

    print(f"Distance from origin: {p.distance()}")
    q = Point(4.5, 7.0)
    print(f"Distance from (4.5, 7.0): {p.distance_to(q)}")


if __name__ == "__main__":
    main()
