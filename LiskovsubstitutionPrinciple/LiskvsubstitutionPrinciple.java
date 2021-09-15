package LiskovsubstitutionPrinciple;

// Principle states that the subtype should be able to replace or substitute
// the behaviour of the class, it is subtype of

// Violations - How do you spot
// #1 Empty methods or Partially implemented interfaces that are not implementable in class that is extending base class
// e.g @Override public void fly(int alt){ throw exception or do nothing}
// #2 Harden preconditions
// e.g. square extending rectangle. square doesnt need width but just height
//      Rectangle r = new sqaure() , r.setWidth(10), r. setHeight(20),r.area() will give wrong answer
// #3 Type checking of class to implement certain behavior with forceful typecasting


public class LiskvsubstitutionPrinciple {

    
}
