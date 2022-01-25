package org.dmfs.gradle.gitversion;

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.jupiter.api.Test;


class GitVersionPluginTest
{

    @Test
    public void greeterPluginAddsGreetingTaskToProject()
    {
        Project project = ProjectBuilder.builder().build();

        project.getPluginManager().apply("org.dmfs.gitversion");
    }
}