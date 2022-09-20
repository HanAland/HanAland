public class DNA
{
    public static void main(String[]args)
    {
        //create a skeleton
    
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ / 
        //   / \   \   / \   \  
        //  ~   `-~ `-`   `-~ `-
        
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna1 + dna2 + dna3;
        int start = dna.indexOf("ATG");
        int end = dna.indexOf("TGA");
    
        System.out.println(dna.length());
        System.out.println("Start: " + start);
        System.out.println("End: " + end);
    
        if(start != -1 && end != -1 && (start-end) % 3 == 0){
    
        System.out.println("Condition 1 and 2 are satisfied.");
    
        String protein = dna.substring(start, end + 3);
        System.out.println("Protein: " + protein);
        }else{
        System.out.println("No protein.");
        }
    }
}    

