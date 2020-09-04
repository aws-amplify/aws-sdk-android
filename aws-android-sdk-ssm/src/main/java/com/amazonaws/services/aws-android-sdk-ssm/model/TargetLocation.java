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
 * <p>The combination of AWS Regions and accounts targeted by the current Automation execution.</p>
 */
public class TargetLocation implements Serializable {
    /**
     * <p>The AWS accounts targeted by the current Automation execution.</p>
     */
    private java.util.List<String> accounts;

    /**
     * <p>The AWS Regions targeted by the current Automation execution.</p>
     */
    private java.util.List<String> regions;

    /**
     * <p>The maximum number of AWS accounts and AWS regions allowed to run the Automation concurrently </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     */
    private String targetLocationMaxConcurrency;

    /**
     * <p>The maximum number of errors allowed before the system stops queueing additional Automation executions for the currently running Automation. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     */
    private String targetLocationMaxErrors;

    /**
     * <p>The Automation execution role used by the currently running Automation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String executionRoleName;

    /**
     * <p>The AWS accounts targeted by the current Automation execution.</p>
     *
     * @return <p>The AWS accounts targeted by the current Automation execution.</p>
     */
    public java.util.List<String> getAccounts() {
        return accounts;
    }

    /**
     * <p>The AWS accounts targeted by the current Automation execution.</p>
     *
     * @param accounts <p>The AWS accounts targeted by the current Automation execution.</p>
     */
    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<String>(accounts);
    }

    /**
     * <p>The AWS accounts targeted by the current Automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accounts <p>The AWS accounts targeted by the current Automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public TargetLocation withAccounts(String... accounts) {
        if (getAccounts() == null) {
            this.accounts = new java.util.ArrayList<String>(accounts.length);
        }
        for (String value : accounts) {
            this.accounts.add(value);
        }
        return this;
    }

    /**
     * <p>The AWS accounts targeted by the current Automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accounts <p>The AWS accounts targeted by the current Automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public TargetLocation withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>The AWS Regions targeted by the current Automation execution.</p>
     *
     * @return <p>The AWS Regions targeted by the current Automation execution.</p>
     */
    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>The AWS Regions targeted by the current Automation execution.</p>
     *
     * @param regions <p>The AWS Regions targeted by the current Automation execution.</p>
     */
    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>The AWS Regions targeted by the current Automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param regions <p>The AWS Regions targeted by the current Automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public TargetLocation withRegions(String... regions) {
        if (getRegions() == null) {
            this.regions = new java.util.ArrayList<String>(regions.length);
        }
        for (String value : regions) {
            this.regions.add(value);
        }
        return this;
    }

    /**
     * <p>The AWS Regions targeted by the current Automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param regions <p>The AWS Regions targeted by the current Automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public TargetLocation withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>The maximum number of AWS accounts and AWS regions allowed to run the Automation concurrently </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @return <p>The maximum number of AWS accounts and AWS regions allowed to run the Automation concurrently </p>
     */
    public String getTargetLocationMaxConcurrency() {
        return targetLocationMaxConcurrency;
    }

    /**
     * <p>The maximum number of AWS accounts and AWS regions allowed to run the Automation concurrently </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param targetLocationMaxConcurrency <p>The maximum number of AWS accounts and AWS regions allowed to run the Automation concurrently </p>
     */
    public void setTargetLocationMaxConcurrency(String targetLocationMaxConcurrency) {
        this.targetLocationMaxConcurrency = targetLocationMaxConcurrency;
    }

    /**
     * <p>The maximum number of AWS accounts and AWS regions allowed to run the Automation concurrently </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param targetLocationMaxConcurrency <p>The maximum number of AWS accounts and AWS regions allowed to run the Automation concurrently </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public TargetLocation withTargetLocationMaxConcurrency(String targetLocationMaxConcurrency) {
        this.targetLocationMaxConcurrency = targetLocationMaxConcurrency;
        return this;
    }

    /**
     * <p>The maximum number of errors allowed before the system stops queueing additional Automation executions for the currently running Automation. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @return <p>The maximum number of errors allowed before the system stops queueing additional Automation executions for the currently running Automation. </p>
     */
    public String getTargetLocationMaxErrors() {
        return targetLocationMaxErrors;
    }

    /**
     * <p>The maximum number of errors allowed before the system stops queueing additional Automation executions for the currently running Automation. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param targetLocationMaxErrors <p>The maximum number of errors allowed before the system stops queueing additional Automation executions for the currently running Automation. </p>
     */
    public void setTargetLocationMaxErrors(String targetLocationMaxErrors) {
        this.targetLocationMaxErrors = targetLocationMaxErrors;
    }

    /**
     * <p>The maximum number of errors allowed before the system stops queueing additional Automation executions for the currently running Automation. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param targetLocationMaxErrors <p>The maximum number of errors allowed before the system stops queueing additional Automation executions for the currently running Automation. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public TargetLocation withTargetLocationMaxErrors(String targetLocationMaxErrors) {
        this.targetLocationMaxErrors = targetLocationMaxErrors;
        return this;
    }

    /**
     * <p>The Automation execution role used by the currently running Automation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>The Automation execution role used by the currently running Automation.</p>
     */
    public String getExecutionRoleName() {
        return executionRoleName;
    }

    /**
     * <p>The Automation execution role used by the currently running Automation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param executionRoleName <p>The Automation execution role used by the currently running Automation.</p>
     */
    public void setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
    }

    /**
     * <p>The Automation execution role used by the currently running Automation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param executionRoleName <p>The Automation execution role used by the currently running Automation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public TargetLocation withExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
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
        if (getAccounts() != null) sb.append("Accounts: " + getAccounts() + ",");
        if (getRegions() != null) sb.append("Regions: " + getRegions() + ",");
        if (getTargetLocationMaxConcurrency() != null) sb.append("TargetLocationMaxConcurrency: " + getTargetLocationMaxConcurrency() + ",");
        if (getTargetLocationMaxErrors() != null) sb.append("TargetLocationMaxErrors: " + getTargetLocationMaxErrors() + ",");
        if (getExecutionRoleName() != null) sb.append("ExecutionRoleName: " + getExecutionRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getTargetLocationMaxConcurrency() == null) ? 0 : getTargetLocationMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getTargetLocationMaxErrors() == null) ? 0 : getTargetLocationMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleName() == null) ? 0 : getExecutionRoleName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TargetLocation == false) return false;
        TargetLocation other = (TargetLocation)obj;

        if (other.getAccounts() == null ^ this.getAccounts() == null) return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false) return false;
        if (other.getRegions() == null ^ this.getRegions() == null) return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false) return false;
        if (other.getTargetLocationMaxConcurrency() == null ^ this.getTargetLocationMaxConcurrency() == null) return false;
        if (other.getTargetLocationMaxConcurrency() != null && other.getTargetLocationMaxConcurrency().equals(this.getTargetLocationMaxConcurrency()) == false) return false;
        if (other.getTargetLocationMaxErrors() == null ^ this.getTargetLocationMaxErrors() == null) return false;
        if (other.getTargetLocationMaxErrors() != null && other.getTargetLocationMaxErrors().equals(this.getTargetLocationMaxErrors()) == false) return false;
        if (other.getExecutionRoleName() == null ^ this.getExecutionRoleName() == null) return false;
        if (other.getExecutionRoleName() != null && other.getExecutionRoleName().equals(this.getExecutionRoleName()) == false) return false;
        return true;
    }
}
