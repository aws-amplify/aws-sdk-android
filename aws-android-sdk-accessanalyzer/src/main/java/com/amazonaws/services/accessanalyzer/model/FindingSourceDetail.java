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
 * Includes details about how the access that generated the finding is granted.
 * This is populated for Amazon S3 bucket findings.
 * </p>
 */
public class FindingSourceDetail implements Serializable {
    /**
     * <p>
     * The ARN of the access point that generated the finding.
     * </p>
     */
    private String accessPointArn;

    /**
     * <p>
     * The ARN of the access point that generated the finding.
     * </p>
     *
     * @return <p>
     *         The ARN of the access point that generated the finding.
     *         </p>
     */
    public String getAccessPointArn() {
        return accessPointArn;
    }

    /**
     * <p>
     * The ARN of the access point that generated the finding.
     * </p>
     *
     * @param accessPointArn <p>
     *            The ARN of the access point that generated the finding.
     *            </p>
     */
    public void setAccessPointArn(String accessPointArn) {
        this.accessPointArn = accessPointArn;
    }

    /**
     * <p>
     * The ARN of the access point that generated the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPointArn <p>
     *            The ARN of the access point that generated the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSourceDetail withAccessPointArn(String accessPointArn) {
        this.accessPointArn = accessPointArn;
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
        if (getAccessPointArn() != null)
            sb.append("accessPointArn: " + getAccessPointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessPointArn() == null) ? 0 : getAccessPointArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingSourceDetail == false)
            return false;
        FindingSourceDetail other = (FindingSourceDetail) obj;

        if (other.getAccessPointArn() == null ^ this.getAccessPointArn() == null)
            return false;
        if (other.getAccessPointArn() != null
                && other.getAccessPointArn().equals(this.getAccessPointArn()) == false)
            return false;
        return true;
    }
}
