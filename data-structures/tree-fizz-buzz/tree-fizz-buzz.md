# Challenge Summary
Write a function called fizz buzz tree
Arguments: k-ary tree
Return: new k-ary tree
Determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:

If the value is divisible by 3, replace the value with “Fizz”
If the value is divisible by 5, replace the value with “Buzz”
If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
If the value is not divisible by 3 or 5, simply turn the number into a String.

## Whiteboard Process
![ch18.jpg](ch18.jpg)

## Approach & Efficiency
* time =O(n)
* space =O(n)

because i used while to loop and i created a queue.

## Solution
example: 

```
          KaryTree<Integer> KaryTreeTest = new KaryTree<>(3);
        KaryTreeTest.add(3);
        KaryTreeTest.add(5);
        KaryTreeTest.add(15);

        System.out.println(fizzBuzzTree(KaryTreeTest).root.value);
```

output:
![output](output.jpg)