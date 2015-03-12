package org.bndtools.builder.classpath;

import org.bndtools.api.BndtoolsConstants;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;

public class BndContainer implements IClasspathContainer {
    public static final String DESCRIPTION = "Bnd Bundle Path";
    private final IClasspathEntry[] entries;

    BndContainer(IClasspathEntry[] entries) {
        this.entries = entries;
    }

    @Override
    public IClasspathEntry[] getClasspathEntries() {
        return entries;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public int getKind() {
        return IClasspathContainer.K_APPLICATION;
    }

    @Override
    public IPath getPath() {
        return BndtoolsConstants.BND_CLASSPATH_ID;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
