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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * An entity describing an executable that runs on a cluster.
 * </p>
 */
public class Command implements Serializable {
    /**
     * <p>
     * The name of the command.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon S3 location of the command script.
     * </p>
     */
    private String scriptPath;

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the command for execution.
     * </p>
     */
    private java.util.List<String> args;

    /**
     * <p>
     * The name of the command.
     * </p>
     *
     * @return <p>
     *         The name of the command.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the command.
     * </p>
     *
     * @param name <p>
     *            The name of the command.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the command.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the command.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Command withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the command script.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 location of the command script.
     *         </p>
     */
    public String getScriptPath() {
        return scriptPath;
    }

    /**
     * <p>
     * The Amazon S3 location of the command script.
     * </p>
     *
     * @param scriptPath <p>
     *            The Amazon S3 location of the command script.
     *            </p>
     */
    public void setScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
    }

    /**
     * <p>
     * The Amazon S3 location of the command script.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scriptPath <p>
     *            The Amazon S3 location of the command script.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Command withScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the command for execution.
     * </p>
     *
     * @return <p>
     *         Arguments for Amazon EMR to pass to the command for execution.
     *         </p>
     */
    public java.util.List<String> getArgs() {
        return args;
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the command for execution.
     * </p>
     *
     * @param args <p>
     *            Arguments for Amazon EMR to pass to the command for execution.
     *            </p>
     */
    public void setArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
            return;
        }

        this.args = new java.util.ArrayList<String>(args);
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the command for execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            Arguments for Amazon EMR to pass to the command for execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Command withArgs(String... args) {
        if (getArgs() == null) {
            this.args = new java.util.ArrayList<String>(args.length);
        }
        for (String value : args) {
            this.args.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Arguments for Amazon EMR to pass to the command for execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            Arguments for Amazon EMR to pass to the command for execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Command withArgs(java.util.Collection<String> args) {
        setArgs(args);
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
            sb.append("Name: " + getName() + ",");
        if (getScriptPath() != null)
            sb.append("ScriptPath: " + getScriptPath() + ",");
        if (getArgs() != null)
            sb.append("Args: " + getArgs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScriptPath() == null) ? 0 : getScriptPath().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Command == false)
            return false;
        Command other = (Command) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScriptPath() == null ^ this.getScriptPath() == null)
            return false;
        if (other.getScriptPath() != null
                && other.getScriptPath().equals(this.getScriptPath()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        return true;
    }
}
