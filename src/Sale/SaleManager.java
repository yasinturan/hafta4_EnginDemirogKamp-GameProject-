package Sale;

import Campaign.Campaign;
import Game.Game;
import User.User;

public class SaleManager implements SaleService{

	@Override
	public void Sale(User user, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("satýþ " + user.getName() + " " +game.getName() + " " +campaign.getName());
	}

	@Override
	public void Sale(User user, Game game) {
		// TODO Auto-generated method stub
		System.out.println("satýþ " + user.getName() + " " +game.getName());
	}

}
