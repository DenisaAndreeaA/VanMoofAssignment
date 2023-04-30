# VanMoof Assignment - Option A

## The task

Probably you have seen fans in a stadium stand up and raise their hands in a synchronised way, creating a wave-like motion that travels through the crowd.

This is called Mexican Wave and let’s try to do the same with strings. You will get an input string and you must return that string in an array where an uppercase letter is a person standing up.

## Solution

### Java

The solution in Java can be found in the `code/example/java/Wave.java` file. It reads the input string from the command line arguments, creates a `StringBuilder` object to efficiently manipulate the string, loops through the string character by character, and creates a new string for each wave iteration. Finally, the resulting wave list is printed to the console.

### Python

The solution in Python can be found in the `code/example/python/wave.py` file. It takes a string input, converts it to lowercase, loops through the string character by character, and creates a new string for each wave iteration. The resulting wave list is returned.

### JavaScript

The solution in JavaScript can be found in the `code/example/javascript/wave.js` file. It takes a string input, converts it to lowercase, loops through the string character by character using a regular expression, and creates a new string for each wave iteration. The resulting wave list is printed to the console.

## How to Run

### Java

To run the Java program, navigate first to the `code/example/java` directory and execute the following command to compile the class:

```
javac Wave.java
```

Then, go to the root directory and run:

```
java Wave 'input string'
```

Replace "input string" with the string you want to convert to a wave pattern.

### Python

To run the Python program, navigate to the `python` directory and execute the following command:

```
python3 wave.py "input string"
```

Replace "input string" with the string you want to convert to a wave pattern.

### JavaScript

To run the JavaScript program, navigate to the `javascript` directory and execute the following command:

```
node wave.js "input string"
```

Replace "input string" with the string you want to convert to a wave pattern.

## Conclusion

This solution provides a way to convert a string into a wave pattern in Java, Python, and JavaScript. The complexity of all solutions is O(n).
