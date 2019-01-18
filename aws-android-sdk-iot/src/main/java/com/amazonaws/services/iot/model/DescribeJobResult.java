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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class DescribeJobResult implements Serializable {
    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     */
    private String documentSource;

    /**
     * <p>
     * Information about the job.
     * </p>
     */
    private Job job;

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @return <p>
     *         An S3 link to the job document.
     *         </p>
     */
    public String getDocumentSource() {
        return documentSource;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param documentSource <p>
     *            An S3 link to the job document.
     *            </p>
     */
    public void setDocumentSource(String documentSource) {
        this.documentSource = documentSource;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param documentSource <p>
     *            An S3 link to the job document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobResult withDocumentSource(String documentSource) {
        this.documentSource = documentSource;
        return this;
    }

    /**
     * <p>
     * Information about the job.
     * </p>
     *
     * @return <p>
     *         Information about the job.
     *         </p>
     */
    public Job getJob() {
        return job;
    }

    /**
     * <p>
     * Information about the job.
     * </p>
     *
     * @param job <p>
     *            Information about the job.
     *            </p>
     */
    public void setJob(Job job) {
        this.job = job;
    }

    /**
     * <p>
     * Information about the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param job <p>
     *            Information about the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobResult withJob(Job job) {
        this.job = job;
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
        if (getDocumentSource() != null)
            sb.append("documentSource: " + getDocumentSource() + ",");
        if (getJob() != null)
            sb.append("job: " + getJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentSource() == null) ? 0 : getDocumentSource().hashCode());
        hashCode = prime * hashCode + ((getJob() == null) ? 0 : getJob().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobResult == false)
            return false;
        DescribeJobResult other = (DescribeJobResult) obj;

        if (other.getDocumentSource() == null ^ this.getDocumentSource() == null)
            return false;
        if (other.getDocumentSource() != null
                && other.getDocumentSource().equals(this.getDocumentSource()) == false)
            return false;
        if (other.getJob() == null ^ this.getJob() == null)
            return false;
        if (other.getJob() != null && other.getJob().equals(this.getJob()) == false)
            return false;
        return true;
    }
}
