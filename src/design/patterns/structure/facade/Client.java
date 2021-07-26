package design.patterns.structure.facade;

public class Client {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Project project = new Project();
        Screen screen = new Screen();
        Stereo stereo = new Stereo();
        TheaterLight theaterLight = new TheaterLight();
        HouseTheaterFacade houseTheaterFacade = new HouseTheaterFacade(dvdPlayer, project, screen, stereo, theaterLight);
        System.out.println("---------------開始看電影------------------------");
        houseTheaterFacade.watchMovie();
        System.out.println("---------------結束電影------------------------");
        houseTheaterFacade.endMovie();

    }
}
