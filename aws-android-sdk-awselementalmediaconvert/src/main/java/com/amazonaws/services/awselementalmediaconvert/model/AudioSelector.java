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
 * Selector for Audio
 */
public class AudioSelector implements Serializable {
    /**
     * Selects a specific language code from within an audio source, using the
     * ISO 639-2 or ISO 639-3 three-letter language code
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^[A-Za-z]{3}$<br/>
     */
    private String customLanguageCode;

    /**
     * Enable this setting on one audio selector to set it as the default for
     * the job. The service uses this default for outputs where it can't find
     * the specified input audio. If you don't set a default, those outputs have
     * no audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, NOT_DEFAULT
     */
    private String defaultSelection;

    /**
     * Specifies audio data from an external file source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^((s3://([^\/]+\/+)+([^\/\.]+|(([^\/]*)\.([mM]2[vV]|[mM][pP
     * ][eE][gG]|[
     * mM][pP]3|[aA][vV][iI]|[mM][pP]4|[fF][lL][vV]|[mM][pP][tT]|[mM][
     * pP][gG]|[mM
     * ]4[vV]|[tT][rR][pP]|[fF]4[vV]|[mM]2[tT][sS]|[tT][sS]|264|[hH]264
     * |[mM][kK][
     * vV]|[mM][oO][vV]|[mM][tT][sS]|[mM]2[tT]|[wW][mM][vV]|[aA][sS][fF
     * ]|[vV][oO]
     * [bB]|3[gG][pP]|3[gG][pP][pP]|[mM][xX][fF]|[dD][iI][vV][xX]|[xX][
     * vV][iI][dD
     * ]|[rR][aA][wW]|[dD][vV]|[gG][xX][fF]|[mM]1[vV]|3[gG]2|[vV][mM][fF
     * ]|[mM]3[uU
     * ]8|[lL][cC][hH]|[gG][xX][fF]_[mM][pP][eE][gG]2|[mM][xX][fF]_[mM]
     * [pP][eE][gG
     * ]2|[mM][xX][fF][hH][dD]|[wW][aA][vV]|[yY]4[mM]|[aA][aA][cC]|[aA
     * ][iI][fF][fF
     * ]|[mM][pP]2|[aA][cC]3|[eE][cC]3|[dD][tT][sS][eE]))))|(https?:/
     * /([^\/]+\/+)
     * +([^\/\.]+|(([^\/]*)\.([mM]2[vV]|[mM][pP][eE][gG]|[mM][pP]3|[aA
     * ][vV][iI]|[
     * mM][pP]4|[fF][lL][vV]|[mM][pP][tT]|[mM][pP][gG]|[mM]4[vV]|[tT][
     * rR][pP]|[fF
     * ]4[vV]|[mM]2[tT][sS]|[tT][sS]|264|[hH]264|[mM][kK][vV]|[mM][oO]
     * [vV]|[mM][tT
     * ][sS]|[mM]2[tT]|[wW][mM][vV]|[aA][sS][fF]|[vV][oO][bB]|3[gG][pP
     * ]|3[gG][pP]
     * [pP]|[mM][xX][fF]|[dD][iI][vV][xX]|[xX][vV][iI][dD]|[rR][aA][wW
     * ]|[dD][vV]|
     * [gG][xX][fF]|[mM]1[vV]|3[gG]2|[vV][mM][fF]|[mM]3[uU]8|[lL][cC][
     * hH]|[gG][xX
     * ][fF]_[mM][pP][eE][gG]2|[mM][xX][fF]_[mM][pP][eE][gG]2|[mM][xX]
     * [fF][hH][dD
     * ]|[wW][aA][vV]|[yY]4[mM]|[aA][aA][cC]|[aA][iI][fF][fF]|[mM][pP]
     * 2|[aA][cC]3
     * |[eE][cC]3|[dD][tT][sS][eE])))(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     */
    private String externalAudioFileInput;

    /**
     * Selects a specific language code from within an audio source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS,
     * POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE,
     * ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE,
     * BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES,
     * DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA,
     * GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO,
     * IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK,
     * KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ,
     * MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL,
     * NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL,
     * PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND,
     * SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT,
     * TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN,
     * VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG
     */
    private String languageCode;

    /**
     * Specifies a time delta in milliseconds to offset the audio from the input
     * video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2147483648 - 2147483647<br/>
     */
    private Integer offset;

    /**
     * Selects a specific PID from within an audio source (e.g. 257 selects PID
     * 0x101).
     */
    private java.util.List<Integer> pids;

