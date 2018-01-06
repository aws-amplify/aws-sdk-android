/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates an access policy associated with an existing destination.
 * An access policy is an <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html">IAM
 * policy document</a> that is used to authorize claims to register a
 * subscription filter against a given destination.
 * </p>
 */
public class PutDestinationPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A name for an existing destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String destinationName;

    /**
     * <p>
     * An IAM policy document that authorizes cross-account users to deliver
     * their log events to the associated destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String accessPolicy;

    /**
     * <p>
     * A name for an existing destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         A name for an existing destination.
     *         </p>
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * <p>
     * A name for an existing destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param destinationName <p>
     *            A name for an existing destination.
     *            </p>
     */
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * A name for an existing destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param destinationName <p>
     *            A name for an existing destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutDestinationPolicyRequest withDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }

    /**
     * <p>
     * An IAM policy document that authorizes cross-account users to deliver
     * their log events to the associated destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         An IAM policy document that authorizes cross-account users to
     *         deliver their log events to the associated destination.
     *         </p>
     */
    public String getAccessPolicy() {
        return accessPolicy;
    }

    /**
     * <p>
     * An IAM policy document that authorizes cross-account users to deliver
     * their log events to the associated destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param accessPolicy <p>
     *            An IAM policy document that authorizes cross-account users to
     *            deliver their log events to the associated destination.
     *            </p>
     */
    public void setAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    /**
     * <p>
     * An IAM policy document that authorizes cross-account users to deliver
     * their log events to the associated destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param accessPolicy <p>
     *            An IAM policy document that authorizes cross-account users to
     *            deliver their log events to the associated destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutDestinationPolicyRequest withAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
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
        if (getDestinationName() != null)
            sb.append("destinationName: " + getDestinationName() + ",");
        if (getAccessPolicy() != null)
            sb.append("accessPolicy: " + getAccessPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode
                + ((getAccessPolicy() == null) ? 0 : getAccessPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDestinationPolicyRequest == false)
            return false;
        PutDestinationPolicyRequest other = (PutDestinationPolicyRequest) obj;

        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null
                && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getAccessPolicy() == null ^ this.getAccessPolicy() == null)
            return false;
        if (other.getAccessPolicy() != null
                && other.getAccessPolicy().equals(this.getAccessPolicy()) == false)
            return false;
        return true;
    }
}
