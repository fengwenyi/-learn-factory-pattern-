# Learn Factory Pattern

学习工厂模式

## Simple

#### 定义一个接口

```java
public interface Hungry {

    /**
     * 吃点东西
     */
    void eat();

}
```

#### 实现

方案1：

```java
public class Rice implements Hungry {

    public void eat() {
        PrintUtils.info("吃米饭");
    }
}
```

方案2：

```java
public class Noodle implements Hungry {
    public void eat() {
        PrintUtils.info("吃面条");
    }
}
```

#### Factory

```java
public class HungryFactory {
    public static Hungry getHungry(String food) {
        Hungry hungry = null;
        if ("rice".equals(food))
            hungry = new Rice();
        else if ("noodle".equals(food))
            hungry = new Noodle();
        return hungry;
    }
}
```

#### Test

```java
public class AppSimple {
    public static void main(String[] args) {
        Hungry hungry = HungryFactory.getHungry("rice");
        hungry.eat();
        hungry = HungryFactory.getHungry("noodle");
        hungry.eat();
    }
}
```

#### 控制台打印

```
[2019-05-30 23:55:06.875] 吃米饭
[2019-05-30 23:55:06.885] 吃面条
```





