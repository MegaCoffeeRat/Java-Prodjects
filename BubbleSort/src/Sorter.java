class Sorter
{
	void printList(int[] list)
	{
    
    for(int i = 0; i<list.length; i++)
      {
        System.out.print(list[i] + " ");
      }
    System.out.println(" ");
	} 

	void bubbleSort(int[] list)
	{
    boolean sorted = true;
    while(sorted)
      {
      sorted = false;
      for(int i = 0; i < list.length -1; i++)
        {
          if(list[i] > list [i+1])
          {
            sorted = true;
            int var = list[i];
            list[i] = list[i+1];
            list[i+1] = var;
            System.out.println(" ");
            printList(list);
          }
        }
      }

    
	}

}