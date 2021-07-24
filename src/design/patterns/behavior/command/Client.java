package design.patterns.behavior.command;

/**
 * 第一组控制 卧室的灯
 * 第二组控制 吊灯
 * 第三组控制 吊扇
 * 第四组控制 吊扇的速度
 * 第五组控制 车库门
 * 第六组控制 音响
 * 第七组控制 音响声音大小
 * 第八组 空命令
 */


public class Client {
    public static void main(String[] args) {
        Light gardenLight = new Light("卧室的灯");
        Command gardenLightOnCommand = new LightOnCommand(gardenLight);
        Command gardenLightOffCommand = new LightOffCommand(gardenLight);

        Light ceilingLight = new Light("吊灯");
        Command ceilingLightOnCommand = new LightOnCommand(ceilingLight);
        Command ceilingLightOffCommand = new LightOffCommand(ceilingLight);


        CeilingFan ceilingFan = new CeilingFan("吊扇");
        Command ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        Command ceilingFanSetHeightCommand = new CeilingFanSetHeightCommand(ceilingFan);
        Command ceilingFanSetLowCommand = new CeilingFanSetLowCommand(ceilingFan);


        GarageDoor garageDoor = new GarageDoor("车库");
        Command garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        Command garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);


        Stereo stereo = new Stereo("音响");
        Command stereoOnCommand = new StereoOnCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);
        Command stereoUpCommand = new StereoUpCommand(stereo);
        Command stereoDownCommand = new StereoDownCommand(stereo);


        Control control = new Control();
        control.setCommands(0, gardenLightOnCommand, gardenLightOffCommand);

        control.setCommands(1, ceilingLightOnCommand, ceilingLightOffCommand);

        control.setCommands(2, ceilingFanOnCommand, ceilingFanOffCommand);
        control.setCommands(3, ceilingFanSetHeightCommand, ceilingFanSetLowCommand);

        control.setCommands(4, garageDoorUpCommand, garageDoorDownCommand);

        control.setCommands(5, stereoOnCommand, stereoOffCommand);
        control.setCommands(6, stereoUpCommand, stereoDownCommand);


        // 按下第一组的打开开关
        control.onKeyWasPushed(0);
        // 按下第二组的打开开关
        control.onKeyWasPushed(1);
        // 按下第三组的开关
        control.onKeyWasPushed(2);
        // 按下第四组的打开开关
        control.onKeyWasPushed(3);
        // 按下第八组的打开开关 ,无反应
        control.onKeyWasPushed(7);

        // 按下第二组的关闭开关
        control.offKeyWasPushed(1);
        // 按下返回按钮
        control.back();

        System.out.println("-----------------开启party模式--------------------------");
        // 测试party模式
        Control control1 = new Control();
        Command[] onCommands = {gardenLightOnCommand, ceilingLightOnCommand};
        Command[] offCommands = {gardenLightOffCommand, ceilingLightOffCommand};

        MacroCommand onMacroCommand = new MacroCommand(onCommands);
        MacroCommand offMacroCommand = new MacroCommand(offCommands);

        control1.setCommands(0, onMacroCommand, offMacroCommand);
        control1.onKeyWasPushed(0);
        control1.offKeyWasPushed(0);

        control1.back();


    }
}
