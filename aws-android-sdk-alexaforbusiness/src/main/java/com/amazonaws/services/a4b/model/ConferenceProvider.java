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

/**
 * <p>
 * An entity that provides a conferencing solution. Alexa for Business acts as
 * the voice interface and mediator that connects users to their preferred
 * conference provider. Examples of conference providers include Amazon Chime,
 * Zoom, Cisco, and Polycom.
 * </p>
 */
public class ConferenceProvider implements Serializable {
    /**
     * <p>
     * The ARN of the newly created conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String arn;

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
    private String name;

    /**
     * <p>
     * The type of conference providers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     */
    private String type;

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
     * The ARN of the newly created conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the newly created conference provider.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of the newly created conference provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param arn <p>
     *            The ARN of the newly created conference provider.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the newly created conference provider.
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
     * @param arn <p>
     *            The ARN of the newly created conference provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConferenceProvider withArn(String arn) {
        this.arn = arn;
        return this;
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
     * @return <p>
     *         The name of the conference provider.
     *         </p>
     */
    public String getName() {
        return name;
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
     * @param name <p>
     *            The name of the conference provider.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
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
     * @param name <p>
     *            The name of the conference provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConferenceProvider withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of conference providers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @return <p>
     *         The type of conference providers.
     *         </p>
     * @see ConferenceProviderType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of conference providers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @param type <p>
     *            The type of conference providers.
     *            </p>
     * @see ConferenceProviderType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of conference providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @param type <p>
     *            The type of conference providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConferenceProviderType
     */
    public ConferenceProvider withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of conference providers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @param type <p>
     *            The type of conference providers.
     *            </p>
     * @see ConferenceProviderType
     */
    public void setType(ConferenceProviderType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of conference providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM,
     * RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM
     *
     * @param type <p>
     *            The type of conference providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConferenceProviderType
     */
    public ConferenceProvider withType(ConferenceProviderType type) {
        this.type = type.toString();
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
    public ConferenceProvider withIPDialIn(IPDialIn iPDialIn) {
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
    public ConferenceProvider withPSTNDialIn(PSTNDialIn pSTNDialIn) {
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
    public ConferenceProvider withMeetingSetting(MeetingSetting meetingSetting) {
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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

        if (obj instanceof ConferenceProvider == false)
            return false;
        ConferenceProvider other = (ConferenceProvider) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
