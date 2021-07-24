package design.patterns.behavior.command;

// 调用者
public class Control {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public Control() {
        onCommands = new Command[8];
        offCommands = new Command[8];
        for (int i = 0; i < 8; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onKeyWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offKeyWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void back() {
        undoCommand.undo();
    }

}
