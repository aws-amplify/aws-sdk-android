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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

/**
 * <p>
 * The source of the finding. This indicates how the access that generated the
 * finding is granted. It is populated for Amazon S3 bucket findings.
 * </p>
 */
public class FindingSource implements Serializable {
    /**
     * <p>
     * Includes details about how the access that generated the finding is
     * granted. This is populated for Amazon S3 bucket findings.
     * </p>
     */
    private FindingSourceDetail detail;

    /**
     * <p>
     * Indicates the type of access that generated the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUCKET_ACL, POLICY, S3_ACCESS_POINT
     */
    private String type;

    /**
     * <p>
     * Includes details about how the access that generated the finding is
     * granted. This is populated for Amazon S3 bucket findings.
     * </p>
     *
     * @return <p>
     *         Includes details about how the access that generated the finding
     *         is granted. This is populated for Amazon S3 bucket findings.
     *         </p>
     */
    public FindingSourceDetail getDetail() {
        return detail;
    }

    /**
     * <p>
     * Includes details about how the access that generated the finding is
     * granted. This is populated for Amazon S3 bucket findings.
     * </p>
     *
     * @param detail <p>
     *            Includes details about how the access that generated the
     *            finding is granted. This is populated for Amazon S3 bucket
     *            findings.
     *            </p>
     */
    public void setDetail(FindingSourceDetail detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * Includes details about how the access that generated the finding is
     * granted. This is populated for Amazon S3 bucket findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detail <p>
     *            Includes details about how the access that generated the
     *            finding is granted. This is populated for Amazon S3 bucket
     *            findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSource withDetail(FindingSourceDetail detail) {
        this.detail = detail;
        return this;
    }

    /**
     * <p>
     * Indicates the type of access that generated the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUCKET_ACL, POLICY, S3_ACCESS_POINT
     *
     * @return <p>
     *         Indicates the type of access that generated the finding.
     *         </p>
     * @see FindingSourceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Indicates the type of access that generated the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUCKET_ACL, POLICY, S3_ACCESS_POINT
     *
     * @param type <p>
     *            Indicates the type of access that generated the finding.
     *            </p>
     * @see FindingSourceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates the type of access that generated the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUCKET_ACL, POLICY, S3_ACCESS_POINT
     *
     * @param type <p>
     *            Indicates the type of access that generated the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingSourceType
     */
    public FindingSource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Indicates the type of access that generated the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUCKET_ACL, POLICY, S3_ACCESS_POINT
     *
     * @param type <p>
     *            Indicates the type of access that generated the finding.
     *            </p>
     * @see FindingSourceType
     */
    public void setType(FindingSourceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Indicates the type of access that generated the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUCKET_ACL, POLICY, S3_ACCESS_POINT
     *
     * @param type <p>
     *            Indicates the type of access that generated the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingSourceType
     */
    public FindingSource withType(FindingSourceType type) {
        this.type = type.toString();
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
        if (getDetail() != null)
            sb.append("detail: " + getDetail() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingSource == false)
            return false;
        FindingSource other = (FindingSource) obj;

        if (other.getDetail() == null ^ this.getDetail() == null)
            return false;
        if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
