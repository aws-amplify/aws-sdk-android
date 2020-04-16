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

package com.amazonaws.services.ec2imagebuilder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a component policy.
 * </p>
 */
public class GetComponentPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component whose policy you want to
     * retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):component/
     * [a-z0-9-_]+/\d+\.\d+\.\d+/\d+$<br/>
     */
    private String componentArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component whose policy you want to
     * retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):component/
     * [a-z0-9-_]+/\d+\.\d+\.\d+/\d+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the component whose policy you
     *         want to retrieve.
     *         </p>
     */
    public String getComponentArn() {
        return componentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component whose policy you want to
     * retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):component/
     * [a-z0-9-_]+/\d+\.\d+\.\d+/\d+$<br/>
     *
     * @param componentArn <p>
     *            The Amazon Resource Name (ARN) of the component whose policy
     *            you want to retrieve.
     *            </p>
     */
    public void setComponentArn(String componentArn) {
        this.componentArn = componentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component whose policy you want to
     * retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):component/
     * [a-z0-9-_]+/\d+\.\d+\.\d+/\d+$<br/>
     *
     * @param componentArn <p>
     *            The Amazon Resource Name (ARN) of the component whose policy
     *            you want to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComponentPolicyRequest withComponentArn(String componentArn) {
        this.componentArn = componentArn;
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
        if (getComponentArn() != null)
            sb.append("componentArn: " + getComponentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getComponentArn() == null) ? 0 : getComponentArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComponentPolicyRequest == false)
            return false;
        GetComponentPolicyRequest other = (GetComponentPolicyRequest) obj;

        if (other.getComponentArn() == null ^ this.getComponentArn() == null)
            return false;
        if (other.getComponentArn() != null
                && other.getComponentArn().equals(this.getComponentArn()) == false)
            return false;
        return true;
    }
}
