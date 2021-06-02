/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * An object that contains information about the job template.
 * </p>
 */
public class JobTemplateSummary implements Serializable {
    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     */
    private String jobTemplateArn;

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String jobTemplateId;

    /**
     * <p>
     * A description of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String description;

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @return <p>
     *         The ARN of the job template.
     *         </p>
     */
    public String getJobTemplateArn() {
        return jobTemplateArn;
    }

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @param jobTemplateArn <p>
     *            The ARN of the job template.
     *            </p>
     */
    public void setJobTemplateArn(String jobTemplateArn) {
        this.jobTemplateArn = jobTemplateArn;
    }

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @param jobTemplateArn <p>
     *            The ARN of the job template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSummary withJobTemplateArn(String jobTemplateArn) {
        this.jobTemplateArn = jobTemplateArn;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The unique identifier of the job template.
     *         </p>
     */
    public String getJobTemplateId() {
        return jobTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobTemplateId <p>
     *            The unique identifier of the job template.
     *            </p>
     */
    public void setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobTemplateId <p>
     *            The unique identifier of the job template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSummary withJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
        return this;
    }

    /**
     * <p>
     * A description of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         A description of the job template.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A description of the job template.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the job template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A description of the job template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     *
     * @return <p>
     *         The time, in seconds since the epoch, when the job template was
     *         created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     *
     * @param createdAt <p>
     *            The time, in seconds since the epoch, when the job template
     *            was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time, in seconds since the epoch, when the job template
     *            was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSummary withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
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
        if (getJobTemplateArn() != null)
            sb.append("jobTemplateArn: " + getJobTemplateArn() + ",");
        if (getJobTemplateId() != null)
            sb.append("jobTemplateId: " + getJobTemplateId() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobTemplateArn() == null) ? 0 : getJobTemplateArn().hashCode());
        hashCode = prime * hashCode
                + ((getJobTemplateId() == null) ? 0 : getJobTemplateId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobTemplateSummary == false)
            return false;
        JobTemplateSummary other = (JobTemplateSummary) obj;

        if (other.getJobTemplateArn() == null ^ this.getJobTemplateArn() == null)
            return false;
        if (other.getJobTemplateArn() != null
                && other.getJobTemplateArn().equals(this.getJobTemplateArn()) == false)
            return false;
        if (other.getJobTemplateId() == null ^ this.getJobTemplateId() == null)
            return false;
        if (other.getJobTemplateId() != null
                && other.getJobTemplateId().equals(this.getJobTemplateId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }
}