    /**
     * Use this setting for input streams that contain Dolby E, to have the
     * service extract specific program data from the track. To select multiple
     * programs, create multiple selectors with the same Track and different
     * Program numbers. In the console, this setting is visible when you set
     * Selector type to Track. Choose the program number from the dropdown list.
     * If you are sending a JSON file, provide the program ID, which is part of
     * the audio metadata. If your input file has incorrect metadata, you can
     * choose All channels instead of a program number to have the service
     * ignore the program IDs and include all the programs in the track.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 8<br/>
     */
    private Integer programSelection;

    /**
     * Use these settings to reorder the audio channels of one input to match
     * those of another input. This allows you to combine the two files into a
     * single output, one after the other.
     */
    private RemixSettings remixSettings;

    /**
     * Specifies the type of the audio selector.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PID, TRACK, LANGUAGE_CODE
     */
    private String selectorType;

    /**
     * Identify a track from the input audio to include in this selector by
     * entering the track index number. To include several tracks in a single
     * audio selector, specify multiple tracks as follows. Using the console,
     * enter a comma-separated list. For examle, type "1,2,3" to include tracks
     * 1 through 3. Specifying directly in your JSON job file, provide the track
     * numbers in an array. For example, "tracks": [1,2,3].
     */
    private java.util.List<Integer> tracks;

    /**
     * Selects a specific language code from within an audio source, using the
     * ISO 639-2 or ISO 639-3 three-letter language code
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^[A-Za-z]{3}$<br/>
     *
     * @return Selects a specific language code from within an audio source,
     *         using the ISO 639-2 or ISO 639-3 three-letter language code
     */
    public String getCustomLanguageCode() {
        return customLanguageCode;
    }

