class Node:
    def __init__(self, value: int):
        self.value = value
        self.left =None
        self.right =None
    def display(self):
        print(' ',self.value,' ')
class Tree:
    def __init__(self):
        self.root = None

    def insert(self, number: int):
        new_node = Node(number)
        parent = None
        current = self.root
        while current is not None:
            parent = current
            if number < current.value:
                current = current.left
            else:
                current = current.right

        if parent is None:
            self.root = new_node
        elif number < parent.value:
            parent.left = new_node
        else:
            parent.right = new_node

    def delete(self, number: int):
        self.root = self._delete(self.root, number)

    def _delete(self, root: Node | None, number: int):
        if root is None:
            return None

        if number < root.value:
            root.left = self._delete(root.left, number)
        elif number > root.value:
            root.right = self._delete(root.right, number)
        else:
            # Case: node has two children
            if root.left is not None and root.right is not None:
                # Using max from the left subtree (same as Java version)
                max_left = self.find_max(root.left)
                root.value = max_left.value
                root.left = self._delete(root.left, max_left.value)
            elif root.left is not None:
                root = root.left
            elif root.right is not None:
                root = root.right
            else:
                root = None
        return root

    def find_max(self, node: Node):
        while node.right is not None:
            node = node.right
        return node

    def find_min(self, node: Node):
        while node.left is not None:
            node = node.left
        return node

    def search(self, number: int) -> bool:
        current = self.root
        while current is not None:
            if current.value == number:
                return True
            elif number < current.value:
                current = current.left
            else:
                current = current.right
        return False

    def update(self, old_value: int, new_value: int):
        self.delete(old_value)
        self.insert(new_value)

    def preorder(self, local_root):
        if local_root is not None:
            print(local_root.value)
            self.preorder(local_root.left)
            self.preorder(local_root.right)

    def preorder_traversal(self):
        print("PreOrder =>")
        self.preorder(self.root)
    def postorder(self,local_root):
        if local_root is not None:
            self.postorder(local_root.left)
            self.postorder(local_root.right)
            print(local_root.value)
    def postorder_traversal(self):
        print("Postorder =>")
        self.postorder(self.root)


    def inorder_traversal(self):
        current = self.root
        stack: list[Node] = []
        if current is None:
            return
        print("InOrder => ")
        while current is not None or stack:
            while current is not None:
                stack.append(current)
                current = current.left
            current = stack.pop()
            print(f"{current.value} ")
            current = current.right
        print()

    def inorder2(self, local_root):
        if local_root is not None:

            self.inorder2(local_root.left)
            print(local_root.value)
            self.inorder2(local_root.right)

    def inorder_traversal2(self):
        print("PreOrder =>")
        self.preorder(self.root)

if __name__ == "__main__":
    tree = Tree()
    tree.insert(50)
    tree.insert(30)
    tree.insert(70)
    tree.insert(20)
    tree.insert(40)
    tree.insert(80)
    tree.insert(60)


"""
    Expected Tree Structure:
             50
           /    \
         30      70
        /  \    /  \
       20  40  60  80
    """
