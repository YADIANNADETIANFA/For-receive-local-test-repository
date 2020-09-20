public class Passenger implements Callback{
    @Override
    public boolean Consider(int money) {
        boolean result = true;
        if(money>80){
            System.out.println(money + "太贵了，80行不");
            result = false;
        }
        return result;
    }

    @Override
    public void PayFor(int money) {
        System.out.println("好的，这个是你的" + money);
    }

    public void TakeTaxi(TaxiDriver td){
        System.out.println("师傅，去一天多少钱");
        td.Answer(this);
    }

}
