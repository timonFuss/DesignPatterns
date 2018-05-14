package commands;

import model.ArrayModel;

public class EinfuegenCommand implements ICommand {
	private ArrayModel myArrayModel;
	private int index;
	private int number;

	public EinfuegenCommand(ArrayModel am, int index, int number) {
		myArrayModel = am;
		this.index = index;
		this.number = number;
	}

	@Override
	public void execute() {
		myArrayModel.addElement(index, number);

	}

	@Override
	public void undo() {
		myArrayModel.removeElement(index);

	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return null;
	}

}
