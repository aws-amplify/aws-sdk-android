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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Defines the default patch baseline for the relevant operating system.
 * </p>
 * <p>
 * To reset the AWS predefined patch baseline as the default, specify the full
 * patch baseline ARN as the baseline ID value. For example, for CentOS, specify
 * <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed</code>
 * instead of <code>pb-0574b43a65ea646ed</code>.
 * </p>
 */
public class RegisterDefaultPatchBaselineRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the patch baseline that should be the default patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     */
    private String baselineId;

    /**
     * <p>
     * The ID of the patch baseline that should be the default patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     *
     * @return <p>
     *         The ID of the patch baseline that should be the default patch
     *         baseline.
     *         </p>
     */
    public String getBaselineId() {
        return baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline that should be the default patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     *
     * @param baselineId <p>
     *            The ID of the patch baseline that should be the default patch
     *            baseline.
     *            </p>
     */
    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline that should be the default patch baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-:/]{20,128}$<br/>
     *
     * @param baselineId <p>
     *            The ID of the patch baseline that should be the default patch
     *            baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDefaultPatchBaselineRequest withBaselineId(String baselineId) {
        this.baselineId = baselineId;
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
        if (getBaselineId() != null)
            sb.append("BaselineId: " + getBaselineId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterDefaultPatchBaselineRequest == false)
            return false;
        RegisterDefaultPatchBaselineRequest other = (RegisterDefaultPatchBaselineRequest) obj;

        if (other.getBaselineId() == null ^ this.getBaselineId() == null)
            return false;
        if (other.getBaselineId() != null
                && other.getBaselineId().equals(this.getBaselineId()) == false)
            return false;
        return true;
    }
}
