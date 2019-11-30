#工厂方法 
定义： 定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行

## 适用场景
1. 创建对象需要大量的重复代码
2. 客户端应用层不依赖于产品类实例如何被创建，实现等细节
3. 一个类通过其子类来指定创建哪个对象

## 优势
1. 客户端应用层不依赖于产品类实例如何被创建，实现等细节
2. 加入新产品符合开闭原则，提高扩展性

## 缺点
1. 类的个数容易多，增加复杂度
2. 增加了系统的抽象度和理解难度