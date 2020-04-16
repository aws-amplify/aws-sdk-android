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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of resource metadata for a given list of trigger names. After
 * calling the <code>ListTriggers</code> operation, you can call this operation
 * to access the data to which you have been granted permissions. This operation
 * supports all IAM permissions, including permission conditions that uses tags.
 * </p>
 */
public class BatchGetTriggersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of trigger names, which may be the names returned from the
     * <code>ListTriggers</code> operation.
     * </p>
     */
    private java.util.List<String> triggerNames;

    /**
     * <p>
     * A list of trigger names, which may be the names returned from the
     * <code>ListTriggers</code> operation.
     * </p>
     *
     * @return <p>
     *         A list of trigger names, which may be the names returned from the
     *         <code>ListTriggers</code> operation.
     *         </p>
     */
    public java.util.List<String> getTriggerNames() {
        return triggerNames;
    }

    /**
     * <p>
     * A list of trigger names, which may be the names returned from the
     * <code>ListTriggers</code> operation.
     * </p>
     *
     * @param triggerNames <p>
     *            A list of trigger names, which may be the names returned from
     *            the <code>ListTriggers</code> operation.
     *            </p>
     */
    public void setTriggerNames(java.util.Collection<String> triggerNames) {
        if (triggerNames == null) {
            this.triggerNames = null;
            return;
        }

        this.triggerNames = new java.util.ArrayList<String>(triggerNames);
    }

    /**
     * <p>
     * A list of trigger names, which may be the names returned from the
     * <code>ListTriggers</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerNames <p>
     *            A list of trigger names, which may be the names returned from
     *            the <code>ListTriggers</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetTriggersRequest withTriggerNames(String... triggerNames) {
        if (getTriggerNames() == null) {
            this.triggerNames = new java.util.ArrayList<String>(triggerNames.length);
        }
        for (String value : triggerNames) {
            this.triggerNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of trigger names, which may be the names returned from the
     * <code>ListTriggers</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerNames <p>
     *            A list of trigger names, which may be the names returned from
     *            the <code>ListTriggers</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetTriggersRequest withTriggerNames(java.util.Collection<String> triggerNames) {
        setTriggerNames(triggerNames);
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
        if (getTriggerNames() != null)
            sb.append("TriggerNames: " + getTriggerNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTriggerNames() == null) ? 0 : getTriggerNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetTriggersRequest == false)
            return false;
        BatchGetTriggersRequest other = (BatchGetTriggersRequest) obj;

        if (other.getTriggerNames() == null ^ this.getTriggerNames() == null)
            return false;
        if (other.getTriggerNames() != null
                && other.getTriggerNames().equals(this.getTriggerNames()) == false)
            return false;
        return true;
    }
}
