/*
 * Copyright 2016 Alessandro Falappa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.alexfalappa.nbspringboot.projects.customizer;

/**
 * Represents a Spring Boot configuration property override.
 * <p>
 * Can be enabled/disabled. Enabled overrides are meant to be passed to the application as command line arguments of the form
 * {@code --name=value}.
 *
 * @author Alessandro Falappa
 */
public class CfgOverride {

    boolean enabled = false;
    String name = "";
    String value = "";

    @Override
    public String toString() {
        return String.format("[%s] %s = %s", enabled ? "X" : " ", name, value);
    }

}