    /**
     * Selects a specific language code from within an audio source, using the
     * ISO 639-2 or ISO 639-3 three-letter language code
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^[A-Za-z]{3}$<br/>
     *
     * @param customLanguageCode Selects a specific language code from within an
     *            audio source, using the ISO 639-2 or ISO 639-3 three-letter
     *            language code
     */
    public void setCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
    }

    /**
     * Selects a specific language code from within an audio source, using the
     * ISO 639-2 or ISO 639-3 three-letter language code
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^[A-Za-z]{3}$<br/>
     *
     * @param customLanguageCode Selects a specific language code from within an
     *            audio source, using the ISO 639-2 or ISO 639-3 three-letter
     *            language code
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelector withCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
        return this;
    }

    /**
     * Enable this setting on one audio selector to set it as the default for
     * the job. The service uses this default for outputs where it can't find
     * the specified input audio. If you don't set a default, those outputs have
     * no audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, NOT_DEFAULT
     *
     * @return Enable this setting on one audio selector to set it as the
     *         default for the job. The service uses this default for outputs
     *         where it can't find the specified input audio. If you don't set a
     *         default, those outputs have no audio.
     * @see AudioDefaultSelection
     */
    public String getDefaultSelection() {
        return defaultSelection;
    }

    /**
     * Enable this setting on one audio selector to set it as the default for
     * the job. The service uses this default for outputs where it can't find
     * the specified input audio. If you don't set a default, those outputs have
     * no audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, NOT_DEFAULT
     *
     * @param defaultSelection Enable this setting on one audio selector to set
     *            it as the default for the job. The service uses this default
     *            for outputs where it can't find the specified input audio. If
     *            you don't set a default, those outputs have no audio.
     * @see AudioDefaultSelection
     */
    public void setDefaultSelection(String defaultSelection) {
        this.defaultSelection = defaultSelection;
    }

    /**
     * Enable this setting on one audio selector to set it as the default for
     * the job. The service uses this default for outputs where it can't find
     * the specified input audio. If you don't set a default, those outputs have
     * no audio.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, NOT_DEFAULT
     *
     * @param defaultSelection Enable this setting on one audio selector to set
     *            it as the default for the job. The service uses this default
     *            for outputs where it can't find the specified input audio. If
     *            you don't set a default, those outputs have no audio.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioDefaultSelection
     */
    public AudioSelector withDefaultSelection(String defaultSelection) {
        this.defaultSelection = defaultSelection;
        return this;
    }

    /**
     * Enable this setting on one audio selector to set it as the default for
     * the job. The service uses this default for outputs where it can't find
     * the specified input audio. If you don't set a default, those outputs have
     * no audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, NOT_DEFAULT
     *
     * @param defaultSelection Enable this setting on one audio selector to set
     *            it as the default for the job. The service uses this default
     *            for outputs where it can't find the specified input audio. If
     *            you don't set a default, those outputs have no audio.
     * @see AudioDefaultSelection
     */
    public void setDefaultSelection(AudioDefaultSelection defaultSelection) {
        this.defaultSelection = defaultSelection.toString();
    }

    /**
     * Enable this setting on one audio selector to set it as the default for
     * the job. The service uses this default for outputs where it can't find
     * the specified input audio. If you don't set a default, those outputs have
     * no audio.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, NOT_DEFAULT
     *
     * @param defaultSelection Enable this setting on one audio selector to set
     *            it as the default for the job. The service uses this default
     *            for outputs where it can't find the specified input audio. If
     *            you don't set a default, those outputs have no audio.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioDefaultSelection
     */
    public AudioSelector withDefaultSelection(AudioDefaultSelection defaultSelection) {
        this.defaultSelection = defaultSelection.toString();
        return this;
    }

    /**
     * Specifies audio data from an external file source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^((s3://([^\/]+\/+)+([^\/\.]+|(([^\/]*)\.([mM]2[vV]|[mM][pP
     * ][eE][gG]|[
     * mM][pP]3|[aA][vV][iI]|[mM][pP]4|[fF][lL][vV]|[mM][pP][tT]|[mM][
     * pP][gG]|[mM
     * ]4[vV]|[tT][rR][pP]|[fF]4[vV]|[mM]2[tT][sS]|[tT][sS]|264|[hH]264
     * |[mM][kK][
     * vV]|[mM][oO][vV]|[mM][tT][sS]|[mM]2[tT]|[wW][mM][vV]|[aA][sS][fF
     * ]|[vV][oO]
     * [bB]|3[gG][pP]|3[gG][pP][pP]|[mM][xX][fF]|[dD][iI][vV][xX]|[xX][
     * vV][iI][dD
     * ]|[rR][aA][wW]|[dD][vV]|[gG][xX][fF]|[mM]1[vV]|3[gG]2|[vV][mM][fF
     * ]|[mM]3[uU
     * ]8|[lL][cC][hH]|[gG][xX][fF]_[mM][pP][eE][gG]2|[mM][xX][fF]_[mM]
     * [pP][eE][gG
     * ]2|[mM][xX][fF][hH][dD]|[wW][aA][vV]|[yY]4[mM]|[aA][aA][cC]|[aA
     * ][iI][fF][fF
     * ]|[mM][pP]2|[aA][cC]3|[eE][cC]3|[dD][tT][sS][eE]))))|(https?:/
     * /([^\/]+\/+)
     * +([^\/\.]+|(([^\/]*)\.([mM]2[vV]|[mM][pP][eE][gG]|[mM][pP]3|[aA
     * ][vV][iI]|[
     * mM][pP]4|[fF][lL][vV]|[mM][pP][tT]|[mM][pP][gG]|[mM]4[vV]|[tT][
     * rR][pP]|[fF
     * ]4[vV]|[mM]2[tT][sS]|[tT][sS]|264|[hH]264|[mM][kK][vV]|[mM][oO]
     * [vV]|[mM][tT
     * ][sS]|[mM]2[tT]|[wW][mM][vV]|[aA][sS][fF]|[vV][oO][bB]|3[gG][pP
     * ]|3[gG][pP]
     * [pP]|[mM][xX][fF]|[dD][iI][vV][xX]|[xX][vV][iI][dD]|[rR][aA][wW
     * ]|[dD][vV]|
     * [gG][xX][fF]|[mM]1[vV]|3[gG]2|[vV][mM][fF]|[mM]3[uU]8|[lL][cC][
     * hH]|[gG][xX
     * ][fF]_[mM][pP][eE][gG]2|[mM][xX][fF]_[mM][pP][eE][gG]2|[mM][xX]
     * [fF][hH][dD
     * ]|[wW][aA][vV]|[yY]4[mM]|[aA][aA][cC]|[aA][iI][fF][fF]|[mM][pP]
     * 2|[aA][cC]3
     * |[eE][cC]3|[dD][tT][sS][eE])))(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @return Specifies audio data from an external file source.
     */
    public String getExternalAudioFileInput() {
        return externalAudioFileInput;
    }

    /**
     * Specifies audio data from an external file source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^((s3://([^\/]+\/+)+([^\/\.]+|(([^\/]*)\.([mM]2[vV]|[mM][pP
     * ][eE][gG]|[
     * mM][pP]3|[aA][vV][iI]|[mM][pP]4|[fF][lL][vV]|[mM][pP][tT]|[mM][
     * pP][gG]|[mM
     * ]4[vV]|[tT][rR][pP]|[fF]4[vV]|[mM]2[tT][sS]|[tT][sS]|264|[hH]264
     * |[mM][kK][
     * vV]|[mM][oO][vV]|[mM][tT][sS]|[mM]2[tT]|[wW][mM][vV]|[aA][sS][fF
     * ]|[vV][oO]
     * [bB]|3[gG][pP]|3[gG][pP][pP]|[mM][xX][fF]|[dD][iI][vV][xX]|[xX][
     * vV][iI][dD
     * ]|[rR][aA][wW]|[dD][vV]|[gG][xX][fF]|[mM]1[vV]|3[gG]2|[vV][mM][fF
     * ]|[mM]3[uU
     * ]8|[lL][cC][hH]|[gG][xX][fF]_[mM][pP][eE][gG]2|[mM][xX][fF]_[mM]
     * [pP][eE][gG
     * ]2|[mM][xX][fF][hH][dD]|[wW][aA][vV]|[yY]4[mM]|[aA][aA][cC]|[aA
     * ][iI][fF][fF
     * ]|[mM][pP]2|[aA][cC]3|[eE][cC]3|[dD][tT][sS][eE]))))|(https?:/
     * /([^\/]+\/+)
     * +([^\/\.]+|(([^\/]*)\.([mM]2[vV]|[mM][pP][eE][gG]|[mM][pP]3|[aA
     * ][vV][iI]|[
     * mM][pP]4|[fF][lL][vV]|[mM][pP][tT]|[mM][pP][gG]|[mM]4[vV]|[tT][
     * rR][pP]|[fF
     * ]4[vV]|[mM]2[tT][sS]|[tT][sS]|264|[hH]264|[mM][kK][vV]|[mM][oO]
     * [vV]|[mM][tT
     * ][sS]|[mM]2[tT]|[wW][mM][vV]|[aA][sS][fF]|[vV][oO][bB]|3[gG][pP
     * ]|3[gG][pP]
     * [pP]|[mM][xX][fF]|[dD][iI][vV][xX]|[xX][vV][iI][dD]|[rR][aA][wW
     * ]|[dD][vV]|
     * [gG][xX][fF]|[mM]1[vV]|3[gG]2|[vV][mM][fF]|[mM]3[uU]8|[lL][cC][
     * hH]|[gG][xX
     * ][fF]_[mM][pP][eE][gG]2|[mM][xX][fF]_[mM][pP][eE][gG]2|[mM][xX]
     * [fF][hH][dD
     * ]|[wW][aA][vV]|[yY]4[mM]|[aA][aA][cC]|[aA][iI][fF][fF]|[mM][pP]
     * 2|[aA][cC]3
     * |[eE][cC]3|[dD][tT][sS][eE])))(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @param externalAudioFileInput Specifies audio data from an external file
     *            source.
     */
    public void setExternalAudioFileInput(String externalAudioFileInput) {
        this.externalAudioFileInput = externalAudioFileInput;
    }

    /**
     * Specifies audio data from an external file source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^((s3://([^\/]+\/+)+([^\/\.]+|(([^\/]*)\.([mM]2[vV]|[mM][pP
     * ][eE][gG]|[
     * mM][pP]3|[aA][vV][iI]|[mM][pP]4|[fF][lL][vV]|[mM][pP][tT]|[mM][
     * pP][gG]|[mM
     * ]4[vV]|[tT][rR][pP]|[fF]4[vV]|[mM]2[tT][sS]|[tT][sS]|264|[hH]264
     * |[mM][kK][
     * vV]|[mM][oO][vV]|[mM][tT][sS]|[mM]2[tT]|[wW][mM][vV]|[aA][sS][fF
     * ]|[vV][oO]
     * [bB]|3[gG][pP]|3[gG][pP][pP]|[mM][xX][fF]|[dD][iI][vV][xX]|[xX][
     * vV][iI][dD
     * ]|[rR][aA][wW]|[dD][vV]|[gG][xX][fF]|[mM]1[vV]|3[gG]2|[vV][mM][fF
     * ]|[mM]3[uU
     * ]8|[lL][cC][hH]|[gG][xX][fF]_[mM][pP][eE][gG]2|[mM][xX][fF]_[mM]
     * [pP][eE][gG
     * ]2|[mM][xX][fF][hH][dD]|[wW][aA][vV]|[yY]4[mM]|[aA][aA][cC]|[aA
     * ][iI][fF][fF
     * ]|[mM][pP]2|[aA][cC]3|[eE][cC]3|[dD][tT][sS][eE]))))|(https?:/
     * /([^\/]+\/+)
     * +([^\/\.]+|(([^\/]*)\.([mM]2[vV]|[mM][pP][eE][gG]|[mM][pP]3|[aA
     * ][vV][iI]|[
     * mM][pP]4|[fF][lL][vV]|[mM][pP][tT]|[mM][pP][gG]|[mM]4[vV]|[tT][
     * rR][pP]|[fF
     * ]4[vV]|[mM]2[tT][sS]|[tT][sS]|264|[hH]264|[mM][kK][vV]|[mM][oO]
     * [vV]|[mM][tT
     * ][sS]|[mM]2[tT]|[wW][mM][vV]|[aA][sS][fF]|[vV][oO][bB]|3[gG][pP
     * ]|3[gG][pP]
     * [pP]|[mM][xX][fF]|[dD][iI][vV][xX]|[xX][vV][iI][dD]|[rR][aA][wW
     * ]|[dD][vV]|
     * [gG][xX][fF]|[mM]1[vV]|3[gG]2|[vV][mM][fF]|[mM]3[uU]8|[lL][cC][
     * hH]|[gG][xX
     * ][fF]_[mM][pP][eE][gG]2|[mM][xX][fF]_[mM][pP][eE][gG]2|[mM][xX]
     * [fF][hH][dD
     * ]|[wW][aA][vV]|[yY]4[mM]|[aA][aA][cC]|[aA][iI][fF][fF]|[mM][pP]
     * 2|[aA][cC]3
     * |[eE][cC]3|[dD][tT][sS][eE])))(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @param externalAudioFileInput Specifies audio data from an external file
     *            source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelector withExternalAudioFileInput(String externalAudioFileInput) {
        this.externalAudioFileInput = externalAudioFileInput;
        return this;
    }

    /**
     * Selects a specific language code from within an audio source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS,
     * POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE,
     * ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE,
     * BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES,
     * DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA,
     * GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO,
     * IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK,
     * KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ,
     * MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL,
     * NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL,
     * PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND,
     * SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT,
     * TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN,
     * VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG
     *
     * @return Selects a specific language code from within an audio source.
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Selects a specific language code from within an audio source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS,
     * POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE,
     * ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE,
     * BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES,
     * DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA,
     * GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO,
     * IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK,
     * KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ,
     * MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL,
     * NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL,
     * PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND,
     * SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT,
     * TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN,
     * VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG
     *
     * @param languageCode Selects a specific language code from within an audio
     *            source.
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Selects a specific language code from within an audio source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS,
     * POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE,
     * ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE,
     * BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES,
     * DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA,
     * GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO,
     * IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK,
     * KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ,
     * MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL,
     * NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL,
     * PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND,
     * SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT,
     * TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN,
     * VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG
     *
     * @param languageCode Selects a specific language code from within an audio
     *            source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public AudioSelector withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Selects a specific language code from within an audio source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS,
     * POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE,
     * ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE,
     * BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES,
     * DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA,
     * GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO,
     * IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK,
     * KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ,
     * MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL,
     * NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL,
     * PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND,
     * SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT,
     * TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN,
     * VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG
     *
     * @param languageCode Selects a specific language code from within an audio
     *            source.
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * Selects a specific language code from within an audio source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS,
     * POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE,
     * ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE,
     * BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES,
     * DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA,
     * GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO,
     * IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK,
     * KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ,
     * MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL,
     * NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL,
     * PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND,
     * SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT,
     * TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN,
     * VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG
     *
     * @param languageCode Selects a specific language code from within an audio
     *            source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public AudioSelector withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * Specifies a time delta in milliseconds to offset the audio from the input
     * video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2147483648 - 2147483647<br/>
     *
     * @return Specifies a time delta in milliseconds to offset the audio from
     *         the input video.
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Specifies a time delta in milliseconds to offset the audio from the input
     * video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2147483648 - 2147483647<br/>
     *
     * @param offset Specifies a time delta in milliseconds to offset the audio
     *            from the input video.
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Specifies a time delta in milliseconds to offset the audio from the input
     * video.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2147483648 - 2147483647<br/>
     *
     * @param offset Specifies a time delta in milliseconds to offset the audio
     *            from the input video.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelector withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Selects a specific PID from within an audio source (e.g. 257 selects PID
     * 0x101).
     *
     * @return Selects a specific PID from within an audio source (e.g. 257
     *         selects PID 0x101).
     */
    public java.util.List<Integer> getPids() {
        return pids;
    }

    /**
     * Selects a specific PID from within an audio source (e.g. 257 selects PID
     * 0x101).
     *
     * @param pids Selects a specific PID from within an audio source (e.g. 257
     *            selects PID 0x101).
     */
    public void setPids(java.util.Collection<Integer> pids) {
        if (pids == null) {
            this.pids = null;
            return;
        }

        this.pids = new java.util.ArrayList<Integer>(pids);
    }

    /**
     * Selects a specific PID from within an audio source (e.g. 257 selects PID
     * 0x101).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pids Selects a specific PID from within an audio source (e.g. 257
     *            selects PID 0x101).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelector withPids(Integer... pids) {
        if (getPids() == null) {
            this.pids = new java.util.ArrayList<Integer>(pids.length);
        }
        for (Integer value : pids) {
            this.pids.add(value);
        }
        return this;
    }

    /**
     * Selects a specific PID from within an audio source (e.g. 257 selects PID
     * 0x101).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pids Selects a specific PID from within an audio source (e.g. 257
     *            selects PID 0x101).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelector withPids(java.util.Collection<Integer> pids) {
        setPids(pids);
        return this;
    }

    /**
     * Use this setting for input streams that contain Dolby E, to have the
     * service extract specific program data from the track. To select multiple
     * programs, create multiple selectors with the same Track and different
     * Program numbers. In the console, this setting is visible when you set
     * Selector type to Track. Choose the program number from the dropdown list.
     * If you are sending a JSON file, provide the program ID, which is part of
     * the audio metadata. If your input file has incorrect metadata, you can
     * choose All channels instead of a program number to have the service
     * ignore the program IDs and include all the programs in the track.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 8<br/>
     *
     * @return Use this setting for input streams that contain Dolby E, to have
     *         the service extract specific program data from the track. To
     *         select multiple programs, create multiple selectors with the same
     *         Track and different Program numbers. In the console, this setting
     *         is visible when you set Selector type to Track. Choose the
     *         program number from the dropdown list. If you are sending a JSON
     *         file, provide the program ID, which is part of the audio
     *         metadata. If your input file has incorrect metadata, you can
     *         choose All channels instead of a program number to have the
     *         service ignore the program IDs and include all the programs in
     *         the track.
     */
    public Integer getProgramSelection() {
        return programSelection;
    }

    /**
     * Use this setting for input streams that contain Dolby E, to have the
     * service extract specific program data from the track. To select multiple
     * programs, create multiple selectors with the same Track and different
     * Program numbers. In the console, this setting is visible when you set
     * Selector type to Track. Choose the program number from the dropdown list.
     * If you are sending a JSON file, provide the program ID, which is part of
     * the audio metadata. If your input file has incorrect metadata, you can
     * choose All channels instead of a program number to have the service
     * ignore the program IDs and include all the programs in the track.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 8<br/>
     *
     * @param programSelection Use this setting for input streams that contain
     *            Dolby E, to have the service extract specific program data
     *            from the track. To select multiple programs, create multiple
     *            selectors with the same Track and different Program numbers.
     *            In the console, this setting is visible when you set Selector
     *            type to Track. Choose the program number from the dropdown
     *            list. If you are sending a JSON file, provide the program ID,
     *            which is part of the audio metadata. If your input file has
     *            incorrect metadata, you can choose All channels instead of a
     *            program number to have the service ignore the program IDs and
     *            include all the programs in the track.
     */
    public void setProgramSelection(Integer programSelection) {
        this.programSelection = programSelection;
    }

    /**
     * Use this setting for input streams that contain Dolby E, to have the
     * service extract specific program data from the track. To select multiple
     * programs, create multiple selectors with the same Track and different
     * Program numbers. In the console, this setting is visible when you set
     * Selector type to Track. Choose the program number from the dropdown list.
     * If you are sending a JSON file, provide the program ID, which is part of
     * the audio metadata. If your input file has incorrect metadata, you can
     * choose All channels instead of a program number to have the service
     * ignore the program IDs and include all the programs in the track.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 8<br/>
     *
     * @param programSelection Use this setting for input streams that contain
     *            Dolby E, to have the service extract specific program data
     *            from the track. To select multiple programs, create multiple
     *            selectors with the same Track and different Program numbers.
     *            In the console, this setting is visible when you set Selector
     *            type to Track. Choose the program number from the dropdown
     *            list. If you are sending a JSON file, provide the program ID,
     *            which is part of the audio metadata. If your input file has
     *            incorrect metadata, you can choose All channels instead of a
     *            program number to have the service ignore the program IDs and
     *            include all the programs in the track.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelector withProgramSelection(Integer programSelection) {
        this.programSelection = programSelection;
        return this;
    }

    /**
     * Use these settings to reorder the audio channels of one input to match
     * those of another input. This allows you to combine the two files into a
     * single output, one after the other.
     *
     * @return Use these settings to reorder the audio channels of one input to
     *         match those of another input. This allows you to combine the two
     *         files into a single output, one after the other.
     */
    public RemixSettings getRemixSettings() {
        return remixSettings;
    }

    /**
     * Use these settings to reorder the audio channels of one input to match
     * those of another input. This allows you to combine the two files into a
     * single output, one after the other.
     *
     * @param remixSettings Use these settings to reorder the audio channels of
     *            one input to match those of another input. This allows you to
     *            combine the two files into a single output, one after the
     *            other.
     */
    public void setRemixSettings(RemixSettings remixSettings) {
        this.remixSettings = remixSettings;
    }

    /**
     * Use these settings to reorder the audio channels of one input to match
     * those of another input. This allows you to combine the two files into a
     * single output, one after the other.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remixSettings Use these settings to reorder the audio channels of
     *            one input to match those of another input. This allows you to
     *            combine the two files into a single output, one after the
     *            other.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelector withRemixSettings(RemixSettings remixSettings) {
        this.remixSettings = remixSettings;
        return this;
    }

    /**
     * Specifies the type of the audio selector.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PID, TRACK, LANGUAGE_CODE
     *
     * @return Specifies the type of the audio selector.
     * @see AudioSelectorType
     */
    public String getSelectorType() {
        return selectorType;
    }

    /**
     * Specifies the type of the audio selector.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PID, TRACK, LANGUAGE_CODE
     *
     * @param selectorType Specifies the type of the audio selector.
     * @see AudioSelectorType
     */
    public void setSelectorType(String selectorType) {
        this.selectorType = selectorType;
    }

    /**
     * Specifies the type of the audio selector.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PID, TRACK, LANGUAGE_CODE
     *
     * @param selectorType Specifies the type of the audio selector.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioSelectorType
     */
    public AudioSelector withSelectorType(String selectorType) {
        this.selectorType = selectorType;
        return this;
    }

    /**
     * Specifies the type of the audio selector.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PID, TRACK, LANGUAGE_CODE
     *
     * @param selectorType Specifies the type of the audio selector.
     * @see AudioSelectorType
     */
    public void setSelectorType(AudioSelectorType selectorType) {
        this.selectorType = selectorType.toString();
    }

    /**
     * Specifies the type of the audio selector.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PID, TRACK, LANGUAGE_CODE
     *
     * @param selectorType Specifies the type of the audio selector.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioSelectorType
     */
    public AudioSelector withSelectorType(AudioSelectorType selectorType) {
        this.selectorType = selectorType.toString();
        return this;
    }

    /**
     * Identify a track from the input audio to include in this selector by
     * entering the track index number. To include several tracks in a single
     * audio selector, specify multiple tracks as follows. Using the console,
     * enter a comma-separated list. For examle, type "1,2,3" to include tracks
     * 1 through 3. Specifying directly in your JSON job file, provide the track
     * numbers in an array. For example, "tracks": [1,2,3].
     *
     * @return Identify a track from the input audio to include in this selector
     *         by entering the track index number. To include several tracks in
     *         a single audio selector, specify multiple tracks as follows.
     *         Using the console, enter a comma-separated list. For examle, type
     *         "1,2,3" to include tracks 1 through 3. Specifying directly in
     *         your JSON job file, provide the track numbers in an array. For
     *         example, "tracks": [1,2,3].
     */
    public java.util.List<Integer> getTracks() {
        return tracks;
    }

    /**
     * Identify a track from the input audio to include in this selector by
     * entering the track index number. To include several tracks in a single
     * audio selector, specify multiple tracks as follows. Using the console,
     * enter a comma-separated list. For examle, type "1,2,3" to include tracks
     * 1 through 3. Specifying directly in your JSON job file, provide the track
     * numbers in an array. For example, "tracks": [1,2,3].
     *
     * @param tracks Identify a track from the input audio to include in this
     *            selector by entering the track index number. To include
     *            several tracks in a single audio selector, specify multiple
     *            tracks as follows. Using the console, enter a comma-separated
     *            list. For examle, type "1,2,3" to include tracks 1 through 3.
     *            Specifying directly in your JSON job file, provide the track
     *            numbers in an array. For example, "tracks": [1,2,3].
     */
    public void setTracks(java.util.Collection<Integer> tracks) {
        if (tracks == null) {
            this.tracks = null;
            return;
        }

        this.tracks = new java.util.ArrayList<Integer>(tracks);
    }

    /**
     * Identify a track from the input audio to include in this selector by
     * entering the track index number. To include several tracks in a single
     * audio selector, specify multiple tracks as follows. Using the console,
     * enter a comma-separated list. For examle, type "1,2,3" to include tracks
     * 1 through 3. Specifying directly in your JSON job file, provide the track
     * numbers in an array. For example, "tracks": [1,2,3].
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tracks Identify a track from the input audio to include in this
     *            selector by entering the track index number. To include
     *            several tracks in a single audio selector, specify multiple
     *            tracks as follows. Using the console, enter a comma-separated
     *            list. For examle, type "1,2,3" to include tracks 1 through 3.
     *            Specifying directly in your JSON job file, provide the track
     *            numbers in an array. For example, "tracks": [1,2,3].
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelector withTracks(Integer... tracks) {
        if (getTracks() == null) {
            this.tracks = new java.util.ArrayList<Integer>(tracks.length);
        }
        for (Integer value : tracks) {
            this.tracks.add(value);
        }
        return this;
    }

    /**
     * Identify a track from the input audio to include in this selector by
     * entering the track index number. To include several tracks in a single
     * audio selector, specify multiple tracks as follows. Using the console,
     * enter a comma-separated list. For examle, type "1,2,3" to include tracks
     * 1 through 3. Specifying directly in your JSON job file, provide the track
     * numbers in an array. For example, "tracks": [1,2,3].
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tracks Identify a track from the input audio to include in this
     *            selector by entering the track index number. To include
     *            several tracks in a single audio selector, specify multiple
     *            tracks as follows. Using the console, enter a comma-separated
     *            list. For examle, type "1,2,3" to include tracks 1 through 3.
     *            Specifying directly in your JSON job file, provide the track
     *            numbers in an array. For example, "tracks": [1,2,3].
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelector withTracks(java.util.Collection<Integer> tracks) {
        setTracks(tracks);
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
        if (getCustomLanguageCode() != null)
            sb.append("CustomLanguageCode: " + getCustomLanguageCode() + ",");
        if (getDefaultSelection() != null)
            sb.append("DefaultSelection: " + getDefaultSelection() + ",");
        if (getExternalAudioFileInput() != null)
            sb.append("ExternalAudioFileInput: " + getExternalAudioFileInput() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getOffset() != null)
            sb.append("Offset: " + getOffset() + ",");
        if (getPids() != null)
            sb.append("Pids: " + getPids() + ",");
        if (getProgramSelection() != null)
            sb.append("ProgramSelection: " + getProgramSelection() + ",");
        if (getRemixSettings() != null)
            sb.append("RemixSettings: " + getRemixSettings() + ",");
        if (getSelectorType() != null)
            sb.append("SelectorType: " + getSelectorType() + ",");
        if (getTracks() != null)
            sb.append("Tracks: " + getTracks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCustomLanguageCode() == null) ? 0 : getCustomLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultSelection() == null) ? 0 : getDefaultSelection().hashCode());
        hashCode = prime
                * hashCode
                + ((getExternalAudioFileInput() == null) ? 0 : getExternalAudioFileInput()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        hashCode = prime * hashCode + ((getPids() == null) ? 0 : getPids().hashCode());
        hashCode = prime * hashCode
                + ((getProgramSelection() == null) ? 0 : getProgramSelection().hashCode());
        hashCode = prime * hashCode
                + ((getRemixSettings() == null) ? 0 : getRemixSettings().hashCode());
        hashCode = prime * hashCode
                + ((getSelectorType() == null) ? 0 : getSelectorType().hashCode());
        hashCode = prime * hashCode + ((getTracks() == null) ? 0 : getTracks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioSelector == false)
            return false;
        AudioSelector other = (AudioSelector) obj;

        if (other.getCustomLanguageCode() == null ^ this.getCustomLanguageCode() == null)
            return false;
        if (other.getCustomLanguageCode() != null
                && other.getCustomLanguageCode().equals(this.getCustomLanguageCode()) == false)
            return false;
        if (other.getDefaultSelection() == null ^ this.getDefaultSelection() == null)
            return false;
        if (other.getDefaultSelection() != null
                && other.getDefaultSelection().equals(this.getDefaultSelection()) == false)
            return false;
        if (other.getExternalAudioFileInput() == null ^ this.getExternalAudioFileInput() == null)
            return false;
        if (other.getExternalAudioFileInput() != null
                && other.getExternalAudioFileInput().equals(this.getExternalAudioFileInput()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        if (other.getPids() == null ^ this.getPids() == null)
            return false;
        if (other.getPids() != null && other.getPids().equals(this.getPids()) == false)
            return false;
        if (other.getProgramSelection() == null ^ this.getProgramSelection() == null)
            return false;
        if (other.getProgramSelection() != null
                && other.getProgramSelection().equals(this.getProgramSelection()) == false)
            return false;
        if (other.getRemixSettings() == null ^ this.getRemixSettings() == null)
            return false;
        if (other.getRemixSettings() != null
                && other.getRemixSettings().equals(this.getRemixSettings()) == false)
            return false;
        if (other.getSelectorType() == null ^ this.getSelectorType() == null)
            return false;
        if (other.getSelectorType() != null
                && other.getSelectorType().equals(this.getSelectorType()) == false)
            return false;
        if (other.getTracks() == null ^ this.getTracks() == null)
            return false;
        if (other.getTracks() != null && other.getTracks().equals(this.getTracks()) == false)
            return false;
        return true;
    }
}
