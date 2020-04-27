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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Defines the Amazon Cognito user group that is part of a work team.
 * </p>
 */
public class MemberDefinition implements Serializable {
    /**
     * <p>
     * The Amazon Cognito user group that is part of the work team.
     * </p>
     */
    private CognitoMemberDefinition cognitoMemberDefinition;

    /**
     * <p>
     * The Amazon Cognito user group that is part of the work team.
     * </p>
     *
     * @return <p>
     *         The Amazon Cognito user group that is part of the work team.
     *         </p>
     */
    public CognitoMemberDefinition getCognitoMemberDefinition() {
        return cognitoMemberDefinition;
    }

    /**
     * <p>
     * The Amazon Cognito user group that is part of the work team.
     * </p>
     *
     * @param cognitoMemberDefinition <p>
     *            The Amazon Cognito user group that is part of the work team.
     *            </p>
     */
    public void setCognitoMemberDefinition(CognitoMemberDefinition cognitoMemberDefinition) {
        this.cognitoMemberDefinition = cognitoMemberDefinition;
    }

    /**
     * <p>
     * The Amazon Cognito user group that is part of the work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cognitoMemberDefinition <p>
     *            The Amazon Cognito user group that is part of the work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MemberDefinition withCognitoMemberDefinition(
            CognitoMemberDefinition cognitoMemberDefinition) {
        this.cognitoMemberDefinition = cognitoMemberDefinition;
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
        if (getCognitoMemberDefinition() != null)
            sb.append("CognitoMemberDefinition: " + getCognitoMemberDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCognitoMemberDefinition() == null) ? 0 : getCognitoMemberDefinition()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberDefinition == false)
            return false;
        MemberDefinition other = (MemberDefinition) obj;

        if (other.getCognitoMemberDefinition() == null ^ this.getCognitoMemberDefinition() == null)
            return false;
        if (other.getCognitoMemberDefinition() != null
                && other.getCognitoMemberDefinition().equals(this.getCognitoMemberDefinition()) == false)
            return false;
        return true;
    }
}
