package ControleRemoto;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[10];
        offCommands = new Command[10];

        Command noCommand = new NoCommand();

        for (int i = 0; i < offCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("\n---------------------------\n");
        strBuff.append("\n----- Controle remoto -----\n");
        strBuff.append("\n---------------------------\n");
        for (int i = 0; i < offCommands.length; i++) {
            strBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "		" + offCommands[i].getClass().getName() + "\n");
        }
        return strBuff.toString();
    }

}
