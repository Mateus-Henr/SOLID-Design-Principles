/*  Open-Closed Principle

    • This is the second letter of the SOLID acronym.


    What this principle tells us
    SOFTWARE ENTITIES (Classes, Modules, methods, etc.) SHOULD BE OPEN FOR EXTENSION, BUT CLOSED FOR MODIFICATION.


    Meaning
    • "Open for Extension" means that we should be able to extend existing behaviour.
    • "Closed for Modification" means that existing code remains unchanged.

    "Open for Extension" in Java
    • It means that we should be able to extend a base class through inheritance, so in the context of methods from the
      base class for example, we should be able to get them and overwriting them.

    "Closed for Modification" in Java
    • This means that you should not modify code that was written in a base class since that code there is already
      "bug free", and it has already been tested as well.
 */

public class Main
{
    public static void main(String[] args)
    {

    }
}
