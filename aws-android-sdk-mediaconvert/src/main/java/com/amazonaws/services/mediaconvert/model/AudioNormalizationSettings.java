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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Advanced audio normalization settings. Ignore these settings unless you need
 * to comply with a loudness standard.
 */
public class AudioNormalizationSettings implements Serializable {
    /**
     * Choose one of the following audio normalization algorithms: ITU-R
     * BS.1770-1: Ungated loudness. A measurement of ungated average loudness
     * for an entire piece of content, suitable for measurement of short-form
     * content under ATSC recommendation A/85. Supports up to 5.1 audio
     * channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average
     * loudness compliant with the requirements of EBU-R128. Supports up to 5.1
     * audio channels. ITU-R BS.1770-3: Modified peak. The same loudness
     * measurement algorithm as 1770-2, with an updated true peak measurement.
     * ITU-R BS.1770-4: Higher channel count. Allows for more audio channels
     * than the other algorithms, including configurations such as 7.1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3,
     * ITU_BS_1770_4
     */
    private String algorithm;

    /**
     * When enabled the output audio is corrected using the chosen algorithm. If
     * disabled, the audio will be measured but not adjusted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CORRECT_AUDIO, MEASURE_ONLY
     */
    private String algorithmControl;

    /**
     * Content measuring above this level will be corrected to the target level.
     * Content measuring below this level will not be corrected.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-70 - 0<br/>
     */
    private Integer correctionGateLevel;

    /**
     * If set to LOG, log each output's audio track loudness to a CSV file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, DONT_LOG
     */
    private String loudnessLogging;

    /**
     * If set to TRUE_PEAK, calculate and log the TruePeak for each output's
     * audio track loudness.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRUE_PEAK, NONE
     */
    private String peakCalculation;

    /**
     * When you use Audio normalization (AudioNormalizationSettings), optionally
     * use this setting to specify a target loudness. If you don't specify a
     * value here, the encoder chooses a value for you, based on the algorithm
     * that you choose for Algorithm (algorithm). If you choose algorithm
     * 1770-1, the encoder will choose -24 LKFS; otherwise, the encoder will
     * choose -23 LKFS.
     */
    private Double targetLkfs;

