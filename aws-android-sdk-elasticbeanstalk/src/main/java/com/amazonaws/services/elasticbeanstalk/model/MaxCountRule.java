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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * A lifecycle rule that deletes the oldest application version when the maximum
 * count is exceeded.
 * </p>
 */
public class MaxCountRule implements Serializable {
    /**
     * <p>
     * Specify <code>true</code> to apply the rule, or <code>false</code> to
     * disable it.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Specify the maximum number of application versions to retain.
     * </p>
     */
    private Integer maxCount;

    /**
     * <p>
     * Set to <code>true</code> to delete a version's source bundle from Amazon
     * S3 when Elastic Beanstalk deletes the application version.
     * </p>
     */
    private Boolean deleteSourceFromS3;

    /**
     * <p>
     * Specify <code>true</code> to apply the rule, or <code>false</code> to
     * disable it.
     * </p>
     *
     * @return <p>
     *         Specify <code>true</code> to apply the rule, or
     *         <code>false</code> to disable it.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specify <code>true</code> to apply the rule, or <code>false</code> to
     * disable it.
     * </p>
     *
     * @return <p>
     *         Specify <code>true</code> to apply the rule, or
     *         <code>false</code> to disable it.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specify <code>true</code> to apply the rule, or <code>false</code> to
     * disable it.
     * </p>
     *
     * @param enabled <p>
     *            Specify <code>true</code> to apply the rule, or
     *            <code>false</code> to disable it.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specify <code>true</code> to apply the rule, or <code>false</code> to
     * disable it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specify <code>true</code> to apply the rule, or
     *            <code>false</code> to disable it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaxCountRule withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * Specify the maximum number of application versions to retain.
     * </p>
     *
     * @return <p>
     *         Specify the maximum number of application versions to retain.
     *         </p>
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * <p>
     * Specify the maximum number of application versions to retain.
     * </p>
     *
     * @param maxCount <p>
     *            Specify the maximum number of application versions to retain.
     *            </p>
     */
    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * <p>
     * Specify the maximum number of application versions to retain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxCount <p>
     *            Specify the maximum number of application versions to retain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaxCountRule withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete a version's source bundle from Amazon
     * S3 when Elastic Beanstalk deletes the application version.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to delete a version's source bundle from
     *         Amazon S3 when Elastic Beanstalk deletes the application version.
     *         </p>
     */
    public Boolean isDeleteSourceFromS3() {
        return deleteSourceFromS3;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete a version's source bundle from Amazon
     * S3 when Elastic Beanstalk deletes the application version.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to delete a version's source bundle from
     *         Amazon S3 when Elastic Beanstalk deletes the application version.
     *         </p>
     */
    public Boolean getDeleteSourceFromS3() {
        return deleteSourceFromS3;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete a version's source bundle from Amazon
     * S3 when Elastic Beanstalk deletes the application version.
     * </p>
     *
     * @param deleteSourceFromS3 <p>
     *            Set to <code>true</code> to delete a version's source bundle
     *            from Amazon S3 when Elastic Beanstalk deletes the application
     *            version.
     *            </p>
     */
    public void setDeleteSourceFromS3(Boolean deleteSourceFromS3) {
        this.deleteSourceFromS3 = deleteSourceFromS3;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete a version's source bundle from Amazon
     * S3 when Elastic Beanstalk deletes the application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteSourceFromS3 <p>
     *            Set to <code>true</code> to delete a version's source bundle
     *            from Amazon S3 when Elastic Beanstalk deletes the application
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaxCountRule withDeleteSourceFromS3(Boolean deleteSourceFromS3) {
        this.deleteSourceFromS3 = deleteSourceFromS3;
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getMaxCount() != null)
            sb.append("MaxCount: " + getMaxCount() + ",");
        if (getDeleteSourceFromS3() != null)
            sb.append("DeleteSourceFromS3: " + getDeleteSourceFromS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getMaxCount() == null) ? 0 : getMaxCount().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteSourceFromS3() == null) ? 0 : getDeleteSourceFromS3().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaxCountRule == false)
            return false;
        MaxCountRule other = (MaxCountRule) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getMaxCount() == null ^ this.getMaxCount() == null)
            return false;
        if (other.getMaxCount() != null && other.getMaxCount().equals(this.getMaxCount()) == false)
            return false;
        if (other.getDeleteSourceFromS3() == null ^ this.getDeleteSourceFromS3() == null)
            return false;
        if (other.getDeleteSourceFromS3() != null
                && other.getDeleteSourceFromS3().equals(this.getDeleteSourceFromS3()) == false)
            return false;
        return true;
    }
}
