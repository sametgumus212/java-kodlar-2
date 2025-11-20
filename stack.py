class Stack:
    def __init__(self, size):
        self.size = size
        self.array = [None] * size
        self.top = -1

    def is_empty(self):
        return self.top == -1

    def is_full(self):
        return self.top == self.size - 1

    def push(self, element):
        if not self.is_full():
            self.top += 1
            self.array[self.top] = element
        else:
            print("Stack is full, cannot push element.")

    def pop(self):
        if not self.is_empty():
            self.top -= 1
            return self.array[self.top + 1]
        else:
            print("Stack is empty.")
            return -1

    def peek(self):
        if not self.is_empty():
            return self.array[self.top]
        else:
            print("Stack is empty, nothing to peek.")
            return -1


if __name__ == "__main__":
    stack = Stack(5)
    
    # Push elements 1 to 6 (last one will fail)
    for i in range(1, 7):
        stack.push(i)

    # Pop all elements
    for j in range(stack.size, 0, -1):
        stack.pop()

    # Try to pop from empty stack twice
    stack.pop()
    stack.pop()
