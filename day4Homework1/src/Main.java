public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager = new AudiCustomerManager(new CustomerCheckManager());
        BaseCustomerManager customerManager1 = new BmvCustomerManager();
        customerManager.save(new Customer(1,"Alperen","Ayaz",2002,585858585));
        customerManager1.save(new Customer(2,"Ömer","Uzundağ",2002,58585858));
    }
}
