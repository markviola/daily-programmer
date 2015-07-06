
class BottlesOfBeer{
	public static void main(String[] args){
		int numBeerOnWall = 99;
		for (int i = numBeerOnWall; i > 0; i--){
			beerSong(i);
		}
	}

	public static void beerSong(int numBeer){
		String song;
		if (numBeer != 1){
			song = String.valueOf(numBeer) + " bottles of beer on the wall,\n" +
						String.valueOf(numBeer) + " bottles of beer.\n" +
						"You take one down and pass it around, \n" + 
						String.valueOf(numBeer -1) + " bottles of beer on the wall.\n\n";
		} else {
			song = String.valueOf(numBeer) + " bottle of beer on the wall,\n" +
						String.valueOf(numBeer) + " bottle of beer.\n" +
						"You take one down and pass it around, \n" + 
						String.valueOf(numBeer -1) + " bottles of beer on the wall.\n\n";
		}

		System.out.print(song);
	}
}