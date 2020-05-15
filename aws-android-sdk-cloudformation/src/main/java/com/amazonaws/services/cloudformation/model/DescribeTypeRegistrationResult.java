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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

public class DescribeTypeRegistrationResult implements Serializable {
    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, IN_PROGRESS, FAILED
     */
    private String progressStatus;

    /**
     * <p>
     * The description of the type registration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type being registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other
     * than <code>COMPLETE</code>, this will be <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     */
    private String typeArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this specific version of the type being
     * registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other
     * than <code>COMPLETE</code>, this will be <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     */
    private String typeVersionArn;

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, IN_PROGRESS, FAILED
     *
     * @return <p>
     *         The current status of the type registration request.
     *         </p>
     * @see RegistrationStatus
     */
    public String getProgressStatus() {
        return progressStatus;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, IN_PROGRESS, FAILED
     *
     * @param progressStatus <p>
     *            The current status of the type registration request.
     *            </p>
     * @see RegistrationStatus
     */
    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, IN_PROGRESS, FAILED
     *
     * @param progressStatus <p>
     *            The current status of the type registration request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistrationStatus
     */
    public DescribeTypeRegistrationResult withProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, IN_PROGRESS, FAILED
     *
     * @param progressStatus <p>
     *            The current status of the type registration request.
     *            </p>
     * @see RegistrationStatus
     */
    public void setProgressStatus(RegistrationStatus progressStatus) {
        this.progressStatus = progressStatus.toString();
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, IN_PROGRESS, FAILED
     *
     * @param progressStatus <p>
     *            The current status of the type registration request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistrationStatus
     */
    public DescribeTypeRegistrationResult withProgressStatus(RegistrationStatus progressStatus) {
        this.progressStatus = progressStatus.toString();
        return this;
    }

    /**
     * <p>
     * The description of the type registration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The description of the type registration request.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the type registration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the type registration request.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the type registration request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the type registration request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeRegistrationResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type being registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other
     * than <code>COMPLETE</code>, this will be <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the type being registered.
     *         </p>
     *         <p>
     *         For registration requests with a <code>ProgressStatus</code> of
     *         other than <code>COMPLETE</code>, this will be <code>null</code>.
     *         </p>
     */
    public String getTypeArn() {
        return typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type being registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other
     * than <code>COMPLETE</code>, this will be <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @param typeArn <p>
     *            The Amazon Resource Name (ARN) of the type being registered.
     *            </p>
     *            <p>
     *            For registration requests with a <code>ProgressStatus</code>
     *            of other than <code>COMPLETE</code>, this will be
     *            <code>null</code>.
     *            </p>
     */
    public void setTypeArn(String typeArn) {
        this.typeArn = typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type being registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other
     * than <code>COMPLETE</code>, this will be <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @param typeArn <p>
     *            The Amazon Resource Name (ARN) of the type being registered.
     *            </p>
     *            <p>
     *            For registration requests with a <code>ProgressStatus</code>
     *            of other than <code>COMPLETE</code>, this will be
     *            <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeRegistrationResult withTypeArn(String typeArn) {
        this.typeArn = typeArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this specific version of the type being
     * registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other
     * than <code>COMPLETE</code>, this will be <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of this specific version of the
     *         type being registered.
     *         </p>
     *         <p>
     *         For registration requests with a <code>ProgressStatus</code> of
     *         other than <code>COMPLETE</code>, this will be <code>null</code>.
     *         </p>
     */
    public String getTypeVersionArn() {
        return typeVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this specific version of the type being
     * registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other
     * than <code>COMPLETE</code>, this will be <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @param typeVersionArn <p>
     *            The Amazon Resource Name (ARN) of this specific version of the
     *            type being registered.
     *            </p>
     *            <p>
     *            For registration requests with a <code>ProgressStatus</code>
     *            of other than <code>COMPLETE</code>, this will be
     *            <code>null</code>.
     *            </p>
     */
    public void setTypeVersionArn(String typeVersionArn) {
        this.typeVersionArn = typeVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this specific version of the type being
     * registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other
     * than <code>COMPLETE</code>, this will be <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @param typeVersionArn <p>
     *            The Amazon Resource Name (ARN) of this specific version of the
     *            type being registered.
     *            </p>
     *            <p>
     *            For registration requests with a <code>ProgressStatus</code>
     *            of other than <code>COMPLETE</code>, this will be
     *            <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeRegistrationResult withTypeVersionArn(String typeVersionArn) {
        this.typeVersionArn = typeVersionArn;
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
        if (getProgressStatus() != null)
            sb.append("ProgressStatus: " + getProgressStatus() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTypeArn() != null)
            sb.append("TypeArn: " + getTypeArn() + ",");
        if (getTypeVersionArn() != null)
            sb.append("TypeVersionArn: " + getTypeVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProgressStatus() == null) ? 0 : getProgressStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTypeArn() == null) ? 0 : getTypeArn().hashCode());
        hashCode = prime * hashCode
                + ((getTypeVersionArn() == null) ? 0 : getTypeVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTypeRegistrationResult == false)
            return false;
        DescribeTypeRegistrationResult other = (DescribeTypeRegistrationResult) obj;

        if (other.getProgressStatus() == null ^ this.getProgressStatus() == null)
            return false;
        if (other.getProgressStatus() != null
                && other.getProgressStatus().equals(this.getProgressStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTypeArn() == null ^ this.getTypeArn() == null)
            return false;
        if (other.getTypeArn() != null && other.getTypeArn().equals(this.getTypeArn()) == false)
            return false;
        if (other.getTypeVersionArn() == null ^ this.getTypeVersionArn() == null)
            return false;
        if (other.getTypeVersionArn() != null
                && other.getTypeVersionArn().equals(this.getTypeVersionArn()) == false)
            return false;
        return true;
    }
}
