package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class People implements Iterable<Person>{

    //    The class should instantiate a List field of Person objects named personList.
    ArrayList<Person> ppl;

    public People(){
        ppl = new ArrayList<>();
    }

    //    The class should define a method named add which adds a Person to the personList.
    public void add(Person ppl) {
        this.ppl.add(ppl);
    }

    //    The class should define a method named findById which makes use of a long id parameter to return a Person object with the respective id field.
    public Person findById(long id){
        for(Person p :ppl){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    //    The class should define a named contains which makes use of a Person person parameter to return true if the personList contains the respective Person object.
    public boolean contains(Person person){
        return findById(person.getId()) != null;
    }

    //    The class should define a method named remove which makes use of a Person person parameter to remove a respective Person object.
    public void remove(Person person){
        if(findById(person.getId())!=null){
            ppl.remove(person);
        }
    }

    //    The class should define a method named remove which makes use of a long id parameter to remove a Person object with the respective id field.
    public void remove(long id){
        for(Person p :ppl){
            if(p.getId() == id){
                ppl.remove(p);
                break;
            }
        }
    }

    //    The class should define a named removeAll which clears our personList field.
    public void removeAll(){
        ppl.clear();
    }

    //    The class should define a method named count which returns the size of personList.
    public int count(){
        return ppl.size();
    }

    //    The class should define a method named toArray which returns an array representation of the personList field.
    public Person[] toArray(){
        return ppl.toArray( new Person[0]);
    }

    //    The class should implement Iterable<E> and define a method named iterator which makes use of the personList field to generate a new a Iterator<E>.
    @Override
    public Iterator<Person> iterator() {
        return ppl.iterator();
    }





}
