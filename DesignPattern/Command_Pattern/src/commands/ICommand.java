package commands;

public interface ICommand {
	public void execute();

	public void undo();

	public String describe();

}
