package User;

public class UserManager implements UserService{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("kullan�c� eklendi " + user.getName());		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("kullan�c� silindi " + user.getName());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("kullan�c� g�ncellendi " + user.getName());
	}
	
}
