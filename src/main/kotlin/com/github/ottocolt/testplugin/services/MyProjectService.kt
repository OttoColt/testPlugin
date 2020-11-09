package com.github.ottocolt.testplugin.services

import com.intellij.openapi.project.Project
import com.github.ottocolt.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
