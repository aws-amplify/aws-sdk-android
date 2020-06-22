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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * A job flow step consisting of a JAR file whose main function will be
 * executed. The main function submits a job for Hadoop to execute and waits for
 * the job to finish or fail.
 * </p>
 */
public class HadoopJarStepConfig implements Serializable {
    /**
     * <p>
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     * </p>
     */
    private java.util.List<KeyValue> properties;

    /**
     * <p>
     * A path to a JAR file run during the step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String jar;

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified,
     * the JAR file should specify a Main-Class in its manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String mainClass;

    /**
     * <p>
     * A list of command line arguments passed to the JAR file's main function
     * when executed.
     * </p>
     */
    private java.util.List<String> args;

    /**
     * <p>
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     * </p>
     *
     * @return <p>
     *         A list of Java properties that are set when the step runs. You
     *         can use these properties to pass key value pairs to your main
     *         function.
     *         </p>
     */
    public java.util.List<KeyValue> getProperties() {
        return properties;
    }

    /**
     * <p>
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     * </p>
     *
     * @param properties <p>
     *            A list of Java properties that are set when the step runs. You
     *            can use these properties to pass key value pairs to your main
     *            function.
     *            </p>
     */
    public void setProperties(java.util.Collection<KeyValue> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new java.util.ArrayList<KeyValue>(properties);
    }

    /**
     * <p>
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param properties <p>
     *            A list of Java properties that are set when the step runs. You
     *            can use these properties to pass key value pairs to your main
     *            function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HadoopJarStepConfig withProperties(KeyValue... properties) {
        if (getProperties() == null) {
            this.properties = new java.util.ArrayList<KeyValue>(properties.length);
        }
        for (KeyValue value : properties) {
            this.properties.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param properties <p>
     *            A list of Java properties that are set when the step runs. You
     *            can use these properties to pass key value pairs to your main
     *            function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HadoopJarStepConfig withProperties(java.util.Collection<KeyValue> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * <p>
     * A path to a JAR file run during the step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A path to a JAR file run during the step.
     *         </p>
     */
    public String getJar() {
        return jar;
    }

    /**
     * <p>
     * A path to a JAR file run during the step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param jar <p>
     *            A path to a JAR file run during the step.
     *            </p>
     */
    public void setJar(String jar) {
        this.jar = jar;
    }

    /**
     * <p>
     * A path to a JAR file run during the step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param jar <p>
     *            A path to a JAR file run during the step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HadoopJarStepConfig withJar(String jar) {
        this.jar = jar;
        return this;
    }

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified,
     * the JAR file should specify a Main-Class in its manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the main class in the specified Java file. If not
     *         specified, the JAR file should specify a Main-Class in its
     *         manifest file.
     *         </p>
     */
    public String getMainClass() {
        return mainClass;
    }

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified,
     * the JAR file should specify a Main-Class in its manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param mainClass <p>
     *            The name of the main class in the specified Java file. If not
     *            specified, the JAR file should specify a Main-Class in its
     *            manifest file.
     *            </p>
     */
    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified,
     * the JAR file should specify a Main-Class in its manifest file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param mainClass <p>
     *            The name of the main class in the specified Java file. If not
     *            specified, the JAR file should specify a Main-Class in its
     *            manifest file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HadoopJarStepConfig withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * <p>
     * A list of command line arguments passed to the JAR file's main function
     * when executed.
     * </p>
     *
     * @return <p>
     *         A list of command line arguments passed to the JAR file's main
     *         function when executed.
     *         </p>
     */
    public java.util.List<String> getArgs() {
        return args;
    }

    /**
     * <p>
     * A list of command line arguments passed to the JAR file's main function
     * when executed.
     * </p>
     *
     * @param args <p>
     *            A list of command line arguments passed to the JAR file's main
     *            function when executed.
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
     * A list of command line arguments passed to the JAR file's main function
     * when executed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            A list of command line arguments passed to the JAR file's main
     *            function when executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HadoopJarStepConfig withArgs(String... args) {
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
     * A list of command line arguments passed to the JAR file's main function
     * when executed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            A list of command line arguments passed to the JAR file's main
     *            function when executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HadoopJarStepConfig withArgs(java.util.Collection<String> args) {
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
        if (getProperties() != null)
            sb.append("Properties: " + getProperties() + ",");
        if (getJar() != null)
            sb.append("Jar: " + getJar() + ",");
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

        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getJar() == null) ? 0 : getJar().hashCode());
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

        if (obj instanceof HadoopJarStepConfig == false)
            return false;
        HadoopJarStepConfig other = (HadoopJarStepConfig) obj;

        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null
                && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getJar() == null ^ this.getJar() == null)
            return false;
        if (other.getJar() != null && other.getJar().equals(this.getJar()) == false)
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
