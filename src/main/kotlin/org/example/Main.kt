package org.example

import spoon.Launcher
import spoon.reflect.declaration.CtEnum
import spoon.reflect.declaration.CtEnumValue
import spoon.reflect.declaration.CtType
import spoon.support.sniper.SniperJavaPrettyPrinter

fun main() {
    val launcher = Launcher()
    launcher.environment.setPrettyPrinterCreator { SniperJavaPrettyPrinter(launcher.environment) }
    launcher.addInputResource("./srcToTransform")
    val model = launcher.buildModel()
    val t = model.allTypes.first() as CtEnum<*>
    t.getEnumValue("FRENCH").setSimpleName<CtEnumValue<*>>("FR");
}