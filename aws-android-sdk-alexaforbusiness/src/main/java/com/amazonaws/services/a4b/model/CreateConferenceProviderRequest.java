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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds a new conference provider under the user's AWS account.
 * </p>
 */
public class CreateConferenceProviderRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String conferenceProviderName;

    /**
     * <p>
     * Represents a type within a list of predefined types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     */
    private String conferenceProviderType;

    /**
     * <p>
     * The IP endpoint and protocol for calling.
     * </p>
     */
    private IPDialIn iPDialIn;

    /**
     * <p>
     * The information for PSTN conferencing.
     * </p>
     */
    private PSTNDialIn pSTNDialIn;

    /**
     * <p>
     * The meeting settings for the conference provider.
     * </p>
     */
    private MeetingSetting meetingSetting;

    /**
     * <p>
     * The request token of the client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of the conference provider.
     *         </p>
     */
    public String getConferenceProviderName() {
        return conferenceProviderName;
    }

    /**
     * <p>
     * The name of the conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param conferenceProviderName <p>
     *            The name of the conference provider.
     *            </p>
     */
    public void setConferenceProviderName(String conferenceProviderName) {
        this.conferenceProviderName = conferenceProviderName;
    }

    /**
     * <p>
     * The name of the conference provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param conferenceProviderName <p>
     *            The name of the conference provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConferenceProviderRequest withConferenceProviderName(String conferenceProviderName) {
        this.conferenceProviderName = conferenceProviderName;
        return this;
    }

    /**
     * <p>
     * Represents a type within a list of predefined types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @return <p>
     *         Represents a type within a list of predefined types.
     *         </p>
     * @see ConferenceProviderType
     */
    public String getConferenceProviderType() {
        return conferenceProviderType;
    }

    /**
     * <p>
     * Represents a type within a list of predefined types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @param conferenceProviderType <p>
     *            Represents a type within a list of predefined types.
     *            </p>
     * @see ConferenceProviderType
     */
    public void setConferenceProviderType(String conferenceProviderType) {
        this.conferenceProviderType = conferenceProviderType;
    }

    /**
     * <p>
     * Represents a type within a list of predefined types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @param conferenceProviderType <p>
     *            Represents a type within a list of predefined types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConferenceProviderType
     */
    public CreateConferenceProviderRequest withConferenceProviderType(String conferenceProviderType) {
        this.conferenceProviderType = conferenceProviderType;
        return this;
    }

    /**
     * <p>
     * Represents a type within a list of predefined types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @param conferenceProviderType <p>
     *            Represents a type within a list of predefined types.
     *            </p>
     * @see ConferenceProviderType
     */
    public void setConferenceProviderType(ConferenceProviderType conferenceProviderType) {
        this.conferenceProviderType = conferenceProviderType.toString();
    }

    /**
     * <p>
     * Represents a type within a list of predefined types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @param conferenceProviderType <p>
     *            Represents a type within a list of predefined types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConferenceProviderType
     */
    public CreateConferenceProviderRequest withConferenceProviderType(
            ConferenceProviderType conferenceProviderType) {
        this.conferenceProviderType = conferenceProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The IP endpoint and protocol for calling.
     * </p>
     *
     * @return <p>
     *         The IP endpoint and protocol for calling.
     *         </p>
     */
    public IPDialIn getIPDialIn() {
        return iPDialIn;
    }

    /**
     * <p>
     * The IP endpoint and protocol for calling.
     * </p>
     *
     * @param iPDialIn <p>
     *            The IP endpoint and protocol for calling.
     *            </p>
     */
    public void setIPDialIn(IPDialIn iPDialIn) {
        this.iPDialIn = iPDialIn;
    }

    /**
     * <p>
     * The IP endpoint and protocol for calling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iPDialIn <p>
     *            The IP endpoint and protocol for calling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConferenceProviderRequest withIPDialIn(IPDialIn iPDialIn) {
        this.iPDialIn = iPDialIn;
        return this;
    }

    /**
     * <p>
     * The information for PSTN conferencing.
     * </p>
     *
     * @return <p>
     *         The information for PSTN conferencing.
     *         </p>
     */
    public PSTNDialIn getPSTNDialIn() {
        return pSTNDialIn;
    }

    /**
     * <p>
     * The information for PSTN conferencing.
     * </p>
     *
     * @param pSTNDialIn <p>
     *            The information for PSTN conferencing.
     *            </p>
     */
    public void setPSTNDialIn(PSTNDialIn pSTNDialIn) {
        this.pSTNDialIn = pSTNDialIn;
    }

    /**
     * <p>
     * The information for PSTN conferencing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pSTNDialIn <p>
     *            The information for PSTN conferencing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConferenceProviderRequest withPSTNDialIn(PSTNDialIn pSTNDialIn) {
        this.pSTNDialIn = pSTNDialIn;
        return this;
    }

    /**
     * <p>
     * The meeting settings for the conference provider.
     * </p>
     *
     * @return <p>
     *         The meeting settings for the conference provider.
     *         </p>
     */
    public MeetingSetting getMeetingSetting() {
        return meetingSetting;
    }

    /**
     * <p>
     * The meeting settings for the conference provider.
     * </p>
     *
     * @param meetingSetting <p>
     *            The meeting settings for the conference provider.
     *            </p>
     */
    public void setMeetingSetting(MeetingSetting meetingSetting) {
        this.meetingSetting = meetingSetting;
    }

    /**
     * <p>
     * The meeting settings for the conference provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param meetingSetting <p>
     *            The meeting settings for the conference provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConferenceProviderRequest withMeetingSetting(MeetingSetting meetingSetting) {
        this.meetingSetting = meetingSetting;
        return this;
    }

    /**
     * <p>
     * The request token of the client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The request token of the client.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * The request token of the client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param clientRequestToken <p>
     *            The request token of the client.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The request token of the client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param clientRequestToken <p>
     *            The request token of the client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConferenceProviderRequest withClientRequestToken(String clientRequestToken) {
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
        if (getConferenceProviderName() != null)
            sb.append("ConferenceProviderName: " + getConferenceProviderName() + ",");
        if (getConferenceProviderType() != null)
            sb.append("ConferenceProviderType: " + getConferenceProviderType() + ",");
        if (getIPDialIn() != null)
            sb.append("IPDialIn: " + getIPDialIn() + ",");
        if (getPSTNDialIn() != null)
            sb.append("PSTNDialIn: " + getPSTNDialIn() + ",");
        if (getMeetingSetting() != null)
            sb.append("MeetingSetting: " + getMeetingSetting() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getConferenceProviderName() == null) ? 0 : getConferenceProviderName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getConferenceProviderType() == null) ? 0 : getConferenceProviderType()
                        .hashCode());
        hashCode = prime * hashCode + ((getIPDialIn() == null) ? 0 : getIPDialIn().hashCode());
        hashCode = prime * hashCode + ((getPSTNDialIn() == null) ? 0 : getPSTNDialIn().hashCode());
        hashCode = prime * hashCode
                + ((getMeetingSetting() == null) ? 0 : getMeetingSetting().hashCode());
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

        if (obj instanceof CreateConferenceProviderRequest == false)
            return false;
        CreateConferenceProviderRequest other = (CreateConferenceProviderRequest) obj;

        if (other.getConferenceProviderName() == null ^ this.getConferenceProviderName() == null)
            return false;
        if (other.getConferenceProviderName() != null
                && other.getConferenceProviderName().equals(this.getConferenceProviderName()) == false)
            return false;
        if (other.getConferenceProviderType() == null ^ this.getConferenceProviderType() == null)
            return false;
        if (other.getConferenceProviderType() != null
                && other.getConferenceProviderType().equals(this.getConferenceProviderType()) == false)
            return false;
        if (other.getIPDialIn() == null ^ this.getIPDialIn() == null)
            return false;
        if (other.getIPDialIn() != null && other.getIPDialIn().equals(this.getIPDialIn()) == false)
            return false;
        if (other.getPSTNDialIn() == null ^ this.getPSTNDialIn() == null)
            return false;
        if (other.getPSTNDialIn() != null
                && other.getPSTNDialIn().equals(this.getPSTNDialIn()) == false)
            return false;
        if (other.getMeetingSetting() == null ^ this.getMeetingSetting() == null)
            return false;
        if (other.getMeetingSetting() != null
                && other.getMeetingSetting().equals(this.getMeetingSetting()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
