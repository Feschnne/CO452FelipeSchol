
/**
 * This class Module represents the code, tittle and credit value
 * of a given module. 
 *
 * @author (Felipe Schol Negrin)
 * @version 12/10/2021
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String code;
    private String title;
    private int credit;

    /**
     * Module constructor assings the code and title for a module
     * It also initialises the credit value to 0
     */
    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
        this.credit = 0;
    }

    /**
     *This method returns the code for the module
     *
     * @return code represent the module Code
     */
    public String getCode()
    {
        return code;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getCredit()
    {
        return credit;
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    /**
     * Print the details of the module which includes
     * the code, title and credits
     */
    public void print()
    {
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println(" Credit: " + credit);
        System.out.println();
    }
}
