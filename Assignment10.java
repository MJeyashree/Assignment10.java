		// Day-10 Assignment Questions:
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.util.NavigableSet;
import java.util.HashMap;
import java.util.*;
/*1. Write a Java program
	a. to create a new array list, add some colors (string) and print out the collection.
	b. to iterate through all elements in an array list.
	c. to insert an element into the array list at the first position.
	d. to retrieve an element (at a specified index) from a given array list.
	e. to update specific array element by given element.
	f. to remove the third element from an array list.
	g. to search an element in an array list.
	h. to sort a given array list.
	i. to copy one array list into another.
	j. to shuffle elements in an array list. */
	
class ArrayListColor{
	public static void main(String[] args){
	//a. to create a new array list, add some colors (string) and print out the collection.
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Sky-Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("Pink");
		colors.add("Yellow");
		System.out.println("List of Colors : " + colors);
		System.out.println("============================");
    //OUTPUT - List of Colors : [Sky-Blue, Red, Green, Pink, Yellow]
	
	//b. to iterate through all elements in an array list.
	    Iterator<String> itr = colors.iterator();
	    System.out.println("Iterating all Elements");
		while(itr.hasNext()){
			String color=itr.next();
		    System.out.println(color);
		}
		System.out.println("============================");
	/* OUTPUT
	Iterating all Elements
	Sky-Blue
	Red
	Green
	Pink
	Yellow */
	
	//c.to insert an element into the array list at the first position.
	    colors.add(0, "Navy-blue");
        System.out.println("After insertion : " + colors);
		System.out.println("============================");
	/* OUTPUT
	After insertion : [Navy-blue, Sky-Blue, Red, Green, Pink, Yellow]*/
	
	//d.to retrieve an element (at a specified index) from a given array list.
	    System.out.println("Element at index 4 : " + colors.get(4));
		System.out.println("============================");
	/* OUTPUT
	Element at index 4 : Pink */
	
	//e.to update specific array element by given element.
	    colors.set(4, "Orange");
        System.out.println("After updating the Element : " + colors);
		System.out.println("============================");
	/* OUTPUT
	[Navy-blue, Sky-Blue, Red, Green, Orange, Yellow] */
	
	//f.to remove the third element from an array list.
	    colors.remove(2);
        System.out.println("After removing third element: " + colors);
		System.out.println("============================");
    /* OUTPUT
	After removing third element: [Navy-blue, Sky-Blue, Green, Orange, Yellow] */
	
	//g. to search an element in an array list.
        if (colors.contains("Orange")) {
            System.out.println("Orange is found in the list.");
        } else {
            System.out.println("Orange is NOT found in the list.");
        }
		System.out.println("============================");
	/* OUTPUT
	Orange is found in the list.  */
	
	// h. to sort a given array list.
	    Collections.sort(colors);
        System.out.println("Sorted list: " + colors);
		System.out.println("============================");
    /*  OUTPUT
	Sorted list: [Green, Navy-blue, Orange, Sky-Blue, Yellow]  */
	
    // i. Copy one ArrayList into another
        ArrayList<String> newList = new ArrayList<>(colors);
        System.out.println("Copied list: " + newList);
		System.out.println("============================");
	/*  OUTPUT
	Copied list: [Green, Navy-blue, Orange, Sky-Blue, Yellow] */
        
    // j. Shuffle elements in the ArrayList
        Collections.shuffle(colors);
        System.out.println("Shuffled list: " + colors);
		System.out.println("============================");
	/* OUTPUT
	Shuffled list: [Navy-blue, Green, Yellow, Orange, Sky-Blue] */
	}
}

/*2.Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list. */

//a. append the specified element to the end of a linked list.

class LinkedListQues{
	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<>();
		list.add("Sky-Blue");
		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("Yellow");
		System.out.println("After Appending the Elements  : " + list);
		System.out.println("============================");
    //OUTPUT - List of Colors : [Sky-Blue, Red, Green, Pink, Yellow]
	
	//b. to iterate through all elements.
	    Iterator<String> itr = list.iterator();
	    System.out.println("Iterating all Elements");
		while(itr.hasNext()){
			String color=itr.next();
		    System.out.println(color);
		}
		System.out.println("============================");
	/* OUTPUT
	Iterating all Elements
	Sky-Blue
	Red
	Green
	Pink
	Yellow */
	
