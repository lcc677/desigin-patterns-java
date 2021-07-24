package design.patterns.behavior.command;

public class StereoUpCommand implements Command {
    Stereo stereo;

    public StereoUpCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.up();
    }

    @Override
    public void undo() {
        stereo.down();
    }
}
