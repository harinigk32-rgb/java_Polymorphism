abstract class Payment{
   abstract void  processPayment();
}
class UPIPayment extends Payment{

    @Override
    void processPayment(){
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI Payment Successful");
    }

}

class CardPayment extends Payment{

    @Override
    void processPayment(){
        System.out.println("Processing Card Payment...");
        System.out.println("Card Payment Successful");
    }

}

class NetBankingPayment extends Payment{

    @Override
    void processPayment(){
        System.out.println("Processing NetBanking Payment...");
        System.out.println("NetBanking Payment Successful");
    }

}
void main() {

    Payment m = new UPIPayment(); {
    m.processPayment();

    Payment n = new CardPayment();
    n.processPayment();

    Payment u = new NetBankingPayment();
    u.processPayment();


    }
}
