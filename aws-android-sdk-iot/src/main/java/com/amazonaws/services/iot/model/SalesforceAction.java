/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an action to write a message to a Salesforce IoT Cloud Input
 * Stream.
 * </p>
 */
public class SalesforceAction implements Serializable {
    /**
     * <p>
     * The token used to authenticate access to the Salesforce IoT Cloud Input
     * Stream. The token is available from the Salesforce IoT Cloud platform
     * after creation of the Input Stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - <br/>
     */
    private String token;

    /**
     * <p>
     * The URL exposed by the Salesforce IoT Cloud Input Stream. The URL is
     * available from the Salesforce IoT Cloud platform after creation of the
     * Input Stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     * <b>Pattern:
     * </b>https://ingestion-[a-zA-Z0-9]{1,12}\.[a-zA-Z0-9]+\.((sfdc-
     * matrix\.net)|(sfdcnow\.com))/streams/\w{1,20}/\w{1,20}/event<br/>
     */
    private String url;

    /**
     * <p>
     * The token used to authenticate access to the Salesforce IoT Cloud Input
     * Stream. The token is available from the Salesforce IoT Cloud platform
     * after creation of the Input Stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - <br/>
     *
     * @return <p>
     *         The token used to authenticate access to the Salesforce IoT Cloud
     *         Input Stream. The token is available from the Salesforce IoT
     *         Cloud platform after creation of the Input Stream.
     *         </p>
     */
    public String getToken() {
        return token;
    }

    /**
     * <p>
     * The token used to authenticate access to the Salesforce IoT Cloud Input
     * Stream. The token is available from the Salesforce IoT Cloud platform
     * after creation of the Input Stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - <br/>
     *
     * @param token <p>
     *            The token used to authenticate access to the Salesforce IoT
     *            Cloud Input Stream. The token is available from the Salesforce
     *            IoT Cloud platform after creation of the Input Stream.
     *            </p>
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The token used to authenticate access to the Salesforce IoT Cloud Input
     * Stream. The token is available from the Salesforce IoT Cloud platform
     * after creation of the Input Stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>40 - <br/>
     *
     * @param token <p>
     *            The token used to authenticate access to the Salesforce IoT
     *            Cloud Input Stream. The token is available from the Salesforce
     *            IoT Cloud platform after creation of the Input Stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceAction withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * <p>
     * The URL exposed by the Salesforce IoT Cloud Input Stream. The URL is
     * available from the Salesforce IoT Cloud platform after creation of the
     * Input Stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     * <b>Pattern:
     * </b>https://ingestion-[a-zA-Z0-9]{1,12}\.[a-zA-Z0-9]+\.((sfdc-
     * matrix\.net)|(sfdcnow\.com))/streams/\w{1,20}/\w{1,20}/event<br/>
     *
     * @return <p>
     *         The URL exposed by the Salesforce IoT Cloud Input Stream. The URL
     *         is available from the Salesforce IoT Cloud platform after
     *         creation of the Input Stream.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL exposed by the Salesforce IoT Cloud Input Stream. The URL is
     * available from the Salesforce IoT Cloud platform after creation of the
     * Input Stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     * <b>Pattern:
     * </b>https://ingestion-[a-zA-Z0-9]{1,12}\.[a-zA-Z0-9]+\.((sfdc-
     * matrix\.net)|(sfdcnow\.com))/streams/\w{1,20}/\w{1,20}/event<br/>
     *
     * @param url <p>
     *            The URL exposed by the Salesforce IoT Cloud Input Stream. The
     *            URL is available from the Salesforce IoT Cloud platform after
     *            creation of the Input Stream.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL exposed by the Salesforce IoT Cloud Input Stream. The URL is
     * available from the Salesforce IoT Cloud platform after creation of the
     * Input Stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     * <b>Pattern:
     * </b>https://ingestion-[a-zA-Z0-9]{1,12}\.[a-zA-Z0-9]+\.((sfdc-
     * matrix\.net)|(sfdcnow\.com))/streams/\w{1,20}/\w{1,20}/event<br/>
     *
     * @param url <p>
     *            The URL exposed by the Salesforce IoT Cloud Input Stream. The
     *            URL is available from the Salesforce IoT Cloud platform after
     *            creation of the Input Stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceAction withUrl(String url) {
        this.url = url;
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
        if (getToken() != null)
            sb.append("token: " + getToken() + ",");
        if (getUrl() != null)
            sb.append("url: " + getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceAction == false)
            return false;
        SalesforceAction other = (SalesforceAction) obj;

        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }
}
