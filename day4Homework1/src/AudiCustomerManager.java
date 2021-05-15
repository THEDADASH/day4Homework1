public class AudiCustomerManager extends BaseCustomerManager{
    private ICustomerCheckService _customerCheckService;
    public AudiCustomerManager(ICustomerCheckService customerCheckService){
        _customerCheckService=customerCheckService;

    }
    public void save(Customer customer){
        if(_customerCheckService.checkIfRealPerson(customer)){
            System.out.println("Audi data to saved :"+ customer.getFirstName());
        }else{
            System.out.println("Geçersiz kullanıcı");
        }
    }
}
