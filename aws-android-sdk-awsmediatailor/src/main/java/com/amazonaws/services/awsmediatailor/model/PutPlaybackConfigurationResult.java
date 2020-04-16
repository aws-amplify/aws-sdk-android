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

package com.amazonaws.services.awsmediatailor.model;

import java.io.Serializable;

public class PutPlaybackConfigurationResult implements Serializable {
    /**
     * <p>
     * The URL for the ad decision server (ADS). This includes the specification
     * of static parameters and placeholders for dynamic parameters. AWS
     * Elemental MediaTailor substitutes player-specific and session-specific
     * parameters as needed when calling the ADS. Alternately, for testing, you
     * can provide a static VAST URL. The maximum length is 25,000 characters.
     * </p>
     */
    private String adDecisionServerUrl;

    /**
     * <p>
     * The configuration for Avail Suppression. Ad suppression can be used to
     * turn off ad personalization in a long manifest, or if a viewer joins
     * mid-break.
     * </p>
     */
    private AvailSuppression availSuppression;

    /**
     * <p>
     * The configuration for using a content delivery network (CDN), like Amazon
     * CloudFront, for content and ad segment management.
     * </p>
     */
    private CdnConfiguration cdnConfiguration;

    /**
     * <p>
     * The configuration for DASH content.
     * </p>
     */
    private DashConfiguration dashConfiguration;

    /**
     * <p>
     * The configuration for HLS content.
     * </p>
     */
    private HlsConfiguration hlsConfiguration;

    /**
     * <p>
     * The configuration for pre-roll ad insertion.
     * </p>
     */
    private LivePreRollConfiguration livePreRollConfiguration;

    /**
     * <p>
     * The identifier for the playback configuration.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The maximum duration of underfilled ad time (in seconds) allowed in an ad
     * break.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer personalizationThresholdSeconds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the playback configuration.
     * </p>
     */
    private String playbackConfigurationArn;

    /**
     * <p>
     * The URL that the player accesses to get a manifest from AWS Elemental
     * MediaTailor. This session will use server-side reporting.
     * </p>
     */
    private String playbackEndpointPrefix;

    /**
     * <p>
     * The URL that the player uses to initialize a session that uses
     * client-side reporting.
     * </p>
     */
    private String sessionInitializationEndpointPrefix;

    /**
     * <p>
     * The URL for a high-quality video asset to transcode and use to fill in
     * time that's not used by ads. AWS Elemental MediaTailor shows the slate to
     * fill in gaps in media content. Configuring the slate is optional for
     * non-VPAID playback configurations. For VPAID, the slate is required
     * because MediaTailor provides it in the slots designated for dynamic ad
     * content. The slate must be a high-quality asset that contains both audio
     * and video.
     * </p>
     */
    private String slateAdUrl;

    /**
     * <p>
     * The tags assigned to the playback configuration.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name that is used to associate this playback configuration with a
     * custom transcode profile. This overrides the dynamic transcoding defaults
     * of MediaTailor. Use this only if you have already set up custom profiles
     * with the help of AWS Support.
     * </p>
     */
    private String transcodeProfileName;

    /**
     * <p>
     * The URL prefix for the master playlist for the stream, minus the asset
     * ID. The maximum length is 512 characters.
     * </p>
     */
    private String videoContentSourceUrl;

    /**
     * <p>
     * The URL for the ad decision server (ADS). This includes the specification
     * of static parameters and placeholders for dynamic parameters. AWS
     * Elemental MediaTailor substitutes player-specific and session-specific
     * parameters as needed when calling the ADS. Alternately, for testing, you
     * can provide a static VAST URL. The maximum length is 25,000 characters.
     * </p>
     *
     * @return <p>
     *         The URL for the ad decision server (ADS). This includes the
     *         specification of static parameters and placeholders for dynamic
     *         parameters. AWS Elemental MediaTailor substitutes player-specific
     *         and session-specific parameters as needed when calling the ADS.
     *         Alternately, for testing, you can provide a static VAST URL. The
     *         maximum length is 25,000 characters.
     *         </p>
     */
    public String getAdDecisionServerUrl() {
        return adDecisionServerUrl;
    }

