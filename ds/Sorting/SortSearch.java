//Seth Adams, Steve Sabagh, Parmanand Mohanlall, Saranii Muller


import java.io.*;
import java.util.*;

/*

Sort Project:

Part 1:  (BASIC)
✔️  1. Analyze the two constructors - try to figure out how they work.
✔️ 2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
✔️ 1. Read the description of findSmallestIndex and complete the method.
✔️2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
✔️  1. Complete the sort method - read comments for description
✔️  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)//can't binary search on a non sorted list
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){//default constructor that will make array list of integers
	data = new ArrayList<Integer>(); //new array list of integers called data
	r = new Random(); //creates (instantiates) a new random object called r
	for (int i=0;i<15;i++){ //loops through array list spots 0-14 
	    data.add(r.nextInt(20)); // add a random integer of a value between 0 and 19
	}//default constructor makes an ArrayList with size 15 filled with randomized Ints between 0-19 
	
    }
    
    public SortSearch(int size){//makes array list of integers of a size in the parameter when called
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}
	
    }//override constructor makes an ArrayList with parameter size filled with randomized Ints between 0-19 

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
    }
    

    /*
      return the index of the smallest data item from index start to the end of the ArrayList. If there are multiple of the smallest value, return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8

      if start was 2 (start at index 2, value 10) then it would return 3 which is the index of the value 6 which is the index with the smallest value from start to end

      On the other hand, if start was 0, then the method would return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
  public int findSmallestIndex(int start){//created method called findSmallestIndex w/parameter of start
  	int smallIndex = start; //smallIndex is start
  	for(int i=start; i <data.size(); i++){//loop starting at start parameter, increments up until start is less then the size of array
      if(data.get(i) < data.get(smallIndex)){//if the data at the index we are checking is less than the data at our current smallest index then we replace the smallIndex with that index
        smallIndex = i;
      }
    }
	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList data in place.
       Algorithm:
       Loop a variable that represents the ArrayList index from 0 to the end of the ArrayList.
         For each index, find the smallest from that Location to the end of the array and swap it with that index.
    */
    public void sort(){
      //some if loop and then if true we would shift start up one -- replace value from lowest index with current test index (will need temp placeholder variable??)
      //oh I thought that was what I was calling sethsVal but nevermind. HMM. Im just thinking through this.
      int smallIndex = 0;
      int tempInt = 0;
      for(int i = 0/*this is the start*/;i < data.size()-1;i++){ //this is like the j loop and start always moves up with the loop
        smallIndex = findSmallestIndex(i); //find smallest index starting at 0
        tempInt = data.get(smallIndex); //temporary variable to hold the smallest int index while looping through
        data.set(smallIndex, data.get(i)); //set index to looped data from start point
        data.set(i, tempInt); //that data now becomes the temp
      }
    }


  /** 
    Searching projects Saranii + Kirk + Stacy + Parmanand **/
   
    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
    public int linearSearch(int value){
      for (int i = 0; i < data.size() - 1; i++){
        if(data.get(i) == value) {
          return i;
        } 
      }
      return -1;
    }
	
	
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

	// create assign variables  representing the high, low and middle indices 
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle

    /*
  - step 1: Assume list is sorted
  - step 2: set low, set high. find mid
  - step 3: if # is more than mid, set middle +1 to low and find new mid like in 2 rinse repeat until middle low and high ar eall the same

sorting method called sort
*/
  int low = 0; //setting low index to be 0
  int high = data.size() - 1;    //setting high to highest index of arraylist
  while (low != high) { //creates loop until
    int mid = (high + low)/2; //sets mid continually
    if(data.get(mid) == value) //if the value we are looking for is the mid then return the mid - setting truth first
    {
      return mid;
    }
    else if (data.get(mid) < value) { //if the mid is less than the value, change the low to one above the current mid
      low = mid + 1;
    }
    else {
      high = mid - 1; // for when value is less then mid, get rid of the high
    }
  } //exit loop
  if(data.get(high) == value) { //if high == value then the value exists in the array
    return high; //return the index of the value
  }
  return -1; //value does not exist in the array thus -1
	    
  }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){

	// refer to class discussion
	
	return 0;
	    
    }
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    

    
}

	 
       

 