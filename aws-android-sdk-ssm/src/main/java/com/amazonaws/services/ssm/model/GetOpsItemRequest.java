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
 * Get information about an OpsItem by using the ID. You must have permission in
 * AWS Identity and Access Management (IAM) to view information about an
 * OpsItem. For more information, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
 * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
 * Guide</i>.
 * </p>
 * <p>
 * Operations engineers and IT professionals use OpsCenter to view, investigate,
 * and remediate operational issues impacting the performance and health of
 * their AWS resources. For more information, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
 * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
 * Guide</i>.
 * </p>
 */
public class GetOpsItemRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the OpsItem that you want to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     */
    private String opsItemId;

    /**
     * <p>
     * The ID of the OpsItem that you want to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the OpsItem that you want to get.
     *         </p>
     */
    public String getOpsItemId() {
        return opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem that you want to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     *
     * @param opsItemId <p>
     *            The ID of the OpsItem that you want to get.
     *            </p>
     */
    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem that you want to get.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(oi)-[0-9a-f]{12}$<br/>
     *
     * @param opsItemId <p>
     *            The ID of the OpsItem that you want to get.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpsItemRequest withOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
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
        if (getOpsItemId() != null)
            sb.append("OpsItemId: " + getOpsItemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpsItemRequest == false)
            return false;
        GetOpsItemRequest other = (GetOpsItemRequest) obj;

        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null)
            return false;
        if (other.getOpsItemId() != null
                && other.getOpsItemId().equals(this.getOpsItemId()) == false)
            return false;
        return true;
    }
}
