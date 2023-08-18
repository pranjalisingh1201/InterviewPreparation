//Array Implementation of Stack in java.
/*
 * Empty array -> top = -1
 * 10 -> top = 0
 * 10,20 -> top = 1
 * 10 -> top = 0
 * 10,30 -> top=1
 * 
 * Output : 20
*/
/*Problems with this Implementation
 * 1) It does not handles underflow and overflow.
 * 2) No dynamic resizing.
*/
/*
 * Array Time Complexity : O(1)
 * ArrayList Time Complexity :O(1)
*/

import java.util.ArrayList;

class Stack 
{
    int arr[]; // Stack with array ds.
    int cap; // Capacity
    int top; // index of the top element.
    Stack (int c)
    {
        top = -1;// initially top is -1;
        cap = c;
        arr = new int [cap];
    }

    void push(int x)
    {
        top++;// increment top;
        arr[top]=x;//assign value;
    }
    int pop()
    {
        int res = arr[top];// get value;
        top--;// decrement top, next item is not removed but now will not be referenced or the value will be replaced by next pushed item;
        return res;//return
    }
    int size()
    {
        return top+1;//Index+1
    }
    boolean isEmpty()
    {
        return(top==-1);//If array is empty.
    }
}

class Test
{
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
    }
}
// ArrayList based Implementation.
class MyStack
{
    ArrayList<Integer> al = new ArrayList<>();
    void push (int x)
    {
        al.add(x);
    }
    int pop()
    {
        int res = al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }
    int peek()
    {
        return al.get(al.size()-1);
    }
    boolean isEmpty()
    {
        return al.isEmpty();
    }
    int size()
    {
        return al.size();
    }
}