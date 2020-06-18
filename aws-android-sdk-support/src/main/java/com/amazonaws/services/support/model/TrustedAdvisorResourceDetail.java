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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a resource identified by a Trusted Advisor check.
 * </p>
 */
public class TrustedAdvisorResourceDetail implements Serializable {
    /**
     * <p>
     * The status code for the resource identified in the Trusted Advisor check.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The AWS region in which the identified resource is located.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The unique identifier for the identified resource.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * Specifies whether the AWS resource was ignored by Trusted Advisor because
     * it was marked as suppressed by the user.
     * </p>
     */
    private Boolean isSuppressed;

    /**
     * <p>
     * Additional information about the identified resource. The exact metadata
     * and its order can be obtained by inspecting the
     * <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     * <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the
     * data that is shown in the Excel download, even in those cases where the
     * UI shows just summary data.
     * </p>
     */
    private java.util.List<String> metadata;

    /**
     * <p>
     * The status code for the resource identified in the Trusted Advisor check.
     * </p>
     *
     * @return <p>
     *         The status code for the resource identified in the Trusted
     *         Advisor check.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status code for the resource identified in the Trusted Advisor check.
     * </p>
     *
     * @param status <p>
     *            The status code for the resource identified in the Trusted
     *            Advisor check.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status code for the resource identified in the Trusted Advisor check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status code for the resource identified in the Trusted
     *            Advisor check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorResourceDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The AWS region in which the identified resource is located.
     * </p>
     *
     * @return <p>
     *         The AWS region in which the identified resource is located.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The AWS region in which the identified resource is located.
     * </p>
     *
     * @param region <p>
     *            The AWS region in which the identified resource is located.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS region in which the identified resource is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The AWS region in which the identified resource is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorResourceDetail withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the identified resource.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the identified resource.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The unique identifier for the identified resource.
     * </p>
     *
     * @param resourceId <p>
     *            The unique identifier for the identified resource.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The unique identifier for the identified resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            The unique identifier for the identified resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorResourceDetail withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * Specifies whether the AWS resource was ignored by Trusted Advisor because
     * it was marked as suppressed by the user.
     * </p>
     *
     * @return <p>
     *         Specifies whether the AWS resource was ignored by Trusted Advisor
     *         because it was marked as suppressed by the user.
     *         </p>
     */
    public Boolean isIsSuppressed() {
        return isSuppressed;
    }

    /**
     * <p>
     * Specifies whether the AWS resource was ignored by Trusted Advisor because
     * it was marked as suppressed by the user.
     * </p>
     *
     * @return <p>
     *         Specifies whether the AWS resource was ignored by Trusted Advisor
     *         because it was marked as suppressed by the user.
     *         </p>
     */
    public Boolean getIsSuppressed() {
        return isSuppressed;
    }

    /**
     * <p>
     * Specifies whether the AWS resource was ignored by Trusted Advisor because
     * it was marked as suppressed by the user.
     * </p>
     *
     * @param isSuppressed <p>
     *            Specifies whether the AWS resource was ignored by Trusted
     *            Advisor because it was marked as suppressed by the user.
     *            </p>
     */
    public void setIsSuppressed(Boolean isSuppressed) {
        this.isSuppressed = isSuppressed;
    }

    /**
     * <p>
     * Specifies whether the AWS resource was ignored by Trusted Advisor because
     * it was marked as suppressed by the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isSuppressed <p>
     *            Specifies whether the AWS resource was ignored by Trusted
     *            Advisor because it was marked as suppressed by the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorResourceDetail withIsSuppressed(Boolean isSuppressed) {
        this.isSuppressed = isSuppressed;
        return this;
    }

    /**
     * <p>
     * Additional information about the identified resource. The exact metadata
     * and its order can be obtained by inspecting the
     * <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     * <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the
     * data that is shown in the Excel download, even in those cases where the
     * UI shows just summary data.
     * </p>
     *
     * @return <p>
     *         Additional information about the identified resource. The exact
     *         metadata and its order can be obtained by inspecting the
     *         <a>TrustedAdvisorCheckDescription</a> object returned by the call
     *         to <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains
     *         all the data that is shown in the Excel download, even in those
     *         cases where the UI shows just summary data.
     *         </p>
     */
    public java.util.List<String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Additional information about the identified resource. The exact metadata
     * and its order can be obtained by inspecting the
     * <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     * <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the
     * data that is shown in the Excel download, even in those cases where the
     * UI shows just summary data.
     * </p>
     *
     * @param metadata <p>
     *            Additional information about the identified resource. The
     *            exact metadata and its order can be obtained by inspecting the
     *            <a>TrustedAdvisorCheckDescription</a> object returned by the
     *            call to <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b>
     *            contains all the data that is shown in the Excel download,
     *            even in those cases where the UI shows just summary data.
     *            </p>
     */
    public void setMetadata(java.util.Collection<String> metadata) {
        if (metadata == null) {
            this.metadata = null;
            return;
        }

        this.metadata = new java.util.ArrayList<String>(metadata);
    }

    /**
     * <p>
     * Additional information about the identified resource. The exact metadata
     * and its order can be obtained by inspecting the
     * <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     * <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the
     * data that is shown in the Excel download, even in those cases where the
     * UI shows just summary data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            Additional information about the identified resource. The
     *            exact metadata and its order can be obtained by inspecting the
     *            <a>TrustedAdvisorCheckDescription</a> object returned by the
     *            call to <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b>
     *            contains all the data that is shown in the Excel download,
     *            even in those cases where the UI shows just summary data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorResourceDetail withMetadata(String... metadata) {
        if (getMetadata() == null) {
            this.metadata = new java.util.ArrayList<String>(metadata.length);
        }
        for (String value : metadata) {
            this.metadata.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Additional information about the identified resource. The exact metadata
     * and its order can be obtained by inspecting the
     * <a>TrustedAdvisorCheckDescription</a> object returned by the call to
     * <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b> contains all the
     * data that is shown in the Excel download, even in those cases where the
     * UI shows just summary data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            Additional information about the identified resource. The
     *            exact metadata and its order can be obtained by inspecting the
     *            <a>TrustedAdvisorCheckDescription</a> object returned by the
     *            call to <a>DescribeTrustedAdvisorChecks</a>. <b>Metadata</b>
     *            contains all the data that is shown in the Excel download,
     *            even in those cases where the UI shows just summary data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedAdvisorResourceDetail withMetadata(java.util.Collection<String> metadata) {
        setMetadata(metadata);
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
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getRegion() != null)
            sb.append("region: " + getRegion() + ",");
        if (getResourceId() != null)
            sb.append("resourceId: " + getResourceId() + ",");
        if (getIsSuppressed() != null)
            sb.append("isSuppressed: " + getIsSuppressed() + ",");
        if (getMetadata() != null)
            sb.append("metadata: " + getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getIsSuppressed() == null) ? 0 : getIsSuppressed().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorResourceDetail == false)
            return false;
        TrustedAdvisorResourceDetail other = (TrustedAdvisorResourceDetail) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getIsSuppressed() == null ^ this.getIsSuppressed() == null)
            return false;
        if (other.getIsSuppressed() != null
                && other.getIsSuppressed().equals(this.getIsSuppressed()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }
}
