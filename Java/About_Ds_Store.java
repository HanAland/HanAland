public class About_Ds_Store 
{
    public static void main(String[] args)
    {
        //Step by step guide on how to remove .DS_Store from your directory

        System.out.println("Step 1: Open up Terminal");
        System.out.println("Step 2: In the command line, type - " + "cd to/your/directory");
        System.out.println("Step 3: type - " + "find . -name .DS_Store -print0 | xargs -0 git gm --ignore-unmatch");
        System.out.println("Step 4: type - " + "git add .");   // . means add all changes
        System.out.println("Step 5: type - " + "git commit -m " + "blah blah");
        System.out.println("Step 6: type - " + "git push origin HEAD:master");
    }
}