    /**
     * Choose one of the following audio normalization algorithms: ITU-R
     * BS.1770-1: Ungated loudness. A measurement of ungated average loudness
     * for an entire piece of content, suitable for measurement of short-form
     * content under ATSC recommendation A/85. Supports up to 5.1 audio
     * channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average
     * loudness compliant with the requirements of EBU-R128. Supports up to 5.1
     * audio channels. ITU-R BS.1770-3: Modified peak. The same loudness
     * measurement algorithm as 1770-2, with an updated true peak measurement.
     * ITU-R BS.1770-4: Higher channel count. Allows for more audio channels
     * than the other algorithms, including configurations such as 7.1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3,
     * ITU_BS_1770_4
     *
     * @return Choose one of the following audio normalization algorithms: ITU-R
     *         BS.1770-1: Ungated loudness. A measurement of ungated average
     *         loudness for an entire piece of content, suitable for measurement
     *         of short-form content under ATSC recommendation A/85. Supports up
     *         to 5.1 audio channels. ITU-R BS.1770-2: Gated loudness. A
     *         measurement of gated average loudness compliant with the
     *         requirements of EBU-R128. Supports up to 5.1 audio channels.
     *         ITU-R BS.1770-3: Modified peak. The same loudness measurement
     *         algorithm as 1770-2, with an updated true peak measurement. ITU-R
     *         BS.1770-4: Higher channel count. Allows for more audio channels
     *         than the other algorithms, including configurations such as 7.1.
     * @see AudioNormalizationAlgorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Choose one of the following audio normalization algorithms: ITU-R
     * BS.1770-1: Ungated loudness. A measurement of ungated average loudness
     * for an entire piece of content, suitable for measurement of short-form
     * content under ATSC recommendation A/85. Supports up to 5.1 audio
     * channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average
     * loudness compliant with the requirements of EBU-R128. Supports up to 5.1
     * audio channels. ITU-R BS.1770-3: Modified peak. The same loudness
     * measurement algorithm as 1770-2, with an updated true peak measurement.
     * ITU-R BS.1770-4: Higher channel count. Allows for more audio channels
     * than the other algorithms, including configurations such as 7.1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3,
     * ITU_BS_1770_4
     *
     * @param algorithm Choose one of the following audio normalization
     *            algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement
     *            of ungated average loudness for an entire piece of content,
     *            suitable for measurement of short-form content under ATSC
     *            recommendation A/85. Supports up to 5.1 audio channels. ITU-R
     *            BS.1770-2: Gated loudness. A measurement of gated average
     *            loudness compliant with the requirements of EBU-R128. Supports
     *            up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The
     *            same loudness measurement algorithm as 1770-2, with an updated
     *            true peak measurement. ITU-R BS.1770-4: Higher channel count.
     *            Allows for more audio channels than the other algorithms,
     *            including configurations such as 7.1.
     * @see AudioNormalizationAlgorithm
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * Choose one of the following audio normalization algorithms: ITU-R
     * BS.1770-1: Ungated loudness. A measurement of ungated average loudness
     * for an entire piece of content, suitable for measurement of short-form
     * content under ATSC recommendation A/85. Supports up to 5.1 audio
     * channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average
     * loudness compliant with the requirements of EBU-R128. Supports up to 5.1
     * audio channels. ITU-R BS.1770-3: Modified peak. The same loudness
     * measurement algorithm as 1770-2, with an updated true peak measurement.
     * ITU-R BS.1770-4: Higher channel count. Allows for more audio channels
     * than the other algorithms, including configurations such as 7.1.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3,
     * ITU_BS_1770_4
     *
     * @param algorithm Choose one of the following audio normalization
     *            algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement
     *            of ungated average loudness for an entire piece of content,
     *            suitable for measurement of short-form content under ATSC
     *            recommendation A/85. Supports up to 5.1 audio channels. ITU-R
     *            BS.1770-2: Gated loudness. A measurement of gated average
     *            loudness compliant with the requirements of EBU-R128. Supports
     *            up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The
     *            same loudness measurement algorithm as 1770-2, with an updated
     *            true peak measurement. ITU-R BS.1770-4: Higher channel count.
     *            Allows for more audio channels than the other algorithms,
     *            including configurations such as 7.1.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioNormalizationAlgorithm
     */
    public AudioNormalizationSettings withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Choose one of the following audio normalization algorithms: ITU-R
     * BS.1770-1: Ungated loudness. A measurement of ungated average loudness
     * for an entire piece of content, suitable for measurement of short-form
     * content under ATSC recommendation A/85. Supports up to 5.1 audio
     * channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average
     * loudness compliant with the requirements of EBU-R128. Supports up to 5.1
     * audio channels. ITU-R BS.1770-3: Modified peak. The same loudness
     * measurement algorithm as 1770-2, with an updated true peak measurement.
     * ITU-R BS.1770-4: Higher channel count. Allows for more audio channels
     * than the other algorithms, including configurations such as 7.1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3,
     * ITU_BS_1770_4
     *
     * @param algorithm Choose one of the following audio normalization
     *            algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement
     *            of ungated average loudness for an entire piece of content,
     *            suitable for measurement of short-form content under ATSC
     *            recommendation A/85. Supports up to 5.1 audio channels. ITU-R
     *            BS.1770-2: Gated loudness. A measurement of gated average
     *            loudness compliant with the requirements of EBU-R128. Supports
     *            up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The
     *            same loudness measurement algorithm as 1770-2, with an updated
     *            true peak measurement. ITU-R BS.1770-4: Higher channel count.
     *            Allows for more audio channels than the other algorithms,
     *            including configurations such as 7.1.
     * @see AudioNormalizationAlgorithm
     */
    public void setAlgorithm(AudioNormalizationAlgorithm algorithm) {
        this.algorithm = algorithm.toString();
    }

    /**
     * Choose one of the following audio normalization algorithms: ITU-R
     * BS.1770-1: Ungated loudness. A measurement of ungated average loudness
     * for an entire piece of content, suitable for measurement of short-form
     * content under ATSC recommendation A/85. Supports up to 5.1 audio
     * channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average
     * loudness compliant with the requirements of EBU-R128. Supports up to 5.1
     * audio channels. ITU-R BS.1770-3: Modified peak. The same loudness
     * measurement algorithm as 1770-2, with an updated true peak measurement.
     * ITU-R BS.1770-4: Higher channel count. Allows for more audio channels
     * than the other algorithms, including configurations such as 7.1.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3,
     * ITU_BS_1770_4
     *
     * @param algorithm Choose one of the following audio normalization
     *            algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement
     *            of ungated average loudness for an entire piece of content,
     *            suitable for measurement of short-form content under ATSC
     *            recommendation A/85. Supports up to 5.1 audio channels. ITU-R
     *            BS.1770-2: Gated loudness. A measurement of gated average
     *            loudness compliant with the requirements of EBU-R128. Supports
     *            up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The
     *            same loudness measurement algorithm as 1770-2, with an updated
     *            true peak measurement. ITU-R BS.1770-4: Higher channel count.
     *            Allows for more audio channels than the other algorithms,
     *            including configurations such as 7.1.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioNormalizationAlgorithm
     */
    public AudioNormalizationSettings withAlgorithm(AudioNormalizationAlgorithm algorithm) {
        this.algorithm = algorithm.toString();
        return this;
    }

