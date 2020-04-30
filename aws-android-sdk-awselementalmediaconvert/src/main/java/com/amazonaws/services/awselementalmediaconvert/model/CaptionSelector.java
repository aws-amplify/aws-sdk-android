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
 * Set up captions in your outputs by first selecting them from your input here.
 */
public class CaptionSelector implements Serializable {
    /**
     * The specific language to extract from source, using the ISO 639-2 or ISO
     * 639-3 three-letter language code. If input is SCTE-27, complete this
     * field and/or PID to select the caption language to extract. If input is
     * DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or PID
     * to select the caption language to extract. If input is DVB-Sub that is
     * being passed through, omit this field (and PID field); there is no way to
     * extract a specific language with pass-through captions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^[A-Za-z]{3}$<br/>
     */
    private String customLanguageCode;

    /**
     * The specific language to extract from source. If input is SCTE-27,
     * complete this field and/or PID to select the caption language to extract.
     * If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this
     * field and/or PID to select the caption language to extract. If input is
     * DVB-Sub that is being passed through, omit this field (and PID field);
     * there is no way to extract a specific language with pass-through
     * captions.
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
     * If your input captions are SCC, TTML, STL, SMI, SRT, or IMSC in an xml
     * file, specify the URI of the input captions source file. If your input
     * captions are IMSC in an IMF package, use TrackSourceSettings instead of
     * FileSoureSettings.
     */
    private CaptionSourceSettings sourceSettings;

    /**
     * The specific language to extract from source, using the ISO 639-2 or ISO
     * 639-3 three-letter language code. If input is SCTE-27, complete this
     * field and/or PID to select the caption language to extract. If input is
     * DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or PID
     * to select the caption language to extract. If input is DVB-Sub that is
     * being passed through, omit this field (and PID field); there is no way to
     * extract a specific language with pass-through captions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^[A-Za-z]{3}$<br/>
     *
     * @return The specific language to extract from source, using the ISO 639-2
     *         or ISO 639-3 three-letter language code. If input is SCTE-27,
     *         complete this field and/or PID to select the caption language to
     *         extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT,
     *         complete this field and/or PID to select the caption language to
     *         extract. If input is DVB-Sub that is being passed through, omit
     *         this field (and PID field); there is no way to extract a specific
     *         language with pass-through captions.
     */
    public String getCustomLanguageCode() {
        return customLanguageCode;
    }

