package com.github.doublesevenos.testmvvmtemp.services

import com.github.doublesevenos.testmvvmtemp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
