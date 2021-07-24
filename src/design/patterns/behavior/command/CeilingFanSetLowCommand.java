package design.patterns.behavior.command;

public class CeilingFanSetLowCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanSetLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.setLow();
    }

    @Override
    public void undo() {
        ceilingFan.setHeight();
    }
}
