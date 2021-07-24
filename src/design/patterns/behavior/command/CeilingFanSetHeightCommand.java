package design.patterns.behavior.command;

public class CeilingFanSetHeightCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanSetHeightCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.setHeight();
    }

    @Override
    public void undo() {
        ceilingFan.setLow();
    }
}
