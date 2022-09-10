package ch03;
import ch03.WikiPage;

public class PageCrawlerImpl {

    private WikiPage inheritedPage;
    
    public WikiPage getInheritedPage(String suiteSetupName, WikiPage wikiPage)
    {
        return inheritedPage;
    }

    public WikiPagePath getFullPath(WikiPage wikiPage)
    {
        WikiPagePath path;
        // faz coisas com path
        return path;
    }
}
