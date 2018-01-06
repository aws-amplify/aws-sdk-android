/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class ExportTaskStatus implements Serializable {
    /**
     * <p>
     * The status code of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCELLED, COMPLETED, FAILED, PENDING,
     * PENDING_CANCEL, RUNNING
     */
    private String code;

    /**
     * <p>
     * The status message related to the status code.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status code of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCELLED, COMPLETED, FAILED, PENDING,
     * PENDING_CANCEL, RUNNING
     *
     * @return <p>
     *         The status code of the export task.
     *         </p>
     * @see ExportTaskStatusCode
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The status code of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCELLED, COMPLETED, FAILED, PENDING,
     * PENDING_CANCEL, RUNNING
     *
     * @param code <p>
     *            The status code of the export task.
     *            </p>
     * @see ExportTaskStatusCode
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The status code of the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCELLED, COMPLETED, FAILED, PENDING,
     * PENDING_CANCEL, RUNNING
     *
     * @param code <p>
     *            The status code of the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportTaskStatusCode
     */
    public ExportTaskStatus withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The status code of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCELLED, COMPLETED, FAILED, PENDING,
     * PENDING_CANCEL, RUNNING
     *
     * @param code <p>
     *            The status code of the export task.
     *            </p>
     * @see ExportTaskStatusCode
     */
    public void setCode(ExportTaskStatusCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * The status code of the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCELLED, COMPLETED, FAILED, PENDING,
     * PENDING_CANCEL, RUNNING
     *
     * @param code <p>
     *            The status code of the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportTaskStatusCode
     */
    public ExportTaskStatus withCode(ExportTaskStatusCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * The status message related to the status code.
     * </p>
     *
     * @return <p>
     *         The status message related to the status code.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The status message related to the status code.
     * </p>
     *
     * @param message <p>
     *            The status message related to the status code.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The status message related to the status code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The status message related to the status code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTaskStatus withMessage(String message) {
        this.message = message;
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
        if (getCode() != null)
            sb.append("code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTaskStatus == false)
            return false;
        ExportTaskStatus other = (ExportTaskStatus) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