    /**
     * <p>
     * The URL for the ad decision server (ADS). This includes the specification
     * of static parameters and placeholders for dynamic parameters. AWS
     * Elemental MediaTailor substitutes player-specific and session-specific
     * parameters as needed when calling the ADS. Alternately, for testing, you
     * can provide a static VAST URL. The maximum length is 25,000 characters.
     * </p>
     *
     * @param adDecisionServerUrl <p>
     *            The URL for the ad decision server (ADS). This includes the
     *            specification of static parameters and placeholders for
     *            dynamic parameters. AWS Elemental MediaTailor substitutes
     *            player-specific and session-specific parameters as needed when
     *            calling the ADS. Alternately, for testing, you can provide a
     *            static VAST URL. The maximum length is 25,000 characters.
     *            </p>
     */
    public void setAdDecisionServerUrl(String adDecisionServerUrl) {
        this.adDecisionServerUrl = adDecisionServerUrl;
    }

    /**
     * <p>
     * The URL for the ad decision server (ADS). This includes the specification
     * of static parameters and placeholders for dynamic parameters. AWS
     * Elemental MediaTailor substitutes player-specific and session-specific
     * parameters as needed when calling the ADS. Alternately, for testing, you
     * can provide a static VAST URL. The maximum length is 25,000 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adDecisionServerUrl <p>
     *            The URL for the ad decision server (ADS). This includes the
     *            specification of static parameters and placeholders for
     *            dynamic parameters. AWS Elemental MediaTailor substitutes
     *            player-specific and session-specific parameters as needed when
     *            calling the ADS. Alternately, for testing, you can provide a
     *            static VAST URL. The maximum length is 25,000 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withAdDecisionServerUrl(String adDecisionServerUrl) {
        this.adDecisionServerUrl = adDecisionServerUrl;
        return this;
    }

    /**
     * <p>
     * The configuration for Avail Suppression. Ad suppression can be used to
     * turn off ad personalization in a long manifest, or if a viewer joins
     * mid-break.
     * </p>
     *
     * @return <p>
     *         The configuration for Avail Suppression. Ad suppression can be
     *         used to turn off ad personalization in a long manifest, or if a
     *         viewer joins mid-break.
     *         </p>
     */
    public AvailSuppression getAvailSuppression() {
        return availSuppression;
    }

    /**
     * <p>
     * The configuration for Avail Suppression. Ad suppression can be used to
     * turn off ad personalization in a long manifest, or if a viewer joins
     * mid-break.
     * </p>
     *
     * @param availSuppression <p>
     *            The configuration for Avail Suppression. Ad suppression can be
     *            used to turn off ad personalization in a long manifest, or if
     *            a viewer joins mid-break.
     *            </p>
     */
    public void setAvailSuppression(AvailSuppression availSuppression) {
        this.availSuppression = availSuppression;
    }

    /**
     * <p>
     * The configuration for Avail Suppression. Ad suppression can be used to
     * turn off ad personalization in a long manifest, or if a viewer joins
     * mid-break.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availSuppression <p>
     *            The configuration for Avail Suppression. Ad suppression can be
     *            used to turn off ad personalization in a long manifest, or if
     *            a viewer joins mid-break.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withAvailSuppression(AvailSuppression availSuppression) {
        this.availSuppression = availSuppression;
        return this;
    }

    /**
     * <p>
     * The configuration for using a content delivery network (CDN), like Amazon
     * CloudFront, for content and ad segment management.
     * </p>
     *
     * @return <p>
     *         The configuration for using a content delivery network (CDN),
     *         like Amazon CloudFront, for content and ad segment management.
     *         </p>
     */
    public CdnConfiguration getCdnConfiguration() {
        return cdnConfiguration;
    }

    /**
     * <p>
     * The configuration for using a content delivery network (CDN), like Amazon
     * CloudFront, for content and ad segment management.
     * </p>
     *
     * @param cdnConfiguration <p>
     *            The configuration for using a content delivery network (CDN),
     *            like Amazon CloudFront, for content and ad segment management.
     *            </p>
     */
    public void setCdnConfiguration(CdnConfiguration cdnConfiguration) {
        this.cdnConfiguration = cdnConfiguration;
    }

