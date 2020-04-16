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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * The standard that you want to enable.
 * </p>
 */
public class StandardsSubscriptionRequest implements Serializable {
    /**
     * <p>
     * The ARN of the standard that you want to enable. To view the list of
     * available standards and their ARNs, use the
     * <code> <a>DescribeStandards</a> </code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String standardsArn;

    /**
     * <p>
     * A key-value pair of input for the standard.
     * </p>
     */
    private java.util.Map<String, String> standardsInput;

    /**
     * <p>
     * The ARN of the standard that you want to enable. To view the list of
     * available standards and their ARNs, use the
     * <code> <a>DescribeStandards</a> </code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of the standard that you want to enable. To view the list
     *         of available standards and their ARNs, use the
     *         <code> <a>DescribeStandards</a> </code> operation.
     *         </p>
     */
    public String getStandardsArn() {
        return standardsArn;
    }

    /**
     * <p>
     * The ARN of the standard that you want to enable. To view the list of
     * available standards and their ARNs, use the
     * <code> <a>DescribeStandards</a> </code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param standardsArn <p>
     *            The ARN of the standard that you want to enable. To view the
     *            list of available standards and their ARNs, use the
     *            <code> <a>DescribeStandards</a> </code> operation.
     *            </p>
     */
    public void setStandardsArn(String standardsArn) {
        this.standardsArn = standardsArn;
    }

    /**
     * <p>
     * The ARN of the standard that you want to enable. To view the list of
     * available standards and their ARNs, use the
     * <code> <a>DescribeStandards</a> </code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param standardsArn <p>
     *            The ARN of the standard that you want to enable. To view the
     *            list of available standards and their ARNs, use the
     *            <code> <a>DescribeStandards</a> </code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardsSubscriptionRequest withStandardsArn(String standardsArn) {
        this.standardsArn = standardsArn;
        return this;
    }

    /**
     * <p>
     * A key-value pair of input for the standard.
     * </p>
     *
     * @return <p>
     *         A key-value pair of input for the standard.
     *         </p>
     */
    public java.util.Map<String, String> getStandardsInput() {
        return standardsInput;
    }

    /**
     * <p>
     * A key-value pair of input for the standard.
     * </p>
     *
     * @param standardsInput <p>
     *            A key-value pair of input for the standard.
     *            </p>
     */
    public void setStandardsInput(java.util.Map<String, String> standardsInput) {
        this.standardsInput = standardsInput;
    }

    /**
     * <p>
     * A key-value pair of input for the standard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardsInput <p>
     *            A key-value pair of input for the standard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardsSubscriptionRequest withStandardsInput(
            java.util.Map<String, String> standardsInput) {
        this.standardsInput = standardsInput;
        return this;
    }

    /**
     * <p>
     * A key-value pair of input for the standard.
     * </p>
     * <p>
     * The method adds a new key-value pair into StandardsInput parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into StandardsInput.
     * @param value The corresponding value of the entry to be added into
     *            StandardsInput.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardsSubscriptionRequest addStandardsInputEntry(String key, String value) {
        if (null == this.standardsInput) {
            this.standardsInput = new java.util.HashMap<String, String>();
        }
        if (this.standardsInput.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.standardsInput.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StandardsInput.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public StandardsSubscriptionRequest clearStandardsInputEntries() {
        this.standardsInput = null;
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
        if (getStandardsArn() != null)
            sb.append("StandardsArn: " + getStandardsArn() + ",");
        if (getStandardsInput() != null)
            sb.append("StandardsInput: " + getStandardsInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStandardsArn() == null) ? 0 : getStandardsArn().hashCode());
        hashCode = prime * hashCode
                + ((getStandardsInput() == null) ? 0 : getStandardsInput().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandardsSubscriptionRequest == false)
            return false;
        StandardsSubscriptionRequest other = (StandardsSubscriptionRequest) obj;

        if (other.getStandardsArn() == null ^ this.getStandardsArn() == null)
            return false;
        if (other.getStandardsArn() != null
                && other.getStandardsArn().equals(this.getStandardsArn()) == false)
            return false;
        if (other.getStandardsInput() == null ^ this.getStandardsInput() == null)
            return false;
        if (other.getStandardsInput() != null
                && other.getStandardsInput().equals(this.getStandardsInput()) == false)
            return false;
        return true;
    }
}
