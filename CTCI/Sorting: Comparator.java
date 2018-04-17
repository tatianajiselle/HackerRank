// Write your Checker class here
class Checker implements Comparator<Player>{
    
    // @override
    public int compare(Player p1, Player p2){
        if (p1.score == p2.score){
            return p1.name.compareTo(p2.name);
        }
        return p1.score > p2.score ? -1 : 1;

    }
}