public class Magic {
    public static void main(String[] args){
        Jeu maMain = new Jeu(10);

        maMain.piocher(new Terrain('b'));
        maMain.piocher(new Creature(6, "Golem",4,6) );
        maMain.piocher(new Sortilege(1,"croissance Gigantesque","la createur ciblée gagne  +3/+3 jusqu'à la fin du tour" ));
        System.out.println("là , j'ai en stock:");
        maMain.afficher();
        maMain.joue();

    }
}
