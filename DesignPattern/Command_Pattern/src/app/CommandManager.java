package app;

import java.util.ArrayList;
import java.util.List;

import commands.ICommand;

public class CommandManager {
	private static CommandManager theCommandManager = null;

	// Liste der Commands
	List<ICommand> commands = new ArrayList<ICommand>();

	// Pointer in die Liste
	int index = 0;

	private CommandManager() {

	}

	// Singleton-Instanz bereitstellen
	public static CommandManager getInstance() {
		if (theCommandManager == null) {
			theCommandManager = new CommandManager();
		}
		return theCommandManager;
	}

	// neues Kommando-Objekt hinzunehmen
	public void pushCommand(ICommand cmd) {
		if (index < commands.size()) {
			commands = commands.subList(0, index);
		}
		commands.add(cmd);
		index++;
	}

	public void undo() {
		if (index > 0) {
			index--;
			ICommand cmd = commands.get(index);
			cmd.undo();
		} else {
			throw new UndoRedoException("Nothing to undo");
		}
	}

	public void redo() {
		if (index < commands.size()) {
			ICommand cmd = commands.get(index);
			cmd.execute();
			index++;
		} else {
			throw new UndoRedoException("Nothing to redo");
		}
	}

	// Kommando ausführen und in Undo-Liste aufnehmen
	public void execAndPush(ICommand cmd) {
		cmd.execute();
		pushCommand(cmd);
	}

	// Zustand des CommandManagers ausgeben
	public String toString() {
		String res = "CommandStack\n";

		for (int i = 0; i < commands.size(); i++) {
			if (i == index) {
				res += "-----------------------\n";
			}
			res += "  " + i + ".: " + commands.get(i).describe() + "\n";
		}
		res += ")";
		return res;
	}

}
