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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Specified video input in a template.
 */
public class InputTemplate implements Serializable {
    /**
     * Specifies set of audio selectors within an input to combine. An input may
     * have multiple audio selector groups. See
     * "Audio Selector Group":#inputs-audio_selector_group for more information.
     */
    private java.util.Map<String, AudioSelectorGroup> audioSelectorGroups;

    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks
     * from the input that you will use in your outputs. You can use mutiple
     * Audio selectors per input.
     */
    private java.util.Map<String, AudioSelector> audioSelectors;

    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data
     * from the input that you will use in your outputs. You can use mutiple
     * captions selectors per input.
     */
    private java.util.Map<String, CaptionSelector> captionSelectors;

    /**
     * Use Cropping selection (crop) to specify the video area that the service
     * will include in the output video frame. If you specify a value here, it
     * will override any value that you specify in the output setting Cropping
     * selection (crop).
     */
    private Rectangle crop;

    /**
     * Enable Deblock (InputDeblockFilter) to produce smoother motion in the
     * output. Default is disabled. Only manaully controllable for MPEG2 and
     * uncompressed video inputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String deblockFilter;

    /**
     * Enable Denoise (InputDenoiseFilter) to filter noise from the input.
     * Default is disabled. Only applicable to MPEG2, H.264, H.265, and
     * uncompressed video inputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String denoiseFilter;

    /**
     * Use Filter enable (InputFilterEnable) to specify how the transcoding
     * service applies the denoise and deblock filters. You must also enable the
     * filters separately, with Denoise (InputDenoiseFilter) and Deblock
     * (InputDeblockFilter). * Auto - The transcoding service determines whether
     * to apply filtering, depending on input type and quality. * Disable - The
     * input is not filtered. This is true even if you use the API to enable
     * them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in
     * put is filtered regardless of input type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, DISABLE, FORCE
     */
    private String filterEnable;

    /**
     * Use Filter strength (FilterStrength) to adjust the magnitude the input
     * filter settings (Deblock and Denoise). The range is -5 to 5. Default is
     * 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-5 - 5<br/>
     */
    private Integer filterStrength;

    /**
     * Enable the image inserter feature to include a graphic overlay on your
     * video. Enable or disable this feature for each input individually. This
     * setting is disabled by default.
     */
    private ImageInserter imageInserter;

    /**
     * (InputClippings) contains sets of start and end times that together
     * specify a portion of the input to be used in the outputs. If you provide
     * only a start time, the clip will be the entire input from that point to
     * the end. If you provide only an end time, it will be the entire input up
     * to that point. When you specify more than one input clip, the transcoding
     * service creates the job outputs by stringing the clips together in the
     * order you specify them.
     */
    private java.util.List<InputClipping> inputClippings;

    /**
     * Use Selection placement (position) to define the video area in your
     * output frame. The area outside of the rectangle that you specify here is
     * black. If you specify a value here, it will override any value that you
     * specify in the output setting Selection placement (position). If you
     * specify a value here, this will override any AFD values in your input,
     * even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If
     * you specify a value here, this will ignore anything that you specify for
     * the setting Scaling Behavior (scalingBehavior).
     */
    private Rectangle position;

    /**
     * Use Program (programNumber) to select a specific program from within a
     * multi-program transport stream. Note that Quad 4K is not currently
     * supported. Default is the first program within the transport stream. If
     * the program you specify doesn't exist, the transcoding service will use
     * this default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer programNumber;

    /**
     * Set PSI control (InputPsiControl) for transport stream inputs to specify
     * which data the demux process to scans. * Ignore PSI - Scan all PIDs for
     * audio and video. * Use PSI - Scan only PSI data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE_PSI, USE_PSI
     */
    private String psiControl;

    /**
     * Use this Timecode source setting, located under the input settings
     * (InputTimecodeSource), to specify how the service counts input video
     * frames. This input frame count affects only the behavior of features that
     * apply to a single input at a time, such as input clipping and
     * synchronizing some captions formats. Choose Embedded (EMBEDDED) to use
     * the timecodes in your input video. Choose Start at zero (ZEROBASED) to
     * start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to
     * start the first frame at the timecode that you specify in the setting
     * Start timecode (timecodeStart). If you don't specify a value for Timecode
     * source, the service will use Embedded by default. For more information
     * about timecodes, see
     * https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, ZEROBASED, SPECIFIEDSTART
     */
    private String timecodeSource;

    /**
     * Specify the timecode that you want the service to use for this input's
     * initial frame. To use this setting, you must set the Timecode source
     * setting, located under the input settings (InputTimecodeSource), to
     * Specified start (SPECIFIEDSTART). For more information about timecodes,
     * see https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 11<br/>
     * <b>Pattern: </b>^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$<br/>
     */
    private String timecodeStart;

    /**
     * Selector for video.
     */
    private VideoSelector videoSelector;

    /**
     * Specifies set of audio selectors within an input to combine. An input may
     * have multiple audio selector groups. See
     * "Audio Selector Group":#inputs-audio_selector_group for more information.
     *
     * @return Specifies set of audio selectors within an input to combine. An
     *         input may have multiple audio selector groups. See
     *         "Audio Selector Group":#inputs-audio_selector_group for more
     *         information.
     */
    public java.util.Map<String, AudioSelectorGroup> getAudioSelectorGroups() {
        return audioSelectorGroups;
    }

    /**
     * Specifies set of audio selectors within an input to combine. An input may
     * have multiple audio selector groups. See
     * "Audio Selector Group":#inputs-audio_selector_group for more information.
     *
     * @param audioSelectorGroups Specifies set of audio selectors within an
     *            input to combine. An input may have multiple audio selector
     *            groups. See
     *            "Audio Selector Group":#inputs-audio_selector_group for more
     *            information.
     */
    public void setAudioSelectorGroups(java.util.Map<String, AudioSelectorGroup> audioSelectorGroups) {
        this.audioSelectorGroups = audioSelectorGroups;
    }

