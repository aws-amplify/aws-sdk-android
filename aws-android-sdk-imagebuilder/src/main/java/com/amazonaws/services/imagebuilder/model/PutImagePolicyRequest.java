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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Applies a policy to an image. We recommend that you call the RAM API <a href=
 * "https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html"
 * >CreateResourceShare</a> to share resources. If you call the Image Builder
 * API <code>PutImagePolicy</code>, you must also call the RAM API <a href=
 * "https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html"
 * >PromoteResourceShareCreatedFromPolicy</a> in order for the resource to be
 * visible to all principals with whom the resource is shared.
 * </p>
 */
public class PutImagePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image that this policy should be
     * applied to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image/[a-z0
     * -9-_]+/\d+\.\d+\.\d+/\d+$<br/>
     */
    private String imageArn;

    /**
     * <p>
     * The policy to apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 30000<br/>
     */
    private String policy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image that this policy should be
     * applied to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image/[a-z0
     * -9-_]+/\d+\.\d+\.\d+/\d+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the image that this policy
     *         should be applied to.
     *         </p>
     */
    public String getImageArn() {
        return imageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image that this policy should be
     * applied to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image/[a-z0
     * -9-_]+/\d+\.\d+\.\d+/\d+$<br/>
     *
     * @param imageArn <p>
     *            The Amazon Resource Name (ARN) of the image that this policy
     *            should be applied to.
     *            </p>
     */
    public void setImageArn(String imageArn) {
        this.imageArn = imageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image that this policy should be
     * applied to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image/[a-z0
     * -9-_]+/\d+\.\d+\.\d+/\d+$<br/>
     *
     * @param imageArn <p>
     *            The Amazon Resource Name (ARN) of the image that this policy
     *            should be applied to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutImagePolicyRequest withImageArn(String imageArn) {
        this.imageArn = imageArn;
        return this;
    }

    /**
     * <p>
     * The policy to apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 30000<br/>
     *
     * @return <p>
     *         The policy to apply.
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The policy to apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 30000<br/>
     *
     * @param policy <p>
     *            The policy to apply.
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The policy to apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 30000<br/>
     *
     * @param policy <p>
     *            The policy to apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutImagePolicyRequest withPolicy(String policy) {
        this.policy = policy;
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
        if (getImageArn() != null)
            sb.append("imageArn: " + getImageArn() + ",");
        if (getPolicy() != null)
            sb.append("policy: " + getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageArn() == null) ? 0 : getImageArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutImagePolicyRequest == false)
            return false;
        PutImagePolicyRequest other = (PutImagePolicyRequest) obj;

        if (other.getImageArn() == null ^ this.getImageArn() == null)
            return false;
        if (other.getImageArn() != null && other.getImageArn().equals(this.getImageArn()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }
}
