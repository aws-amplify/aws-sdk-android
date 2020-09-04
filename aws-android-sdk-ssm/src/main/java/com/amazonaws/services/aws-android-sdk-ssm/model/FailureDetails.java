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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Information about an Automation failure.</p>
 */
public class FailureDetails implements Serializable {
    /**
     * <p>The stage of the Automation execution when the failure occurred. The stages include the following: InputValidation, PreVerification, Invocation, PostVerification.</p>
     */
    private String failureStage;

    /**
     * <p>The type of Automation failure. Failure types include the following: Action, Permission, Throttling, Verification, Internal.</p>
     */
    private String failureType;

    /**
     * <p>Detailed information about the Automation step failure.</p>
     */
    private java.util.Map<String, java.util.List<String>> details;

    /**
     * <p>The stage of the Automation execution when the failure occurred. The stages include the following: InputValidation, PreVerification, Invocation, PostVerification.</p>
     *
     * @return <p>The stage of the Automation execution when the failure occurred. The stages include the following: InputValidation, PreVerification, Invocation, PostVerification.</p>
     */
    public String getFailureStage() {
        return failureStage;
    }

    /**
     * <p>The stage of the Automation execution when the failure occurred. The stages include the following: InputValidation, PreVerification, Invocation, PostVerification.</p>
     *
     * @param failureStage <p>The stage of the Automation execution when the failure occurred. The stages include the following: InputValidation, PreVerification, Invocation, PostVerification.</p>
     */
    public void setFailureStage(String failureStage) {
        this.failureStage = failureStage;
    }

    /**
     * <p>The stage of the Automation execution when the failure occurred. The stages include the following: InputValidation, PreVerification, Invocation, PostVerification.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failureStage <p>The stage of the Automation execution when the failure occurred. The stages include the following: InputValidation, PreVerification, Invocation, PostVerification.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public FailureDetails withFailureStage(String failureStage) {
        this.failureStage = failureStage;
        return this;
    }

    /**
     * <p>The type of Automation failure. Failure types include the following: Action, Permission, Throttling, Verification, Internal.</p>
     *
     * @return <p>The type of Automation failure. Failure types include the following: Action, Permission, Throttling, Verification, Internal.</p>
     */
    public String getFailureType() {
        return failureType;
    }

    /**
     * <p>The type of Automation failure. Failure types include the following: Action, Permission, Throttling, Verification, Internal.</p>
     *
     * @param failureType <p>The type of Automation failure. Failure types include the following: Action, Permission, Throttling, Verification, Internal.</p>
     */
    public void setFailureType(String failureType) {
        this.failureType = failureType;
    }

    /**
     * <p>The type of Automation failure. Failure types include the following: Action, Permission, Throttling, Verification, Internal.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failureType <p>The type of Automation failure. Failure types include the following: Action, Permission, Throttling, Verification, Internal.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public FailureDetails withFailureType(String failureType) {
        this.failureType = failureType;
        return this;
    }

    /**
     * <p>Detailed information about the Automation step failure.</p>
     *
     * @return <p>Detailed information about the Automation step failure.</p>
     */
    public java.util.Map<String, java.util.List<String>> getDetails() {
        return details;
    }

    /**
     * <p>Detailed information about the Automation step failure.</p>
     *
     * @param details <p>Detailed information about the Automation step failure.</p>
     */
    public void setDetails(java.util.Map<String, java.util.List<String>> details) {
        this.details = details;
    }

    /**
     * <p>Detailed information about the Automation step failure.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param details <p>Detailed information about the Automation step failure.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public FailureDetails withDetails(java.util.Map<String, java.util.List<String>> details) {
        this.details = details;
        return this;
    }

    /**
     * <p>Detailed information about the Automation step failure.</p>
     * <p>
     * The method adds a new key-value pair into Details parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Details.
     * @param value The corresponding value of the entry to be added into Details.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public FailureDetails addDetailsEntry(String key, java.util.List<String> value) {
        if (null == this.details) {
            this.details = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.details.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.details.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Details.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public FailureDetails clearDetailsEntries() {
        this.details = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFailureStage() != null) sb.append("FailureStage: " + getFailureStage() + ",");
        if (getFailureType() != null) sb.append("FailureType: " + getFailureType() + ",");
        if (getDetails() != null) sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureStage() == null) ? 0 : getFailureStage().hashCode());
        hashCode = prime * hashCode + ((getFailureType() == null) ? 0 : getFailureType().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof FailureDetails == false) return false;
        FailureDetails other = (FailureDetails)obj;

        if (other.getFailureStage() == null ^ this.getFailureStage() == null) return false;
        if (other.getFailureStage() != null && other.getFailureStage().equals(this.getFailureStage()) == false) return false;
        if (other.getFailureType() == null ^ this.getFailureType() == null) return false;
        if (other.getFailureType() != null && other.getFailureType().equals(this.getFailureType()) == false) return false;
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false;
        return true;
    }
}
