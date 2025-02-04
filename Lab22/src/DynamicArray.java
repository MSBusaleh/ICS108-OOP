public class DynamicArray <T>{
    private T[] mainArray = (T[]) new Object[2];
    private int items = 0;

    public void add(T addedItem){
        if(items == mainArray.length){
            T[] newArray = (T[]) new Object[2* mainArray.length];
            for(int i = 0; i<mainArray.length; i++)
                newArray[i] = mainArray[i];

            mainArray = newArray.clone();
        }

        mainArray[items] = addedItem;
        items++;
    }

    public T remove(){
        if(items > 0){
        T removed= mainArray[items-1];
        mainArray[items-1] = null;
        items--;
        return removed;
        }
        else
            return null;
    }
}
