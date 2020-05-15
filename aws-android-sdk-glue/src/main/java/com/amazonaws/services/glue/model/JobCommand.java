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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies code executed when a job is run.
 * </p>
 */
public class JobCommand implements Serializable {
    /**
     * <p>
     * The name of the job command. For an Apache Spark ETL job, this must be
     * <code>glueetl</code>. For a Python shell job, it must be
     * <code>pythonshell</code>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script
     * that executes a job.
     * </p>
     */
    private String scriptLocation;

    /**
     * <p>
     * The Python version being used to execute a Python shell job. Allowed
     * values are 2 or 3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[2-3]$<br/>
     */
    private String pythonVersion;

    /**
     * <p>
     * The name of the job command. For an Apache Spark ETL job, this must be
     * <code>glueetl</code>. For a Python shell job, it must be
     * <code>pythonshell</code>.
     * </p>
     *
     * @return <p>
     *         The name of the job command. For an Apache Spark ETL job, this
     *         must be <code>glueetl</code>. For a Python shell job, it must be
     *         <code>pythonshell</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the job command. For an Apache Spark ETL job, this must be
     * <code>glueetl</code>. For a Python shell job, it must be
     * <code>pythonshell</code>.
     * </p>
     *
     * @param name <p>
     *            The name of the job command. For an Apache Spark ETL job, this
     *            must be <code>glueetl</code>. For a Python shell job, it must
     *            be <code>pythonshell</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the job command. For an Apache Spark ETL job, this must be
     * <code>glueetl</code>. For a Python shell job, it must be
     * <code>pythonshell</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the job command. For an Apache Spark ETL job, this
     *            must be <code>glueetl</code>. For a Python shell job, it must
     *            be <code>pythonshell</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobCommand withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script
     * that executes a job.
     * </p>
     *
     * @return <p>
     *         Specifies the Amazon Simple Storage Service (Amazon S3) path to a
     *         script that executes a job.
     *         </p>
     */
    public String getScriptLocation() {
        return scriptLocation;
    }

    /**
     * <p>
     * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script
     * that executes a job.
     * </p>
     *
     * @param scriptLocation <p>
     *            Specifies the Amazon Simple Storage Service (Amazon S3) path
     *            to a script that executes a job.
     *            </p>
     */
    public void setScriptLocation(String scriptLocation) {
        this.scriptLocation = scriptLocation;
    }

    /**
     * <p>
     * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script
     * that executes a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scriptLocation <p>
     *            Specifies the Amazon Simple Storage Service (Amazon S3) path
     *            to a script that executes a job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobCommand withScriptLocation(String scriptLocation) {
        this.scriptLocation = scriptLocation;
        return this;
    }

    /**
     * <p>
     * The Python version being used to execute a Python shell job. Allowed
     * values are 2 or 3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[2-3]$<br/>
     *
     * @return <p>
     *         The Python version being used to execute a Python shell job.
     *         Allowed values are 2 or 3.
     *         </p>
     */
    public String getPythonVersion() {
        return pythonVersion;
    }

    /**
     * <p>
     * The Python version being used to execute a Python shell job. Allowed
     * values are 2 or 3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[2-3]$<br/>
     *
     * @param pythonVersion <p>
     *            The Python version being used to execute a Python shell job.
     *            Allowed values are 2 or 3.
     *            </p>
     */
    public void setPythonVersion(String pythonVersion) {
        this.pythonVersion = pythonVersion;
    }

    /**
     * <p>
     * The Python version being used to execute a Python shell job. Allowed
     * values are 2 or 3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[2-3]$<br/>
     *
     * @param pythonVersion <p>
     *            The Python version being used to execute a Python shell job.
     *            Allowed values are 2 or 3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobCommand withPythonVersion(String pythonVersion) {
        this.pythonVersion = pythonVersion;
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
        if (getScriptLocation() != null)
            sb.append("ScriptLocation: " + getScriptLocation() + ",");
        if (getPythonVersion() != null)
            sb.append("PythonVersion: " + getPythonVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getScriptLocation() == null) ? 0 : getScriptLocation().hashCode());
        hashCode = prime * hashCode
                + ((getPythonVersion() == null) ? 0 : getPythonVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobCommand == false)
            return false;
        JobCommand other = (JobCommand) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScriptLocation() == null ^ this.getScriptLocation() == null)
            return false;
        if (other.getScriptLocation() != null
                && other.getScriptLocation().equals(this.getScriptLocation()) == false)
            return false;
        if (other.getPythonVersion() == null ^ this.getPythonVersion() == null)
            return false;
        if (other.getPythonVersion() != null
                && other.getPythonVersion().equals(this.getPythonVersion()) == false)
            return false;
        return true;
    }
}
