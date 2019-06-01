package com.sample.designpattern.command.homeautomation;

/**
 * Command Interface which will be implemented by the exact commands.
 *
 */
@FunctionalInterface
public interface ICommand {
	public void execute();
}
