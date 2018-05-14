package app;

public class UndoRedoException extends RuntimeException {
	private String description = "";

	public UndoRedoException(String description) {
		this.description = description;
	}

	public String toString() {
		return description;
	}
}
