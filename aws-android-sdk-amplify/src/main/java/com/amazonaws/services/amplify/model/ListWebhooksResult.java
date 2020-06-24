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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * The result structure for the list webhooks request.
 * </p>
 */
public class ListWebhooksResult implements Serializable {
    /**
     * <p>
     * A list of webhooks.
     * </p>
     */
    private java.util.List<Webhook> webhooks;

    /**
     * <p>
     * A pagination token. If non-null, the pagination token is returned in a
     * result. Pass its value in another request to retrieve more entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of webhooks.
     * </p>
     *
     * @return <p>
     *         A list of webhooks.
     *         </p>
     */
    public java.util.List<Webhook> getWebhooks() {
        return webhooks;
    }

    /**
     * <p>
     * A list of webhooks.
     * </p>
     *
     * @param webhooks <p>
     *            A list of webhooks.
     *            </p>
     */
    public void setWebhooks(java.util.Collection<Webhook> webhooks) {
        if (webhooks == null) {
            this.webhooks = null;
            return;
        }

        this.webhooks = new java.util.ArrayList<Webhook>(webhooks);
    }

    /**
     * <p>
     * A list of webhooks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param webhooks <p>
     *            A list of webhooks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWebhooksResult withWebhooks(Webhook... webhooks) {
        if (getWebhooks() == null) {
            this.webhooks = new java.util.ArrayList<Webhook>(webhooks.length);
        }
        for (Webhook value : webhooks) {
            this.webhooks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of webhooks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param webhooks <p>
     *            A list of webhooks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWebhooksResult withWebhooks(java.util.Collection<Webhook> webhooks) {
        setWebhooks(webhooks);
        return this;
    }

    /**
     * <p>
     * A pagination token. If non-null, the pagination token is returned in a
     * result. Pass its value in another request to retrieve more entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         A pagination token. If non-null, the pagination token is returned
     *         in a result. Pass its value in another request to retrieve more
     *         entries.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token. If non-null, the pagination token is returned in a
     * result. Pass its value in another request to retrieve more entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param nextToken <p>
     *            A pagination token. If non-null, the pagination token is
     *            returned in a result. Pass its value in another request to
     *            retrieve more entries.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token. If non-null, the pagination token is returned in a
     * result. Pass its value in another request to retrieve more entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param nextToken <p>
     *            A pagination token. If non-null, the pagination token is
     *            returned in a result. Pass its value in another request to
     *            retrieve more entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWebhooksResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getWebhooks() != null)
            sb.append("webhooks: " + getWebhooks() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebhooks() == null) ? 0 : getWebhooks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWebhooksResult == false)
            return false;
        ListWebhooksResult other = (ListWebhooksResult) obj;

        if (other.getWebhooks() == null ^ this.getWebhooks() == null)
            return false;
        if (other.getWebhooks() != null && other.getWebhooks().equals(this.getWebhooks()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
