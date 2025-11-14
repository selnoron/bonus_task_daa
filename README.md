# kmp string search algorithm

this project has my simple kmp algorithm in java.  
kmp is a string search method. it can find pattern inside text fast.  
i write code with easy comments so it is simple to understand.

## how it works

kmp use lps array.  
lps means longest prefix suffix.  
it helps the algorithm not check same letters many times.  
so the code is faster than normal search.

## files

- `KMPAlgorithm.java` – main java file with the algorithm  
- inside it you can see:
  - search() method to find pattern  
  - buildLPS() method make the lps array  
  - simple tests in main  

## how to run

1. open project in intellij idea  
2. run the file `KMPAlgorithm.java`  
3. you will see output in console like:
found at index: 0
found at index: 3

vbnet
Копировать код

## tests

i use 3 tests:
- short text  
- medium text  
- long text  

this show how algorithm work in different size of input.

## time complexity

- best: **o(n)**  
- average: **o(n)**  
- worst: **o(n)**  
kmp is fast because it skip some checks with the lps array.

## why i choose kmp

kmp is not very hard  
and it is good for school project  
and also it is classic algorithm that many people learn  

## end