    /**
     * When enabled the output audio is corrected using the chosen algorithm. If
     * disabled, the audio will be measured but not adjusted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CORRECT_AUDIO, MEASURE_ONLY
     *
     * @return When enabled the output audio is corrected using the chosen
     *         algorithm. If disabled, the audio will be measured but not
     *         adjusted.
     * @see AudioNormalizationAlgorithmControl
     */
    public String getAlgorithmControl() {
        return algorithmControl;
    }

    /**
     * When enabled the output audio is corrected using the chosen algorithm. If
     * disabled, the audio will be measured but not adjusted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CORRECT_AUDIO, MEASURE_ONLY
     *
     * @param algorithmControl When enabled the output audio is corrected using
     *            the chosen algorithm. If disabled, the audio will be measured
     *            but not adjusted.
     * @see AudioNormalizationAlgorithmControl
     */
    public void setAlgorithmControl(String algorithmControl) {
        this.algorithmControl = algorithmControl;
    }

    /**
     * When enabled the output audio is corrected using the chosen algorithm. If
     * disabled, the audio will be measured but not adjusted.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CORRECT_AUDIO, MEASURE_ONLY
     *
     * @param algorithmControl When enabled the output audio is corrected using
     *            the chosen algorithm. If disabled, the audio will be measured
     *            but not adjusted.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioNormalizationAlgorithmControl
     */
    public AudioNormalizationSettings withAlgorithmControl(String algorithmControl) {
        this.algorithmControl = algorithmControl;
        return this;
    }

    /**
     * When enabled the output audio is corrected using the chosen algorithm. If
     * disabled, the audio will be measured but not adjusted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CORRECT_AUDIO, MEASURE_ONLY
     *
     * @param algorithmControl When enabled the output audio is corrected using
     *            the chosen algorithm. If disabled, the audio will be measured
     *            but not adjusted.
     * @see AudioNormalizationAlgorithmControl
     */
    public void setAlgorithmControl(AudioNormalizationAlgorithmControl algorithmControl) {
        this.algorithmControl = algorithmControl.toString();
    }

    /**
     * When enabled the output audio is corrected using the chosen algorithm. If
     * disabled, the audio will be measured but not adjusted.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CORRECT_AUDIO, MEASURE_ONLY
     *
     * @param algorithmControl When enabled the output audio is corrected using
     *            the chosen algorithm. If disabled, the audio will be measured
     *            but not adjusted.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioNormalizationAlgorithmControl
     */
    public AudioNormalizationSettings withAlgorithmControl(
            AudioNormalizationAlgorithmControl algorithmControl) {
        this.algorithmControl = algorithmControl.toString();
        return this;
    }

    /**
     * Content measuring above this level will be corrected to the target level.
     * Content measuring below this level will not be corrected.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-70 - 0<br/>
     *
     * @return Content measuring above this level will be corrected to the
     *         target level. Content measuring below this level will not be
     *         corrected.
     */
    public Integer getCorrectionGateLevel() {
        return correctionGateLevel;
    }

    /**
     * Content measuring above this level will be corrected to the target level.
     * Content measuring below this level will not be corrected.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-70 - 0<br/>
     *
     * @param correctionGateLevel Content measuring above this level will be
     *            corrected to the target level. Content measuring below this
     *            level will not be corrected.
     */
    public void setCorrectionGateLevel(Integer correctionGateLevel) {
        this.correctionGateLevel = correctionGateLevel;
    }

    /**
     * Content measuring above this level will be corrected to the target level.
     * Content measuring below this level will not be corrected.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-70 - 0<br/>
     *
     * @param correctionGateLevel Content measuring above this level will be
     *            corrected to the target level. Content measuring below this
     *            level will not be corrected.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioNormalizationSettings withCorrectionGateLevel(Integer correctionGateLevel) {
        this.correctionGateLevel = correctionGateLevel;
        return this;
    }

    /**
     * If set to LOG, log each output's audio track loudness to a CSV file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, DONT_LOG
     *
     * @return If set to LOG, log each output's audio track loudness to a CSV
     *         file.
     * @see AudioNormalizationLoudnessLogging
     */
    public String getLoudnessLogging() {
        return loudnessLogging;
    }

