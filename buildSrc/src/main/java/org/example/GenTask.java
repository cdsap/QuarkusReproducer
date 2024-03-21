package org.example;

import org.gradle.api.DefaultTask;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.TaskAction;

public abstract class GenTask extends DefaultTask {

    private final Property<ApplicationModel> applicationModel = getProject().getObjects().property(ApplicationModel.class);

    @Internal
    public Property<ApplicationModel> getAppModel() {
        return applicationModel;
    }

    @TaskAction
    public void generateCode() {

    }
}
