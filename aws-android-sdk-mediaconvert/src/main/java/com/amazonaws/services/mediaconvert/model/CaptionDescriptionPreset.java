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
 * Caption Description for preset
 */
public class CaptionDescriptionPreset implements Serializable {
    /**
     * Specify the language for this captions output track. For most captions
     * output formats, the encoder puts this language information in the output
     * captions metadata. If your output captions format is DVB-Sub or Burn in,
     * the encoder uses this language information when automatically selecting
     * the font script for rendering the captions text. For all outputs, you can
     * use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also
     * use any other code in the full RFC-5646 specification. Streaming outputs
     * are those that are in one of the following output groups: CMAF, DASH ISO,
     * Apple HLS, or Microsoft Smooth Streaming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[A-Za-z]{2,3}(-[A-Za-z-]+)?$<br/>
     */
    private String customLanguageCode;

    /**
     * Specific settings required by destination type. Note that
     * burnin_destination_settings are not available if the source of the
     * caption data is Embedded or Teletext.
     */
    private CaptionDestinationSettings destinationSettings;

    /**
     * Specify the language of this captions output track. For most captions
     * output formats, the encoder puts this language information in the output
     * captions metadata. If your output captions format is DVB-Sub or Burn in,
     * the encoder uses this language information to choose the font language
     * for rendering the captions text.
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
     * Specify a label for this set of output captions. For example, "English",
     * "Director commentary", or "track_2". For streaming outputs, MediaConvert
     * passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the
     * service ignores this setting.
     */
    private String languageDescription;

    /**
     * Specify the language for this captions output track. For most captions
     * output formats, the encoder puts this language information in the output
     * captions metadata. If your output captions format is DVB-Sub or Burn in,
     * the encoder uses this language information when automatically selecting
     * the font script for rendering the captions text. For all outputs, you can
     * use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also
     * use any other code in the full RFC-5646 specification. Streaming outputs
     * are those that are in one of the following output groups: CMAF, DASH ISO,
     * Apple HLS, or Microsoft Smooth Streaming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[A-Za-z]{2,3}(-[A-Za-z-]+)?$<br/>
     *
     * @return Specify the language for this captions output track. For most
     *         captions output formats, the encoder puts this language
     *         information in the output captions metadata. If your output
     *         captions format is DVB-Sub or Burn in, the encoder uses this
     *         language information when automatically selecting the font script
     *         for rendering the captions text. For all outputs, you can use an
     *         ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also
     *         use any other code in the full RFC-5646 specification. Streaming
     *         outputs are those that are in one of the following output groups:
     *         CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
     */
    public String getCustomLanguageCode() {
        return customLanguageCode;
    }