    /**
     * If set to LOG, log each output's audio track loudness to a CSV file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, DONT_LOG
     *
     * @param loudnessLogging If set to LOG, log each output's audio track
     *            loudness to a CSV file.
     * @see AudioNormalizationLoudnessLogging
     */
    public void setLoudnessLogging(String loudnessLogging) {
        this.loudnessLogging = loudnessLogging;
    }

    /**
     * If set to LOG, log each output's audio track loudness to a CSV file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, DONT_LOG
     *
     * @param loudnessLogging If set to LOG, log each output's audio track
     *            loudness to a CSV file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioNormalizationLoudnessLogging
     */
    public AudioNormalizationSettings withLoudnessLogging(String loudnessLogging) {
        this.loudnessLogging = loudnessLogging;
        return this;
    }

    /**
     * If set to LOG, log each output's audio track loudness to a CSV file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, DONT_LOG
     *
     * @param loudnessLogging If set to LOG, log each output's audio track
     *            loudness to a CSV file.
     * @see AudioNormalizationLoudnessLogging
     */
    public void setLoudnessLogging(AudioNormalizationLoudnessLogging loudnessLogging) {
        this.loudnessLogging = loudnessLogging.toString();
    }

    /**
     * If set to LOG, log each output's audio track loudness to a CSV file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, DONT_LOG
     *
     * @param loudnessLogging If set to LOG, log each output's audio track
     *            loudness to a CSV file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioNormalizationLoudnessLogging
     */
    public AudioNormalizationSettings withLoudnessLogging(
            AudioNormalizationLoudnessLogging loudnessLogging) {
        this.loudnessLogging = loudnessLogging.toString();
        return this;
    }

    /**
     * If set to TRUE_PEAK, calculate and log the TruePeak for each output's
     * audio track loudness.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRUE_PEAK, NONE
     *
     * @return If set to TRUE_PEAK, calculate and log the TruePeak for each
     *         output's audio track loudness.
     * @see AudioNormalizationPeakCalculation
     */
    public String getPeakCalculation() {
        return peakCalculation;
    }

    /**
     * If set to TRUE_PEAK, calculate and log the TruePeak for each output's
     * audio track loudness.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRUE_PEAK, NONE
     *
     * @param peakCalculation If set to TRUE_PEAK, calculate and log the
     *            TruePeak for each output's audio track loudness.
     * @see AudioNormalizationPeakCalculation
     */
    public void setPeakCalculation(String peakCalculation) {
        this.peakCalculation = peakCalculation;
    }

    /**
     * If set to TRUE_PEAK, calculate and log the TruePeak for each output's
     * audio track loudness.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRUE_PEAK, NONE
     *
     * @param peakCalculation If set to TRUE_PEAK, calculate and log the
     *            TruePeak for each output's audio track loudness.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioNormalizationPeakCalculation
     */
    public AudioNormalizationSettings withPeakCalculation(String peakCalculation) {
        this.peakCalculation = peakCalculation;
        return this;
    }

    /**
     * If set to TRUE_PEAK, calculate and log the TruePeak for each output's
     * audio track loudness.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRUE_PEAK, NONE
     *
     * @param peakCalculation If set to TRUE_PEAK, calculate and log the
     *            TruePeak for each output's audio track loudness.
     * @see AudioNormalizationPeakCalculation
     */
    public void setPeakCalculation(AudioNormalizationPeakCalculation peakCalculation) {
        this.peakCalculation = peakCalculation.toString();
    }

    /**
     * If set to TRUE_PEAK, calculate and log the TruePeak for each output's
     * audio track loudness.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRUE_PEAK, NONE
     *
     * @param peakCalculation If set to TRUE_PEAK, calculate and log the
     *            TruePeak for each output's audio track loudness.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioNormalizationPeakCalculation
     */
    public AudioNormalizationSettings withPeakCalculation(
            AudioNormalizationPeakCalculation peakCalculation) {
        this.peakCalculation = peakCalculation.toString();
        return this;
    }

    /**
     * When you use Audio normalization (AudioNormalizationSettings), optionally
     * use this setting to specify a target loudness. If you don't specify a
     * value here, the encoder chooses a value for you, based on the algorithm
     * that you choose for Algorithm (algorithm). If you choose algorithm
     * 1770-1, the encoder will choose -24 LKFS; otherwise, the encoder will
     * choose -23 LKFS.
     *
     * @return When you use Audio normalization (AudioNormalizationSettings),
     *         optionally use this setting to specify a target loudness. If you
     *         don't specify a value here, the encoder chooses a value for you,
     *         based on the algorithm that you choose for Algorithm (algorithm).
     *         If you choose algorithm 1770-1, the encoder will choose -24 LKFS;
     *         otherwise, the encoder will choose -23 LKFS.
     */
    public Double getTargetLkfs() {
        return targetLkfs;
    }

