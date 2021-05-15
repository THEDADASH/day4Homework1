public abstract class BaseCustomerManager implements ICustomerService{
    public void save(Customer customer){
        System.out.println("Data to saved :"+ customer.getFirstName());
    }
}