    /**
     * Specify the language for this captions output track. For most captions
     * output formats, the encoder puts this language information in the output
     * captions metadata. If your output captions format is DVB-Sub or Burn in,
     * the encoder uses this language information when automatically selecting
     * the font script for rendering the captions text. For all outputs, you can
     * use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also
     * use any other code in the full RFC-5646 specification. Streaming outputs
     * are those that are in one of the following output groups: CMAF, DASH ISO,
     * Apple HLS, or Microsoft Smooth Streaming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[A-Za-z]{2,3}(-[A-Za-z-]+)?$<br/>
     *
     * @param customLanguageCode Specify the language for this captions output
     *            track. For most captions output formats, the encoder puts this
     *            language information in the output captions metadata. If your
     *            output captions format is DVB-Sub or Burn in, the encoder uses
     *            this language information when automatically selecting the
     *            font script for rendering the captions text. For all outputs,
     *            you can use an ISO 639-2 or ISO 639-3 code. For streaming
     *            outputs, you can also use any other code in the full RFC-5646
     *            specification. Streaming outputs are those that are in one of
     *            the following output groups: CMAF, DASH ISO, Apple HLS, or
     *            Microsoft Smooth Streaming.
     */
    public void setCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
    }

    /**
     * Specify the language for this captions output track. For most captions
     * output formats, the encoder puts this language information in the output
     * captions metadata. If your output captions format is DVB-Sub or Burn in,
     * the encoder uses this language information when automatically selecting
     * the font script for rendering the captions text. For all outputs, you can
     * use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also
     * use any other code in the full RFC-5646 specification. Streaming outputs
     * are those that are in one of the following output groups: CMAF, DASH ISO,
     * Apple HLS, or Microsoft Smooth Streaming.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[A-Za-z]{2,3}(-[A-Za-z-]+)?$<br/>
     *
     * @param customLanguageCode Specify the language for this captions output
     *            track. For most captions output formats, the encoder puts this
     *            language information in the output captions metadata. If your
     *            output captions format is DVB-Sub or Burn in, the encoder uses
     *            this language information when automatically selecting the
     *            font script for rendering the captions text. For all outputs,
     *            you can use an ISO 639-2 or ISO 639-3 code. For streaming
     *            outputs, you can also use any other code in the full RFC-5646
     *            specification. Streaming outputs are those that are in one of
     *            the following output groups: CMAF, DASH ISO, Apple HLS, or
     *            Microsoft Smooth Streaming.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDescriptionPreset withCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
        return this;
    }

    /**
     * Specific settings required by destination type. Note that
     * burnin_destination_settings are not available if the source of the
     * caption data is Embedded or Teletext.
     *
     * @return Specific settings required by destination type. Note that
     *         burnin_destination_settings are not available if the source of
     *         the caption data is Embedded or Teletext.
     */
    public CaptionDestinationSettings getDestinationSettings() {
        return destinationSettings;
    }

    /**
     * Specific settings required by destination type. Note that
     * burnin_destination_settings are not available if the source of the
     * caption data is Embedded or Teletext.
     *
     * @param destinationSettings Specific settings required by destination
     *            type. Note that burnin_destination_settings are not available
     *            if the source of the caption data is Embedded or Teletext.
     */
    public void setDestinationSettings(CaptionDestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
    }

    /**
     * Specific settings required by destination type. Note that
     * burnin_destination_settings are not available if the source of the
     * caption data is Embedded or Teletext.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationSettings Specific settings required by destination
     *            type. Note that burnin_destination_settings are not available
     *            if the source of the caption data is Embedded or Teletext.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDescriptionPreset withDestinationSettings(
            CaptionDestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
        return this;
    }

    /**
     * Specify the language of this captions output track. For most captions
     * output formats, the encoder puts this language information in the output
     * captions metadata. If your output captions format is DVB-Sub or Burn in,
     * the encoder uses this language information to choose the font language
     * for rendering the captions text.
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
     * @return Specify the language of this captions output track. For most
     *         captions output formats, the encoder puts this language
     *         information in the output captions metadata. If your output
     *         captions format is DVB-Sub or Burn in, the encoder uses this
     *         language information to choose the font language for rendering
     *         the captions text.
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Specify the language of this captions output track. For most captions
     * output formats, the encoder puts this language information in the output
     * captions metadata. If your output captions format is DVB-Sub or Burn in,
     * the encoder uses this language information to choose the font language
     * for rendering the captions text.
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
     * @param languageCode Specify the language of this captions output track.
     *            For most captions output formats, the encoder puts this
     *            language information in the output captions metadata. If your
     *            output captions format is DVB-Sub or Burn in, the encoder uses
     *            this language information to choose the font language for
     *            rendering the captions text.
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Specify the language of this captions output track. For most captions
     * output formats, the encoder puts this language information in the output
     * captions metadata. If your output captions format is DVB-Sub or Burn in,
     * the encoder uses this language information to choose the font language
     * for rendering the captions text.
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
     * @param languageCode Specify the language of this captions output track.
     *            For most captions output formats, the encoder puts this
     *            language information in the output captions metadata. If your
     *            output captions format is DVB-Sub or Burn in, the encoder uses
     *            this language information to choose the font language for
     *            rendering the captions text.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public CaptionDescriptionPreset withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Specify the language of this captions output track. For most captions
     * output formats, the encoder puts this language information in the output
     * captions metadata. If your output captions format is DVB-Sub or Burn in,
     * the encoder uses this language information to choose the font language
     * for rendering the captions text.
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
     * @param languageCode Specify the language of this captions output track.
     *            For most captions output formats, the encoder puts this
     *            language information in the output captions metadata. If your
     *            output captions format is DVB-Sub or Burn in, the encoder uses
     *            this language information to choose the font language for
     *            rendering the captions text.
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * Specify the language of this captions output track. For most captions
     * output formats, the encoder puts this language information in the output
     * captions metadata. If your output captions format is DVB-Sub or Burn in,
     * the encoder uses this language information to choose the font language
     * for rendering the captions text.
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
     * @param languageCode Specify the language of this captions output track.
     *            For most captions output formats, the encoder puts this
     *            language information in the output captions metadata. If your
     *            output captions format is DVB-Sub or Burn in, the encoder uses
     *            this language information to choose the font language for
     *            rendering the captions text.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public CaptionDescriptionPreset withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * Specify a label for this set of output captions. For example, "English",
     * "Director commentary", or "track_2". For streaming outputs, MediaConvert
     * passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the
     * service ignores this setting.
     *
     * @return Specify a label for this set of output captions. For example,
     *         "English", "Director commentary", or "track_2". For streaming
     *         outputs, MediaConvert passes this information into destination
     *         manifests for display on the end-viewer's player device. For
     *         outputs in other output groups, the service ignores this setting.
     */
    public String getLanguageDescription() {
        return languageDescription;
    }

    /**
     * Specify a label for this set of output captions. For example, "English",
     * "Director commentary", or "track_2". For streaming outputs, MediaConvert
     * passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the
     * service ignores this setting.
     *
     * @param languageDescription Specify a label for this set of output
     *            captions. For example, "English", "Director commentary", or
     *            "track_2". For streaming outputs, MediaConvert passes this
     *            information into destination manifests for display on the
     *            end-viewer's player device. For outputs in other output
     *            groups, the service ignores this setting.
     */
    public void setLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
    }

    /**
     * Specify a label for this set of output captions. For example, "English",
     * "Director commentary", or "track_2". For streaming outputs, MediaConvert
     * passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the
     * service ignores this setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageDescription Specify a label for this set of output
     *            captions. For example, "English", "Director commentary", or
     *            "track_2". For streaming outputs, MediaConvert passes this
     *            information into destination manifests for display on the
     *            end-viewer's player device. For outputs in other output
     *            groups, the service ignores this setting.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDescriptionPreset withLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
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
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: " + getDestinationSettings() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getLanguageDescription() != null)
            sb.append("LanguageDescription: " + getLanguageDescription());
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
                + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageDescription() == null) ? 0 : getLanguageDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionDescriptionPreset == false)
            return false;
        CaptionDescriptionPreset other = (CaptionDescriptionPreset) obj;

        if (other.getCustomLanguageCode() == null ^ this.getCustomLanguageCode() == null)
            return false;
        if (other.getCustomLanguageCode() != null
                && other.getCustomLanguageCode().equals(this.getCustomLanguageCode()) == false)
            return false;
        if (other.getDestinationSettings() == null ^ this.getDestinationSettings() == null)
            return false;
        if (other.getDestinationSettings() != null
                && other.getDestinationSettings().equals(this.getDestinationSettings()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageDescription() == null ^ this.getLanguageDescription() == null)
            return false;
        if (other.getLanguageDescription() != null
                && other.getLanguageDescription().equals(this.getLanguageDescription()) == false)
            return false;
        return true;
    }
}
