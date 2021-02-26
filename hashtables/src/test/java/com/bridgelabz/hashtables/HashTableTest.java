 	package com.bridgelabz.hashtables;

 	import static org.junit.Assert.assertFalse;
 	import static org.junit.Assert.assertTrue;

 	import org.junit.Before;
 	import org.junit.Test;

 	
 	public class HashTableTest 
 	{
 		HashTable hashTable;
 		
 		@Before
 		public void initialize() {
 			hashTable = new HashTable();
 			String input = new String("To be or not to be");
 			String []words = input.split(" ");
 			for(String word : words)
 				hashTable.add(word);
 		}
 	    
 	  
 	    @Test
 	    public void TestingFrequency_Correct(){
 	        assertTrue(hashTable.hashtable.search("be"));
 	    }
 	    
 	    
 	    @Test
 	    public void TestingFrequency_INCorrect(){
 	        assertFalse(hashTable.hashtable.search("hello"));
 	    }

 }
