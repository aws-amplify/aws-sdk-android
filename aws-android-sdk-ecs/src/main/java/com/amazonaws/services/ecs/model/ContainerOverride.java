/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * The overrides that should be sent to a container. An empty container override
 * can be passed in. An example of an empty container override would be
 * <code>{"containerOverrides": [ ] }</code>. If a non-empty container override
 * is specified, the <code>name</code> parameter must be included.
 * </p>
 */
public class ContainerOverride implements Serializable {
    /**
     * <p>
     * The name of the container that receives the override. This parameter is
     * required if any override is specified.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The command to send to the container that overrides the default command
     * from the Docker image or the task definition. You must also specify a
     * container name.
     * </p>
     */
    private java.util.List<String> command;

    /**
     * <p>
     * The environment variables to send to the container. You can add new
     * environment variables, which are added to the container at launch, or you
     * can override the existing environment variables from the Docker image or
     * the task definition. You must also specify a container name.
     * </p>
     */
    private java.util.List<KeyValuePair> environment;

    /**
     * <p>
     * A list of files containing the environment variables to pass to a
     * container, instead of the value from the container definition.
     * </p>
     */
    private java.util.List<EnvironmentFile> environmentFiles;

    /**
     * <p>
     * The number of <code>cpu</code> units reserved for the container, instead
     * of the default value from the task definition. You must also specify a
     * container name.
     * </p>
     */
    private Integer cpu;

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container, instead of
     * the default value from the task definition. If your container attempts to
     * exceed the memory specified here, the container is killed. You must also
     * specify a container name.
     * </p>
     */
    private Integer memory;

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container, instead
     * of the default value from the task definition. You must also specify a
     * container name.
     * </p>
     */
    private Integer memoryReservation;

    /**
     * <p>
     * The type and amount of a resource to assign to a container, instead of
     * the default value from the task definition. The only supported resource
     * is a GPU.
     * </p>
     */
    private java.util.List<ResourceRequirement> resourceRequirements;

