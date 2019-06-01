package com.sample.designpattern.command.homeautomation;

/**
 * Remote Control for Home automation where it will accept the command and
 * execute.
 */
public class HomeAutomationRemote {
	ICommand command;

	public void setCommand(ICommand command) {
		this.command = command;
	}

	public void buttonPressed() {
		command.execute();
	}
}
