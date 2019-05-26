package Analytics;

class DelfiScraper extends Scraper{

    public DelfiScraper(String url){
        super(url);
    }

    private void sendOutput(){
        System.out.println("Sending data to a databse");
    }

}