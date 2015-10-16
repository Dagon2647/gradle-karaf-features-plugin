/*
 * Copyright (c) 2015, contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.lburgazzoli.gradle.plugin.karaf.features.model

import org.gradle.api.Project
import org.gradle.api.artifacts.Configuration
import org.gradle.util.ConfigureUtil
import groovy.transform.ToString

import com.github.lburgazzoli.gradle.plugin.karaf.features.KarafFeaturesTaskExtension

/**
 * DSL extension allowing instruction on how to connect project with properties to a {@code <feature/>} entry
 * in a Karaf features repository file
 *
 * @author Steve Ebersole
 * @author Luca Burgazzoli
 * @author Sergey Nekhviadovich
 */
 
@ToString(includeNames=true)
class ProjectDependenciesDescriptor {

	/**
	 * The flag how to process project's transitive dependecies
	 * WARN: not fully supported with Obr dependecies
	 */
	def Boolean transitive = true

	ProjectDependenciesDescriptor() {
	}
}