    /**
     * <p>
     * The name of the container that receives the override. This parameter is
     * required if any override is specified.
     * </p>
     *
     * @return <p>
     *         The name of the container that receives the override. This
     *         parameter is required if any override is specified.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the container that receives the override. This parameter is
     * required if any override is specified.
     * </p>
     *
     * @param name <p>
     *            The name of the container that receives the override. This
     *            parameter is required if any override is specified.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container that receives the override. This parameter is
     * required if any override is specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the container that receives the override. This
     *            parameter is required if any override is specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerOverride withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command
     * from the Docker image or the task definition. You must also specify a
     * container name.
     * </p>
     *
     * @return <p>
     *         The command to send to the container that overrides the default
     *         command from the Docker image or the task definition. You must
     *         also specify a container name.
     *         </p>
     */
    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command
     * from the Docker image or the task definition. You must also specify a
     * container name.
     * </p>
     *
     * @param command <p>
     *            The command to send to the container that overrides the
     *            default command from the Docker image or the task definition.
     *            You must also specify a container name.
     *            </p>
     */
    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }

        this.command = new java.util.ArrayList<String>(command);
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command
     * from the Docker image or the task definition. You must also specify a
     * container name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param command <p>
     *            The command to send to the container that overrides the
     *            default command from the Docker image or the task definition.
     *            You must also specify a container name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerOverride withCommand(String... command) {
        if (getCommand() == null) {
            this.command = new java.util.ArrayList<String>(command.length);
        }
        for (String value : command) {
            this.command.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The command to send to the container that overrides the default command
     * from the Docker image or the task definition. You must also specify a
     * container name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param command <p>
     *            The command to send to the container that overrides the
     *            default command from the Docker image or the task definition.
     *            You must also specify a container name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerOverride withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new
     * environment variables, which are added to the container at launch, or you
     * can override the existing environment variables from the Docker image or
     * the task definition. You must also specify a container name.
     * </p>
     *
     * @return <p>
     *         The environment variables to send to the container. You can add
     *         new environment variables, which are added to the container at
     *         launch, or you can override the existing environment variables
     *         from the Docker image or the task definition. You must also
     *         specify a container name.
     *         </p>
     */
    public java.util.List<KeyValuePair> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new
     * environment variables, which are added to the container at launch, or you
     * can override the existing environment variables from the Docker image or
     * the task definition. You must also specify a container name.
     * </p>
     *
     * @param environment <p>
     *            The environment variables to send to the container. You can
     *            add new environment variables, which are added to the
     *            container at launch, or you can override the existing
     *            environment variables from the Docker image or the task
     *            definition. You must also specify a container name.
     *            </p>
     */
    public void setEnvironment(java.util.Collection<KeyValuePair> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }

        this.environment = new java.util.ArrayList<KeyValuePair>(environment);
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new
     * environment variables, which are added to the container at launch, or you
     * can override the existing environment variables from the Docker image or
     * the task definition. You must also specify a container name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environment <p>
     *            The environment variables to send to the container. You can
     *            add new environment variables, which are added to the
     *            container at launch, or you can override the existing
     *            environment variables from the Docker image or the task
     *            definition. You must also specify a container name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerOverride withEnvironment(KeyValuePair... environment) {
        if (getEnvironment() == null) {
            this.environment = new java.util.ArrayList<KeyValuePair>(environment.length);
        }
        for (KeyValuePair value : environment) {
            this.environment.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The environment variables to send to the container. You can add new
     * environment variables, which are added to the container at launch, or you
     * can override the existing environment variables from the Docker image or
     * the task definition. You must also specify a container name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environment <p>
     *            The environment variables to send to the container. You can
     *            add new environment variables, which are added to the
     *            container at launch, or you can override the existing
     *            environment variables from the Docker image or the task
     *            definition. You must also specify a container name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerOverride withEnvironment(java.util.Collection<KeyValuePair> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * A list of files containing the environment variables to pass to a
     * container, instead of the value from the container definition.
     * </p>
     *
     * @return <p>
     *         A list of files containing the environment variables to pass to a
     *         container, instead of the value from the container definition.
     *         </p>
     */
    public java.util.List<EnvironmentFile> getEnvironmentFiles() {
        return environmentFiles;
    }

    /**
     * <p>
     * A list of files containing the environment variables to pass to a
     * container, instead of the value from the container definition.
     * </p>
     *
     * @param environmentFiles <p>
     *            A list of files containing the environment variables to pass
     *            to a container, instead of the value from the container
     *            definition.
     *            </p>
     */
    public void setEnvironmentFiles(java.util.Collection<EnvironmentFile> environmentFiles) {
        if (environmentFiles == null) {
            this.environmentFiles = null;
            return;
        }

        this.environmentFiles = new java.util.ArrayList<EnvironmentFile>(environmentFiles);
    }

    /**
     * <p>
     * A list of files containing the environment variables to pass to a
     * container, instead of the value from the container definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentFiles <p>
     *            A list of files containing the environment variables to pass
     *            to a container, instead of the value from the container
     *            definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerOverride withEnvironmentFiles(EnvironmentFile... environmentFiles) {
        if (getEnvironmentFiles() == null) {
            this.environmentFiles = new java.util.ArrayList<EnvironmentFile>(
                    environmentFiles.length);
        }
        for (EnvironmentFile value : environmentFiles) {
            this.environmentFiles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of files containing the environment variables to pass to a
     * container, instead of the value from the container definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentFiles <p>
     *            A list of files containing the environment variables to pass
     *            to a container, instead of the value from the container
     *            definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerOverride withEnvironmentFiles(
            java.util.Collection<EnvironmentFile> environmentFiles) {
        setEnvironmentFiles(environmentFiles);
        return this;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units reserved for the container, instead
     * of the default value from the task definition. You must also specify a
     * container name.
     * </p>
     *
     * @return <p>
     *         The number of <code>cpu</code> units reserved for the container,
     *         instead of the default value from the task definition. You must
     *         also specify a container name.
     *         </p>
     */
    public Integer getCpu() {
        return cpu;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units reserved for the container, instead
     * of the default value from the task definition. You must also specify a
     * container name.
     * </p>
     *
     * @param cpu <p>
     *            The number of <code>cpu</code> units reserved for the
     *            container, instead of the default value from the task
     *            definition. You must also specify a container name.
     *            </p>
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units reserved for the container, instead
     * of the default value from the task definition. You must also specify a
     * container name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cpu <p>
     *            The number of <code>cpu</code> units reserved for the
     *            container, instead of the default value from the task
     *            definition. You must also specify a container name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerOverride withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container, instead of
     * the default value from the task definition. If your container attempts to
     * exceed the memory specified here, the container is killed. You must also
     * specify a container name.
     * </p>
     *
     * @return <p>
     *         The hard limit (in MiB) of memory to present to the container,
     *         instead of the default value from the task definition. If your
     *         container attempts to exceed the memory specified here, the
     *         container is killed. You must also specify a container name.
     *         </p>
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container, instead of
     * the default value from the task definition. If your container attempts to
     * exceed the memory specified here, the container is killed. You must also
     * specify a container name.
     * </p>
     *
     * @param memory <p>
     *            The hard limit (in MiB) of memory to present to the container,
     *            instead of the default value from the task definition. If your
     *            container attempts to exceed the memory specified here, the
     *            container is killed. You must also specify a container name.
     *            </p>
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory to present to the container, instead of
     * the default value from the task definition. If your container attempts to
     * exceed the memory specified here, the container is killed. You must also
     * specify a container name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memory <p>
     *            The hard limit (in MiB) of memory to present to the container,
     *            instead of the default value from the task definition. If your
     *            container attempts to exceed the memory specified here, the
     *            container is killed. You must also specify a container name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerOverride withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container, instead
     * of the default value from the task definition. You must also specify a
     * container name.
     * </p>
     *
     * @return <p>
     *         The soft limit (in MiB) of memory to reserve for the container,
     *         instead of the default value from the task definition. You must
     *         also specify a container name.
     *         </p>
     */
    public Integer getMemoryReservation() {
        return memoryReservation;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container, instead
     * of the default value from the task definition. You must also specify a
     * container name.
     * </p>
     *
     * @param memoryReservation <p>
     *            The soft limit (in MiB) of memory to reserve for the
     *            container, instead of the default value from the task
     *            definition. You must also specify a container name.
     *            </p>
     */
    public void setMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory to reserve for the container, instead
     * of the default value from the task definition. You must also specify a
     * container name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memoryReservation <p>
     *            The soft limit (in MiB) of memory to reserve for the
     *            container, instead of the default value from the task
     *            definition. You must also specify a container name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerOverride withMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
        return this;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container, instead of
     * the default value from the task definition. The only supported resource
     * is a GPU.
     * </p>
     *
     * @return <p>
     *         The type and amount of a resource to assign to a container,
     *         instead of the default value from the task definition. The only
     *         supported resource is a GPU.
     *         </p>
     */
    public java.util.List<ResourceRequirement> getResourceRequirements() {
        return resourceRequirements;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container, instead of
     * the default value from the task definition. The only supported resource
     * is a GPU.
     * </p>
     *
     * @param resourceRequirements <p>
     *            The type and amount of a resource to assign to a container,
     *            instead of the default value from the task definition. The
     *            only supported resource is a GPU.
     *            </p>
     */
    public void setResourceRequirements(
            java.util.Collection<ResourceRequirement> resourceRequirements) {
        if (resourceRequirements == null) {
            this.resourceRequirements = null;
            return;
        }

        this.resourceRequirements = new java.util.ArrayList<ResourceRequirement>(
                resourceRequirements);
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container, instead of
     * the default value from the task definition. The only supported resource
     * is a GPU.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceRequirements <p>
     *            The type and amount of a resource to assign to a container,
     *            instead of the default value from the task definition. The
     *            only supported resource is a GPU.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerOverride withResourceRequirements(ResourceRequirement... resourceRequirements) {
        if (getResourceRequirements() == null) {
            this.resourceRequirements = new java.util.ArrayList<ResourceRequirement>(
                    resourceRequirements.length);
        }
        for (ResourceRequirement value : resourceRequirements) {
            this.resourceRequirements.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The type and amount of a resource to assign to a container, instead of
     * the default value from the task definition. The only supported resource
     * is a GPU.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceRequirements <p>
     *            The type and amount of a resource to assign to a container,
     *            instead of the default value from the task definition. The
     *            only supported resource is a GPU.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerOverride withResourceRequirements(
            java.util.Collection<ResourceRequirement> resourceRequirements) {
        setResourceRequirements(resourceRequirements);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getCommand() != null)
            sb.append("command: " + getCommand() + ",");
        if (getEnvironment() != null)
            sb.append("environment: " + getEnvironment() + ",");
        if (getEnvironmentFiles() != null)
            sb.append("environmentFiles: " + getEnvironmentFiles() + ",");
        if (getCpu() != null)
            sb.append("cpu: " + getCpu() + ",");
        if (getMemory() != null)
            sb.append("memory: " + getMemory() + ",");
        if (getMemoryReservation() != null)
            sb.append("memoryReservation: " + getMemoryReservation() + ",");
        if (getResourceRequirements() != null)
            sb.append("resourceRequirements: " + getResourceRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentFiles() == null) ? 0 : getEnvironmentFiles().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode
                + ((getMemoryReservation() == null) ? 0 : getMemoryReservation().hashCode());
        hashCode = prime * hashCode
                + ((getResourceRequirements() == null) ? 0 : getResourceRequirements().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerOverride == false)
            return false;
        ContainerOverride other = (ContainerOverride) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null
                && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getEnvironmentFiles() == null ^ this.getEnvironmentFiles() == null)
            return false;
        if (other.getEnvironmentFiles() != null
                && other.getEnvironmentFiles().equals(this.getEnvironmentFiles()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getMemoryReservation() == null ^ this.getMemoryReservation() == null)
            return false;
        if (other.getMemoryReservation() != null
                && other.getMemoryReservation().equals(this.getMemoryReservation()) == false)
            return false;
        if (other.getResourceRequirements() == null ^ this.getResourceRequirements() == null)
            return false;
        if (other.getResourceRequirements() != null
                && other.getResourceRequirements().equals(this.getResourceRequirements()) == false)
            return false;
        return true;
    }
}
