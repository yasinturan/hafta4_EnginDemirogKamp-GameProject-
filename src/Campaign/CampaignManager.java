package Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("kampanya eklendi " + campaign.getName());		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("kampanya silindi " + campaign.getName());	
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("kampanya güncellendi " + campaign.getName());	
	}

}