    /**
     * When you use Audio normalization (AudioNormalizationSettings), optionally
     * use this setting to specify a target loudness. If you don't specify a
     * value here, the encoder chooses a value for you, based on the algorithm
     * that you choose for Algorithm (algorithm). If you choose algorithm
     * 1770-1, the encoder will choose -24 LKFS; otherwise, the encoder will
     * choose -23 LKFS.
     *
     * @param targetLkfs When you use Audio normalization
     *            (AudioNormalizationSettings), optionally use this setting to
     *            specify a target loudness. If you don't specify a value here,
     *            the encoder chooses a value for you, based on the algorithm
     *            that you choose for Algorithm (algorithm). If you choose
     *            algorithm 1770-1, the encoder will choose -24 LKFS; otherwise,
     *            the encoder will choose -23 LKFS.
     */
    public void setTargetLkfs(Double targetLkfs) {
        this.targetLkfs = targetLkfs;
    }

    /**
     * When you use Audio normalization (AudioNormalizationSettings), optionally
     * use this setting to specify a target loudness. If you don't specify a
     * value here, the encoder chooses a value for you, based on the algorithm
     * that you choose for Algorithm (algorithm). If you choose algorithm
     * 1770-1, the encoder will choose -24 LKFS; otherwise, the encoder will
     * choose -23 LKFS.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLkfs When you use Audio normalization
     *            (AudioNormalizationSettings), optionally use this setting to
     *            specify a target loudness. If you don't specify a value here,
     *            the encoder chooses a value for you, based on the algorithm
     *            that you choose for Algorithm (algorithm). If you choose
     *            algorithm 1770-1, the encoder will choose -24 LKFS; otherwise,
     *            the encoder will choose -23 LKFS.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioNormalizationSettings withTargetLkfs(Double targetLkfs) {
        this.targetLkfs = targetLkfs;
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: " + getAlgorithm() + ",");
        if (getAlgorithmControl() != null)
            sb.append("AlgorithmControl: " + getAlgorithmControl() + ",");
        if (getCorrectionGateLevel() != null)
            sb.append("CorrectionGateLevel: " + getCorrectionGateLevel() + ",");
        if (getLoudnessLogging() != null)
            sb.append("LoudnessLogging: " + getLoudnessLogging() + ",");
        if (getPeakCalculation() != null)
            sb.append("PeakCalculation: " + getPeakCalculation() + ",");
        if (getTargetLkfs() != null)
            sb.append("TargetLkfs: " + getTargetLkfs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getAlgorithmControl() == null) ? 0 : getAlgorithmControl().hashCode());
        hashCode = prime * hashCode
                + ((getCorrectionGateLevel() == null) ? 0 : getCorrectionGateLevel().hashCode());
        hashCode = prime * hashCode
                + ((getLoudnessLogging() == null) ? 0 : getLoudnessLogging().hashCode());
        hashCode = prime * hashCode
                + ((getPeakCalculation() == null) ? 0 : getPeakCalculation().hashCode());
        hashCode = prime * hashCode + ((getTargetLkfs() == null) ? 0 : getTargetLkfs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioNormalizationSettings == false)
            return false;
        AudioNormalizationSettings other = (AudioNormalizationSettings) obj;

        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null
                && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getAlgorithmControl() == null ^ this.getAlgorithmControl() == null)
            return false;
        if (other.getAlgorithmControl() != null
                && other.getAlgorithmControl().equals(this.getAlgorithmControl()) == false)
            return false;
        if (other.getCorrectionGateLevel() == null ^ this.getCorrectionGateLevel() == null)
            return false;
        if (other.getCorrectionGateLevel() != null
                && other.getCorrectionGateLevel().equals(this.getCorrectionGateLevel()) == false)
            return false;
        if (other.getLoudnessLogging() == null ^ this.getLoudnessLogging() == null)
            return false;
        if (other.getLoudnessLogging() != null
                && other.getLoudnessLogging().equals(this.getLoudnessLogging()) == false)
            return false;
        if (other.getPeakCalculation() == null ^ this.getPeakCalculation() == null)
            return false;
        if (other.getPeakCalculation() != null
                && other.getPeakCalculation().equals(this.getPeakCalculation()) == false)
            return false;
        if (other.getTargetLkfs() == null ^ this.getTargetLkfs() == null)
            return false;
        if (other.getTargetLkfs() != null
                && other.getTargetLkfs().equals(this.getTargetLkfs()) == false)
            return false;
        return true;
    }
}