    /**
     * <p>
     * The configuration for using a content delivery network (CDN), like Amazon
     * CloudFront, for content and ad segment management.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cdnConfiguration <p>
     *            The configuration for using a content delivery network (CDN),
     *            like Amazon CloudFront, for content and ad segment management.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withCdnConfiguration(CdnConfiguration cdnConfiguration) {
        this.cdnConfiguration = cdnConfiguration;
        return this;
    }

    /**
     * <p>
     * The configuration for DASH content.
     * </p>
     *
     * @return <p>
     *         The configuration for DASH content.
     *         </p>
     */
    public DashConfiguration getDashConfiguration() {
        return dashConfiguration;
    }

    /**
     * <p>
     * The configuration for DASH content.
     * </p>
     *
     * @param dashConfiguration <p>
     *            The configuration for DASH content.
     *            </p>
     */
    public void setDashConfiguration(DashConfiguration dashConfiguration) {
        this.dashConfiguration = dashConfiguration;
    }

    /**
     * <p>
     * The configuration for DASH content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dashConfiguration <p>
     *            The configuration for DASH content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withDashConfiguration(DashConfiguration dashConfiguration) {
        this.dashConfiguration = dashConfiguration;
        return this;
    }

    /**
     * <p>
     * The configuration for HLS content.
     * </p>
     *
     * @return <p>
     *         The configuration for HLS content.
     *         </p>
     */
    public HlsConfiguration getHlsConfiguration() {
        return hlsConfiguration;
    }

    /**
     * <p>
     * The configuration for HLS content.
     * </p>
     *
     * @param hlsConfiguration <p>
     *            The configuration for HLS content.
     *            </p>
     */
    public void setHlsConfiguration(HlsConfiguration hlsConfiguration) {
        this.hlsConfiguration = hlsConfiguration;
    }

    /**
     * <p>
     * The configuration for HLS content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsConfiguration <p>
     *            The configuration for HLS content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withHlsConfiguration(HlsConfiguration hlsConfiguration) {
        this.hlsConfiguration = hlsConfiguration;
        return this;
    }

    /**
     * <p>
     * The configuration for pre-roll ad insertion.
     * </p>
     *
     * @return <p>
     *         The configuration for pre-roll ad insertion.
     *         </p>
     */
    public LivePreRollConfiguration getLivePreRollConfiguration() {
        return livePreRollConfiguration;
    }

    /**
     * <p>
     * The configuration for pre-roll ad insertion.
     * </p>
     *
     * @param livePreRollConfiguration <p>
     *            The configuration for pre-roll ad insertion.
     *            </p>
     */
    public void setLivePreRollConfiguration(LivePreRollConfiguration livePreRollConfiguration) {
        this.livePreRollConfiguration = livePreRollConfiguration;
    }

    /**
     * <p>
     * The configuration for pre-roll ad insertion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param livePreRollConfiguration <p>
     *            The configuration for pre-roll ad insertion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withLivePreRollConfiguration(
            LivePreRollConfiguration livePreRollConfiguration) {
        this.livePreRollConfiguration = livePreRollConfiguration;
        return this;
    }

    /**
     * <p>
     * The identifier for the playback configuration.
     * </p>
     *
     * @return <p>
     *         The identifier for the playback configuration.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The identifier for the playback configuration.
     * </p>
     *
     * @param name <p>
     *            The identifier for the playback configuration.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The identifier for the playback configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The identifier for the playback configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The maximum duration of underfilled ad time (in seconds) allowed in an ad
     * break.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum duration of underfilled ad time (in seconds) allowed
     *         in an ad break.
     *         </p>
     */
    public Integer getPersonalizationThresholdSeconds() {
        return personalizationThresholdSeconds;
    }

    /**
     * <p>
     * The maximum duration of underfilled ad time (in seconds) allowed in an ad
     * break.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param personalizationThresholdSeconds <p>
     *            The maximum duration of underfilled ad time (in seconds)
     *            allowed in an ad break.
     *            </p>
     */
    public void setPersonalizationThresholdSeconds(Integer personalizationThresholdSeconds) {
        this.personalizationThresholdSeconds = personalizationThresholdSeconds;
    }

