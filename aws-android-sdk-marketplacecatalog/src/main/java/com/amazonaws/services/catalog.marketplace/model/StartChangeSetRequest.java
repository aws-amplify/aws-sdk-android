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

package com.amazonaws.services.catalog.marketplace.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This operation allows you to request changes for your entities. Within a
 * single ChangeSet, you cannot start the same change type against the same
 * entity multiple times. Additionally, when a ChangeSet is running, all the
 * entities targeted by the different changes are locked until the ChangeSet has
 * completed (either succeeded, cancelled, or failed). If you try to start a
 * ChangeSet containing a change against an entity that is already locked, you
 * will receive a <code>ResourceInUseException</code>.
 * </p>
 * <p>
 * For example, you cannot start the ChangeSet described in the <a href=
 * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/API_StartChangeSet.html#API_StartChangeSet_Examples"
 * >example</a> below because it contains two changes to execute the same change
 * type (<code>AddRevisions</code>) against the same entity (
 * <code>entity-id@1)</code>.
 * </p>
 */
public class StartChangeSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     */
    private String catalog;

    /**
     * <p>
     * Array of <code>change</code> object.
     * </p>
     */
    private java.util.List<Change> changeSet;

    /**
     * <p>
     * Optional case sensitive string of up to 100 ASCII characters. The change
     * set name can be used to filter the list of change sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[\w\s+=.:@-]+$<br/>
     */
    private String changeSetName;

    /**
     * <p>
     * A unique token to identify the request to ensure idempotency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @return <p>
     *         The catalog related to the request. Fixed value:
     *         <code>AWSMarketplace</code>
     *         </p>
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param catalog <p>
     *            The catalog related to the request. Fixed value:
     *            <code>AWSMarketplace</code>
     *            </p>
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param catalog <p>
     *            The catalog related to the request. Fixed value:
     *            <code>AWSMarketplace</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChangeSetRequest withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * <p>
     * Array of <code>change</code> object.
     * </p>
     *
     * @return <p>
     *         Array of <code>change</code> object.
     *         </p>
     */
    public java.util.List<Change> getChangeSet() {
        return changeSet;
    }

    /**
     * <p>
     * Array of <code>change</code> object.
     * </p>
     *
     * @param changeSet <p>
     *            Array of <code>change</code> object.
     *            </p>
     */
    public void setChangeSet(java.util.Collection<Change> changeSet) {
        if (changeSet == null) {
            this.changeSet = null;
            return;
        }

        this.changeSet = new java.util.ArrayList<Change>(changeSet);
    }

    /**
     * <p>
     * Array of <code>change</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changeSet <p>
     *            Array of <code>change</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChangeSetRequest withChangeSet(Change... changeSet) {
        if (getChangeSet() == null) {
            this.changeSet = new java.util.ArrayList<Change>(changeSet.length);
        }
        for (Change value : changeSet) {
            this.changeSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Array of <code>change</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changeSet <p>
     *            Array of <code>change</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChangeSetRequest withChangeSet(java.util.Collection<Change> changeSet) {
        setChangeSet(changeSet);
        return this;
    }

    /**
     * <p>
     * Optional case sensitive string of up to 100 ASCII characters. The change
     * set name can be used to filter the list of change sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[\w\s+=.:@-]+$<br/>
     *
     * @return <p>
     *         Optional case sensitive string of up to 100 ASCII characters. The
     *         change set name can be used to filter the list of change sets.
     *         </p>
     */
    public String getChangeSetName() {
        return changeSetName;
    }

    /**
     * <p>
     * Optional case sensitive string of up to 100 ASCII characters. The change
     * set name can be used to filter the list of change sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[\w\s+=.:@-]+$<br/>
     *
     * @param changeSetName <p>
     *            Optional case sensitive string of up to 100 ASCII characters.
     *            The change set name can be used to filter the list of change
     *            sets.
     *            </p>
     */
    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * Optional case sensitive string of up to 100 ASCII characters. The change
     * set name can be used to filter the list of change sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[\w\s+=.:@-]+$<br/>
     *
     * @param changeSetName <p>
     *            Optional case sensitive string of up to 100 ASCII characters.
     *            The change set name can be used to filter the list of change
     *            sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChangeSetRequest withChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }

    /**
     * <p>
     * A unique token to identify the request to ensure idempotency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @return <p>
     *         A unique token to identify the request to ensure idempotency.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique token to identify the request to ensure idempotency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param clientRequestToken <p>
     *            A unique token to identify the request to ensure idempotency.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique token to identify the request to ensure idempotency.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param clientRequestToken <p>
     *            A unique token to identify the request to ensure idempotency.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChangeSetRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getCatalog() != null)
            sb.append("Catalog: " + getCatalog() + ",");
        if (getChangeSet() != null)
            sb.append("ChangeSet: " + getChangeSet() + ",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: " + getChangeSetName() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getChangeSet() == null) ? 0 : getChangeSet().hashCode());
        hashCode = prime * hashCode
                + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartChangeSetRequest == false)
            return false;
        StartChangeSetRequest other = (StartChangeSetRequest) obj;

        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getChangeSet() == null ^ this.getChangeSet() == null)
            return false;
        if (other.getChangeSet() != null
                && other.getChangeSet().equals(this.getChangeSet()) == false)
            return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null
                && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