	//c.iterate through all elements in a linked list starting at the specified position.
        int start=3;
		ListIterator<String> listItr = list.listIterator(start);
	    System.out.println("Iterating all Elements : " + start + ":");
		while(listItr.hasNext()){
			String color=listItr.next();
		    System.out.println(color);
		}
		System.out.println("============================");
	/* OUTPUT
	Iterating all Elements : 3:
		Pink
		Yellow   */
		
	//d.iterate a linked list in reverse order.
	    System.out.println("Reverse order iteration:");
        Iterator<String> reverseItr = list.descendingIterator();
        while (reverseItr.hasNext()) {
            System.out.println(reverseItr.next());
        }
		System.out.println("============================");
		
	/* OUTPUT
	Reverse order iteration:
	Yellow
	Pink
	Green
	Red
	Sky-Blue  */
    
	//e.insert the specified element at the specified position in the linked list.
	    list.add(1, "Brown"); 
        System.out.println("After inserting Elements in index 1: " + list);
		System.out.println("============================");
	/* OUTPUT
	After inserting Elements in index 1: [Sky-Blue, Brown, Red, Green, Pink, Yellow] */
	
	//f.insert elements into the linked list at the first and last position.
	    list.addFirst("Green");
        list.addLast("Orange");
        System.out.println("After adding first & last: " + list);
		System.out.println("============================");
	/* OUTPUT
	After adding first & last: [Green, Sky-Blue, Brown, Red, Green, Pink, Yellow, Orange]*/
	
	//g.insert the specified element at the front of a linked list.
	    list.offerFirst("Purple");
        System.out.println("After inserting the Element at front: " + list);
		System.out.println("============================");
	/* OUTPUT
	After inserting the Element at front: [Purple, Green, Sky-Blue, Brown, Red, Green, Pink, Yellow, Orange]
	*/

    //h.Insert at end of linked list
        list.offerLast("White");
        System.out.println("After inserting Element at end: " + list);
		System.out.println("============================");
	/* OUTPUT
	After inserting Element at end: [Purple, Green, Sky-Blue, Brown, Red, Green, Pink, Yellow, Orange, White]
	*/
	
	//i. insert some elements at the specified position into a linked list.
        LinkedList<String> addColors = new LinkedList<>();
        addColors.add("Black");
        addColors.add("Grey");
        list.addAll(3, addColors); 
        System.out.println("After inserting new colors at index 3: " + list);
		System.out.println("============================");
    /* OUTPUT 
    After inserting new colors at index 3: [Purple, Green, Sky-Blue, Black, Grey, Brown, Red, Green, Pink, Yellow, Orange, White] */
    
	// j. Get first and last occurrence of specified element
        list.add("Green"); 
        list.add("Black"); 
        System.out.println("First occurrence of 'Green': " + list.indexOf("Green"));
        System.out.println("Last occurrence of 'Black': " + list.lastIndexOf("Black"));
		System.out.println("============================");
	/* OUTUT
	First occurrence of 'Green': 1
    Last occurrence of 'Black': 13 */
	}
}

/*3.Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set. */

//a. append the specified element to the end of a hash set.

