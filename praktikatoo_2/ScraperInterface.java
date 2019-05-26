package Analytics;

interface ScraperInterface{

    void requestHTML(String url);
    void sendOutput();
}

interface ScraperIOInterface{
    void openSpider();
    void closeSpider();

}


interface ScraperMasterInterface extends ScraperInterface, ScraperIOInterface{

}