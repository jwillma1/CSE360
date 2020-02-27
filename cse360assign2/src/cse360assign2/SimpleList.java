/**
 * James Willman
 * 185
 * Assignment 2
 * This file contains the Simple List 
 * class which has an array that will be manipulated
 */

package cse360assign2;



/**
 * Simple List class
 * This class has the constructor which
 * allocates a new array of size 10 and the element
 * count to 0
 * The user can add/remove elements, find an index
 * of a certain element, the total elements inputed by the user
 * and a toString for the array
 */
public class SimpleList 
{
	private int[] list;
	private int count;
	private int arraySize = 10;
	
	/**
	 * Class Constructor
	 * This sets up a new Simple List Object
	 * Has an empty array and the total count of 0
	 */
	public SimpleList()
	{
		list = new int[arraySize];
		count = 0;
	}
	
	/**
	 * This adds the integer to the front of the array
	 * @param addInt specifies the integer added to the array 
	 */
	public void add(int addInt)
	{
		//Checks if the array is empty
		if(count == 0)
		{
			list[0] = addInt;
		}else
		{
			if (count == arraySize)
			{
				arraySize *= 1.5;
				int tempArray[] = list;
				list = new int[arraySize];
				for(int i = 0; i < tempArray.length; i++)
				{
					list[i] = tempArray[i];
				}
			}
			//Starts at the end of the array, moving the elements to the right
			for(int index = count - 1; index >= 0; index--)
			{
				list[index+1] = list[index];
	
			}
			//Adds the element to the first index
			list[0] = addInt;	
		}
		count++;
	}
	
	/**
	 * This removes the integer from the array if found
	 * Shifts all elements to the left
	 * @param removeInt specifies the integer to be removed
	 */
	public void remove(int removeInt)
	{
		int elementIndex = search(removeInt); //Finds the index of the element
		if(elementIndex != -1)
		{
			//Shifts the array to the left
			for(int index = elementIndex; index < count; index++)
			{
				//Checks if the values are within the proper boundaries to shift left
				if(index != count - 1)
				{
					list[index] = list[index+1];
				}
			}
			count--; //Updates the count
		}
		
		//Updates the array size if the count is wrong
		double temp = (double)arraySize/(double)count;
		if(temp <= .75)
		{
			arraySize *= .75;
			int tempArray[] = list;
			list = new int[arraySize];
			for(int i = 0; i < tempArray.length; i++)
			{
				list[i] = tempArray[i];
			}
			
					
		}
	}
	
	/**
	 * Gives the total count of elements
	 * @return the total elements added by the user
	 */
	public int count()
	{
		return count; //The amount of elements in the array
	}
	
	/**
	 * Returns a string of the array
	 * @return a string of the elements separated by commas
	 */
	public String toString()
	{
		String result = "";
		//Creates a string for the array input
		for(int index = 0; index < count; index++)
		{
			//Spaces after each element expect for the last element
			if(index == count - 1)
			{
				result += list[index];
			}else
			{
				result += list[index] + " ";
			}
		}
		return result;
	}
	
	/**
	 * Searches for the integer in the array and returns the index
	 * if found
	 * @param search gives the value you want to find
	 * @return gives the index of the element found
	 * returns -1 if not found
	 */
	public int search(int search)
	{
		int searchIndex = -1;
		//Traversing the array until all elements are searched
		for(int index = 0; index < count; index++)
		{
			//Updates search index if the value is found
			if(list[index] == search)
			{
				searchIndex = index;
			}
		}
		return searchIndex;
	}
	
	public void append(int end)
	{
		if(count == arraySize)
		{
			arraySize *= 1.5;
			int tempArray[] = list;
			list = new int[arraySize];
			for(int i = 0; i < tempArray.length; i++)
			{
				list[i] = tempArray[i];
			}
		}
		list[count] = end;
		count++;
	}
	
	public int first()
	{
		int toReturn = -1;
		if(count != 0)
		{
			toReturn = list[0];
		}
		return toReturn;
	}
	
	public int last()
	{
		int toReturn = -1;
		if(count != 0)
		{
			toReturn = list[count];
		}
		return toReturn;
	}
	
	public int size()
	{
		return arraySize;
	}
}
