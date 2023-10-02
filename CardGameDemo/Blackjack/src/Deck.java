
public class Deck 
{
	private Card[] cards;
	
	public Deck()
	{
		cards = new Card[52];
		populate();
	}
	
	private void populate()
	{
	    int index = 0;

	    // Loop through ranks (1-13)
	    for (int rank = 1; rank <= 13; rank++) {
	        // Loop through suits (4 suits)
	        for (String suit : new String[]{"Spades", "Hearts", "Diamonds", "Clubs"}) {
	            String cardName;
	            int cardValue;

	            // Determine card name and value based on rank
	            if (rank == 1) {
	                cardName = "A" + suit.charAt(0);
	                cardValue = 11; // Ace value
	            } else if (rank >= 11) {
	                // Handle face cards (Jack, Queen, King)
	                cardName = rankToFace(rank) + suit.charAt(0);
	                cardValue = 10; // Face cards value
	            } else {
	                cardName = Integer.toString(rank) + suit.charAt(0);
	                cardValue = rank; // Numeric card value
	            }

	            // Create and add the card to the cards array
	            Card card = new Card(rank, cardName, cardValue);
	            cards[index] = card;
	            index++;
	        }
	    }
	}

	// Helper method to convert rank to face card name
	private String rankToFace(int rank) {
	    switch (rank) {
	        case 11:
	            return "J";
	        case 12:
	            return "Q";
	        case 13:
	            return "K";
	        default:
	            return "";
	    }
	}
	
}
