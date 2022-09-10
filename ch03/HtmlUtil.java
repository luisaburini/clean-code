package ch03;
import ch03.PageData;
import ch03.PathParser;

public class HtmlUtil {

    public static String testableHtml(
        PageData pageData, 
        boolean includeSuiteSetup
        ) throws Exception {
            WikiPage wikiPage = pageData.getWikiPage();
            StringBuffer buffer = new StringBuffer();
            if(pageData.hasAttribute("Test"))
            {
                if(includeSuiteSetup)
                {
                    WikiPage suiteSetup = PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_SETUP_NAME, wikiPage);

                    if(suiteSetup != null)
                    {
                        WikiPagePath pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
                        String pagePathName = PathParser.render(pagePath);
                    }
                }
            }

    }
    
}
