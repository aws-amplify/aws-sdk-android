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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p>If this job failed, this element indicates why the job failed.</p>
 */
public class JobFailure implements Serializable {
    /**
     * <p>The failure code, if any, for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String failureCode;

    /**
     * <p>The failure reason, if any, for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String failureReason;

    /**
     * <p>The failure code, if any, for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>The failure code, if any, for the specified job.</p>
     */
    public String getFailureCode() {
        return failureCode;
    }

    /**
     * <p>The failure code, if any, for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param failureCode <p>The failure code, if any, for the specified job.</p>
     */
    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>The failure code, if any, for the specified job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param failureCode <p>The failure code, if any, for the specified job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobFailure withFailureCode(String failureCode) {
        this.failureCode = failureCode;
        return this;
    }

    /**
     * <p>The failure reason, if any, for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>The failure reason, if any, for the specified job.</p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>The failure reason, if any, for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param failureReason <p>The failure reason, if any, for the specified job.</p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>The failure reason, if any, for the specified job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param failureReason <p>The failure reason, if any, for the specified job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobFailure withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFailureCode() != null) sb.append("FailureCode: " + getFailureCode() + ",");
        if (getFailureReason() != null) sb.append("FailureReason: " + getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobFailure == false) return false;
        JobFailure other = (JobFailure)obj;

        if (other.getFailureCode() == null ^ this.getFailureCode() == null) return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false) return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null) return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false) return false;
        return true;
    }
}
