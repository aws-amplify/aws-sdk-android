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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Tests the functionality of repository triggers by sending information to the
 * trigger target. If real data is available in the repository, the test sends
 * data from the last commit. If no data is available, sample data is generated.
 * </p>
 */
public class TestRepositoryTriggersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the repository in which to test the triggers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The list of triggers to test.
     * </p>
     */
    private java.util.List<RepositoryTrigger> triggers;

    /**
     * <p>
     * The name of the repository in which to test the triggers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository in which to test the triggers.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository in which to test the triggers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository in which to test the triggers.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository in which to test the triggers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository in which to test the triggers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestRepositoryTriggersRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The list of triggers to test.
     * </p>
     *
     * @return <p>
     *         The list of triggers to test.
     *         </p>
     */
    public java.util.List<RepositoryTrigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * The list of triggers to test.
     * </p>
     *
     * @param triggers <p>
     *            The list of triggers to test.
     *            </p>
     */
    public void setTriggers(java.util.Collection<RepositoryTrigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }

        this.triggers = new java.util.ArrayList<RepositoryTrigger>(triggers);
    }

    /**
     * <p>
     * The list of triggers to test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggers <p>
     *            The list of triggers to test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestRepositoryTriggersRequest withTriggers(RepositoryTrigger... triggers) {
        if (getTriggers() == null) {
            this.triggers = new java.util.ArrayList<RepositoryTrigger>(triggers.length);
        }
        for (RepositoryTrigger value : triggers) {
            this.triggers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of triggers to test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggers <p>
     *            The list of triggers to test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestRepositoryTriggersRequest withTriggers(
            java.util.Collection<RepositoryTrigger> triggers) {
        setTriggers(triggers);
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
        if (getRepositoryName() != null)
            sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getTriggers() != null)
            sb.append("triggers: " + getTriggers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestRepositoryTriggersRequest == false)
            return false;
        TestRepositoryTriggersRequest other = (TestRepositoryTriggersRequest) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        return true;
    }
}
