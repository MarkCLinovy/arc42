package org.jetbrains.plugins.template.module

import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.module.ModuleTypeManager
import javax.swing.Icon

class Arc42ModuleType : ModuleType<Arc42ModuleBuilder>(ID) {
    override fun createModuleBuilder(): Arc42ModuleBuilder {
        TODO("Not yet implemented")
    }

    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getDescription(): String {
        TODO("Not yet implemented")
    }

    override fun getNodeIcon(isOpened: Boolean): Icon {
        TODO("Not yet implemented")
    }

    companion object {
        const val ID = "RUST_MODULE"
        val INSTANCE: Arc42ModuleType by lazy { ModuleTypeManager.getInstance().findByID(ID) as Arc42ModuleType }
    }
}