    /**
     * <p>
     * The maximum duration of underfilled ad time (in seconds) allowed in an ad
     * break.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param personalizationThresholdSeconds <p>
     *            The maximum duration of underfilled ad time (in seconds)
     *            allowed in an ad break.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withPersonalizationThresholdSeconds(
            Integer personalizationThresholdSeconds) {
        this.personalizationThresholdSeconds = personalizationThresholdSeconds;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the playback configuration.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the playback configuration.
     *         </p>
     */
    public String getPlaybackConfigurationArn() {
        return playbackConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the playback configuration.
     * </p>
     *
     * @param playbackConfigurationArn <p>
     *            The Amazon Resource Name (ARN) for the playback configuration.
     *            </p>
     */
    public void setPlaybackConfigurationArn(String playbackConfigurationArn) {
        this.playbackConfigurationArn = playbackConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the playback configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param playbackConfigurationArn <p>
     *            The Amazon Resource Name (ARN) for the playback configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withPlaybackConfigurationArn(
            String playbackConfigurationArn) {
        this.playbackConfigurationArn = playbackConfigurationArn;
        return this;
    }

    /**
     * <p>
     * The URL that the player accesses to get a manifest from AWS Elemental
     * MediaTailor. This session will use server-side reporting.
     * </p>
     *
     * @return <p>
     *         The URL that the player accesses to get a manifest from AWS
     *         Elemental MediaTailor. This session will use server-side
     *         reporting.
     *         </p>
     */
    public String getPlaybackEndpointPrefix() {
        return playbackEndpointPrefix;
    }

    /**
     * <p>
     * The URL that the player accesses to get a manifest from AWS Elemental
     * MediaTailor. This session will use server-side reporting.
     * </p>
     *
     * @param playbackEndpointPrefix <p>
     *            The URL that the player accesses to get a manifest from AWS
     *            Elemental MediaTailor. This session will use server-side
     *            reporting.
     *            </p>
     */
    public void setPlaybackEndpointPrefix(String playbackEndpointPrefix) {
        this.playbackEndpointPrefix = playbackEndpointPrefix;
    }

    /**
     * <p>
     * The URL that the player accesses to get a manifest from AWS Elemental
     * MediaTailor. This session will use server-side reporting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param playbackEndpointPrefix <p>
     *            The URL that the player accesses to get a manifest from AWS
     *            Elemental MediaTailor. This session will use server-side
     *            reporting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withPlaybackEndpointPrefix(String playbackEndpointPrefix) {
        this.playbackEndpointPrefix = playbackEndpointPrefix;
        return this;
    }

    /**
     * <p>
     * The URL that the player uses to initialize a session that uses
     * client-side reporting.
     * </p>
     *
     * @return <p>
     *         The URL that the player uses to initialize a session that uses
     *         client-side reporting.
     *         </p>
     */
    public String getSessionInitializationEndpointPrefix() {
        return sessionInitializationEndpointPrefix;
    }

    /**
     * <p>
     * The URL that the player uses to initialize a session that uses
     * client-side reporting.
     * </p>
     *
     * @param sessionInitializationEndpointPrefix <p>
     *            The URL that the player uses to initialize a session that uses
     *            client-side reporting.
     *            </p>
     */
    public void setSessionInitializationEndpointPrefix(String sessionInitializationEndpointPrefix) {
        this.sessionInitializationEndpointPrefix = sessionInitializationEndpointPrefix;
    }

    /**
     * <p>
     * The URL that the player uses to initialize a session that uses
     * client-side reporting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionInitializationEndpointPrefix <p>
     *            The URL that the player uses to initialize a session that uses
     *            client-side reporting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withSessionInitializationEndpointPrefix(
            String sessionInitializationEndpointPrefix) {
        this.sessionInitializationEndpointPrefix = sessionInitializationEndpointPrefix;
        return this;
    }

    /**
     * <p>
     * The URL for a high-quality video asset to transcode and use to fill in
     * time that's not used by ads. AWS Elemental MediaTailor shows the slate to
     * fill in gaps in media content. Configuring the slate is optional for
     * non-VPAID playback configurations. For VPAID, the slate is required
     * because MediaTailor provides it in the slots designated for dynamic ad
     * content. The slate must be a high-quality asset that contains both audio
     * and video.
     * </p>
     *
     * @return <p>
     *         The URL for a high-quality video asset to transcode and use to
     *         fill in time that's not used by ads. AWS Elemental MediaTailor
     *         shows the slate to fill in gaps in media content. Configuring the
     *         slate is optional for non-VPAID playback configurations. For
     *         VPAID, the slate is required because MediaTailor provides it in
     *         the slots designated for dynamic ad content. The slate must be a
     *         high-quality asset that contains both audio and video.
     *         </p>
     */
    public String getSlateAdUrl() {
        return slateAdUrl;
    }

    /**
     * <p>
     * The URL for a high-quality video asset to transcode and use to fill in
     * time that's not used by ads. AWS Elemental MediaTailor shows the slate to
     * fill in gaps in media content. Configuring the slate is optional for
     * non-VPAID playback configurations. For VPAID, the slate is required
     * because MediaTailor provides it in the slots designated for dynamic ad
     * content. The slate must be a high-quality asset that contains both audio
     * and video.
     * </p>
     *
     * @param slateAdUrl <p>
     *            The URL for a high-quality video asset to transcode and use to
     *            fill in time that's not used by ads. AWS Elemental MediaTailor
     *            shows the slate to fill in gaps in media content. Configuring
     *            the slate is optional for non-VPAID playback configurations.
     *            For VPAID, the slate is required because MediaTailor provides
     *            it in the slots designated for dynamic ad content. The slate
     *            must be a high-quality asset that contains both audio and
     *            video.
     *            </p>
     */
    public void setSlateAdUrl(String slateAdUrl) {
        this.slateAdUrl = slateAdUrl;
    }

    /**
     * <p>
     * The URL for a high-quality video asset to transcode and use to fill in
     * time that's not used by ads. AWS Elemental MediaTailor shows the slate to
     * fill in gaps in media content. Configuring the slate is optional for
     * non-VPAID playback configurations. For VPAID, the slate is required
     * because MediaTailor provides it in the slots designated for dynamic ad
     * content. The slate must be a high-quality asset that contains both audio
     * and video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slateAdUrl <p>
     *            The URL for a high-quality video asset to transcode and use to
     *            fill in time that's not used by ads. AWS Elemental MediaTailor
     *            shows the slate to fill in gaps in media content. Configuring
     *            the slate is optional for non-VPAID playback configurations.
     *            For VPAID, the slate is required because MediaTailor provides
     *            it in the slots designated for dynamic ad content. The slate
     *            must be a high-quality asset that contains both audio and
     *            video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withSlateAdUrl(String slateAdUrl) {
        this.slateAdUrl = slateAdUrl;
        return this;
    }

    /**
     * <p>
     * The tags assigned to the playback configuration.
     * </p>
     *
     * @return <p>
     *         The tags assigned to the playback configuration.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the playback configuration.
     * </p>
     *
     * @param tags <p>
     *            The tags assigned to the playback configuration.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the playback configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the playback configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags assigned to the playback configuration.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PutPlaybackConfigurationResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The name that is used to associate this playback configuration with a
     * custom transcode profile. This overrides the dynamic transcoding defaults
     * of MediaTailor. Use this only if you have already set up custom profiles
     * with the help of AWS Support.
     * </p>
     *
     * @return <p>
     *         The name that is used to associate this playback configuration
     *         with a custom transcode profile. This overrides the dynamic
     *         transcoding defaults of MediaTailor. Use this only if you have
     *         already set up custom profiles with the help of AWS Support.
     *         </p>
     */
    public String getTranscodeProfileName() {
        return transcodeProfileName;
    }

    /**
     * <p>
     * The name that is used to associate this playback configuration with a
     * custom transcode profile. This overrides the dynamic transcoding defaults
     * of MediaTailor. Use this only if you have already set up custom profiles
     * with the help of AWS Support.
     * </p>
     *
     * @param transcodeProfileName <p>
     *            The name that is used to associate this playback configuration
     *            with a custom transcode profile. This overrides the dynamic
     *            transcoding defaults of MediaTailor. Use this only if you have
     *            already set up custom profiles with the help of AWS Support.
     *            </p>
     */
    public void setTranscodeProfileName(String transcodeProfileName) {
        this.transcodeProfileName = transcodeProfileName;
    }

    /**
     * <p>
     * The name that is used to associate this playback configuration with a
     * custom transcode profile. This overrides the dynamic transcoding defaults
     * of MediaTailor. Use this only if you have already set up custom profiles
     * with the help of AWS Support.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcodeProfileName <p>
     *            The name that is used to associate this playback configuration
     *            with a custom transcode profile. This overrides the dynamic
     *            transcoding defaults of MediaTailor. Use this only if you have
     *            already set up custom profiles with the help of AWS Support.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withTranscodeProfileName(String transcodeProfileName) {
        this.transcodeProfileName = transcodeProfileName;
        return this;
    }

    /**
     * <p>
     * The URL prefix for the master playlist for the stream, minus the asset
     * ID. The maximum length is 512 characters.
     * </p>
     *
     * @return <p>
     *         The URL prefix for the master playlist for the stream, minus the
     *         asset ID. The maximum length is 512 characters.
     *         </p>
     */
    public String getVideoContentSourceUrl() {
        return videoContentSourceUrl;
    }

    /**
     * <p>
     * The URL prefix for the master playlist for the stream, minus the asset
     * ID. The maximum length is 512 characters.
     * </p>
     *
     * @param videoContentSourceUrl <p>
     *            The URL prefix for the master playlist for the stream, minus
     *            the asset ID. The maximum length is 512 characters.
     *            </p>
     */
    public void setVideoContentSourceUrl(String videoContentSourceUrl) {
        this.videoContentSourceUrl = videoContentSourceUrl;
    }

    /**
     * <p>
     * The URL prefix for the master playlist for the stream, minus the asset
     * ID. The maximum length is 512 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoContentSourceUrl <p>
     *            The URL prefix for the master playlist for the stream, minus
     *            the asset ID. The maximum length is 512 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPlaybackConfigurationResult withVideoContentSourceUrl(String videoContentSourceUrl) {
        this.videoContentSourceUrl = videoContentSourceUrl;
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
        if (getAdDecisionServerUrl() != null)
            sb.append("AdDecisionServerUrl: " + getAdDecisionServerUrl() + ",");
        if (getAvailSuppression() != null)
            sb.append("AvailSuppression: " + getAvailSuppression() + ",");
        if (getCdnConfiguration() != null)
            sb.append("CdnConfiguration: " + getCdnConfiguration() + ",");
        if (getDashConfiguration() != null)
            sb.append("DashConfiguration: " + getDashConfiguration() + ",");
        if (getHlsConfiguration() != null)
            sb.append("HlsConfiguration: " + getHlsConfiguration() + ",");
        if (getLivePreRollConfiguration() != null)
            sb.append("LivePreRollConfiguration: " + getLivePreRollConfiguration() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPersonalizationThresholdSeconds() != null)
            sb.append("PersonalizationThresholdSeconds: " + getPersonalizationThresholdSeconds()
                    + ",");
        if (getPlaybackConfigurationArn() != null)
            sb.append("PlaybackConfigurationArn: " + getPlaybackConfigurationArn() + ",");
        if (getPlaybackEndpointPrefix() != null)
            sb.append("PlaybackEndpointPrefix: " + getPlaybackEndpointPrefix() + ",");
        if (getSessionInitializationEndpointPrefix() != null)
            sb.append("SessionInitializationEndpointPrefix: "
                    + getSessionInitializationEndpointPrefix() + ",");
        if (getSlateAdUrl() != null)
            sb.append("SlateAdUrl: " + getSlateAdUrl() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getTranscodeProfileName() != null)
            sb.append("TranscodeProfileName: " + getTranscodeProfileName() + ",");
        if (getVideoContentSourceUrl() != null)
            sb.append("VideoContentSourceUrl: " + getVideoContentSourceUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdDecisionServerUrl() == null) ? 0 : getAdDecisionServerUrl().hashCode());
        hashCode = prime * hashCode
                + ((getAvailSuppression() == null) ? 0 : getAvailSuppression().hashCode());
        hashCode = prime * hashCode
                + ((getCdnConfiguration() == null) ? 0 : getCdnConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getDashConfiguration() == null) ? 0 : getDashConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getHlsConfiguration() == null) ? 0 : getHlsConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getLivePreRollConfiguration() == null) ? 0 : getLivePreRollConfiguration()
                        .hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPersonalizationThresholdSeconds() == null) ? 0
                        : getPersonalizationThresholdSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getPlaybackConfigurationArn() == null) ? 0 : getPlaybackConfigurationArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPlaybackEndpointPrefix() == null) ? 0 : getPlaybackEndpointPrefix()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSessionInitializationEndpointPrefix() == null) ? 0
                        : getSessionInitializationEndpointPrefix().hashCode());
        hashCode = prime * hashCode + ((getSlateAdUrl() == null) ? 0 : getSlateAdUrl().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getTranscodeProfileName() == null) ? 0 : getTranscodeProfileName().hashCode());
        hashCode = prime
                * hashCode
                + ((getVideoContentSourceUrl() == null) ? 0 : getVideoContentSourceUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPlaybackConfigurationResult == false)
            return false;
        PutPlaybackConfigurationResult other = (PutPlaybackConfigurationResult) obj;

        if (other.getAdDecisionServerUrl() == null ^ this.getAdDecisionServerUrl() == null)
            return false;
        if (other.getAdDecisionServerUrl() != null
                && other.getAdDecisionServerUrl().equals(this.getAdDecisionServerUrl()) == false)
            return false;
        if (other.getAvailSuppression() == null ^ this.getAvailSuppression() == null)
            return false;
        if (other.getAvailSuppression() != null
                && other.getAvailSuppression().equals(this.getAvailSuppression()) == false)
            return false;
        if (other.getCdnConfiguration() == null ^ this.getCdnConfiguration() == null)
            return false;
        if (other.getCdnConfiguration() != null
                && other.getCdnConfiguration().equals(this.getCdnConfiguration()) == false)
            return false;
        if (other.getDashConfiguration() == null ^ this.getDashConfiguration() == null)
            return false;
        if (other.getDashConfiguration() != null
                && other.getDashConfiguration().equals(this.getDashConfiguration()) == false)
            return false;
        if (other.getHlsConfiguration() == null ^ this.getHlsConfiguration() == null)
            return false;
        if (other.getHlsConfiguration() != null
                && other.getHlsConfiguration().equals(this.getHlsConfiguration()) == false)
            return false;
        if (other.getLivePreRollConfiguration() == null
                ^ this.getLivePreRollConfiguration() == null)
            return false;
        if (other.getLivePreRollConfiguration() != null
                && other.getLivePreRollConfiguration().equals(this.getLivePreRollConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPersonalizationThresholdSeconds() == null
                ^ this.getPersonalizationThresholdSeconds() == null)
            return false;
        if (other.getPersonalizationThresholdSeconds() != null
                && other.getPersonalizationThresholdSeconds().equals(
                        this.getPersonalizationThresholdSeconds()) == false)
            return false;
        if (other.getPlaybackConfigurationArn() == null
                ^ this.getPlaybackConfigurationArn() == null)
            return false;
        if (other.getPlaybackConfigurationArn() != null
                && other.getPlaybackConfigurationArn().equals(this.getPlaybackConfigurationArn()) == false)
            return false;
        if (other.getPlaybackEndpointPrefix() == null ^ this.getPlaybackEndpointPrefix() == null)
            return false;
        if (other.getPlaybackEndpointPrefix() != null
                && other.getPlaybackEndpointPrefix().equals(this.getPlaybackEndpointPrefix()) == false)
            return false;
        if (other.getSessionInitializationEndpointPrefix() == null
                ^ this.getSessionInitializationEndpointPrefix() == null)
            return false;
        if (other.getSessionInitializationEndpointPrefix() != null
                && other.getSessionInitializationEndpointPrefix().equals(
                        this.getSessionInitializationEndpointPrefix()) == false)
            return false;
        if (other.getSlateAdUrl() == null ^ this.getSlateAdUrl() == null)
            return false;
        if (other.getSlateAdUrl() != null
                && other.getSlateAdUrl().equals(this.getSlateAdUrl()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTranscodeProfileName() == null ^ this.getTranscodeProfileName() == null)
            return false;
        if (other.getTranscodeProfileName() != null
                && other.getTranscodeProfileName().equals(this.getTranscodeProfileName()) == false)
            return false;
        if (other.getVideoContentSourceUrl() == null ^ this.getVideoContentSourceUrl() == null)
            return false;
        if (other.getVideoContentSourceUrl() != null
                && other.getVideoContentSourceUrl().equals(this.getVideoContentSourceUrl()) == false)
            return false;
        return true;
    }
}
