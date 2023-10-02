import java.util.ArrayList;

public class Game 
{
	
	private int[][] play;
	private int key;
	private ArrayList<Integer> playerList;
	private Deck deck;
	
	public Game()
	{
		for(int i = 0; i < 52; i++)
	    {
	    	int[] line = {i, 0};
	    	play[i] = line;
	    }
		deck = new Deck();
		
		key = (int) (Math.random() * 10000000);
		System.out.println("Game key is: " + key);
	}
	
	public int addPlayer()
	{
		int playerKey = (int) (Math.random() * 10000000);
		playerList.add(playerKey);
		return playerList.get(playerList.size());
	}
	
	public void giveCard(int key)
	{
		
	}
}
