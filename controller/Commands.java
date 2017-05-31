package controller;

public enum Commands {

	COMMAND_CALCULATE_DISTANCE("COMMAD_CALCULATE_DISTANCE", "Calcular distancia",
			"Calcula la distancia entre dos distacnias ");
	
	private String command;
	private String title;
	private String hond;
	
	
	private Commands(String command, String title, String hond ) {
		this.command =command;
		this.title = title;
		this.hond = hond;
	}
	
	public String getCommand() {
		return command;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHond() {
		return hond;
	}

	public void setHond(String hond) {
		this.hond = hond;
	}

	public void setCommand(String command) {
		this.command = command;
	}
	
}
