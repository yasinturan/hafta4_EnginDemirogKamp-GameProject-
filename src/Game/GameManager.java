package Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println("oyun eklendi " + game.getName());		 
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println("oyun silindi " + game.getName());		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println("oyun güncellendi " + game.getName());		
	}



	
}
