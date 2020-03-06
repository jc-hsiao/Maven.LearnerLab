package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class People <E extends Person> implements Iterable<E>{

    private ArrayList<E> ppl;

    public People(){
        ppl = new ArrayList<>();
    }

    public void add(E ppl) {
        this.ppl.add(ppl);
    }

    public E findById(long id){
        for(E p :ppl){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public boolean contains(E person){
        return findById(person.getId()) != null;
    }

    public void remove(E person){
        if(findById(person.getId())!=null){
            ppl.remove(person);
        }
    }

    public void remove(long id){
        for(E p :ppl){
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

    public abstract E[] toArray();

    @Override
    public Iterator<E> iterator() {
        return ppl.iterator();
    }





}
