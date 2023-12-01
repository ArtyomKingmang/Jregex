<div align="center">
  <img src="icon.png" width="300">

Jregex - A simple library for easily working with regular expressions and text colors in the terminal
</div>

## Examples
The library allows you to work with regular expressions simply and clearly.
Jregex example:


```java
public class RegularExpressionsTest {
    public static void main(String[] args) {
        String pattern = new JRegex()
                .digit().times(5)
                .just("-")
                .digit().times(4).optional()
                .build();

        System.out.println(pattern);  // Output: \d{5}(-\d{4})?
    }
}
```
##Coloring
The library also allows you to work with text color in the console. Usage example:

```java
public class AnsiColoringTest {
    public static void main(String[] args){
        System.out.println(ansi.fgRed("Hello") + " " + ansi.fgGreen("World"));
    }

}
```