    /**
     * The specific language to extract from source, using the ISO 639-2 or ISO
     * 639-3 three-letter language code. If input is SCTE-27, complete this
     * field and/or PID to select the caption language to extract. If input is
     * DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or PID
     * to select the caption language to extract. If input is DVB-Sub that is
     * being passed through, omit this field (and PID field); there is no way to
     * extract a specific language with pass-through captions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^[A-Za-z]{3}$<br/>
     *
     * @param customLanguageCode The specific language to extract from source,
     *            using the ISO 639-2 or ISO 639-3 three-letter language code.
     *            If input is SCTE-27, complete this field and/or PID to select
     *            the caption language to extract. If input is DVB-Sub and
     *            output is Burn-in or SMPTE-TT, complete this field and/or PID
     *            to select the caption language to extract. If input is DVB-Sub
     *            that is being passed through, omit this field (and PID field);
     *            there is no way to extract a specific language with
     *            pass-through captions.
     */
    public void setCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
    }

    /**
     * The specific language to extract from source, using the ISO 639-2 or ISO
     * 639-3 three-letter language code. If input is SCTE-27, complete this
     * field and/or PID to select the caption language to extract. If input is
     * DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or PID
     * to select the caption language to extract. If input is DVB-Sub that is
     * being passed through, omit this field (and PID field); there is no way to
     * extract a specific language with pass-through captions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^[A-Za-z]{3}$<br/>
     *
     * @param customLanguageCode The specific language to extract from source,
     *            using the ISO 639-2 or ISO 639-3 three-letter language code.
     *            If input is SCTE-27, complete this field and/or PID to select
     *            the caption language to extract. If input is DVB-Sub and
     *            output is Burn-in or SMPTE-TT, complete this field and/or PID
     *            to select the caption language to extract. If input is DVB-Sub
     *            that is being passed through, omit this field (and PID field);
     *            there is no way to extract a specific language with
     *            pass-through captions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSelector withCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
        return this;
    }

    /**
     * The specific language to extract from source. If input is SCTE-27,
     * complete this field and/or PID to select the caption language to extract.
     * If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this
     * field and/or PID to select the caption language to extract. If input is
     * DVB-Sub that is being passed through, omit this field (and PID field);
     * there is no way to extract a specific language with pass-through
     * captions.
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
     * @return The specific language to extract from source. If input is
     *         SCTE-27, complete this field and/or PID to select the caption
     *         language to extract. If input is DVB-Sub and output is Burn-in or
     *         SMPTE-TT, complete this field and/or PID to select the caption
     *         language to extract. If input is DVB-Sub that is being passed
     *         through, omit this field (and PID field); there is no way to
     *         extract a specific language with pass-through captions.
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * The specific language to extract from source. If input is SCTE-27,
     * complete this field and/or PID to select the caption language to extract.
     * If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this
     * field and/or PID to select the caption language to extract. If input is
     * DVB-Sub that is being passed through, omit this field (and PID field);
     * there is no way to extract a specific language with pass-through
     * captions.
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
     * @param languageCode The specific language to extract from source. If
     *            input is SCTE-27, complete this field and/or PID to select the
     *            caption language to extract. If input is DVB-Sub and output is
     *            Burn-in or SMPTE-TT, complete this field and/or PID to select
     *            the caption language to extract. If input is DVB-Sub that is
     *            being passed through, omit this field (and PID field); there
     *            is no way to extract a specific language with pass-through
     *            captions.
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * The specific language to extract from source. If input is SCTE-27,
     * complete this field and/or PID to select the caption language to extract.
     * If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this
     * field and/or PID to select the caption language to extract. If input is
     * DVB-Sub that is being passed through, omit this field (and PID field);
     * there is no way to extract a specific language with pass-through
     * captions.
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
     * @param languageCode The specific language to extract from source. If
     *            input is SCTE-27, complete this field and/or PID to select the
     *            caption language to extract. If input is DVB-Sub and output is
     *            Burn-in or SMPTE-TT, complete this field and/or PID to select
     *            the caption language to extract. If input is DVB-Sub that is
     *            being passed through, omit this field (and PID field); there
     *            is no way to extract a specific language with pass-through
     *            captions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public CaptionSelector withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * The specific language to extract from source. If input is SCTE-27,
     * complete this field and/or PID to select the caption language to extract.
     * If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this
     * field and/or PID to select the caption language to extract. If input is
     * DVB-Sub that is being passed through, omit this field (and PID field);
     * there is no way to extract a specific language with pass-through
     * captions.
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
     * @param languageCode The specific language to extract from source. If
     *            input is SCTE-27, complete this field and/or PID to select the
     *            caption language to extract. If input is DVB-Sub and output is
     *            Burn-in or SMPTE-TT, complete this field and/or PID to select
     *            the caption language to extract. If input is DVB-Sub that is
     *            being passed through, omit this field (and PID field); there
     *            is no way to extract a specific language with pass-through
     *            captions.
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * The specific language to extract from source. If input is SCTE-27,
     * complete this field and/or PID to select the caption language to extract.
     * If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this
     * field and/or PID to select the caption language to extract. If input is
     * DVB-Sub that is being passed through, omit this field (and PID field);
     * there is no way to extract a specific language with pass-through
     * captions.
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
     * @param languageCode The specific language to extract from source. If
     *            input is SCTE-27, complete this field and/or PID to select the
     *            caption language to extract. If input is DVB-Sub and output is
     *            Burn-in or SMPTE-TT, complete this field and/or PID to select
     *            the caption language to extract. If input is DVB-Sub that is
     *            being passed through, omit this field (and PID field); there
     *            is no way to extract a specific language with pass-through
     *            captions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public CaptionSelector withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * If your input captions are SCC, TTML, STL, SMI, SRT, or IMSC in an xml
     * file, specify the URI of the input captions source file. If your input
     * captions are IMSC in an IMF package, use TrackSourceSettings instead of
     * FileSoureSettings.
     *
     * @return If your input captions are SCC, TTML, STL, SMI, SRT, or IMSC in
     *         an xml file, specify the URI of the input captions source file.
     *         If your input captions are IMSC in an IMF package, use
     *         TrackSourceSettings instead of FileSoureSettings.
     */
    public CaptionSourceSettings getSourceSettings() {
        return sourceSettings;
    }

    /**
     * If your input captions are SCC, TTML, STL, SMI, SRT, or IMSC in an xml
     * file, specify the URI of the input captions source file. If your input
     * captions are IMSC in an IMF package, use TrackSourceSettings instead of
     * FileSoureSettings.
     *
     * @param sourceSettings If your input captions are SCC, TTML, STL, SMI,
     *            SRT, or IMSC in an xml file, specify the URI of the input
     *            captions source file. If your input captions are IMSC in an
     *            IMF package, use TrackSourceSettings instead of
     *            FileSoureSettings.
     */
    public void setSourceSettings(CaptionSourceSettings sourceSettings) {
        this.sourceSettings = sourceSettings;
    }

    /**
     * If your input captions are SCC, TTML, STL, SMI, SRT, or IMSC in an xml
     * file, specify the URI of the input captions source file. If your input
     * captions are IMSC in an IMF package, use TrackSourceSettings instead of
     * FileSoureSettings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSettings If your input captions are SCC, TTML, STL, SMI,
     *            SRT, or IMSC in an xml file, specify the URI of the input
     *            captions source file. If your input captions are IMSC in an
     *            IMF package, use TrackSourceSettings instead of
     *            FileSoureSettings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSelector withSourceSettings(CaptionSourceSettings sourceSettings) {
        this.sourceSettings = sourceSettings;
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getSourceSettings() != null)
            sb.append("SourceSettings: " + getSourceSettings());
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
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getSourceSettings() == null) ? 0 : getSourceSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionSelector == false)
            return false;
        CaptionSelector other = (CaptionSelector) obj;

        if (other.getCustomLanguageCode() == null ^ this.getCustomLanguageCode() == null)
            return false;
        if (other.getCustomLanguageCode() != null
                && other.getCustomLanguageCode().equals(this.getCustomLanguageCode()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getSourceSettings() == null ^ this.getSourceSettings() == null)
            return false;
        if (other.getSourceSettings() != null
                && other.getSourceSettings().equals(this.getSourceSettings()) == false)
            return false;
        return true;
    }
}
