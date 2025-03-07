package org.moe.gradle.model.impl

import org.moe.gradle.model.MOESdkProperties
import java.io.Serializable

data class MOESdkPropertiesImpl(
    override val home: String,
    override val coreJar: String,
    override val platformJar: String?,
    override val junitJar: String,
) : MOESdkProperties, Serializable
