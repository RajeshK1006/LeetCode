class ProductOfNumbers:
    def __init__(self):
        self.prefix = [1]  # Stores cumulative product

    def add(self, num: int) -> None:
        if num == 0:
            self.prefix = [1]  # Reset prefix since product becomes zero
        else:
            self.prefix.append(self.prefix[-1] * num)

    def getProduct(self, k: int) -> int:
        if k >= len(self.prefix):  
            return 0  # If k elements go beyond reset point, product is 0
        return self.prefix[-1] // self.prefix[-1 - k]
