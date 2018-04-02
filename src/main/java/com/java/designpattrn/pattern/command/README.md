# Command Pattern
命令模式

将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或记录请求日志，可以提供命令的撤销和恢复功能

三个角色：  
1、Receive角色：干活的角色，命令传递到这里是应该被执行的；  
2、Command命令角色：需要执行的所有命令在这里声明；  
3、Invoker调用者角色：接受命令并执行命令。

优点：  
1、类间解耦：调用者角色与接受者角色之间没有任何依赖关系；  
2、可扩展性：Command的子类可以非常容易扩展，而调用者Invoker和高层次的模块Client不产生严重的代码耦合；  
3、命令模式和其他模式会更优秀：命令模式可以结合责任链模式，实现命令族解析任务；结合模板方法模式，则可以减少Command子类的膨胀问题。

缺点：  
Command的子类容易膨胀