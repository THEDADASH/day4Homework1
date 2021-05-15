public class BmvCustomerManager extends BaseCustomerManager{
    @Override
    public void save(Customer customer){
        System.out.println("Bmv data to saved :"+ customer.getFirstName());
    }
}
