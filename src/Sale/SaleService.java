package Sale;

import Campaign.Campaign;
import Game.Game;
import User.User;

public interface SaleService {
	
	public void Sale(User user, Game game,Campaign campaign);
	public void Sale(User user, Game game);

}