class HashSetQues{
	public static void main(String[] args){
		//HashSet<String> set = new HashSet<>(); Hashset not maintain order
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Java");
		set.add("Python");
		set.add("C++");
		set.add("HTML");
		set.add("JavaScript");
		System.out.println("After adding Elements into the Set : " + set);
		System.out.println("============================");
	/*OUTPUT 
	After adding Elements into the Set :  [Java, Python, C++, HTML, Java Script] */
	
    //b.iterate through all elements in a hash list.
        System.out.println("Iterating all elements:");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
		System.out.println("============================");
    /*OUTPUT
	Iterating all elements:
	Java
	C++
	HTML
	Python */
    	
    //c. get the number of elements in a hash set.
         System.out.println("Number of elements: " + set.size());
		 System.out.println("============================");
	/*OUTPUT
	Number of elements: 4 */
	
	//d.empty the hash set.
	    set.clear();
        System.out.println("After clear() works : " + set);
		System.out.println("============================");
	/*OUTPUT
	After clear() works : []*/
	
	//e. test a hash set is empty or not.
	    System.out.println("Is the set is empty? " + set.isEmpty());
		System.out.println("============================");
	/*OUTPUT
	Is the set is empty? true*/
	
   //f.clone a hash set to another hash set.
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        HashSet<String> cloneSet = new HashSet<>(set1);
        System.out.println("Original set: " + set1);
        System.out.println("Cloned set: " + cloneSet);
		System.out.println("============================");
	/* OUTPUT
	Original set: [Apple, Cherry, Banana]
    Cloned set: [Apple, Cherry, Banana]*/
	
	//g. convert a hash set to an array.
	    Object[] array = set1.toArray();
        System.out.print("HashSet to array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println("============================");
	/* OUTPUT
	HashSet to array: Apple Cherry Banana */
	
	//h.convert a hash set to a tree set.
	    TreeSet<String> treeSet = new TreeSet<>(set1);
        System.out.println("HashSet to TreeSet : " + treeSet);
        System.out.println("============================");
	/* OUTPUT
    HashSet to TreeSet : [Apple, Banana, Cherry]
	
	//i.convert a hash set to a List/ArrayList. */
	    List<String> list = new ArrayList<>(set1);
        System.out.println("HashSet to ArrayList: " + list);
        System.out.println("============================");
	/* OUTPUT
	HashSet to ArrayList: [Apple, Cherry, Banana] */
		
	//j. compare two hash set.
	    HashSet<String> set2 = new HashSet<>();
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Cherry");
        System.out.println("set1 equals to set2? " + set1.equals(set2)); 
	/* OUTPUT
	set1 equals to set2? true */
	}
}

/*4. Write a Java program to,
a. create a new tree set, add some colors (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
i. Create a TreeSet that stores a set of numbers, find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set. */

class TreeSetQues {
    public static void main(String[] args) {
        // a. Create a new tree set, add some colors (string) and print out the tree set.
        
		TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");
        System.out.println("TreeSet elements: " + colors);  
        System.out.println("============================");

        // b. Iterate through all elements in a tree set.
        
		System.out.println("Iterating elements:");
        Iterator<String> itr = colors.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("============================");

        // c. Add all the elements of a specified tree set to another tree set.
        
		TreeSet<String> newColors = new TreeSet<>();
        newColors.add("Orange");
        newColors.add("Purple");
        newColors.addAll(colors);
        System.out.println("newColors after adding all from colors: " + newColors);
        System.out.println("============================");

        // d. Create a reverse order view of the elements contained in a given tree set.
        
		System.out.println("Reverse order view:");
        Iterator<String> revItr = colors.descendingIterator();
        while (revItr.hasNext()) {
            System.out.println(revItr.next());
        }
        System.out.println("============================");

        // e. Get the first and last elements in a tree set.
        
		System.out.println("First element: " + colors.first());
        System.out.println("Last element: " + colors.last());
        System.out.println("============================");

        // f. Clone a tree set list to another tree set.
        
		@SuppressWarnings("unchecked")
		TreeSet<String> cloneSet = (TreeSet<String>) colors.clone();
        System.out.println("Cloned TreeSet: " + cloneSet);
        System.out.println("============================");

        // g. Get the number of elements in a tree set.
        
		System.out.println("Number of elements: " + colors.size());
        System.out.println("============================");

        // h. Compare two tree sets.
        
		TreeSet<String> set1 = new TreeSet<>(colors);
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Blue");
        set2.add("Green");
        set2.add("Red");
        set2.add("Yellow");
        set2.add("Pink");
        System.out.println("set1 equals set2? " + set1.equals(set2));
        set2.add("Black");
        System.out.println("After adding 'Black', set1 equals set2? " + set1.equals(set2));
        System.out.println("============================");

        // i. Create a TreeSet that stores numbers, find numbers less than 7.
        
		TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        numbers.add(3);
        System.out.println("Numbers less than 7: " + numbers.headSet(7));
        System.out.println("============================");

        // j. Get the element in a tree set which is greater than or equal to the given element.
        
		System.out.println("Element >= 6: " + numbers.ceiling(6));
        System.out.println("============================");

        // k. Get the element in a tree set which is less than or equal to the given element.
        
		System.out.println("Element <= 10: " + numbers.floor(10));
        System.out.println("============================");

        // l. Get the element in a tree set which is strictly greater than the given element.
        
		System.out.println("Element > 5: " + numbers.higher(5));
        System.out.println("============================");
        
        // m. Get an element in a tree set which is strictly less than the given element.
        System.out.println("Element < 10: " + numbers.lower(10));
        System.out.println("============================");

        // n. Retrieve and remove the first element of a tree set.
        System.out.println("Poll first element: " + numbers.pollFirst());
        System.out.println("After polling first: " + numbers);
        System.out.println("============================");

        // o. Retrieve and remove the last element of a tree set.
        System.out.println("o) Poll last element: " + numbers.pollLast());
        System.out.println("   After polling last: " + numbers);
        System.out.println("============================");

        // p. Remove a given element from a tree set.
        numbers.remove(7);
        System.out.println("After removing 7: " + numbers);
        System.out.println("============================");
		
		/* OUTPUT
		
TreeSet elements: [Blue, Green, Pink, Red, Yellow]
============================
Iterating elements:
Blue
Green
Pink
Red
Yellow
============================
newColors after adding all from colors: [Blue, Green, Orange, Pink, Purple, Red, Yellow]
============================
Reverse order view:
Yellow
Red
Pink
Green
Blue
============================
First element: Blue
Last element: Yellow
============================
Cloned TreeSet: [Blue, Green, Pink, Red, Yellow]
============================
Number of elements: 5
============================
set1 equals set2? true
After adding 'Black', set1 equals set2? false
============================
Numbers less than 7: [1, 3, 5]
============================
Element >= 6: 7
============================
Element <= 10: 10
============================
Element > 5: 7
============================
Element < 10: 7
============================
Poll first element: 1
After polling first: [3, 5, 7, 10]
============================
o) Poll last element: 10
   After polling last: [3, 5, 7]
============================
After removing 7: [3, 5]
============================  */
    }
}

/*5.Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in the priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue. */

class PriorityQueueQues{
    public static void main(String[] args) {
        // 1. Create a new priority queue, add some colors, and print elements
        PriorityQueue<String> colorsPQ = new PriorityQueue<>();
        colorsPQ.add("Red");
        colorsPQ.add("Blue");
        colorsPQ.add("Green");
        colorsPQ.add("Yellow");
        colorsPQ.add("Orange");
        System.out.println("Priority Queue elements:");
        System.out.println(colorsPQ);
        System.out.println("============================");
        
        // 2. Iterate through all elements in the priority queue
        System.out.println("Iterating over Priority Queue :");
        Iterator<String> iterator = colorsPQ.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================");
        
        // 3. Add all elements of one priority queue to another
        PriorityQueue<String> colorsPQ1 = new PriorityQueue<>();
        colorsPQ1.add("Purple");
        colorsPQ1.add("Black");
        colorsPQ1.addAll(colorsPQ);
        System.out.println("Priority Queue1 after adding elements from Priority Queue :");
        System.out.println(colorsPQ1);
        System.out.println("============================");
        
        // 4. Insert a given element into a priority queue
        colorsPQ1.add("White");
        System.out.println("Priority Queue1 after adding 'White':");
        System.out.println(colorsPQ1);
        System.out.println("============================");
        
        // 5. Remove all elements from a priority queue
        colorsPQ.clear();
        System.out.println("Priority Queue after removing all elements:");
        System.out.println(colorsPQ);
        System.out.println("============================");
        
        // 6. Count the number of elements in a priority queue
        System.out.println("Number of elements in Priority Queue1 : " + colorsPQ1.size());
        System.out.println("============================");
        
        // 7. Compare two priority queues
        System.out.println("Comparing Priority Queue and Priority Queue1 :");
        System.out.println("Is it equal? " + colorsPQ.equals(colorsPQ1));
        System.out.println("============================");
        
        // 8. Retrieve the first element of the priority queue (without removing)
        System.out.println("First element of Priority Queue1 : " + colorsPQ1.peek());
        System.out.println("============================");
        
        // 9. Retrieve and remove the first element
        System.out.println("Removed first element from Priority Queue1: " + colorsPQ1.poll());
        System.out.println("Priority Queue1 after poll:" + colorsPQ1);
        System.out.println("============================");
        
        // 10. Convert priority queue to an array
		Object[] colorsArray = colorsPQ1.toArray();
        System.out.println("Priority Queue1 converted to array:" + Arrays.toString(colorsArray));
        System.out.println("============================");
		
		/* OUTPUT
Priority Queue elements:
[Blue, Orange, Green, Yellow, Red]
============================
Iterating over Priority Queue :
Blue
Orange
Green
Yellow
Red
============================
Priority Queue1 after adding elements from Priority Queue :
[Black, Green, Blue, Purple, Orange, Yellow, Red]
============================
Priority Queue1 after adding 'White':
[Black, Green, Blue, Purple, Orange, Yellow, Red, White]
============================
Priority Queue after removing all elements:
[]
============================
Number of elements in Priority Queue1 : 8
============================
Comparing Priority Queue and Priority Queue1 :
Is it equal? false
============================
First element of Priority Queue1 : Black
============================
Removed first element from Priority Queue1: Black
Priority Queue1 after poll:[Blue, Green, Red, Purple, Orange, Yellow, White]
============================
Priority Queue1 converted to array:[Blue, Green, Red, Purple, Orange, Yellow, White]
============================   */
    }
}

/*6.Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.   */

class TreeMapQues{
    public static void main(String[] args) {
        // 1. Associate specified value with specified key in TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(101, "Apple");
        treeMap.put(102, "Banana");
        treeMap.put(103, "Cherry");
        treeMap.put(104, "Dates");
        System.out.println("Original TreeMap:");
        System.out.println(treeMap);
        System.out.println("============================");

        // 2. Copy a TreeMap content to another TreeMap
        TreeMap<Integer, String> treeMap1 = new TreeMap<>(treeMap);
        System.out.println("Copied TreeMap:");
        System.out.println(treeMap1);
        System.out.println("============================");

        // 3. Search a key in a TreeMap
        System.out.println("Does this key is Exist : " + treeMap.containsKey(103));
        System.out.println("============================");
        
        // 4. Search a value in a TreeMap
        System.out.println("Does value is  exist? " + treeMap.containsValue("Banana"));
        System.out.println("============================");
        
        // 5. Get all keys from the given TreeMap
        Set<Integer> keys = treeMap.keySet();
        System.out.println("All keys in the TreeMap:");
        System.out.println(keys);
        System.out.println("============================");
        
        // 6. Delete all elements from the given TreeMap
        treeMap1.clear();
        System.out.println("TreeMap1 after clearing all elements:");
        System.out.println(treeMap1);
        System.out.println("============================");
        
        // 7. Sort keys in TreeMap by using comparator (descending order)
        TreeMap<Integer, String> treeMapDesc = new TreeMap<>(Collections.reverseOrder());
        treeMapDesc.putAll(treeMap);
        System.out.println("TreeMap with keys sorted in descending order:");
        System.out.println(treeMapDesc);
        System.out.println("============================");

        // 8. Get key-value mapping associated with greatest and least key in the map
        Map.Entry<Integer, String> greatestEntry = treeMap.lastEntry();
        Map.Entry<Integer, String> leastEntry = treeMap.firstEntry();
        System.out.println("Entry with greatest key: " + greatestEntry);
        System.out.println("Entry with least key: " + leastEntry);
        System.out.println("============================");

        // 9. Get the first (lowest) key and last (highest) key currently in the map
        Integer firstKey = treeMap.firstKey();
        Integer lastKey = treeMap.lastKey();
        System.out.println("First (lowest) key: " + firstKey);
        System.out.println("Last (highest) key: " + lastKey);
        System.out.println("============================");

        // 10. Get a reverse order view of the keys contained in the given map
        NavigableSet<Integer> reverseKeys = treeMap.descendingKeySet();
        System.out.println("Keys in reverse order:");
        System.out.println(reverseKeys);
        System.out.println("============================");
		
/*  OUTPUT
Original TreeMap:
{101=Apple, 102=Banana, 103=Cherry, 104=Dates}
============================
Copied TreeMap:
{101=Apple, 102=Banana, 103=Cherry, 104=Dates}
============================
Does this key is Exist : true
============================
Does value is  exist? true
============================
All keys in the TreeMap:
[101, 102, 103, 104]
============================
TreeMap1 after clearing all elements:
{}
============================
TreeMap with keys sorted in descending order:
{104=Dates, 103=Cherry, 102=Banana, 101=Apple}
============================
Entry with greatest key: 104=Dates
Entry with least key: 101=Apple
============================
First (lowest) key: 101
Last (highest) key: 104
============================
Keys in reverse order:
[104, 103, 102, 101]
============================ */
    }
}

/* 7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map.   */

class HashMapQues{
    public static void main(String[] args) {
        // 1. Associate the specified value with the specified key in a HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Cherry");
        map.put(104, "Date");
        System.out.println("Original HashMap: " + map);
        System.out.println("=========================");

        // 2. Count the number of key-value mappings in a map
        System.out.println("Number of mappings: " + map.size());
        System.out.println("============================");
        
        // 3. Copy all mappings from one map to another
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.putAll(map);
        System.out.println("Copied HashMap: " + map1);
        System.out.println("============================");

        // 4. Remove all mappings from a map
        map1.clear();
        System.out.println("HashMap after clearing: " + map1);
        System.out.println("============================");
        
        // 5. Check if a map is empty
        System.out.println("Is map2 empty? " + map1.isEmpty());
        System.out.println("============================");
        
        // 6. Get a shallow copy of a HashMap instance
		@SuppressWarnings("unchecked")
        HashMap<Integer, String> shallowCopy = (HashMap<Integer, String>) map.clone();
        System.out.println("Shallow copy of map: " + shallowCopy);
        System.out.println("============================");
        
        // 7. Test if a map contains a mapping for the specified key
        System.out.println("Does map contains key " + map.containsKey(103));
        System.out.println("============================");
        
        // 8. Test if a map contains a mapping for the specified value
        System.out.println("Does map contains value " + map.containsValue("Cherry"));
        System.out.println("============================");
        
        // 9. Create a set view of the mappings contained in a map
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println("Set view of map : " + entrySet);
        System.out.println("============================");
        
        // 10. Get the value of a specified key in a map
        System.out.println("\nValue of Specified key " +  map.get(101));
        System.out.println("============================");
		
		/*  OUTPUT
Original HashMap: {101=Apple, 102=Banana, 103=Cherry, 104=Date}
=========================
Number of mappings: 4
============================
Copied HashMap: {104=Date, 101=Apple, 102=Banana, 103=Cherry}
============================
HashMap after clearing: {}
============================
Is map2 empty? true
============================
Shallow copy of map: {104=Date, 101=Apple, 102=Banana, 103=Cherry}
============================
Does map contains key true
============================
Does map contains value true
============================
Set view of map : [101=Apple, 102=Banana, 103=Cherry, 104=Date]
============================

Value of Specified key Apple
============================  */
    }
}

/*8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use auto-boxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed). */

class Account {
    int accountNumber;
    String holderName;
    Double balance; 

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance; 
    }

