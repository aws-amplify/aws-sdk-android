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
 * Updates an existing conference provider's settings.
 * </p>
 */
public class UpdateConferenceProviderRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String conferenceProviderArn;

    /**
     * <p>
     * The type of the conference provider.
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
     * The ARN of the conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the conference provider.
     *         </p>
     */
    public String getConferenceProviderArn() {
        return conferenceProviderArn;
    }

    /**
     * <p>
     * The ARN of the conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param conferenceProviderArn <p>
     *            The ARN of the conference provider.
     *            </p>
     */
    public void setConferenceProviderArn(String conferenceProviderArn) {
        this.conferenceProviderArn = conferenceProviderArn;
    }

    /**
     * <p>
     * The ARN of the conference provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param conferenceProviderArn <p>
     *            The ARN of the conference provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConferenceProviderRequest withConferenceProviderArn(String conferenceProviderArn) {
        this.conferenceProviderArn = conferenceProviderArn;
        return this;
    }

    /**
     * <p>
     * The type of the conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @return <p>
     *         The type of the conference provider.
     *         </p>
     * @see ConferenceProviderType
     */
    public String getConferenceProviderType() {
        return conferenceProviderType;
    }

    /**
     * <p>
     * The type of the conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @param conferenceProviderType <p>
     *            The type of the conference provider.
     *            </p>
     * @see ConferenceProviderType
     */
    public void setConferenceProviderType(String conferenceProviderType) {
        this.conferenceProviderType = conferenceProviderType;
    }

    /**
     * <p>
     * The type of the conference provider.
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
     *            The type of the conference provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConferenceProviderType
     */
    public UpdateConferenceProviderRequest withConferenceProviderType(String conferenceProviderType) {
        this.conferenceProviderType = conferenceProviderType;
        return this;
    }

    /**
     * <p>
     * The type of the conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @param conferenceProviderType <p>
     *            The type of the conference provider.
     *            </p>
     * @see ConferenceProviderType
     */
    public void setConferenceProviderType(ConferenceProviderType conferenceProviderType) {
        this.conferenceProviderType = conferenceProviderType.toString();
    }

    /**
     * <p>
     * The type of the conference provider.
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
     *            The type of the conference provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConferenceProviderType
     */
    public UpdateConferenceProviderRequest withConferenceProviderType(
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
    public UpdateConferenceProviderRequest withIPDialIn(IPDialIn iPDialIn) {
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
    public UpdateConferenceProviderRequest withPSTNDialIn(PSTNDialIn pSTNDialIn) {
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
    public UpdateConferenceProviderRequest withMeetingSetting(MeetingSetting meetingSetting) {
        this.meetingSetting = meetingSetting;
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
        if (getConferenceProviderArn() != null)
            sb.append("ConferenceProviderArn: " + getConferenceProviderArn() + ",");
        if (getConferenceProviderType() != null)
            sb.append("ConferenceProviderType: " + getConferenceProviderType() + ",");
        if (getIPDialIn() != null)
            sb.append("IPDialIn: " + getIPDialIn() + ",");
        if (getPSTNDialIn() != null)
            sb.append("PSTNDialIn: " + getPSTNDialIn() + ",");
        if (getMeetingSetting() != null)
            sb.append("MeetingSetting: " + getMeetingSetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getConferenceProviderArn() == null) ? 0 : getConferenceProviderArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getConferenceProviderType() == null) ? 0 : getConferenceProviderType()
                        .hashCode());
        hashCode = prime * hashCode + ((getIPDialIn() == null) ? 0 : getIPDialIn().hashCode());
        hashCode = prime * hashCode + ((getPSTNDialIn() == null) ? 0 : getPSTNDialIn().hashCode());
        hashCode = prime * hashCode
                + ((getMeetingSetting() == null) ? 0 : getMeetingSetting().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConferenceProviderRequest == false)
            return false;
        UpdateConferenceProviderRequest other = (UpdateConferenceProviderRequest) obj;

        if (other.getConferenceProviderArn() == null ^ this.getConferenceProviderArn() == null)
            return false;
        if (other.getConferenceProviderArn() != null
                && other.getConferenceProviderArn().equals(this.getConferenceProviderArn()) == false)
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
        return true;
    }
}
