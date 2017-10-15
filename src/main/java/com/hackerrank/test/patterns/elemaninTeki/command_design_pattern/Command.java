package com.hackerrank.test.patterns.elemaninTeki.command_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
//Every single command will have to implement this interface
public interface Command {
    void execute();

    //undo command
    void undo();
}
