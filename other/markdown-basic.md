# GFM Markdown 사용법
---
본 문서는 GFM(GitHub Flavored Markdown)을 기반으로 작성된 문서입니다.

### Headers

`#` 기호를 1개에서 6개까지 사용할 수 있으며, 해당 기호는 HTML(Hypertext Markup Language)
Tag 규칙 `<h1>` ~ `<h6>` 과 같다.

> 사용예시
# #1개 사용
## #2개 사용
###### #6개 사용

### Emphasis

*Italic*
_Italic_

**Bold**
__Bold__

_Combine **Italic and Bold**._

<pre>
*Italic*
_Italic_

**Bold**
__Bold__

_Combine **Italic and Bold**._
</pre>

### Lists

* Item1
* Item2
    * Item2a
    * Item2b

1. Item1
1. Item2
    1.Item2a
    2.Item2b
1. Item3

<pre>
* Item1
* Item2
    * Item2a
    * Item2b

1. Item1
1. Item2
    1.Item2a
    2.Item2b
1. Item3
</pre>


### Images

if you want to images, this is how you do it:

![Naver logo](https://s.pstatic.net/static/w8/err/lg_naver.gif)

<pre>
if you want to images, this is how you do it:

![Naver logo](https://s.pstatic.net/static/w8/err/lg_naver.gif)
</pre>

### Task Lists

Task lists:
- [x] **완료된 일감**
- [ ] 미진행 일감
- [x] 완료된 일감
<pre>
Task lists:
- [x] **완료된 일감**
- [ ] 미진행 일감
- [x] 완료된 일감
</pre>

### Tables

|First Field|Second Field|Third Field
|:----------|:----------:|----------:
| 1|2|3
|left | center | right
<pre>
|First Field|Second Field|Third Field
|:----------|:----------:|----------:
| 1|2|3
|left | center | right
</pre>

### Links
http://www.github.com - Atomatic linking

[GitHub](http://www.github.com) - Named linking


### Blockquotes

As ntigo said:
> We can do it!
> but not enough time

### Syntax highlighting

각종 프로그래밍 언어들의 문법 하이라이트를 표현할 수 있다.

> JAVA
```java
public static void main(String[] args) {
    System.out.println( "Hello World" );
}
```

> Python
```python
def main():
    if not bar:
        return False
    
    print('Hello World')
```

> Go
```go
package main

import "fmt"

func main() {
    str := "Hello World"
    fmt.Println(str)
}
```

<pre> ```java ~~CODE~~ ```, ```python ~~~CODE~~~``` 와 같이 사용한다. </pre>

### Inline code

인라인 코드라 함은 중간에 이와 같이 `'강조'` 할 수 있는 문법
<pre> `'강조'` 와 같이 사용한다 </pre>

### Strikethrough

~~TEST~~

<pre>
~~TEST~~
</pre>
  d