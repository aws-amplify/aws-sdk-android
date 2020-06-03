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

public class StartMLLabelingSetGenerationTaskRunResult implements Serializable {
    /**
     * <p>
     * The unique run identifier that is associated with this task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String taskRunId;

    /**
     * <p>
     * The unique run identifier that is associated with this task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique run identifier that is associated with this task run.
     *         </p>
     */
    public String getTaskRunId() {
        return taskRunId;
    }

    /**
     * <p>
     * The unique run identifier that is associated with this task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param taskRunId <p>
     *            The unique run identifier that is associated with this task
     *            run.
     *            </p>
     */
    public void setTaskRunId(String taskRunId) {
        this.taskRunId = taskRunId;
    }

    /**
     * <p>
     * The unique run identifier that is associated with this task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param taskRunId <p>
     *            The unique run identifier that is associated with this task
     *            run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMLLabelingSetGenerationTaskRunResult withTaskRunId(String taskRunId) {
        this.taskRunId = taskRunId;
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
        if (getTaskRunId() != null)
            sb.append("TaskRunId: " + getTaskRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskRunId() == null) ? 0 : getTaskRunId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMLLabelingSetGenerationTaskRunResult == false)
            return false;
        StartMLLabelingSetGenerationTaskRunResult other = (StartMLLabelingSetGenerationTaskRunResult) obj;

        if (other.getTaskRunId() == null ^ this.getTaskRunId() == null)
            return false;
        if (other.getTaskRunId() != null
                && other.getTaskRunId().equals(this.getTaskRunId()) == false)
            return false;
        return true;
    }
}
