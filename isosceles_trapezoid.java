    
    public static void f13(int h){
        
        int num_of_asterisks_in_the_sub_base = h + (2 * (h - 1));
        //System.out.println(num_of_asterisks_in_the_sub_base);  // working
        
        
        for(int col = 0; col < h; col++){
            
            int num_of_asterisks_in_every_line = h + (2 * col);
            int needed_spaces_on_each_side = (num_of_asterisks_in_the_sub_base - num_of_asterisks_in_every_line) / 2;
            
            //System.out.println("num of asterisks in every line: " + num_of_asterisks_in_every_line); // working
            //System.out.println("needed spaces on each side: " + needed_spaces_on_each_side);  // working
            
            
            for (int row = 0; row < num_of_asterisks_in_the_sub_base; row++){
                
                if (row < num_of_asterisks_in_the_sub_base - num_of_asterisks_in_every_line - needed_spaces_on_each_side  ||  row >= num_of_asterisks_in_the_sub_base - needed_spaces_on_each_side){ 
                    
                    //row < num_of_asterisks_in_the_sub_base - num_of_asterisks_in_every_line - needed_spaces_on_each_side:
                    // check if the index of the row is smaller than the index of the first astrisk --> print a space if so
                    
                    //row >= num_of_asterisks_in_the_sub_base - needed_spaces_on_each_side: 
                    // checks if the row (index) got to a index we need to start printing spaces again (the condition gets the index after the last index asterisk in a row  
                    
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
                
            }
            System.out.println();
            
            
        }
        
        
        
        
        
        
    }



    public static void main(String[]args){

        // System.out.println(f8(6));
        f13(5);

    }
