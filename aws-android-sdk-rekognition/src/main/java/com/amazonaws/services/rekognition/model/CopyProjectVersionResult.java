/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class CopyProjectVersionResult implements Serializable {
    /**
     * <p>
     * The ARN of the copied model version in the destination project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String projectVersionArn;

    /**
     * <p>
     * The ARN of the copied model version in the destination project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The ARN of the copied model version in the destination project.
     *         </p>
     */
    public String getProjectVersionArn() {
        return projectVersionArn;
    }

    /**
     * <p>
     * The ARN of the copied model version in the destination project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectVersionArn <p>
     *            The ARN of the copied model version in the destination
     *            project.
     *            </p>
     */
    public void setProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
    }

    /**
     * <p>
     * The ARN of the copied model version in the destination project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectVersionArn <p>
     *            The ARN of the copied model version in the destination
     *            project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProjectVersionResult withProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
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
        if (getProjectVersionArn() != null)
            sb.append("ProjectVersionArn: " + getProjectVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProjectVersionArn() == null) ? 0 : getProjectVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyProjectVersionResult == false)
            return false;
        CopyProjectVersionResult other = (CopyProjectVersionResult) obj;

        if (other.getProjectVersionArn() == null ^ this.getProjectVersionArn() == null)
            return false;
        if (other.getProjectVersionArn() != null
                && other.getProjectVersionArn().equals(this.getProjectVersionArn()) == false)
            return false;
        return true;
    }
}
