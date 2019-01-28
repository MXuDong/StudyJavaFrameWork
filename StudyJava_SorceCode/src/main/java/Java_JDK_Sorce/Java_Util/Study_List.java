package Java_JDK_Sorce.Java_Util;

import java.util.*;

/**
 * @author Dong
 * <p>
 * Class Name : Study_List
 * Create Time : 16:57
 * Create Date : 2019/1/28
 * Project : StudyJavaFrameWork
 */

public class Study_List {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

    }

    /*
    今天主要学习 接口：List 在java.util包下
    他的已经实现的常用类如下：ArrayList, LinkedList, Vector
     */
}

//class MyList<E> implements List<E>{
//
//
//    /**
//     * 空构造，只用来构造一个长度默认的数组
//     */
//    public MyList(){
//        datasValue = new Object[DEFAULT_INIT_LENGTH];
//    }
//
//    /**
//     * 传入集合构造，最小长度为集合长度 + 默认长度
//     * @param collection
//     */
//    public MyList(Collection<? extends E> collection){
//        datasValue = new Object[collection.size() + DEFAULT_INIT_LENGTH];
//        Iterator iterator = collection.iterator();
//
//        while(iterator.hasNext()){
//            datasValue[endPoint++] = iterator.next();
//        }
//    }
//
//    /**
//     * 数据存放，用来保存数据
//     */
//    private Object [] datasValue;
//    /**
//     * 数组的默认长度为10
//     */
//    private static final byte DEFAULT_INIT_LENGTH = 10;
//    /**
//     * 最后一位数据的下一个指针
//     */
//    private int endPoint = 0;
//
//    //帮助方法=======================================================
//
//    /**
//     * 创建新的数组
//     * @param isGrow 传入真则扩充数组，否则压缩数组
//     * @return 新的数组
//     */
//    private Object [] createNewDataValues(boolean isGrow){
//        if(isGrow){
//            if(endPoint > datasValue.length / 2){
//                return new Object[2 * datasValue.length];
//            }else{
//                return new Object[datasValue.length + DEFAULT_INIT_LENGTH];
//            }
//        }else{
//            if(endPoint > datasValue.length / 2){
//                if(datasValue.length - endPoint > DEFAULT_INIT_LENGTH){
//                    return new Object[datasValue.length - DEFAULT_INIT_LENGTH];
//                }
//            }else{
//                if(datasValue.length > 2 * DEFAULT_INIT_LENGTH){
//                    return new Object[datasValue.length / 2 + DEFAULT_INIT_LENGTH];
//                }
//            }
//        }
//
//        return new Object[datasValue.length];
//    }
//
//    /**
//     * 创建大小为数据长度的数组
//     * @return
//     */
//    private Object [] createNewDataValues(){
//        return new Object[endPoint];
//    }
//
//    /**
//     * 数据抄录函数，将原来的数据复制到新的数组中
//     * @param fromCopy 被抄录的数据数组
//     * @param toCopy 用来存放抄录数据的新数组
//     * @return 抄录后的新数组
//     */
//    private Object[] copyData(Object [] fromCopy, Object[] toCopy){
//        if(toCopy.length < endPoint){
//            return null;
//        }
//        for(int i = 0; i < endPoint; i++){
//            toCopy[i] = fromCopy[i];
//        }
//        return toCopy;
//    }
//
//    // 重写方法=======================================================
//
//    public int size() {
//        return datasValue.length - endPoint;
//    }
//
//    public boolean isEmpty() {
//        return endPoint == 0;
//    }
//
//    public boolean contains(Object o) {
//        for(Object objectItem : datasValue){
//            if(objectItem.equals(o)){
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public Iterator iterator() {
//        return null;
//    }
//
//    public Object[] toArray() {
//        Object [] beReturnArray = createNewDataValues();
//        return copyData(datasValue, beReturnArray);
//    }
//
//    public boolean add(Object o) {
//        if(endPoint > datasValue.length - DEFAULT_INIT_LENGTH){
//            Object [] newArray = createNewDataValues(true);
//            datasValue = copyData(datasValue, newArray);
//        }
//        datasValue[endPoint++] = o;
//        return true;
//    }
//
//    public boolean remove(Object o) {
//        if(endPoint == 0){
//            return false;
//        }
//        if(!contains(o)){
//            return false;
//        }
//        int index = -1;
//        for(int i = 0; i < endPoint; i++){
//            if(datasValue[i].equals(o)){
//                index = i;
//            }
//        }
//
//        for(; endPoint > index; index++){
//            datasValue[index] = datasValue[index - 1];
//        }
//
//        endPoint--;
//
//        return true;
//    }
//
//    public void clear() {
//        endPoint = 0;
//
//    }
//
//    public E get(int index) {
//        if(index > endPoint || index < 0){
//            return null;
//        }
//        return (E)datasValue[index];
//    }
//
//    public Object set(int index, Object element) {
//        if(index > endPoint || index < 0){
//            return null;
//        }
//
//        return datasValue[index];
//    }
//
//    public int indexOf(Object o) {
//        if(contains(o)){
//            for(int i = 0; i < endPoint; i++){
//                if(datasValue[i] == o){
//                    return i;
//                }
//            }
//        }
//
//        return -1;
//    }
//
//    public void add(int index, Object element) {
//
//    }
//
//    public Object remove(int index) {
//        return null;
//    }
//
//
//
//    public int lastIndexOf(Object o) {
//        return 0;
//    }
//
//    public ListIterator listIterator() {
//        return null;
//    }
//
//    public ListIterator listIterator(int index) {
//        return null;
//    }
//
//    public List subList(int fromIndex, int toIndex) {
//        return null;
//    }
//
//    public boolean retainAll(Collection c) {
//        return false;
//    }
//
//    public boolean removeAll(Collection c) {
//        return false;
//    }
//
//    public boolean addAll(Collection c) {
//        return false;
//    }
//
//    public boolean addAll(int index, Collection c) {
//        return false;
//    }
//
//    public boolean containsAll(Collection c) {
//        return false;
//    }
//
//    public Object[] toArray(Object[] a) {
//        return new Object[0];
//    }
//}