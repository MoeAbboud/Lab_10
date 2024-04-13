package tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    @Test
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort testing = new SelectionSort();
        int[] outputArr = testing.basicSelectionSort(arr);
        
        assertArrayEquals(Sortedarr, outputArr);
        
        /** add tests to check for this unit test **/
    }
    
    @Test
    public void testNegative(){
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        SelectionSort testing = new SelectionSort();
        int[] outputArr = testing.basicSelectionSort(arr);
        
        assertArrayEquals(Sortedarr, outputArr);
        
        /** Test data contains negative values only **/
    }
    
    @Test
    public void testMixed(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = 2;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;
        
        SelectionSort testing = new SelectionSort();
        int[] outputArr = testing.basicSelectionSort(arr);
        
        assertArrayEquals(Sortedarr, outputArr);
        
        /** Test data contains with both positive, negative and zeros **/
    }
    
    @Test
    public void testDuplicates(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = -4;
        arr[3] = 0;
        arr[4] = 0;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -4;
        Sortedarr[1] = 0;
        Sortedarr[2] = 0;
        Sortedarr[3] = 8;
        Sortedarr[4] = 8;
        
        SelectionSort testing = new SelectionSort();
        int[] outputArr = testing.basicSelectionSort(arr);
        
        assertArrayEquals(Sortedarr, outputArr);
        
        /** Test data contains duplicates **/
    }


}
