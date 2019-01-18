/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the status of an export task.
 * </p>
 */
public class ExportTaskExecutionInfo implements Serializable {
    /**
     * <p>
     * The creation time of the export task, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long creationTime;

    /**
     * <p>
     * The completion time of the export task, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long completionTime;

    /**
     * <p>
     * The creation time of the export task, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The creation time of the export task, expressed as the number of
     *         milliseconds after Jan 1, 1970 00:00:00 UTC.
     *         </p>
     */
    public Long getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation time of the export task, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime <p>
     *            The creation time of the export task, expressed as the number
     *            of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the export task, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime <p>
     *            The creation time of the export task, expressed as the number
     *            of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTaskExecutionInfo withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The completion time of the export task, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The completion time of the export task, expressed as the number
     *         of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *         </p>
     */
    public Long getCompletionTime() {
        return completionTime;
    }

    /**
     * <p>
     * The completion time of the export task, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param completionTime <p>
     *            The completion time of the export task, expressed as the
     *            number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     */
    public void setCompletionTime(Long completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The completion time of the export task, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param completionTime <p>
     *            The completion time of the export task, expressed as the
     *            number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTaskExecutionInfo withCompletionTime(Long completionTime) {
        this.completionTime = completionTime;
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
        if (getCreationTime() != null)
            sb.append("creationTime: " + getCreationTime() + ",");
        if (getCompletionTime() != null)
            sb.append("completionTime: " + getCompletionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTaskExecutionInfo == false)
            return false;
        ExportTaskExecutionInfo other = (ExportTaskExecutionInfo) obj;

        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null
                && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        return true;
    }
}
