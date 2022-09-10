package ch03;
import ch03.WikiPage;

public class PageData {
    private WikiPage wikiPage;

    public WikiPage getWikiPage()
    {
        return wikiPage;
    }

    public boolean hasAttribute(String attribute)
    {
        if(attribute.equals("Test"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
