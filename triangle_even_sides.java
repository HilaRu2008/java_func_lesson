


public class Main
{
    

    public static void f10(int height){
            
        int max_amount_of_asterisk = (height * 2) - 1;  // to get the max amount of asterisk (in the base of the triangle)
            
        for (int i = 1; i <= max_amount_of_asterisk; i+=2) { // to make sure that the program won't run more asterisks lines than needed ( = the amount of asterisks we want to print in each line)
            int amount_of_spaces_needed_on_every_side = (max_amount_of_asterisk - i) / 2;
    
            for (int j = 0; j < max_amount_of_asterisk; j++) {
                if (j < amount_of_spaces_needed_on_every_side || j >= max_amount_of_asterisk - amount_of_spaces_needed_on_every_side) {
                    // j < amount_of_spaces_needed_on_every_side: if the index of j is in index less than the amount of spaces in one side (the index of space area)
                    //j >= max_amount_of_asterisk - amount_of_spaces_needed_on_every_side: for the other side of spaces.
                    // max_amount_of_asterisk - amount_of_spaces_needed_on_every_side = 1 index after the index of the last asterisk in the line
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
    
            System.out.println();
        }
    }
    
    
    
    
    
	public static void main(String[] args) {
	    
	    f10(5);
		
	}
}










public static void f10(int heighet){
        
        int max_anount_of_asterisk = (heighet * 2) - 1;  // to get the max amount of asterisk (in the base of the triangle)
        // max_anount_of_asterisk = 7
        
        for (int i = 1; i <= max_anount_of_asterisk; i+=2){ // to make sure that the program wont run more asterisks lines than needed ( = the amont of asterisks we want to print in each line)
            int amount_of_spaces_needed_on_every_side = (max_anount_of_asterisk - i) / 2;
            
            // System.out.print(amount_of_spaces_needed_on_every_side);
            for (int space = 0; space < amount_of_spaces_needed_on_every_side; space++){
                System.out.print(" ");
            }
            
            for (int j = 0; j < i; j++){  // j is the amount of asterisk in every line
                System.out.print('*');
            }

            
            System.out.println();
            

        }
        
    }
