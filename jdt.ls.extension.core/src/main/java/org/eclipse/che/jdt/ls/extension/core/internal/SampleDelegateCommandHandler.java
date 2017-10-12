package org.eclipse.che.jdt.ls.extension.core.internal;


import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.ls.core.internal.IDelegateCommandHandler;

public class SampleDelegateCommandHandler implements IDelegateCommandHandler {

    public static final String COMMAND_ID = "org.eclipse.che.jdt.ls.extension.samplecommand";

    @Override
    public Object executeCommand(String commandId, List<Object> arguments, IProgressMonitor progress) throws Exception {
        if (COMMAND_ID.equals(commandId)) {
            return "Hello World";
        }
        throw new UnsupportedOperationException(String.format("Unsupported command '%s'!", commandId));
    }


}
