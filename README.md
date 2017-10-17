# AOP (Aspect Oriented Programming)

In this repository you'll find the second exercise solved. Now you need to create a Controller class that calls
to the DAO class. Name the methods of the controller just as the names in the DAO class.
This controller will actually do few (or no) work. It's going to be just a proxy or a facade
to the DAO class. In a real application it would combine several DAOs and implement most of the domain rules.

Once you have the controller create an Advice class for printing some log messages (as in the example seen at class). 
Concretely you need to:
* Create a **pointcut** for all methods (there is only one) that have a single attribute of class *Classroom*
* Create a **pointcut** for all methods that begins with the word *find*
* Create a **pointcut** fot the method *insertBatch*
* Create a **before** advice for the first pointcut that logs the message *"Working with a classroom"*
* Create a **after** advice for the second pointcut that logs the message *"Finding classrooms"*
* Create an **around** advice for the third pointcut that logs two messages. The one before calling the method that reads 
*before multiple insert* and the second after calling the method that reads *after multiple insert*. Note that you
must find the way to pass the list of classrooms to the adviced method.

