package tr.gov.nvi.tckimlik.WS;

import java.time.LocalDate;

import Campaign.Campaign;
import Game.Game;
import Sale.SaleManager;
import User.User;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game("1","Jurassic World","125");
		
		User user1 = new User("EMÝR","TONKAL",11111111,LocalDate.of(2002, 02, 12));
		
		Campaign campaign1 = new Campaign("1","Bahar Kampanyasý");
		
		SaleManager sale1 = new SaleManager();
		sale1.Sale(user1, game1);
		
			
	}

}