    public void applyInterest(Double interestRate) { 
        double interestAmount = balance * interestRate / 100;
        balance += interestAmount; // Auto-boxing again
    }
}

class BankAccountList{
    public static void main(String[] args){
        Double interestRate = Double.valueOf(5.0); 
		
        // Create an ArrayList to store Account objects
        ArrayList<Account> accounts = new ArrayList<>();

        // Adding accounts (Auto-boxing for balance)
        accounts.add(new Account(1001, "Jeya", 5000.0));
        accounts.add(new Account(1002, "Sri", 7500.0));
        accounts.add(new Account(1003, "Padhma", 10000.0));

        for (Account acc : accounts) {
            // Unboxing to primitive for display
            double originalBalance = acc.balance; 

            System.out.println("Account Holder: " + acc.holderName);
            System.out.println("Account Number: " + acc.accountNumber);
            System.out.println("Original Balance: " + originalBalance);

            // Apply interest
            acc.applyInterest(interestRate);

            // Unboxing for new balance 
            double newBalance = acc.balance;
            System.out.println("New Balance after " + interestRate + "% interest: " + newBalance);
            System.out.println("=====================================");
			
			/*    OUTPUT
Account Holder: Jeya
Account Number: 1001
Original Balance: 5000.0
New Balance after 5.0% interest: 5250.0
=====================================
Account Holder: Sri
Account Number: 1002
Original Balance: 7500.0
New Balance after 5.0% interest: 7875.0
=====================================
Account Holder: Padhma
Account Number: 1003
Original Balance: 10000.0
New Balance after 5.0% interest: 10500.0
=====================================   */
        }
    }

}
