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
 * A cluster step consisting of a JAR file whose main function will be executed.
 * The main function submits a job for Hadoop to execute and waits for the job
 * to finish or fail.
 * </p>
 */
public class HadoopStepConfig implements Serializable {
    /**
     * <p>
     * The path to the JAR file that runs during the step.
     * </p>
     */
    private String jar;

    /**
     * <p>
     * The list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     * </p>
     */
    private java.util.Map<String, String> properties;

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified,
     * the JAR file should specify a main class in its manifest file.
     * </p>
     */
    private String mainClass;

    /**
     * <p>
     * The list of command line arguments to pass to the JAR file's main
     * function for execution.
     * </p>
     */
    private java.util.List<String> args;

    /**
     * <p>
     * The path to the JAR file that runs during the step.
     * </p>
     *
     * @return <p>
     *         The path to the JAR file that runs during the step.
     *         </p>
     */
    public String getJar() {
        return jar;
    }

    /**
     * <p>
     * The path to the JAR file that runs during the step.
     * </p>
     *
     * @param jar <p>
     *            The path to the JAR file that runs during the step.
     *            </p>
     */
    public void setJar(String jar) {
        this.jar = jar;
    }

    /**
     * <p>
     * The path to the JAR file that runs during the step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jar <p>
     *            The path to the JAR file that runs during the step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HadoopStepConfig withJar(String jar) {
        this.jar = jar;
        return this;
    }

    /**
     * <p>
     * The list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     * </p>
     *
     * @return <p>
     *         The list of Java properties that are set when the step runs. You
     *         can use these properties to pass key value pairs to your main
     *         function.
     *         </p>
     */
    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * The list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     * </p>
     *
     * @param properties <p>
     *            The list of Java properties that are set when the step runs.
     *            You can use these properties to pass key value pairs to your
     *            main function.
     *            </p>
     */
    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * The list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param properties <p>
     *            The list of Java properties that are set when the step runs.
     *            You can use these properties to pass key value pairs to your
     *            main function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HadoopStepConfig withProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * <p>
     * The list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     * </p>
     * <p>
     * The method adds a new key-value pair into Properties parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Properties.
     * @param value The corresponding value of the entry to be added into
     *            Properties.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HadoopStepConfig addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public HadoopStepConfig clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified,
     * the JAR file should specify a main class in its manifest file.
     * </p>
     *
     * @return <p>
     *         The name of the main class in the specified Java file. If not
     *         specified, the JAR file should specify a main class in its
     *         manifest file.
     *         </p>
     */
    public String getMainClass() {
        return mainClass;
    }

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified,
     * the JAR file should specify a main class in its manifest file.
     * </p>
     *
     * @param mainClass <p>
     *            The name of the main class in the specified Java file. If not
     *            specified, the JAR file should specify a main class in its
     *            manifest file.
     *            </p>
     */
    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified,
     * the JAR file should specify a main class in its manifest file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mainClass <p>
     *            The name of the main class in the specified Java file. If not
     *            specified, the JAR file should specify a main class in its
     *            manifest file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HadoopStepConfig withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * <p>
     * The list of command line arguments to pass to the JAR file's main
     * function for execution.
     * </p>
     *
     * @return <p>
     *         The list of command line arguments to pass to the JAR file's main
     *         function for execution.
     *         </p>
     */
    public java.util.List<String> getArgs() {
        return args;
    }

    /**
     * <p>
     * The list of command line arguments to pass to the JAR file's main
     * function for execution.
     * </p>
     *
     * @param args <p>
     *            The list of command line arguments to pass to the JAR file's
     *            main function for execution.
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
     * The list of command line arguments to pass to the JAR file's main
     * function for execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            The list of command line arguments to pass to the JAR file's
     *            main function for execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HadoopStepConfig withArgs(String... args) {
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
     * The list of command line arguments to pass to the JAR file's main
     * function for execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            The list of command line arguments to pass to the JAR file's
     *            main function for execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HadoopStepConfig withArgs(java.util.Collection<String> args) {
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
        if (getJar() != null)
            sb.append("Jar: " + getJar() + ",");
        if (getProperties() != null)
            sb.append("Properties: " + getProperties() + ",");
        if (getMainClass() != null)
            sb.append("MainClass: " + getMainClass() + ",");
        if (getArgs() != null)
            sb.append("Args: " + getArgs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJar() == null) ? 0 : getJar().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getMainClass() == null) ? 0 : getMainClass().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HadoopStepConfig == false)
            return false;
        HadoopStepConfig other = (HadoopStepConfig) obj;

        if (other.getJar() == null ^ this.getJar() == null)
            return false;
        if (other.getJar() != null && other.getJar().equals(this.getJar()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null
                && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getMainClass() == null ^ this.getMainClass() == null)
            return false;
        if (other.getMainClass() != null
                && other.getMainClass().equals(this.getMainClass()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        return true;
    }
}
