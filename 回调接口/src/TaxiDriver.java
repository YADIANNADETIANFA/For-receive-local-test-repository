public class TaxiDriver {
    public int Answer(Callback callback){
        System.out.println("去那的话要100块");
        if(callback.Consider(100)==true){
            callback.PayFor(100);
        }
        return 100;
    }
}
