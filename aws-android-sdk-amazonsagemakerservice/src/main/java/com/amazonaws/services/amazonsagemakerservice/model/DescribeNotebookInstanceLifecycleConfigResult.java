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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class DescribeNotebookInstanceLifecycleConfigResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String notebookInstanceLifecycleConfigArn;

    /**
     * <p>
     * The name of the lifecycle configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String notebookInstanceLifecycleConfigName;

    /**
     * <p>
     * The shell script that runs only once, when you create a notebook
     * instance.
     * </p>
     */
    private java.util.List<NotebookInstanceLifecycleHook> onCreate;

    /**
     * <p>
     * The shell script that runs every time you start a notebook instance,
     * including when you create the notebook instance.
     * </p>
     */
    private java.util.List<NotebookInstanceLifecycleHook> onStart;

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was last
     * modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the lifecycle configuration.
     *         </p>
     */
    public String getNotebookInstanceLifecycleConfigArn() {
        return notebookInstanceLifecycleConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param notebookInstanceLifecycleConfigArn <p>
     *            The Amazon Resource Name (ARN) of the lifecycle configuration.
     *            </p>
     */
    public void setNotebookInstanceLifecycleConfigArn(String notebookInstanceLifecycleConfigArn) {
        this.notebookInstanceLifecycleConfigArn = notebookInstanceLifecycleConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param notebookInstanceLifecycleConfigArn <p>
     *            The Amazon Resource Name (ARN) of the lifecycle configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceLifecycleConfigResult withNotebookInstanceLifecycleConfigArn(
            String notebookInstanceLifecycleConfigArn) {
        this.notebookInstanceLifecycleConfigArn = notebookInstanceLifecycleConfigArn;
        return this;
    }

    /**
     * <p>
     * The name of the lifecycle configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the lifecycle configuration.
     *         </p>
     */
    public String getNotebookInstanceLifecycleConfigName() {
        return notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * The name of the lifecycle configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceLifecycleConfigName <p>
     *            The name of the lifecycle configuration.
     *            </p>
     */
    public void setNotebookInstanceLifecycleConfigName(String notebookInstanceLifecycleConfigName) {
        this.notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * The name of the lifecycle configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceLifecycleConfigName <p>
     *            The name of the lifecycle configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceLifecycleConfigResult withNotebookInstanceLifecycleConfigName(
            String notebookInstanceLifecycleConfigName) {
        this.notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigName;
        return this;
    }

    /**
     * <p>
     * The shell script that runs only once, when you create a notebook
     * instance.
     * </p>
     *
     * @return <p>
     *         The shell script that runs only once, when you create a notebook
     *         instance.
     *         </p>
     */
    public java.util.List<NotebookInstanceLifecycleHook> getOnCreate() {
        return onCreate;
    }

    /**
     * <p>
     * The shell script that runs only once, when you create a notebook
     * instance.
     * </p>
     *
     * @param onCreate <p>
     *            The shell script that runs only once, when you create a
     *            notebook instance.
     *            </p>
     */
    public void setOnCreate(java.util.Collection<NotebookInstanceLifecycleHook> onCreate) {
        if (onCreate == null) {
            this.onCreate = null;
            return;
        }

        this.onCreate = new java.util.ArrayList<NotebookInstanceLifecycleHook>(onCreate);
    }

    /**
     * <p>
     * The shell script that runs only once, when you create a notebook
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onCreate <p>
     *            The shell script that runs only once, when you create a
     *            notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceLifecycleConfigResult withOnCreate(
            NotebookInstanceLifecycleHook... onCreate) {
        if (getOnCreate() == null) {
            this.onCreate = new java.util.ArrayList<NotebookInstanceLifecycleHook>(onCreate.length);
        }
        for (NotebookInstanceLifecycleHook value : onCreate) {
            this.onCreate.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The shell script that runs only once, when you create a notebook
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onCreate <p>
     *            The shell script that runs only once, when you create a
     *            notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceLifecycleConfigResult withOnCreate(
            java.util.Collection<NotebookInstanceLifecycleHook> onCreate) {
        setOnCreate(onCreate);
        return this;
    }

    /**
     * <p>
     * The shell script that runs every time you start a notebook instance,
     * including when you create the notebook instance.
     * </p>
     *
     * @return <p>
     *         The shell script that runs every time you start a notebook
     *         instance, including when you create the notebook instance.
     *         </p>
     */
    public java.util.List<NotebookInstanceLifecycleHook> getOnStart() {
        return onStart;
    }

    /**
     * <p>
     * The shell script that runs every time you start a notebook instance,
     * including when you create the notebook instance.
     * </p>
     *
     * @param onStart <p>
     *            The shell script that runs every time you start a notebook
     *            instance, including when you create the notebook instance.
     *            </p>
     */
    public void setOnStart(java.util.Collection<NotebookInstanceLifecycleHook> onStart) {
        if (onStart == null) {
            this.onStart = null;
            return;
        }

        this.onStart = new java.util.ArrayList<NotebookInstanceLifecycleHook>(onStart);
    }

    /**
     * <p>
     * The shell script that runs every time you start a notebook instance,
     * including when you create the notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onStart <p>
     *            The shell script that runs every time you start a notebook
     *            instance, including when you create the notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceLifecycleConfigResult withOnStart(
            NotebookInstanceLifecycleHook... onStart) {
        if (getOnStart() == null) {
            this.onStart = new java.util.ArrayList<NotebookInstanceLifecycleHook>(onStart.length);
        }
        for (NotebookInstanceLifecycleHook value : onStart) {
            this.onStart.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The shell script that runs every time you start a notebook instance,
     * including when you create the notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onStart <p>
     *            The shell script that runs every time you start a notebook
     *            instance, including when you create the notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceLifecycleConfigResult withOnStart(
            java.util.Collection<NotebookInstanceLifecycleHook> onStart) {
        setOnStart(onStart);
        return this;
    }

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was last
     * modified.
     * </p>
     *
     * @return <p>
     *         A timestamp that tells when the lifecycle configuration was last
     *         modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was last
     * modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            A timestamp that tells when the lifecycle configuration was
     *            last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was last
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            A timestamp that tells when the lifecycle configuration was
     *            last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceLifecycleConfigResult withLastModifiedTime(
            java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that tells when the lifecycle configuration was
     *         created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that tells when the lifecycle configuration was
     *            created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that tells when the lifecycle configuration was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that tells when the lifecycle configuration was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotebookInstanceLifecycleConfigResult withCreationTime(
            java.util.Date creationTime) {
        this.creationTime = creationTime;
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
        if (getNotebookInstanceLifecycleConfigArn() != null)
            sb.append("NotebookInstanceLifecycleConfigArn: "
                    + getNotebookInstanceLifecycleConfigArn() + ",");
        if (getNotebookInstanceLifecycleConfigName() != null)
            sb.append("NotebookInstanceLifecycleConfigName: "
                    + getNotebookInstanceLifecycleConfigName() + ",");
        if (getOnCreate() != null)
            sb.append("OnCreate: " + getOnCreate() + ",");
        if (getOnStart() != null)
            sb.append("OnStart: " + getOnStart() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNotebookInstanceLifecycleConfigArn() == null) ? 0
                        : getNotebookInstanceLifecycleConfigArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotebookInstanceLifecycleConfigName() == null) ? 0
                        : getNotebookInstanceLifecycleConfigName().hashCode());
        hashCode = prime * hashCode + ((getOnCreate() == null) ? 0 : getOnCreate().hashCode());
        hashCode = prime * hashCode + ((getOnStart() == null) ? 0 : getOnStart().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNotebookInstanceLifecycleConfigResult == false)
            return false;
        DescribeNotebookInstanceLifecycleConfigResult other = (DescribeNotebookInstanceLifecycleConfigResult) obj;

        if (other.getNotebookInstanceLifecycleConfigArn() == null
                ^ this.getNotebookInstanceLifecycleConfigArn() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigArn() != null
                && other.getNotebookInstanceLifecycleConfigArn().equals(
                        this.getNotebookInstanceLifecycleConfigArn()) == false)
            return false;
        if (other.getNotebookInstanceLifecycleConfigName() == null
                ^ this.getNotebookInstanceLifecycleConfigName() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigName() != null
                && other.getNotebookInstanceLifecycleConfigName().equals(
                        this.getNotebookInstanceLifecycleConfigName()) == false)
            return false;
        if (other.getOnCreate() == null ^ this.getOnCreate() == null)
            return false;
        if (other.getOnCreate() != null && other.getOnCreate().equals(this.getOnCreate()) == false)
            return false;
        if (other.getOnStart() == null ^ this.getOnStart() == null)
            return false;
        if (other.getOnStart() != null && other.getOnStart().equals(this.getOnStart()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }
}
