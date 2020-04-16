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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Stops a model compilation job.
 * </p>
 * <p>
 * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This
 * gracefully shuts the job down. If the job hasn't stopped, it sends the
 * SIGKILL signal.
 * </p>
 * <p>
 * When it receives a <code>StopCompilationJob</code> request, Amazon SageMaker
 * changes the <a>CompilationJobSummary$CompilationJobStatus</a> of the job to
 * <code>Stopping</code>. After Amazon SageMaker stops the job, it sets the
 * <a>CompilationJobSummary$CompilationJobStatus</a> to <code>Stopped</code>.
 * </p>
 */
public class StopCompilationJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the model compilation job to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String compilationJobName;

    /**
     * <p>
     * The name of the model compilation job to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the model compilation job to stop.
     *         </p>
     */
    public String getCompilationJobName() {
        return compilationJobName;
    }

    /**
     * <p>
     * The name of the model compilation job to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param compilationJobName <p>
     *            The name of the model compilation job to stop.
     *            </p>
     */
    public void setCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
    }

    /**
     * <p>
     * The name of the model compilation job to stop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param compilationJobName <p>
     *            The name of the model compilation job to stop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopCompilationJobRequest withCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
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
        if (getCompilationJobName() != null)
            sb.append("CompilationJobName: " + getCompilationJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCompilationJobName() == null) ? 0 : getCompilationJobName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopCompilationJobRequest == false)
            return false;
        StopCompilationJobRequest other = (StopCompilationJobRequest) obj;

        if (other.getCompilationJobName() == null ^ this.getCompilationJobName() == null)
            return false;
        if (other.getCompilationJobName() != null
                && other.getCompilationJobName().equals(this.getCompilationJobName()) == false)
            return false;
        return true;
    }
}
