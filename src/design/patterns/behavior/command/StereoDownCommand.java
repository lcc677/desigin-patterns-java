package design.patterns.behavior.command;

public class StereoDownCommand implements Command {
    Stereo stereo;

    public StereoDownCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.down();
    }

    @Override
    public void undo() {
        stereo.up();
    }
}
