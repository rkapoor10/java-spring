# TYPES OF INTERFACE

There are 3 types of interfaces - 

- Normal Interface
- Functional Interface
- Marker Interface



## Normal Interface

Normal Interface is an interface which can have any no of methods or variables


## Functional Interface

Functional Interface is an interface which has a single method only

Lambda Expressions can be used with Functional Interfaces only


## Marker Interface

Marker Interface is an interface which has nothing, no method, no variable.

It use to tell the compiler that an interface is there for future use.

Application of Marker interface can be seen in Serialisation and Deserialization in Java.

So, the data in an object present in heap memory, can be moved to hard disk and the object is deleted. --> This is Serialization. 
With the help of marker interface we can create an object again. 
It tells the compiler that an object was and can be here

When the object is created again, data from hard disk is moved to the Object. 
This is known as deserialization.