  import java.io.File;
  import java.io.FileNotFoundException;
  import java.util.Scanner;
  
  class Input
  {
  	int[] list = new int[Main.LIST_SIZE];
  
  	void menu()
  	{
  	
  		Scanner sc = new Scanner(System.in);
  		Sorter sort = new Sorter();
  
  		while(true)
  		{
  			System.out.println("Choose a Sort:  (0) Quit (1) Bubble");
  			System.out.print(" > ");
  
  			int choice = sc.nextInt();			
  			long startTime = System.nanoTime();
  			
  			if(choice == 1)
  			{
  				System.out.println("Before: ");
          sort.printList(list);
          System.out.println("After: ");
          sort.bubbleSort(list);
  			}
  			else
  			{
  				sc.close();
  				System.exit(0);
  			}
  		
  			long runTime = (System.nanoTime() - startTime) / 1000000;
  			System.out.println("");
        System.out.println("Runtime " + runTime + " ms");
  			System.out.println();
  
  		}
  
  	}
  
  	// This method is completed - do not modify
  	void readFile() 
  	{
  		try
  		{
  			File file = new File("data.txt");
  			Scanner sc = new Scanner(file);
  
  			for(int i = 0; i < Main.LIST_SIZE; i++)
  			{
  				list[i] = sc.nextInt();
  			}
  
  			sc.close();
  		}
  		catch(FileNotFoundException e)
  		{
  			System.err.println("Cannot find file!");
  		}
  	}
  }