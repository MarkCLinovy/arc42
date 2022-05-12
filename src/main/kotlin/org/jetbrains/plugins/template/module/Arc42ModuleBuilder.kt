package org.jetbrains.plugins.template.module

import com.intellij.ide.util.projectWizard.ModuleBuilder
import com.intellij.ide.util.projectWizard.ModuleBuilderListener
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleType

class Arc42ModuleBuilder : ModuleBuilder(), ModuleBuilderListener {
    override fun getDescription(): String {
        return "test";
    }
    override fun getModuleType(): ModuleType<*> {
        TODO("Not yet implemented")
    }

    override fun moduleCreated(module: Module) {
        TODO("Not yet implemented")
    }
}