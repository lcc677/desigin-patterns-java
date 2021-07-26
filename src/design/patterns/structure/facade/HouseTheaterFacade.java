package design.patterns.structure.facade;

public class HouseTheaterFacade {
    DVDPlayer dvdPlayer;
    Project project;
    Screen screen;
    Stereo stereo;
    TheaterLight theaterLight;

    public HouseTheaterFacade(DVDPlayer dvdPlayer, Project project, Screen screen, Stereo stereo, TheaterLight theaterLight) {
        this.dvdPlayer = dvdPlayer;
        this.project = project;
        this.screen = screen;
        this.stereo = stereo;
        this.theaterLight = theaterLight;
    }

    public void watchMovie() {
        dvdPlayer.on();
        dvdPlayer.setCD();
        project.on();
        screen.down();
        stereo.on();
        stereo.height();
        theaterLight.on();
        theaterLight.dim();
    }

    public void paused() {
        dvdPlayer.paused();
    }

    public void endMovie() {
        theaterLight.bright();
        dvdPlayer.off();
        project.off();
        screen.up();
        stereo.off();
        theaterLight.off();
    }
}
