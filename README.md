# design-pattern-practice

## Creational Pattern
### Singleton
#### Why singleton
provides a way to access its only object which can be accessed directly without need to instantiate the object of the class
#### How this example works
![OOAD](https://github.com/jianfeng0309/design-pattern-practice/blob/master/11520486881_.pic_hd.jpg)
We create four thread to get instance of SingletonObject and run these threads
```synchronized(SingleObject.class)``` ensures the exclusive access between these thread so the Message instance inside SingletonObject should be the same
So we see identical meesage in the console
