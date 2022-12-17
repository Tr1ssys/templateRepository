package org.alexanderrr;

public class ArrayContainer implements Container{
    String[] array = {"Apple","Pineapple","Melon","Strawberry"};

    public Iterator getIterator(){
        return new ArrayIterator();
    }
    class ArrayIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Object next() {
            if(hasNext()){
                System.out.println(index);
                return array[index++];
            }
            return null;
        }
    }
}
