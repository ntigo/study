# 아이템 1. 생성자 대신 static 팩토리 메소드 사용을 고려하자.

일반적인 인스턴스 생성 방식은 생성자(Constructor)를 이용하는 방법.

### 장점
* 이름을 가질 수 있다.
* 동일한 시그니처를 갖는 복수의 생성자를 갖는 효과를 눌린다.
* 호출될 때마다 매번 새로운 객체를 생설할 필요가 없다.
(Immutable 재사용 가능, Singleton)




```java 
public static void main( String[] args ) {

}
```

```go
import "fmt"

func main() {
    a:="test"
}
```


