package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class People implements Iterable<Person>{

    private ArrayList<Person> ppl;

    public People(){
        ppl = new ArrayList<>();
    }

    public void add(Person ppl) {
        this.ppl.add(ppl);
    }

    public Person findById(long id){
        for(Person p :ppl){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return findById(person.getId()) != null;
    }

    public void remove(Person person){
        if(findById(person.getId())!=null){
            ppl.remove(person);
        }
    }

    public void remove(long id){
        for(Person p :ppl){
            if(p.getId() == id){
                ppl.remove(p);
                break;
            }
        }
    }

    public void removeAll(){
        ppl.clear();
    }

    public int count(){
        return ppl.size();
    }

    public Person[] toArray(){
        return ppl.toArray( new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return ppl.iterator();
    }





}