    /**
     * Specifies set of audio selectors within an input to combine. An input may
     * have multiple audio selector groups. See
     * "Audio Selector Group":#inputs-audio_selector_group for more information.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioSelectorGroups Specifies set of audio selectors within an
     *            input to combine. An input may have multiple audio selector
     *            groups. See
     *            "Audio Selector Group":#inputs-audio_selector_group for more
     *            information.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate withAudioSelectorGroups(
            java.util.Map<String, AudioSelectorGroup> audioSelectorGroups) {
        this.audioSelectorGroups = audioSelectorGroups;
        return this;
    }

    /**
     * Specifies set of audio selectors within an input to combine. An input may
     * have multiple audio selector groups. See
     * "Audio Selector Group":#inputs-audio_selector_group for more information.
     * <p>
     * The method adds a new key-value pair into AudioSelectorGroups parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into AudioSelectorGroups.
     * @param value The corresponding value of the entry to be added into
     *            AudioSelectorGroups.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate addAudioSelectorGroupsEntry(String key, AudioSelectorGroup value) {
        if (null == this.audioSelectorGroups) {
            this.audioSelectorGroups = new java.util.HashMap<String, AudioSelectorGroup>();
        }
        if (this.audioSelectorGroups.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.audioSelectorGroups.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AudioSelectorGroups.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public InputTemplate clearAudioSelectorGroupsEntries() {
        this.audioSelectorGroups = null;
        return this;
    }

    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks
     * from the input that you will use in your outputs. You can use mutiple
     * Audio selectors per input.
     *
     * @return Use Audio selectors (AudioSelectors) to specify a track or set of
     *         tracks from the input that you will use in your outputs. You can
     *         use mutiple Audio selectors per input.
     */
    public java.util.Map<String, AudioSelector> getAudioSelectors() {
        return audioSelectors;
    }

    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks
     * from the input that you will use in your outputs. You can use mutiple
     * Audio selectors per input.
     *
     * @param audioSelectors Use Audio selectors (AudioSelectors) to specify a
     *            track or set of tracks from the input that you will use in
     *            your outputs. You can use mutiple Audio selectors per input.
     */
    public void setAudioSelectors(java.util.Map<String, AudioSelector> audioSelectors) {
        this.audioSelectors = audioSelectors;
    }

    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks
     * from the input that you will use in your outputs. You can use mutiple
     * Audio selectors per input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioSelectors Use Audio selectors (AudioSelectors) to specify a
     *            track or set of tracks from the input that you will use in
     *            your outputs. You can use mutiple Audio selectors per input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate withAudioSelectors(java.util.Map<String, AudioSelector> audioSelectors) {
        this.audioSelectors = audioSelectors;
        return this;
    }

    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks
     * from the input that you will use in your outputs. You can use mutiple
     * Audio selectors per input.
     * <p>
     * The method adds a new key-value pair into AudioSelectors parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into AudioSelectors.
     * @param value The corresponding value of the entry to be added into
     *            AudioSelectors.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate addAudioSelectorsEntry(String key, AudioSelector value) {
        if (null == this.audioSelectors) {
            this.audioSelectors = new java.util.HashMap<String, AudioSelector>();
        }
        if (this.audioSelectors.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.audioSelectors.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AudioSelectors.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public InputTemplate clearAudioSelectorsEntries() {
        this.audioSelectors = null;
        return this;
    }

    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data
     * from the input that you will use in your outputs. You can use mutiple
     * captions selectors per input.
     *
     * @return Use Captions selectors (CaptionSelectors) to specify the captions
     *         data from the input that you will use in your outputs. You can
     *         use mutiple captions selectors per input.
     */
    public java.util.Map<String, CaptionSelector> getCaptionSelectors() {
        return captionSelectors;
    }

    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data
     * from the input that you will use in your outputs. You can use mutiple
     * captions selectors per input.
     *
     * @param captionSelectors Use Captions selectors (CaptionSelectors) to
     *            specify the captions data from the input that you will use in
     *            your outputs. You can use mutiple captions selectors per
     *            input.
     */
    public void setCaptionSelectors(java.util.Map<String, CaptionSelector> captionSelectors) {
        this.captionSelectors = captionSelectors;
    }

    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data
     * from the input that you will use in your outputs. You can use mutiple
     * captions selectors per input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captionSelectors Use Captions selectors (CaptionSelectors) to
     *            specify the captions data from the input that you will use in
     *            your outputs. You can use mutiple captions selectors per
     *            input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate withCaptionSelectors(
            java.util.Map<String, CaptionSelector> captionSelectors) {
        this.captionSelectors = captionSelectors;
        return this;
    }

    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data
     * from the input that you will use in your outputs. You can use mutiple
     * captions selectors per input.
     * <p>
     * The method adds a new key-value pair into CaptionSelectors parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into CaptionSelectors.
     * @param value The corresponding value of the entry to be added into
     *            CaptionSelectors.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate addCaptionSelectorsEntry(String key, CaptionSelector value) {
        if (null == this.captionSelectors) {
            this.captionSelectors = new java.util.HashMap<String, CaptionSelector>();
        }
        if (this.captionSelectors.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.captionSelectors.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CaptionSelectors.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public InputTemplate clearCaptionSelectorsEntries() {
        this.captionSelectors = null;
        return this;
    }

    /**
     * Use Cropping selection (crop) to specify the video area that the service
     * will include in the output video frame. If you specify a value here, it
     * will override any value that you specify in the output setting Cropping
     * selection (crop).
     *
     * @return Use Cropping selection (crop) to specify the video area that the
     *         service will include in the output video frame. If you specify a
     *         value here, it will override any value that you specify in the
     *         output setting Cropping selection (crop).
     */
    public Rectangle getCrop() {
        return crop;
    }

    /**
     * Use Cropping selection (crop) to specify the video area that the service
     * will include in the output video frame. If you specify a value here, it
     * will override any value that you specify in the output setting Cropping
     * selection (crop).
     *
     * @param crop Use Cropping selection (crop) to specify the video area that
     *            the service will include in the output video frame. If you
     *            specify a value here, it will override any value that you
     *            specify in the output setting Cropping selection (crop).
     */
    public void setCrop(Rectangle crop) {
        this.crop = crop;
    }

    /**
     * Use Cropping selection (crop) to specify the video area that the service
     * will include in the output video frame. If you specify a value here, it
     * will override any value that you specify in the output setting Cropping
     * selection (crop).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crop Use Cropping selection (crop) to specify the video area that
     *            the service will include in the output video frame. If you
     *            specify a value here, it will override any value that you
     *            specify in the output setting Cropping selection (crop).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate withCrop(Rectangle crop) {
        this.crop = crop;
        return this;
    }

    /**
     * Enable Deblock (InputDeblockFilter) to produce smoother motion in the
     * output. Default is disabled. Only manaully controllable for MPEG2 and
     * uncompressed video inputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return Enable Deblock (InputDeblockFilter) to produce smoother motion in
     *         the output. Default is disabled. Only manaully controllable for
     *         MPEG2 and uncompressed video inputs.
     * @see InputDeblockFilter
     */
    public String getDeblockFilter() {
        return deblockFilter;
    }

    /**
     * Enable Deblock (InputDeblockFilter) to produce smoother motion in the
     * output. Default is disabled. Only manaully controllable for MPEG2 and
     * uncompressed video inputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param deblockFilter Enable Deblock (InputDeblockFilter) to produce
     *            smoother motion in the output. Default is disabled. Only
     *            manaully controllable for MPEG2 and uncompressed video inputs.
     * @see InputDeblockFilter
     */
    public void setDeblockFilter(String deblockFilter) {
        this.deblockFilter = deblockFilter;
    }

    /**
     * Enable Deblock (InputDeblockFilter) to produce smoother motion in the
     * output. Default is disabled. Only manaully controllable for MPEG2 and
     * uncompressed video inputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param deblockFilter Enable Deblock (InputDeblockFilter) to produce
     *            smoother motion in the output. Default is disabled. Only
     *            manaully controllable for MPEG2 and uncompressed video inputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeblockFilter
     */
    public InputTemplate withDeblockFilter(String deblockFilter) {
        this.deblockFilter = deblockFilter;
        return this;
    }

    /**
     * Enable Deblock (InputDeblockFilter) to produce smoother motion in the
     * output. Default is disabled. Only manaully controllable for MPEG2 and
     * uncompressed video inputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param deblockFilter Enable Deblock (InputDeblockFilter) to produce
     *            smoother motion in the output. Default is disabled. Only
     *            manaully controllable for MPEG2 and uncompressed video inputs.
     * @see InputDeblockFilter
     */
    public void setDeblockFilter(InputDeblockFilter deblockFilter) {
        this.deblockFilter = deblockFilter.toString();
    }

    /**
     * Enable Deblock (InputDeblockFilter) to produce smoother motion in the
     * output. Default is disabled. Only manaully controllable for MPEG2 and
     * uncompressed video inputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param deblockFilter Enable Deblock (InputDeblockFilter) to produce
     *            smoother motion in the output. Default is disabled. Only
     *            manaully controllable for MPEG2 and uncompressed video inputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeblockFilter
     */
    public InputTemplate withDeblockFilter(InputDeblockFilter deblockFilter) {
        this.deblockFilter = deblockFilter.toString();
        return this;
    }

    /**
     * Enable Denoise (InputDenoiseFilter) to filter noise from the input.
     * Default is disabled. Only applicable to MPEG2, H.264, H.265, and
     * uncompressed video inputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return Enable Denoise (InputDenoiseFilter) to filter noise from the
     *         input. Default is disabled. Only applicable to MPEG2, H.264,
     *         H.265, and uncompressed video inputs.
     * @see InputDenoiseFilter
     */
    public String getDenoiseFilter() {
        return denoiseFilter;
    }

    /**
     * Enable Denoise (InputDenoiseFilter) to filter noise from the input.
     * Default is disabled. Only applicable to MPEG2, H.264, H.265, and
     * uncompressed video inputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param denoiseFilter Enable Denoise (InputDenoiseFilter) to filter noise
     *            from the input. Default is disabled. Only applicable to MPEG2,
     *            H.264, H.265, and uncompressed video inputs.
     * @see InputDenoiseFilter
     */
    public void setDenoiseFilter(String denoiseFilter) {
        this.denoiseFilter = denoiseFilter;
    }

    /**
     * Enable Denoise (InputDenoiseFilter) to filter noise from the input.
     * Default is disabled. Only applicable to MPEG2, H.264, H.265, and
     * uncompressed video inputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param denoiseFilter Enable Denoise (InputDenoiseFilter) to filter noise
     *            from the input. Default is disabled. Only applicable to MPEG2,
     *            H.264, H.265, and uncompressed video inputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDenoiseFilter
     */
    public InputTemplate withDenoiseFilter(String denoiseFilter) {
        this.denoiseFilter = denoiseFilter;
        return this;
    }

    /**
     * Enable Denoise (InputDenoiseFilter) to filter noise from the input.
     * Default is disabled. Only applicable to MPEG2, H.264, H.265, and
     * uncompressed video inputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param denoiseFilter Enable Denoise (InputDenoiseFilter) to filter noise
     *            from the input. Default is disabled. Only applicable to MPEG2,
     *            H.264, H.265, and uncompressed video inputs.
     * @see InputDenoiseFilter
     */
    public void setDenoiseFilter(InputDenoiseFilter denoiseFilter) {
        this.denoiseFilter = denoiseFilter.toString();
    }

    /**
     * Enable Denoise (InputDenoiseFilter) to filter noise from the input.
     * Default is disabled. Only applicable to MPEG2, H.264, H.265, and
     * uncompressed video inputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param denoiseFilter Enable Denoise (InputDenoiseFilter) to filter noise
     *            from the input. Default is disabled. Only applicable to MPEG2,
     *            H.264, H.265, and uncompressed video inputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDenoiseFilter
     */
    public InputTemplate withDenoiseFilter(InputDenoiseFilter denoiseFilter) {
        this.denoiseFilter = denoiseFilter.toString();
        return this;
    }

    /**
     * Use Filter enable (InputFilterEnable) to specify how the transcoding
     * service applies the denoise and deblock filters. You must also enable the
     * filters separately, with Denoise (InputDenoiseFilter) and Deblock
     * (InputDeblockFilter). * Auto - The transcoding service determines whether
     * to apply filtering, depending on input type and quality. * Disable - The
     * input is not filtered. This is true even if you use the API to enable
     * them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in
     * put is filtered regardless of input type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, DISABLE, FORCE
     *
     * @return Use Filter enable (InputFilterEnable) to specify how the
     *         transcoding service applies the denoise and deblock filters. You
     *         must also enable the filters separately, with Denoise
     *         (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto -
     *         The transcoding service determines whether to apply filtering,
     *         depending on input type and quality. * Disable - The input is not
     *         filtered. This is true even if you use the API to enable them in
     *         (InputDeblockFilter) and (InputDeblockFilter). * Force - The in
     *         put is filtered regardless of input type.
     * @see InputFilterEnable
     */
    public String getFilterEnable() {
        return filterEnable;
    }

    /**
     * Use Filter enable (InputFilterEnable) to specify how the transcoding
     * service applies the denoise and deblock filters. You must also enable the
     * filters separately, with Denoise (InputDenoiseFilter) and Deblock
     * (InputDeblockFilter). * Auto - The transcoding service determines whether
     * to apply filtering, depending on input type and quality. * Disable - The
     * input is not filtered. This is true even if you use the API to enable
     * them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in
     * put is filtered regardless of input type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, DISABLE, FORCE
     *
     * @param filterEnable Use Filter enable (InputFilterEnable) to specify how
     *            the transcoding service applies the denoise and deblock
     *            filters. You must also enable the filters separately, with
     *            Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter).
     *            * Auto - The transcoding service determines whether to apply
     *            filtering, depending on input type and quality. * Disable -
     *            The input is not filtered. This is true even if you use the
     *            API to enable them in (InputDeblockFilter) and
     *            (InputDeblockFilter). * Force - The in put is filtered
     *            regardless of input type.
     * @see InputFilterEnable
     */
    public void setFilterEnable(String filterEnable) {
        this.filterEnable = filterEnable;
    }

    /**
     * Use Filter enable (InputFilterEnable) to specify how the transcoding
     * service applies the denoise and deblock filters. You must also enable the
     * filters separately, with Denoise (InputDenoiseFilter) and Deblock
     * (InputDeblockFilter). * Auto - The transcoding service determines whether
     * to apply filtering, depending on input type and quality. * Disable - The
     * input is not filtered. This is true even if you use the API to enable
     * them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in
     * put is filtered regardless of input type.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, DISABLE, FORCE
     *
     * @param filterEnable Use Filter enable (InputFilterEnable) to specify how
     *            the transcoding service applies the denoise and deblock
     *            filters. You must also enable the filters separately, with
     *            Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter).
     *            * Auto - The transcoding service determines whether to apply
     *            filtering, depending on input type and quality. * Disable -
     *            The input is not filtered. This is true even if you use the
     *            API to enable them in (InputDeblockFilter) and
     *            (InputDeblockFilter). * Force - The in put is filtered
     *            regardless of input type.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputFilterEnable
     */
    public InputTemplate withFilterEnable(String filterEnable) {
        this.filterEnable = filterEnable;
        return this;
    }

    /**
     * Use Filter enable (InputFilterEnable) to specify how the transcoding
     * service applies the denoise and deblock filters. You must also enable the
     * filters separately, with Denoise (InputDenoiseFilter) and Deblock
     * (InputDeblockFilter). * Auto - The transcoding service determines whether
     * to apply filtering, depending on input type and quality. * Disable - The
     * input is not filtered. This is true even if you use the API to enable
     * them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in
     * put is filtered regardless of input type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, DISABLE, FORCE
     *
     * @param filterEnable Use Filter enable (InputFilterEnable) to specify how
     *            the transcoding service applies the denoise and deblock
     *            filters. You must also enable the filters separately, with
     *            Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter).
     *            * Auto - The transcoding service determines whether to apply
     *            filtering, depending on input type and quality. * Disable -
     *            The input is not filtered. This is true even if you use the
     *            API to enable them in (InputDeblockFilter) and
     *            (InputDeblockFilter). * Force - The in put is filtered
     *            regardless of input type.
     * @see InputFilterEnable
     */
    public void setFilterEnable(InputFilterEnable filterEnable) {
        this.filterEnable = filterEnable.toString();
    }

    /**
     * Use Filter enable (InputFilterEnable) to specify how the transcoding
     * service applies the denoise and deblock filters. You must also enable the
     * filters separately, with Denoise (InputDenoiseFilter) and Deblock
     * (InputDeblockFilter). * Auto - The transcoding service determines whether
     * to apply filtering, depending on input type and quality. * Disable - The
     * input is not filtered. This is true even if you use the API to enable
     * them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in
     * put is filtered regardless of input type.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, DISABLE, FORCE
     *
     * @param filterEnable Use Filter enable (InputFilterEnable) to specify how
     *            the transcoding service applies the denoise and deblock
     *            filters. You must also enable the filters separately, with
     *            Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter).
     *            * Auto - The transcoding service determines whether to apply
     *            filtering, depending on input type and quality. * Disable -
     *            The input is not filtered. This is true even if you use the
     *            API to enable them in (InputDeblockFilter) and
     *            (InputDeblockFilter). * Force - The in put is filtered
     *            regardless of input type.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputFilterEnable
     */
    public InputTemplate withFilterEnable(InputFilterEnable filterEnable) {
        this.filterEnable = filterEnable.toString();
        return this;
    }

    /**
     * Use Filter strength (FilterStrength) to adjust the magnitude the input
     * filter settings (Deblock and Denoise). The range is -5 to 5. Default is
     * 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-5 - 5<br/>
     *
     * @return Use Filter strength (FilterStrength) to adjust the magnitude the
     *         input filter settings (Deblock and Denoise). The range is -5 to
     *         5. Default is 0.
     */
    public Integer getFilterStrength() {
        return filterStrength;
    }

    /**
     * Use Filter strength (FilterStrength) to adjust the magnitude the input
     * filter settings (Deblock and Denoise). The range is -5 to 5. Default is
     * 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-5 - 5<br/>
     *
     * @param filterStrength Use Filter strength (FilterStrength) to adjust the
     *            magnitude the input filter settings (Deblock and Denoise). The
     *            range is -5 to 5. Default is 0.
     */
    public void setFilterStrength(Integer filterStrength) {
        this.filterStrength = filterStrength;
    }

    /**
     * Use Filter strength (FilterStrength) to adjust the magnitude the input
     * filter settings (Deblock and Denoise). The range is -5 to 5. Default is
     * 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-5 - 5<br/>
     *
     * @param filterStrength Use Filter strength (FilterStrength) to adjust the
     *            magnitude the input filter settings (Deblock and Denoise). The
     *            range is -5 to 5. Default is 0.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate withFilterStrength(Integer filterStrength) {
        this.filterStrength = filterStrength;
        return this;
    }

    /**
     * Enable the image inserter feature to include a graphic overlay on your
     * video. Enable or disable this feature for each input individually. This
     * setting is disabled by default.
     *
     * @return Enable the image inserter feature to include a graphic overlay on
     *         your video. Enable or disable this feature for each input
     *         individually. This setting is disabled by default.
     */
    public ImageInserter getImageInserter() {
        return imageInserter;
    }

    /**
     * Enable the image inserter feature to include a graphic overlay on your
     * video. Enable or disable this feature for each input individually. This
     * setting is disabled by default.
     *
     * @param imageInserter Enable the image inserter feature to include a
     *            graphic overlay on your video. Enable or disable this feature
     *            for each input individually. This setting is disabled by
     *            default.
     */
    public void setImageInserter(ImageInserter imageInserter) {
        this.imageInserter = imageInserter;
    }

    /**
     * Enable the image inserter feature to include a graphic overlay on your
     * video. Enable or disable this feature for each input individually. This
     * setting is disabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageInserter Enable the image inserter feature to include a
     *            graphic overlay on your video. Enable or disable this feature
     *            for each input individually. This setting is disabled by
     *            default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate withImageInserter(ImageInserter imageInserter) {
        this.imageInserter = imageInserter;
        return this;
    }

    /**
     * (InputClippings) contains sets of start and end times that together
     * specify a portion of the input to be used in the outputs. If you provide
     * only a start time, the clip will be the entire input from that point to
     * the end. If you provide only an end time, it will be the entire input up
     * to that point. When you specify more than one input clip, the transcoding
     * service creates the job outputs by stringing the clips together in the
     * order you specify them.
     *
     * @return (InputClippings) contains sets of start and end times that
     *         together specify a portion of the input to be used in the
     *         outputs. If you provide only a start time, the clip will be the
     *         entire input from that point to the end. If you provide only an
     *         end time, it will be the entire input up to that point. When you
     *         specify more than one input clip, the transcoding service creates
     *         the job outputs by stringing the clips together in the order you
     *         specify them.
     */
    public java.util.List<InputClipping> getInputClippings() {
        return inputClippings;
    }

    /**
     * (InputClippings) contains sets of start and end times that together
     * specify a portion of the input to be used in the outputs. If you provide
     * only a start time, the clip will be the entire input from that point to
     * the end. If you provide only an end time, it will be the entire input up
     * to that point. When you specify more than one input clip, the transcoding
     * service creates the job outputs by stringing the clips together in the
     * order you specify them.
     *
     * @param inputClippings (InputClippings) contains sets of start and end
     *            times that together specify a portion of the input to be used
     *            in the outputs. If you provide only a start time, the clip
     *            will be the entire input from that point to the end. If you
     *            provide only an end time, it will be the entire input up to
     *            that point. When you specify more than one input clip, the
     *            transcoding service creates the job outputs by stringing the
     *            clips together in the order you specify them.
     */
    public void setInputClippings(java.util.Collection<InputClipping> inputClippings) {
        if (inputClippings == null) {
            this.inputClippings = null;
            return;
        }

        this.inputClippings = new java.util.ArrayList<InputClipping>(inputClippings);
    }

    /**
     * (InputClippings) contains sets of start and end times that together
     * specify a portion of the input to be used in the outputs. If you provide
     * only a start time, the clip will be the entire input from that point to
     * the end. If you provide only an end time, it will be the entire input up
     * to that point. When you specify more than one input clip, the transcoding
     * service creates the job outputs by stringing the clips together in the
     * order you specify them.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputClippings (InputClippings) contains sets of start and end
     *            times that together specify a portion of the input to be used
     *            in the outputs. If you provide only a start time, the clip
     *            will be the entire input from that point to the end. If you
     *            provide only an end time, it will be the entire input up to
     *            that point. When you specify more than one input clip, the
     *            transcoding service creates the job outputs by stringing the
     *            clips together in the order you specify them.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate withInputClippings(InputClipping... inputClippings) {
        if (getInputClippings() == null) {
            this.inputClippings = new java.util.ArrayList<InputClipping>(inputClippings.length);
        }
        for (InputClipping value : inputClippings) {
            this.inputClippings.add(value);
        }
        return this;
    }

    /**
     * (InputClippings) contains sets of start and end times that together
     * specify a portion of the input to be used in the outputs. If you provide
     * only a start time, the clip will be the entire input from that point to
     * the end. If you provide only an end time, it will be the entire input up
     * to that point. When you specify more than one input clip, the transcoding
     * service creates the job outputs by stringing the clips together in the
     * order you specify them.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputClippings (InputClippings) contains sets of start and end
     *            times that together specify a portion of the input to be used
     *            in the outputs. If you provide only a start time, the clip
     *            will be the entire input from that point to the end. If you
     *            provide only an end time, it will be the entire input up to
     *            that point. When you specify more than one input clip, the
     *            transcoding service creates the job outputs by stringing the
     *            clips together in the order you specify them.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate withInputClippings(java.util.Collection<InputClipping> inputClippings) {
        setInputClippings(inputClippings);
        return this;
    }

    /**
     * Use Selection placement (position) to define the video area in your
     * output frame. The area outside of the rectangle that you specify here is
     * black. If you specify a value here, it will override any value that you
     * specify in the output setting Selection placement (position). If you
     * specify a value here, this will override any AFD values in your input,
     * even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If
     * you specify a value here, this will ignore anything that you specify for
     * the setting Scaling Behavior (scalingBehavior).
     *
     * @return Use Selection placement (position) to define the video area in
     *         your output frame. The area outside of the rectangle that you
     *         specify here is black. If you specify a value here, it will
     *         override any value that you specify in the output setting
     *         Selection placement (position). If you specify a value here, this
     *         will override any AFD values in your input, even if you set
     *         Respond to AFD (RespondToAfd) to Respond (RESPOND). If you
     *         specify a value here, this will ignore anything that you specify
     *         for the setting Scaling Behavior (scalingBehavior).
     */
    public Rectangle getPosition() {
        return position;
    }

    /**
     * Use Selection placement (position) to define the video area in your
     * output frame. The area outside of the rectangle that you specify here is
     * black. If you specify a value here, it will override any value that you
     * specify in the output setting Selection placement (position). If you
     * specify a value here, this will override any AFD values in your input,
     * even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If
     * you specify a value here, this will ignore anything that you specify for
     * the setting Scaling Behavior (scalingBehavior).
     *
     * @param position Use Selection placement (position) to define the video
     *            area in your output frame. The area outside of the rectangle
     *            that you specify here is black. If you specify a value here,
     *            it will override any value that you specify in the output
     *            setting Selection placement (position). If you specify a value
     *            here, this will override any AFD values in your input, even if
     *            you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If
     *            you specify a value here, this will ignore anything that you
     *            specify for the setting Scaling Behavior (scalingBehavior).
     */
    public void setPosition(Rectangle position) {
        this.position = position;
    }

    /**
     * Use Selection placement (position) to define the video area in your
     * output frame. The area outside of the rectangle that you specify here is
     * black. If you specify a value here, it will override any value that you
     * specify in the output setting Selection placement (position). If you
     * specify a value here, this will override any AFD values in your input,
     * even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If
     * you specify a value here, this will ignore anything that you specify for
     * the setting Scaling Behavior (scalingBehavior).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position Use Selection placement (position) to define the video
     *            area in your output frame. The area outside of the rectangle
     *            that you specify here is black. If you specify a value here,
     *            it will override any value that you specify in the output
     *            setting Selection placement (position). If you specify a value
     *            here, this will override any AFD values in your input, even if
     *            you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If
     *            you specify a value here, this will ignore anything that you
     *            specify for the setting Scaling Behavior (scalingBehavior).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate withPosition(Rectangle position) {
        this.position = position;
        return this;
    }

    /**
     * Use Program (programNumber) to select a specific program from within a
     * multi-program transport stream. Note that Quad 4K is not currently
     * supported. Default is the first program within the transport stream. If
     * the program you specify doesn't exist, the transcoding service will use
     * this default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return Use Program (programNumber) to select a specific program from
     *         within a multi-program transport stream. Note that Quad 4K is not
     *         currently supported. Default is the first program within the
     *         transport stream. If the program you specify doesn't exist, the
     *         transcoding service will use this default.
     */
    public Integer getProgramNumber() {
        return programNumber;
    }

    /**
     * Use Program (programNumber) to select a specific program from within a
     * multi-program transport stream. Note that Quad 4K is not currently
     * supported. Default is the first program within the transport stream. If
     * the program you specify doesn't exist, the transcoding service will use
     * this default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param programNumber Use Program (programNumber) to select a specific
     *            program from within a multi-program transport stream. Note
     *            that Quad 4K is not currently supported. Default is the first
     *            program within the transport stream. If the program you
     *            specify doesn't exist, the transcoding service will use this
     *            default.
     */
    public void setProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
    }

    /**
     * Use Program (programNumber) to select a specific program from within a
     * multi-program transport stream. Note that Quad 4K is not currently
     * supported. Default is the first program within the transport stream. If
     * the program you specify doesn't exist, the transcoding service will use
     * this default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param programNumber Use Program (programNumber) to select a specific
     *            program from within a multi-program transport stream. Note
     *            that Quad 4K is not currently supported. Default is the first
     *            program within the transport stream. If the program you
     *            specify doesn't exist, the transcoding service will use this
     *            default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate withProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
        return this;
    }

    /**
     * Set PSI control (InputPsiControl) for transport stream inputs to specify
     * which data the demux process to scans. * Ignore PSI - Scan all PIDs for
     * audio and video. * Use PSI - Scan only PSI data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE_PSI, USE_PSI
     *
     * @return Set PSI control (InputPsiControl) for transport stream inputs to
     *         specify which data the demux process to scans. * Ignore PSI -
     *         Scan all PIDs for audio and video. * Use PSI - Scan only PSI
     *         data.
     * @see InputPsiControl
     */
    public String getPsiControl() {
        return psiControl;
    }

    /**
     * Set PSI control (InputPsiControl) for transport stream inputs to specify
     * which data the demux process to scans. * Ignore PSI - Scan all PIDs for
     * audio and video. * Use PSI - Scan only PSI data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE_PSI, USE_PSI
     *
     * @param psiControl Set PSI control (InputPsiControl) for transport stream
     *            inputs to specify which data the demux process to scans. *
     *            Ignore PSI - Scan all PIDs for audio and video. * Use PSI -
     *            Scan only PSI data.
     * @see InputPsiControl
     */
    public void setPsiControl(String psiControl) {
        this.psiControl = psiControl;
    }

    /**
     * Set PSI control (InputPsiControl) for transport stream inputs to specify
     * which data the demux process to scans. * Ignore PSI - Scan all PIDs for
     * audio and video. * Use PSI - Scan only PSI data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE_PSI, USE_PSI
     *
     * @param psiControl Set PSI control (InputPsiControl) for transport stream
     *            inputs to specify which data the demux process to scans. *
     *            Ignore PSI - Scan all PIDs for audio and video. * Use PSI -
     *            Scan only PSI data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputPsiControl
     */
    public InputTemplate withPsiControl(String psiControl) {
        this.psiControl = psiControl;
        return this;
    }

    /**
     * Set PSI control (InputPsiControl) for transport stream inputs to specify
     * which data the demux process to scans. * Ignore PSI - Scan all PIDs for
     * audio and video. * Use PSI - Scan only PSI data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE_PSI, USE_PSI
     *
     * @param psiControl Set PSI control (InputPsiControl) for transport stream
     *            inputs to specify which data the demux process to scans. *
     *            Ignore PSI - Scan all PIDs for audio and video. * Use PSI -
     *            Scan only PSI data.
     * @see InputPsiControl
     */
    public void setPsiControl(InputPsiControl psiControl) {
        this.psiControl = psiControl.toString();
    }

    /**
     * Set PSI control (InputPsiControl) for transport stream inputs to specify
     * which data the demux process to scans. * Ignore PSI - Scan all PIDs for
     * audio and video. * Use PSI - Scan only PSI data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE_PSI, USE_PSI
     *
     * @param psiControl Set PSI control (InputPsiControl) for transport stream
     *            inputs to specify which data the demux process to scans. *
     *            Ignore PSI - Scan all PIDs for audio and video. * Use PSI -
     *            Scan only PSI data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputPsiControl
     */
    public InputTemplate withPsiControl(InputPsiControl psiControl) {
        this.psiControl = psiControl.toString();
        return this;
    }

    /**
     * Use this Timecode source setting, located under the input settings
     * (InputTimecodeSource), to specify how the service counts input video
     * frames. This input frame count affects only the behavior of features that
     * apply to a single input at a time, such as input clipping and
     * synchronizing some captions formats. Choose Embedded (EMBEDDED) to use
     * the timecodes in your input video. Choose Start at zero (ZEROBASED) to
     * start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to
     * start the first frame at the timecode that you specify in the setting
     * Start timecode (timecodeStart). If you don't specify a value for Timecode
     * source, the service will use Embedded by default. For more information
     * about timecodes, see
     * https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, ZEROBASED, SPECIFIEDSTART
     *
     * @return Use this Timecode source setting, located under the input
     *         settings (InputTimecodeSource), to specify how the service counts
     *         input video frames. This input frame count affects only the
     *         behavior of features that apply to a single input at a time, such
     *         as input clipping and synchronizing some captions formats. Choose
     *         Embedded (EMBEDDED) to use the timecodes in your input video.
     *         Choose Start at zero (ZEROBASED) to start the first frame at
     *         zero. Choose Specified start (SPECIFIEDSTART) to start the first
     *         frame at the timecode that you specify in the setting Start
     *         timecode (timecodeStart). If you don't specify a value for
     *         Timecode source, the service will use Embedded by default. For
     *         more information about timecodes, see
     *         https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * @see InputTimecodeSource
     */
    public String getTimecodeSource() {
        return timecodeSource;
    }

    /**
     * Use this Timecode source setting, located under the input settings
     * (InputTimecodeSource), to specify how the service counts input video
     * frames. This input frame count affects only the behavior of features that
     * apply to a single input at a time, such as input clipping and
     * synchronizing some captions formats. Choose Embedded (EMBEDDED) to use
     * the timecodes in your input video. Choose Start at zero (ZEROBASED) to
     * start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to
     * start the first frame at the timecode that you specify in the setting
     * Start timecode (timecodeStart). If you don't specify a value for Timecode
     * source, the service will use Embedded by default. For more information
     * about timecodes, see
     * https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, ZEROBASED, SPECIFIEDSTART
     *
     * @param timecodeSource Use this Timecode source setting, located under the
     *            input settings (InputTimecodeSource), to specify how the
     *            service counts input video frames. This input frame count
     *            affects only the behavior of features that apply to a single
     *            input at a time, such as input clipping and synchronizing some
     *            captions formats. Choose Embedded (EMBEDDED) to use the
     *            timecodes in your input video. Choose Start at zero
     *            (ZEROBASED) to start the first frame at zero. Choose Specified
     *            start (SPECIFIEDSTART) to start the first frame at the
     *            timecode that you specify in the setting Start timecode
     *            (timecodeStart). If you don't specify a value for Timecode
     *            source, the service will use Embedded by default. For more
     *            information about timecodes, see
     *            https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * @see InputTimecodeSource
     */
    public void setTimecodeSource(String timecodeSource) {
        this.timecodeSource = timecodeSource;
    }

    /**
     * Use this Timecode source setting, located under the input settings
     * (InputTimecodeSource), to specify how the service counts input video
     * frames. This input frame count affects only the behavior of features that
     * apply to a single input at a time, such as input clipping and
     * synchronizing some captions formats. Choose Embedded (EMBEDDED) to use
     * the timecodes in your input video. Choose Start at zero (ZEROBASED) to
     * start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to
     * start the first frame at the timecode that you specify in the setting
     * Start timecode (timecodeStart). If you don't specify a value for Timecode
     * source, the service will use Embedded by default. For more information
     * about timecodes, see
     * https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, ZEROBASED, SPECIFIEDSTART
     *
     * @param timecodeSource Use this Timecode source setting, located under the
     *            input settings (InputTimecodeSource), to specify how the
     *            service counts input video frames. This input frame count
     *            affects only the behavior of features that apply to a single
     *            input at a time, such as input clipping and synchronizing some
     *            captions formats. Choose Embedded (EMBEDDED) to use the
     *            timecodes in your input video. Choose Start at zero
     *            (ZEROBASED) to start the first frame at zero. Choose Specified
     *            start (SPECIFIEDSTART) to start the first frame at the
     *            timecode that you specify in the setting Start timecode
     *            (timecodeStart). If you don't specify a value for Timecode
     *            source, the service will use Embedded by default. For more
     *            information about timecodes, see
     *            https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputTimecodeSource
     */
    public InputTemplate withTimecodeSource(String timecodeSource) {
        this.timecodeSource = timecodeSource;
        return this;
    }

    /**
     * Use this Timecode source setting, located under the input settings
     * (InputTimecodeSource), to specify how the service counts input video
     * frames. This input frame count affects only the behavior of features that
     * apply to a single input at a time, such as input clipping and
     * synchronizing some captions formats. Choose Embedded (EMBEDDED) to use
     * the timecodes in your input video. Choose Start at zero (ZEROBASED) to
     * start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to
     * start the first frame at the timecode that you specify in the setting
     * Start timecode (timecodeStart). If you don't specify a value for Timecode
     * source, the service will use Embedded by default. For more information
     * about timecodes, see
     * https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, ZEROBASED, SPECIFIEDSTART
     *
     * @param timecodeSource Use this Timecode source setting, located under the
     *            input settings (InputTimecodeSource), to specify how the
     *            service counts input video frames. This input frame count
     *            affects only the behavior of features that apply to a single
     *            input at a time, such as input clipping and synchronizing some
     *            captions formats. Choose Embedded (EMBEDDED) to use the
     *            timecodes in your input video. Choose Start at zero
     *            (ZEROBASED) to start the first frame at zero. Choose Specified
     *            start (SPECIFIEDSTART) to start the first frame at the
     *            timecode that you specify in the setting Start timecode
     *            (timecodeStart). If you don't specify a value for Timecode
     *            source, the service will use Embedded by default. For more
     *            information about timecodes, see
     *            https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * @see InputTimecodeSource
     */
    public void setTimecodeSource(InputTimecodeSource timecodeSource) {
        this.timecodeSource = timecodeSource.toString();
    }

    /**
     * Use this Timecode source setting, located under the input settings
     * (InputTimecodeSource), to specify how the service counts input video
     * frames. This input frame count affects only the behavior of features that
     * apply to a single input at a time, such as input clipping and
     * synchronizing some captions formats. Choose Embedded (EMBEDDED) to use
     * the timecodes in your input video. Choose Start at zero (ZEROBASED) to
     * start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to
     * start the first frame at the timecode that you specify in the setting
     * Start timecode (timecodeStart). If you don't specify a value for Timecode
     * source, the service will use Embedded by default. For more information
     * about timecodes, see
     * https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, ZEROBASED, SPECIFIEDSTART
     *
     * @param timecodeSource Use this Timecode source setting, located under the
     *            input settings (InputTimecodeSource), to specify how the
     *            service counts input video frames. This input frame count
     *            affects only the behavior of features that apply to a single
     *            input at a time, such as input clipping and synchronizing some
     *            captions formats. Choose Embedded (EMBEDDED) to use the
     *            timecodes in your input video. Choose Start at zero
     *            (ZEROBASED) to start the first frame at zero. Choose Specified
     *            start (SPECIFIEDSTART) to start the first frame at the
     *            timecode that you specify in the setting Start timecode
     *            (timecodeStart). If you don't specify a value for Timecode
     *            source, the service will use Embedded by default. For more
     *            information about timecodes, see
     *            https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputTimecodeSource
     */
    public InputTemplate withTimecodeSource(InputTimecodeSource timecodeSource) {
        this.timecodeSource = timecodeSource.toString();
        return this;
    }

    /**
     * Specify the timecode that you want the service to use for this input's
     * initial frame. To use this setting, you must set the Timecode source
     * setting, located under the input settings (InputTimecodeSource), to
     * Specified start (SPECIFIEDSTART). For more information about timecodes,
     * see https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 11<br/>
     * <b>Pattern: </b>^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$<br/>
     *
     * @return Specify the timecode that you want the service to use for this
     *         input's initial frame. To use this setting, you must set the
     *         Timecode source setting, located under the input settings
     *         (InputTimecodeSource), to Specified start (SPECIFIEDSTART). For
     *         more information about timecodes, see
     *         https://docs.aws.amazon.com/console/mediaconvert/timecode.
     */
    public String getTimecodeStart() {
        return timecodeStart;
    }

    /**
     * Specify the timecode that you want the service to use for this input's
     * initial frame. To use this setting, you must set the Timecode source
     * setting, located under the input settings (InputTimecodeSource), to
     * Specified start (SPECIFIEDSTART). For more information about timecodes,
     * see https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 11<br/>
     * <b>Pattern: </b>^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$<br/>
     *
     * @param timecodeStart Specify the timecode that you want the service to
     *            use for this input's initial frame. To use this setting, you
     *            must set the Timecode source setting, located under the input
     *            settings (InputTimecodeSource), to Specified start
     *            (SPECIFIEDSTART). For more information about timecodes, see
     *            https://docs.aws.amazon.com/console/mediaconvert/timecode.
     */
    public void setTimecodeStart(String timecodeStart) {
        this.timecodeStart = timecodeStart;
    }

    /**
     * Specify the timecode that you want the service to use for this input's
     * initial frame. To use this setting, you must set the Timecode source
     * setting, located under the input settings (InputTimecodeSource), to
     * Specified start (SPECIFIEDSTART). For more information about timecodes,
     * see https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 11<br/>
     * <b>Pattern: </b>^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$<br/>
     *
     * @param timecodeStart Specify the timecode that you want the service to
     *            use for this input's initial frame. To use this setting, you
     *            must set the Timecode source setting, located under the input
     *            settings (InputTimecodeSource), to Specified start
     *            (SPECIFIEDSTART). For more information about timecodes, see
     *            https://docs.aws.amazon.com/console/mediaconvert/timecode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate withTimecodeStart(String timecodeStart) {
        this.timecodeStart = timecodeStart;
        return this;
    }

    /**
     * Selector for video.
     *
     * @return Selector for video.
     */
    public VideoSelector getVideoSelector() {
        return videoSelector;
    }

    /**
     * Selector for video.
     *
     * @param videoSelector Selector for video.
     */
    public void setVideoSelector(VideoSelector videoSelector) {
        this.videoSelector = videoSelector;
    }

    /**
     * Selector for video.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoSelector Selector for video.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputTemplate withVideoSelector(VideoSelector videoSelector) {
        this.videoSelector = videoSelector;
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
        if (getAudioSelectorGroups() != null)
            sb.append("AudioSelectorGroups: " + getAudioSelectorGroups() + ",");
        if (getAudioSelectors() != null)
            sb.append("AudioSelectors: " + getAudioSelectors() + ",");
        if (getCaptionSelectors() != null)
            sb.append("CaptionSelectors: " + getCaptionSelectors() + ",");
        if (getCrop() != null)
            sb.append("Crop: " + getCrop() + ",");
        if (getDeblockFilter() != null)
            sb.append("DeblockFilter: " + getDeblockFilter() + ",");
        if (getDenoiseFilter() != null)
            sb.append("DenoiseFilter: " + getDenoiseFilter() + ",");
        if (getFilterEnable() != null)
            sb.append("FilterEnable: " + getFilterEnable() + ",");
        if (getFilterStrength() != null)
            sb.append("FilterStrength: " + getFilterStrength() + ",");
        if (getImageInserter() != null)
            sb.append("ImageInserter: " + getImageInserter() + ",");
        if (getInputClippings() != null)
            sb.append("InputClippings: " + getInputClippings() + ",");
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getProgramNumber() != null)
            sb.append("ProgramNumber: " + getProgramNumber() + ",");
        if (getPsiControl() != null)
            sb.append("PsiControl: " + getPsiControl() + ",");
        if (getTimecodeSource() != null)
            sb.append("TimecodeSource: " + getTimecodeSource() + ",");
        if (getTimecodeStart() != null)
            sb.append("TimecodeStart: " + getTimecodeStart() + ",");
        if (getVideoSelector() != null)
            sb.append("VideoSelector: " + getVideoSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAudioSelectorGroups() == null) ? 0 : getAudioSelectorGroups().hashCode());
        hashCode = prime * hashCode
                + ((getAudioSelectors() == null) ? 0 : getAudioSelectors().hashCode());
        hashCode = prime * hashCode
                + ((getCaptionSelectors() == null) ? 0 : getCaptionSelectors().hashCode());
        hashCode = prime * hashCode + ((getCrop() == null) ? 0 : getCrop().hashCode());
        hashCode = prime * hashCode
                + ((getDeblockFilter() == null) ? 0 : getDeblockFilter().hashCode());
        hashCode = prime * hashCode
                + ((getDenoiseFilter() == null) ? 0 : getDenoiseFilter().hashCode());
        hashCode = prime * hashCode
                + ((getFilterEnable() == null) ? 0 : getFilterEnable().hashCode());
        hashCode = prime * hashCode
                + ((getFilterStrength() == null) ? 0 : getFilterStrength().hashCode());
        hashCode = prime * hashCode
                + ((getImageInserter() == null) ? 0 : getImageInserter().hashCode());
        hashCode = prime * hashCode
                + ((getInputClippings() == null) ? 0 : getInputClippings().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode
                + ((getProgramNumber() == null) ? 0 : getProgramNumber().hashCode());
        hashCode = prime * hashCode + ((getPsiControl() == null) ? 0 : getPsiControl().hashCode());
        hashCode = prime * hashCode
                + ((getTimecodeSource() == null) ? 0 : getTimecodeSource().hashCode());
        hashCode = prime * hashCode
                + ((getTimecodeStart() == null) ? 0 : getTimecodeStart().hashCode());
        hashCode = prime * hashCode
                + ((getVideoSelector() == null) ? 0 : getVideoSelector().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputTemplate == false)
            return false;
        InputTemplate other = (InputTemplate) obj;

        if (other.getAudioSelectorGroups() == null ^ this.getAudioSelectorGroups() == null)
            return false;
        if (other.getAudioSelectorGroups() != null
                && other.getAudioSelectorGroups().equals(this.getAudioSelectorGroups()) == false)
            return false;
        if (other.getAudioSelectors() == null ^ this.getAudioSelectors() == null)
            return false;
        if (other.getAudioSelectors() != null
                && other.getAudioSelectors().equals(this.getAudioSelectors()) == false)
            return false;
        if (other.getCaptionSelectors() == null ^ this.getCaptionSelectors() == null)
            return false;
        if (other.getCaptionSelectors() != null
                && other.getCaptionSelectors().equals(this.getCaptionSelectors()) == false)
            return false;
        if (other.getCrop() == null ^ this.getCrop() == null)
            return false;
        if (other.getCrop() != null && other.getCrop().equals(this.getCrop()) == false)
            return false;
        if (other.getDeblockFilter() == null ^ this.getDeblockFilter() == null)
            return false;
        if (other.getDeblockFilter() != null
                && other.getDeblockFilter().equals(this.getDeblockFilter()) == false)
            return false;
        if (other.getDenoiseFilter() == null ^ this.getDenoiseFilter() == null)
            return false;
        if (other.getDenoiseFilter() != null
                && other.getDenoiseFilter().equals(this.getDenoiseFilter()) == false)
            return false;
        if (other.getFilterEnable() == null ^ this.getFilterEnable() == null)
            return false;
        if (other.getFilterEnable() != null
                && other.getFilterEnable().equals(this.getFilterEnable()) == false)
            return false;
        if (other.getFilterStrength() == null ^ this.getFilterStrength() == null)
            return false;
        if (other.getFilterStrength() != null
                && other.getFilterStrength().equals(this.getFilterStrength()) == false)
            return false;
        if (other.getImageInserter() == null ^ this.getImageInserter() == null)
            return false;
        if (other.getImageInserter() != null
                && other.getImageInserter().equals(this.getImageInserter()) == false)
            return false;
        if (other.getInputClippings() == null ^ this.getInputClippings() == null)
            return false;
        if (other.getInputClippings() != null
                && other.getInputClippings().equals(this.getInputClippings()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getProgramNumber() == null ^ this.getProgramNumber() == null)
            return false;
        if (other.getProgramNumber() != null
                && other.getProgramNumber().equals(this.getProgramNumber()) == false)
            return false;
        if (other.getPsiControl() == null ^ this.getPsiControl() == null)
            return false;
        if (other.getPsiControl() != null
                && other.getPsiControl().equals(this.getPsiControl()) == false)
            return false;
        if (other.getTimecodeSource() == null ^ this.getTimecodeSource() == null)
            return false;
        if (other.getTimecodeSource() != null
                && other.getTimecodeSource().equals(this.getTimecodeSource()) == false)
            return false;
        if (other.getTimecodeStart() == null ^ this.getTimecodeStart() == null)
            return false;
        if (other.getTimecodeStart() != null
                && other.getTimecodeStart().equals(this.getTimecodeStart()) == false)
            return false;
        if (other.getVideoSelector() == null ^ this.getVideoSelector() == null)
            return false;
        if (other.getVideoSelector() != null
                && other.getVideoSelector().equals(this.getVideoSelector()) == false)
            return false;
        return true;
    }
}
