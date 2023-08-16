
## Stack

- Stack is a Linear Data Structure.
- It works like a box which is closed at a end.
- So whatever you have to add you have add it from top and whatever you have to remove from the top.
- Insertion Operation on a Stack is called push operation.
- Removal Operation on a Stack data Structure is called pop operation.
 
#### Pictorial Representation of Stack

##### Push(x) Operation

empty  - > push(10) - > 10 - > push(20) - > 20,10 - > push(30) - > 30,20,10.

##### Push() Operation

30,20,10  - > pop() - > 20,10- > pop() - > 10  - > pop() - > empty.

### Stack Operations

- isEmpty() : Returns true if stack is empty else false.
- push(x) : Inserts an item to the top of the stack.
- pop() : Removes an item from stack.
- peek() : Returns the top item.
- size() : Returns the size of stack.

### Corner Conditions on Stack

- Underflow : when pop() or peek() called on empty stack
- Overflow : when push called on a full stack.
