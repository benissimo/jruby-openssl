/***** BEGIN LICENSE BLOCK *****
 * Version: EPL 1.0/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Eclipse Public
 * License Version 1.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.eclipse.org/legal/epl-v10.html
 *
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 *
 * Copyright (C) 2008 Ola Bini <ola.bini@gmail.com>
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either of the GNU General Public License Version 2 or later (the "GPL"),
 * or the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the EPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the EPL, the GPL or the LGPL.
 ***** END LICENSE BLOCK *****/
package org.jruby.ext.openssl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author <a href="mailto:ola.bini@gmail.com">Ola Bini</a>
 */
public class CipherStrings {

    public final static String SSL_TXT_LOW = "LOW";
    public final static String SSL_TXT_MEDIUM = "MEDIUM";
    public final static String SSL_TXT_HIGH = "HIGH";
    public final static String SSL_TXT_kFZA = "kFZA";
    public final static String SSL_TXT_aFZA = "aFZA";
    public final static String SSL_TXT_eFZA = "eFZA";
    public final static String SSL_TXT_FZA = "FZA";

    public final static String SSL_TXT_aNULL = "aNULL";
    public final static String SSL_TXT_eNULL = "eNULL";
    public final static String SSL_TXT_NULL = "NULL";

    public final static String SSL_TXT_kKRB5 = "kKRB5";
    public final static String SSL_TXT_aKRB5 = "aKRB5";
    public final static String SSL_TXT_KRB5 = "KRB5";

    public final static String SSL_TXT_kRSA = "kRSA";
    public final static String SSL_TXT_kDHr = "kDHr";
    public final static String SSL_TXT_kDHd = "kDHd";
    public final static String SSL_TXT_kEDH = "kEDH";
    public final static String SSL_TXT_aRSA = "aRSA";
    public final static String SSL_TXT_aDSS = "aDSS";
    public final static String SSL_TXT_aDH = "aDH";
    public final static String SSL_TXT_DSS = "DSS";
    public final static String SSL_TXT_DH = "DH";
    public final static String SSL_TXT_EDH = "EDH";
    public final static String SSL_TXT_ADH = "ADH";
    public final static String SSL_TXT_RSA = "RSA";
    public final static String SSL_TXT_DES = "DES";
    public final static String SSL_TXT_3DES = "3DES";
    public final static String SSL_TXT_RC4 = "RC4";
    public final static String SSL_TXT_RC2 = "RC2";
    public final static String SSL_TXT_IDEA = "IDEA";
    public final static String SSL_TXT_AES = "AES";
    public final static String SSL_TXT_MD5 = "MD5";
    public final static String SSL_TXT_SHA1 = "SHA1";
    public final static String SSL_TXT_SHA = "SHA";
    public final static String SSL_TXT_EXP = "EXP";
    public final static String SSL_TXT_EXPORT = "EXPORT";
    public final static String SSL_TXT_EXP40 = "EXPORT40";
    public final static String SSL_TXT_EXP56 = "EXPORT56";
    public final static String SSL_TXT_SSLV2 = "SSLv2";
    public final static String SSL_TXT_SSLV3 = "SSLv3";
    public final static String SSL_TXT_TLSV1 = "TLSv1";
    public final static String SSL_TXT_ALL = "ALL";
    public final static String SSL_TXT_ECC = "ECCdraft";

    public final static String SSL_TXT_CMPALL = "COMPLEMENTOFALL";
    public final static String SSL_TXT_CMPDEF = "COMPLEMENTOFDEFAULT";

    // "ALL:!aNULL:!eNULL:!SSLv2" is for OpenSSL 1.0.0 GA
    public final static String SSL_DEFAULT_CIPHER_LIST = "AES:ALL:!aNULL:!eNULL:+RC4:@STRENGTH";

    public final static long SSL_MKEY_MASK = 0x000000FFL;
    public final static long SSL_kRSA = 0x00000001L;
    public final static long SSL_kDHr = 0x00000002L;
    public final static long SSL_kDHd = 0x00000004L;
    public final static long SSL_kFZA = 0x00000008L;
    public final static long SSL_kEDH = 0x00000010L;
    public final static long SSL_kKRB5 = 0x00000020L;
    public final static long SSL_kECDH = 0x00000040L;
    public final static long SSL_kECDHE = 0x00000080L;
    public final static long SSL_aNULL = 0x00000800L;
    public final static long SSL_AUTH_MASK = 0x00007F00L;
    public final static long SSL_EDH = (SSL_kEDH | (SSL_AUTH_MASK ^ SSL_aNULL));
    public final static long SSL_aRSA = 0x00000100L;
    public final static long SSL_aDSS = 0x00000200L;
    public final static long SSL_DSS = SSL_aDSS;
    public final static long SSL_aFZA = 0x00000400L;
    public final static long SSL_aDH = 0x00001000L;
    public final static long SSL_aKRB5 = 0x00002000L;
    public final static long SSL_aECDSA = 0x00004000L;
    public final static long SSL_eNULL = 0x00200000L;
    public final static long SSL_eFZA = 0x00100000L;
    public final static long SSL_NULL = (SSL_eNULL);
    public final static long SSL_ADH = (SSL_kEDH | SSL_aNULL);
    public final static long SSL_RSA = (SSL_kRSA | SSL_aRSA);
    public final static long SSL_DH = (SSL_kDHr | SSL_kDHd | SSL_kEDH);
    public final static long SSL_ECDH = (SSL_kECDH | SSL_kECDHE);
    public final static long SSL_FZA = (SSL_aFZA | SSL_kFZA | SSL_eFZA);
    public final static long SSL_KRB5 = (SSL_kKRB5 | SSL_aKRB5);
    public final static long SSL_ENC_MASK = 0x043F8000L;
    public final static long SSL_DES = 0x00008000L;
    public final static long SSL_3DES = 0x00010000L;
    public final static long SSL_RC4 = 0x00020000L;
    public final static long SSL_RC2 = 0x00040000L;
    public final static long SSL_IDEA = 0x00080000L;
    public final static long SSL_AES = 0x04000000L;
    public final static long SSL_MAC_MASK = 0x00c00000L;
    public final static long SSL_MD5 = 0x00400000L;
    public final static long SSL_SHA1 = 0x00800000L;
    public final static long SSL_SHA = (SSL_SHA1);
    public final static long SSL_SSL_MASK = 0x03000000L;
    public final static long SSL_SSLV2 = 0x01000000L;
    public final static long SSL_SSLV3 = 0x02000000L;
    public final static long SSL_TLSV1 = SSL_SSLV3;
    public final static long SSL_EXP_MASK = 0x00000003L;
    public final static long SSL_NOT_EXP = 0x00000001L;
    public final static long SSL_EXPORT = 0x00000002L;
    public final static long SSL_STRONG_MASK = 0x000000fcL;
    public final static long SSL_STRONG_NONE = 0x00000004L;
    public final static long SSL_EXP40 = 0x00000008L;
    public final static long SSL_MICRO = (SSL_EXP40);
    public final static long SSL_EXP56 = 0x00000010L;
    public final static long SSL_MINI = (SSL_EXP56);
    public final static long SSL_LOW = 0x00000020L;
    public final static long SSL_MEDIUM = 0x00000040L;
    public final static long SSL_HIGH = 0x00000080L;
    public final static long SSL_ALL = 0xffffffffL;
    public final static long SSL_ALL_CIPHERS =
        (SSL_MKEY_MASK | SSL_AUTH_MASK | SSL_ENC_MASK | SSL_MAC_MASK);
    public final static long SSL_ALL_STRENGTHS = (SSL_EXP_MASK | SSL_STRONG_MASK);
    public final static long SSL_PKEY_RSA_ENC = 0;
    public final static long SSL_PKEY_RSA_SIGN = 1;
    public final static long SSL_PKEY_DSA_SIGN = 2;
    public final static long SSL_PKEY_DH_RSA = 3;
    public final static long SSL_PKEY_DH_DSA = 4;
    public final static long SSL_PKEY_ECC = 5;
    public final static long SSL_PKEY_NUM = 6;

    public final static long SSL3_CK_RSA_NULL_MD5 = 0x03000001;
    public final static long SSL3_CK_RSA_NULL_SHA = 0x03000002;
    public final static long SSL3_CK_RSA_RC4_40_MD5 = 0x03000003;
    public final static long SSL3_CK_RSA_RC4_128_MD5 = 0x03000004;
    public final static long SSL3_CK_RSA_RC4_128_SHA = 0x03000005;
    public final static long SSL3_CK_RSA_RC2_40_MD5 = 0x03000006;
    public final static long SSL3_CK_RSA_IDEA_128_SHA = 0x03000007;
    public final static long SSL3_CK_RSA_DES_40_CBC_SHA = 0x03000008;
    public final static long SSL3_CK_RSA_DES_64_CBC_SHA = 0x03000009;
    public final static long SSL3_CK_RSA_DES_192_CBC3_SHA = 0x0300000A;
    public final static long SSL3_CK_DH_DSS_DES_40_CBC_SHA = 0x0300000B;
    public final static long SSL3_CK_DH_DSS_DES_64_CBC_SHA = 0x0300000C;
    public final static long SSL3_CK_DH_DSS_DES_192_CBC3_SHA = 0x0300000D;
    public final static long SSL3_CK_DH_RSA_DES_40_CBC_SHA = 0x0300000E;
    public final static long SSL3_CK_DH_RSA_DES_64_CBC_SHA = 0x0300000F;
    public final static long SSL3_CK_DH_RSA_DES_192_CBC3_SHA = 0x03000010;
    public final static long SSL3_CK_EDH_DSS_DES_40_CBC_SHA = 0x03000011;
    public final static long SSL3_CK_EDH_DSS_DES_64_CBC_SHA = 0x03000012;
    public final static long SSL3_CK_EDH_DSS_DES_192_CBC3_SHA = 0x03000013;
    public final static long SSL3_CK_EDH_RSA_DES_40_CBC_SHA = 0x03000014;
    public final static long SSL3_CK_EDH_RSA_DES_64_CBC_SHA = 0x03000015;
    public final static long SSL3_CK_EDH_RSA_DES_192_CBC3_SHA = 0x03000016;
    public final static long SSL3_CK_ADH_RC4_40_MD5 = 0x03000017;
    public final static long SSL3_CK_ADH_RC4_128_MD5 = 0x03000018;
    public final static long SSL3_CK_ADH_DES_40_CBC_SHA = 0x03000019;
    public final static long SSL3_CK_ADH_DES_64_CBC_SHA = 0x0300001A;
    public final static long SSL3_CK_ADH_DES_192_CBC_SHA = 0x0300001B;
    public final static long SSL3_CK_FZA_DMS_NULL_SHA = 0x0300001C;
    public final static long SSL3_CK_FZA_DMS_FZA_SHA = 0x0300001D;
    public final static long SSL3_CK_KRB5_DES_64_CBC_SHA = 0x0300001E;
    public final static long SSL3_CK_KRB5_DES_192_CBC3_SHA = 0x0300001F;
    public final static long SSL3_CK_KRB5_RC4_128_SHA = 0x03000020;
    public final static long SSL3_CK_KRB5_IDEA_128_CBC_SHA = 0x03000021;
    public final static long SSL3_CK_KRB5_DES_64_CBC_MD5 = 0x03000022;
    public final static long SSL3_CK_KRB5_DES_192_CBC3_MD5 = 0x03000023;
    public final static long SSL3_CK_KRB5_RC4_128_MD5 = 0x03000024;
    public final static long SSL3_CK_KRB5_IDEA_128_CBC_MD5 = 0x03000025;
    public final static long SSL3_CK_KRB5_DES_40_CBC_SHA = 0x03000026;
    public final static long SSL3_CK_KRB5_RC2_40_CBC_SHA = 0x03000027;
    public final static long SSL3_CK_KRB5_RC4_40_SHA = 0x03000028;
    public final static long SSL3_CK_KRB5_DES_40_CBC_MD5 = 0x03000029;
    public final static long SSL3_CK_KRB5_RC2_40_CBC_MD5 = 0x0300002A;
    public final static long SSL3_CK_KRB5_RC4_40_MD5 = 0x0300002B;

    public final static long TLS1_CK_RSA_EXPORT1024_WITH_RC4_56_MD5 = 0x03000060;
    public final static long TLS1_CK_RSA_EXPORT1024_WITH_RC2_CBC_56_MD5 = 0x03000061;
    public final static long TLS1_CK_RSA_EXPORT1024_WITH_DES_CBC_SHA = 0x03000062;
    public final static long TLS1_CK_DHE_DSS_EXPORT1024_WITH_DES_CBC_SHA = 0x03000063;
    public final static long TLS1_CK_RSA_EXPORT1024_WITH_RC4_56_SHA = 0x03000064;
    public final static long TLS1_CK_DHE_DSS_EXPORT1024_WITH_RC4_56_SHA = 0x03000065;
    public final static long TLS1_CK_DHE_DSS_WITH_RC4_128_SHA = 0x03000066;
    public final static long TLS1_CK_RSA_WITH_AES_128_SHA = 0x0300002F;
    public final static long TLS1_CK_DH_DSS_WITH_AES_128_SHA = 0x03000030;
    public final static long TLS1_CK_DH_RSA_WITH_AES_128_SHA = 0x03000031;
    public final static long TLS1_CK_DHE_DSS_WITH_AES_128_SHA = 0x03000032;
    public final static long TLS1_CK_DHE_RSA_WITH_AES_128_SHA = 0x03000033;
    public final static long TLS1_CK_ADH_WITH_AES_128_SHA = 0x03000034;
    public final static long TLS1_CK_RSA_WITH_AES_256_SHA = 0x03000035;
    public final static long TLS1_CK_DH_DSS_WITH_AES_256_SHA = 0x03000036;
    public final static long TLS1_CK_DH_RSA_WITH_AES_256_SHA = 0x03000037;
    public final static long TLS1_CK_DHE_DSS_WITH_AES_256_SHA = 0x03000038;
    public final static long TLS1_CK_DHE_RSA_WITH_AES_256_SHA = 0x03000039;
    public final static long TLS1_CK_ADH_WITH_AES_256_SHA = 0x0300003A;
    public final static long TLS1_CK_ECDH_ECDSA_WITH_NULL_SHA = 0x0300C001;
    public final static long TLS1_CK_ECDH_ECDSA_WITH_RC4_128_SHA = 0x0300C002;
    public final static long TLS1_CK_ECDH_ECDSA_WITH_DES_192_CBC3_SHA = 0x0300C003;
    public final static long TLS1_CK_ECDH_ECDSA_WITH_AES_128_CBC_SHA = 0x0300C004;
    public final static long TLS1_CK_ECDH_ECDSA_WITH_AES_256_CBC_SHA = 0x0300C005;
    public final static long TLS1_CK_ECDHE_ECDSA_WITH_NULL_SHA = 0x0300C006;
    public final static long TLS1_CK_ECDHE_ECDSA_WITH_RC4_128_SHA = 0x0300C007;
    public final static long TLS1_CK_ECDHE_ECDSA_WITH_DES_192_CBC3_SHA = 0x0300C008;
    public final static long TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = 0x0300C009;
    public final static long TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = 0x0300C00A;
    public final static long TLS1_CK_ECDH_RSA_WITH_NULL_SHA = 0x0300C00B;
    public final static long TLS1_CK_ECDH_RSA_WITH_RC4_128_SHA = 0x0300C00C;
    public final static long TLS1_CK_ECDH_RSA_WITH_DES_192_CBC3_SHA = 0x0300C00D;
    public final static long TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = 0x0300C00E;
    public final static long TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = 0x0300C00F;
    public final static long TLS1_CK_ECDHE_RSA_WITH_NULL_SHA = 0x0300C010;
    public final static long TLS1_CK_ECDHE_RSA_WITH_RC4_128_SHA = 0x0300C011;
    public final static long TLS1_CK_ECDHE_RSA_WITH_DES_192_CBC3_SHA = 0x0300C012;
    public final static long TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = 0x0300C013;
    public final static long TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = 0x0300C014;
    public final static long TLS1_CK_ECDH_anon_WITH_NULL_SHA = 0x0300C015;
    public final static long TLS_ECDH_anon_WITH_RC4_128_SHA = 0x0300C016;
    public final static long TLS_ECDH_anon_WITH_DES_192_CBC3_SHA = 0x0300C017;
    public final static long TLS_ECDH_anon_WITH_AES_128_CBC_SHA = 0x0300C018;
    public final static long TLS_ECDH_anon_WITH_AES_256_CBC_SHA = 0x0300C019;

    static final class Def implements Comparable<Def>, Cloneable {

        //private final byte valid;
        final String name;
        //private final long id;
        final long algorithms;
        private final long algStrength;
        //final long algorithm2;
        final int algStrengthBits;
        final int algBits;
        private final long mask;
        private final long algStrengthMask;

        private volatile String cipherSuite;

        Def(String name, long algorithms, long algo_strength, int strength_bits, int alg_bits,
            long mask, long maskStrength) {
            this.name = name;
            this.algorithms = algorithms;
            this.algStrength = algo_strength;
            this.algStrengthBits = strength_bits;
            this.algBits = alg_bits;
            this.mask = mask;
            this.algStrengthMask = maskStrength;
        }

        public String getCipherSuite() {
            return cipherSuite;
        }

        Def setCipherSuite(final String suite) {
            if (this.cipherSuite == null) {
                synchronized (this) {
                    if (this.cipherSuite == null) {
                        this.cipherSuite = suite;
                        return this;
                    }
                }
            }
            if (suite.equals(this.cipherSuite)) return this;
            try {
                Def clone = (Def) super.clone();
                clone.cipherSuite = suite;
                return clone;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e); // won't happen
            }
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            if (other instanceof Def) {
                return this.name.equals(((Def) other).name);
            }
            return false;
        }

        @Override
        public int compareTo(final Def that) {
            return this.algStrengthBits - that.algStrengthBits;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + '@' +
                Integer.toHexString(System.identityHashCode(this)) +
                '<' + name + '>';
        }

        // from ssl_cipher_apply_rule
        public boolean matches(Def current) {
            //            ma = mask & cp->algorithms;
            //            ma_s = mask_strength & cp->algo_strength;
            //
            //            // Select: if none of the mask bit was met from the
            //            // cipher or not all of the bits were met, the
            //            // selection does not apply.
            //            if (((ma == 0) && (ma_s == 0)) ||
            //                ((ma & algorithms) != ma) ||
            //                ((ma_s & algo_strength) != ma_s))
            //                continue; // does not apply
            //            }
            final long ma = this.mask & current.algorithms;
            final long ma_s = this.algStrengthMask & current.algStrength;
            if ((ma == 0 && ma_s == 0) ||
                ((ma & this.algorithms) != ma) ||
                ((ma_s & this.algStrength) != ma_s)) {
                return false;
            }
            return true;
        }
    }

    static Collection<Def> matchingCiphers(final String cipherString, final String[] all,
        final boolean setSuite) {
        final List<Def> matchedList = new LinkedList<Def>();
        Set<Def> removed = null;

        /*
         * If the rule_string begins with DEFAULT, apply the default rule
         * before using the (possibly available) additional rules.
         * (Matching OpenSSL behaviour)
         */
        int offset = 0;
        final String[] parts = cipherString.split("[:, ]+");
        if (parts.length >= 1 && "DEFAULT".equals(parts[0])) {
            final Collection<Def> matching =
                matchingCiphers(SSL_DEFAULT_CIPHER_LIST, all, setSuite);
            matchedList.addAll(matching);
            offset = offset + 1;
        }

        for (int i = offset; i < parts.length; i++) {
            final String part = parts[i];

            if (part.equals("@STRENGTH")) {
                Collections.sort(matchedList);
                continue;
            }

            int index = 0;
            switch (part.charAt(0)) {
                case '!':
                case '+':
                case '-':
                    index++;
                    break;
            }

            final Collection<Def> matching;
            final String[] defs = part.substring(index).split("[+]");
            if (defs.length == 1) {
                matching = matchingExact(defs[0], all, setSuite);
            } else {
                matching = matching(defs, all, setSuite);
            }

            if (matching != null) {
                if (index > 0) {
                    switch (part.charAt(0)) {
                        case '!':
                            matchedList.removeAll(matching);
                            if (removed == null) removed = new HashSet<Def>();
                            removed.addAll(matching);
                            break;
                        case '+': // '+' is for moving entry in the list
                            for (final Def def : matching) {
                                if (removed == null || !removed.contains(def)) {
                                    if (matchedList.remove(def)) matchedList.add(def);
                                }
                            }
                            break;
                        case '-':
                            matchedList.removeAll(matching);
                            break;
                    }
                } else {
                    for (final Def def : matching) {
                        if (removed == null || !removed.contains(def)) {
                            if (!matchedList.contains(def)) matchedList.add(def);
                        }
                    }
                }
            }
        }

        return matchedList;
    }

    private static Collection<Def> matchingExact(final String name, final String[] all,
        final boolean setSuite) {
        final Def pattern = Definitions.get(name);
        if (pattern != null) {
            return matchingPattern(pattern, all, true, setSuite);
        }
        return null; // Collections.emptyList();
    }

    private static Collection<Def> matching(final String[] defs, final String[] all,
        final boolean setSuite) {
        Collection<Def> matching = null;
        for (final String name : defs) {
            final Def pattern = Definitions.get(name);
            if (pattern != null) {
                if (matching == null) {
                    matching = matchingPattern(pattern, all, true, setSuite);
                } else {
                    matching.retainAll(matchingPattern(pattern, all, false, setSuite));
                }
            }
        }
        return matching;
    }

    private static Collection<Def> matchingPattern(
        final Def pattern, final String[] all, final boolean useSet,
        final boolean setSuite) {
        final Collection<Def> matching;
        if (useSet) {
            matching = new LinkedHashSet<Def>();
        } else {
            matching = new ArrayList<Def>(all.length);
        }

        for (final String entry : all) {
            final String ossl = SuiteToOSSL.get(entry);
            if (ossl != null) {
                final Def def = CipherNames.get(ossl);
                if (def != null && pattern.matches(def)) {
                    if (setSuite) {
                        matching.add(def.setCipherSuite(entry));
                    } else {
                        matching.add(def);
                    }
                }
            }
        }
        return matching;
    }

    private final static Map<String, Def> Definitions;
    private final static Map<String, Def> CipherNames;
    private final static Map<String, String> SuiteToOSSL;

    static {
        Definitions = new HashMap<String, Def>(48, 1);
        // TODO review base on OpenSSL's static const SSL_CIPHER cipher_aliases[] ?!
        Definitions.put(SSL_TXT_ALL,
            new Def(SSL_TXT_ALL, SSL_ALL & ~SSL_eNULL, SSL_ALL, 0, 0, SSL_ALL, SSL_ALL));
        Definitions.put(SSL_TXT_CMPALL,
            new Def(SSL_TXT_CMPALL, SSL_eNULL, 0, 0, 0, SSL_ENC_MASK, 0));
        Definitions.put(SSL_TXT_CMPDEF,
            new Def(SSL_TXT_CMPDEF, SSL_ADH, 0, 0, 0, SSL_AUTH_MASK, 0));
        Definitions.put(SSL_TXT_kKRB5,
            new Def(SSL_TXT_kKRB5, SSL_kKRB5, 0, 0, 0, SSL_MKEY_MASK, 0));
        Definitions.put(SSL_TXT_kRSA,
            new Def(SSL_TXT_kRSA, SSL_kRSA, 0, 0, 0, SSL_MKEY_MASK, 0));
        Definitions.put(SSL_TXT_kDHr,
            new Def(SSL_TXT_kDHr, SSL_kDHr, 0, 0, 0, SSL_MKEY_MASK, 0));
        Definitions.put(SSL_TXT_kDHd,
            new Def(SSL_TXT_kDHd, SSL_kDHd, 0, 0, 0, SSL_MKEY_MASK, 0));
        Definitions.put(SSL_TXT_kEDH,
            new Def(SSL_TXT_kEDH, SSL_kEDH, 0, 0, 0, SSL_MKEY_MASK, 0));
        Definitions.put(SSL_TXT_kFZA,
            new Def(SSL_TXT_kFZA, SSL_kFZA, 0, 0, 0, SSL_MKEY_MASK, 0));
        Definitions.put(SSL_TXT_DH,
            new Def(SSL_TXT_DH, SSL_DH, 0, 0, 0, SSL_MKEY_MASK, 0));
        Definitions.put(SSL_TXT_ECC,
            new Def(SSL_TXT_ECC, (SSL_kECDH | SSL_kECDHE), 0, 0, 0, SSL_MKEY_MASK, 0));
        Definitions.put(SSL_TXT_EDH,
            new Def(SSL_TXT_EDH, SSL_EDH, 0, 0, 0, SSL_MKEY_MASK | SSL_AUTH_MASK, 0));
        Definitions.put(SSL_TXT_aKRB5,
            new Def(SSL_TXT_aKRB5, SSL_aKRB5, 0, 0, 0, SSL_AUTH_MASK, 0));
        Definitions.put(SSL_TXT_aRSA,
            new Def(SSL_TXT_aRSA, SSL_aRSA, 0, 0, 0, SSL_AUTH_MASK, 0));
        Definitions.put(SSL_TXT_aDSS,
            new Def(SSL_TXT_aDSS, SSL_aDSS, 0, 0, 0, SSL_AUTH_MASK, 0));
        Definitions.put(SSL_TXT_aFZA,
            new Def(SSL_TXT_aFZA, SSL_aFZA, 0, 0, 0, SSL_AUTH_MASK, 0));
        Definitions.put(SSL_TXT_aNULL,
            new Def(SSL_TXT_aNULL, SSL_aNULL, 0, 0, 0, SSL_AUTH_MASK, 0));
        Definitions.put(SSL_TXT_aDH,
            new Def(SSL_TXT_aDH, SSL_aDH, 0, 0, 0, SSL_AUTH_MASK, 0));
        Definitions.put(SSL_TXT_DSS,
            new Def(SSL_TXT_DSS, SSL_DSS, 0, 0, 0, SSL_AUTH_MASK, 0));
        Definitions.put(SSL_TXT_DES,
            new Def(SSL_TXT_DES, SSL_DES, 0, 0, 0, SSL_ENC_MASK, 0));
        Definitions.put(SSL_TXT_3DES,
            new Def(SSL_TXT_3DES, SSL_3DES, 0, 0, 0, SSL_ENC_MASK, 0));
        Definitions.put(SSL_TXT_RC4,
            new Def(SSL_TXT_RC4, SSL_RC4, 0, 0, 0, SSL_ENC_MASK, 0));
        Definitions.put(SSL_TXT_RC2,
            new Def(SSL_TXT_RC2, SSL_RC2, 0, 0, 0, SSL_ENC_MASK, 0));
        Definitions.put(SSL_TXT_IDEA,
            new Def(SSL_TXT_IDEA, SSL_IDEA, 0, 0, 0, SSL_ENC_MASK, 0));
        Definitions.put(SSL_TXT_eNULL,
            new Def(SSL_TXT_eNULL, SSL_eNULL, 0, 0, 0, SSL_ENC_MASK, 0));
        Definitions.put(SSL_TXT_eFZA,
            new Def(SSL_TXT_eFZA, SSL_eFZA, 0, 0, 0, SSL_ENC_MASK, 0));
        Definitions.put(SSL_TXT_AES,
            new Def(SSL_TXT_AES, SSL_AES, 0, 0, 0, SSL_ENC_MASK, 0));
        Definitions.put(SSL_TXT_MD5,
            new Def(SSL_TXT_MD5, SSL_MD5, 0, 0, 0, SSL_MAC_MASK, 0));
        Definitions.put(SSL_TXT_SHA1,
            new Def(SSL_TXT_SHA1, SSL_SHA1, 0, 0, 0, SSL_MAC_MASK, 0));
        Definitions.put(SSL_TXT_SHA,
            new Def(SSL_TXT_SHA, SSL_SHA, 0, 0, 0, SSL_MAC_MASK, 0));
        Definitions.put(SSL_TXT_NULL,
            new Def(SSL_TXT_NULL, SSL_NULL, 0, 0, 0, SSL_ENC_MASK, 0));
        Definitions.put(SSL_TXT_KRB5,
            new Def(SSL_TXT_KRB5, SSL_KRB5, 0, 0, 0, SSL_AUTH_MASK | SSL_MKEY_MASK, 0));
        Definitions.put(SSL_TXT_RSA,
            new Def(SSL_TXT_RSA, SSL_RSA, 0, 0, 0, SSL_AUTH_MASK | SSL_MKEY_MASK, 0));
        Definitions.put(SSL_TXT_ADH,
            new Def(SSL_TXT_ADH, SSL_ADH, 0, 0, 0, SSL_AUTH_MASK | SSL_MKEY_MASK, 0));
        Definitions.put(SSL_TXT_FZA, new Def(SSL_TXT_FZA, SSL_FZA, 0, 0, 0,
            SSL_AUTH_MASK | SSL_MKEY_MASK | SSL_ENC_MASK, 0));
        Definitions.put(SSL_TXT_SSLV2,
            new Def(SSL_TXT_SSLV2, SSL_SSLV2, 0, 0, 0, SSL_SSL_MASK, 0));
        Definitions.put(SSL_TXT_SSLV3,
            new Def(SSL_TXT_SSLV3, SSL_SSLV3, 0, 0, 0, SSL_SSL_MASK, 0));
        Definitions.put(SSL_TXT_TLSV1,
            new Def(SSL_TXT_TLSV1, SSL_TLSV1, 0, 0, 0, SSL_SSL_MASK, 0));
        Definitions.put(SSL_TXT_EXP,
            new Def(SSL_TXT_EXP, 0, SSL_EXPORT, 0, 0, 0, SSL_EXP_MASK));
        Definitions.put(SSL_TXT_EXPORT,
            new Def(SSL_TXT_EXPORT, 0, SSL_EXPORT, 0, 0, 0, SSL_EXP_MASK));
        Definitions.put(SSL_TXT_EXP40,
            new Def(SSL_TXT_EXP40, 0, SSL_EXP40, 0, 0, 0, SSL_STRONG_MASK));
        Definitions.put(SSL_TXT_EXP56,
            new Def(SSL_TXT_EXP56, 0, SSL_EXP56, 0, 0, 0, SSL_STRONG_MASK));
        Definitions.put(SSL_TXT_LOW,
            new Def(SSL_TXT_LOW, 0, SSL_LOW, 0, 0, 0, SSL_STRONG_MASK));
        Definitions.put(SSL_TXT_MEDIUM,
            new Def(SSL_TXT_MEDIUM, 0, SSL_MEDIUM, 0, 0, 0, SSL_STRONG_MASK));
        Definitions.put(SSL_TXT_HIGH,
            new Def(SSL_TXT_HIGH, 0, SSL_HIGH, 0, 0, 0, SSL_STRONG_MASK));

        CipherNames = new HashMap<String, Def>(96, 1);

        /* The DH ciphers */
        /* Cipher 0B */
        CipherNames.put("EXP-DH-DSS-DES-CBC-SHA", new Def("EXP-DH-DSS-DES-CBC-SHA",
            SSL_kDHd | SSL_aDH | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));
        /* Cipher 0C */
        CipherNames.put("DH-DSS-DES-CBC-SHA", new Def("DH-DSS-DES-CBC-SHA",
            SSL_kDHd | SSL_aDH | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_LOW,
            56,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));
        /* Cipher 0D */
        CipherNames.put("DH-DSS-DES-CBC3-SHA", new Def("DH-DSS-DES-CBC3-SHA",
            SSL_kDHd | SSL_aDH | SSL_3DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_HIGH,
            168,
            168,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));
        /* Cipher 0E */
        CipherNames.put("EXP-DH-RSA-DES-CBC-SHA", new Def("EXP-DH-RSA-DES-CBC-SHA",
            SSL_kDHr | SSL_aDH | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));
        /* Cipher 0F */
        CipherNames.put("DH-RSA-DES-CBC-SHA", new Def("DH-RSA-DES-CBC-SHA",
            SSL_kDHr | SSL_aDH | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_LOW,
            56,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));
        /* Cipher 10 */
        CipherNames.put("DH-RSA-DES-CBC3-SHA", new Def("DH-RSA-DES-CBC3-SHA",
            SSL_kDHr | SSL_aDH | SSL_3DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_HIGH,
            168,
            168,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 12 */
        CipherNames.put("EDH-DSS-DES-CBC-SHA", new Def("EDH-DSS-DES-CBC-SHA",
            SSL_kEDH | SSL_aDSS | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_LOW,
            56,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Fortezza */
        /* Cipher 1C */
        CipherNames.put("FZA-NULL-SHA", new Def("FZA-NULL-SHA",
            SSL_kFZA | SSL_aFZA | SSL_eNULL | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_STRONG_NONE,
            0,
            0,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 1D */
        CipherNames.put("FZA-FZA-CBC-SHA", new Def("FZA-FZA-CBC-SHA",
            SSL_kFZA | SSL_aFZA | SSL_eFZA | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_STRONG_NONE,
            0,
            0,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 1E VRS */
        CipherNames.put("KRB5-DES-CBC-SHA", new Def("KRB5-DES-CBC-SHA",
            SSL_kKRB5 | SSL_aKRB5 | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_LOW,
            56,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 1F VRS */
        CipherNames.put("KRB5-DES-CBC3-SHA", new Def("KRB5-DES-CBC3-SHA",
            SSL_kKRB5 | SSL_aKRB5 | SSL_3DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_HIGH,
            112,
            168,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 20 VRS */
        CipherNames.put("KRB5-RC4-SHA", new Def("KRB5-RC4-SHA",
            SSL_kKRB5 | SSL_aKRB5 | SSL_RC4 | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_MEDIUM,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 21 VRS */
        CipherNames.put("KRB5-IDEA-CBC-SHA", new Def("KRB5-IDEA-CBC-SHA",
            SSL_kKRB5 | SSL_aKRB5 | SSL_IDEA | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_MEDIUM,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 22 VRS */
        CipherNames.put("KRB5-DES-CBC-MD5", new Def("KRB5-DES-CBC-MD5",
            SSL_kKRB5 | SSL_aKRB5 | SSL_DES | SSL_MD5 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_LOW,
            56,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 23 VRS */
        CipherNames.put("KRB5-DES-CBC3-MD5", new Def("KRB5-DES-CBC3-MD5",
            SSL_kKRB5 | SSL_aKRB5 | SSL_3DES | SSL_MD5 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_HIGH,
            112,
            168,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 24 VRS */
        CipherNames.put("KRB5-RC4-MD5", new Def("KRB5-RC4-MD5",
            SSL_kKRB5 | SSL_aKRB5 | SSL_RC4 | SSL_MD5 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_MEDIUM,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 25 VRS */
        CipherNames.put("KRB5-IDEA-CBC-MD5", new Def("KRB5-IDEA-CBC-MD5",
            SSL_kKRB5 | SSL_aKRB5 | SSL_IDEA | SSL_MD5 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_MEDIUM,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 26 VRS */
        CipherNames.put("EXP-KRB5-DES-CBC-SHA", new Def("EXP-KRB5-DES-CBC-SHA",
            SSL_kKRB5 | SSL_aKRB5 | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 27 VRS */
        CipherNames.put("EXP-KRB5-RC2-CBC-SHA", new Def("EXP-KRB5-RC2-CBC-SHA",
            SSL_kKRB5 | SSL_aKRB5 | SSL_RC2 | SSL_SHA1 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 28 VRS */
        CipherNames.put("EXP-KRB5-RC4-SHA", new Def("EXP-KRB5-RC4-SHA",
            SSL_kKRB5 | SSL_aKRB5 | SSL_RC4 | SSL_SHA1 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 29 VRS */
        CipherNames.put("EXP-KRB5-DES-CBC-MD5", new Def("EXP-KRB5-DES-CBC-MD5",
            SSL_kKRB5 | SSL_aKRB5 | SSL_DES | SSL_MD5 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 2A VRS */
        CipherNames.put("EXP-KRB5-RC2-CBC-MD5", new Def("EXP-KRB5-RC2-CBC-MD5",
            SSL_kKRB5 | SSL_aKRB5 | SSL_RC2 | SSL_MD5 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* Cipher 2B VRS */
        CipherNames.put("EXP-KRB5-RC4-MD5", new Def("EXP-KRB5-RC4-MD5",
            SSL_kKRB5 | SSL_aKRB5 | SSL_RC4 | SSL_MD5 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        /* New TLS Export CipherSuites */
        /* Cipher 60 */
        CipherNames.put("EXP1024-RC4-MD5", new Def("EXP1024-RC4-MD5",
            SSL_kRSA | SSL_aRSA | SSL_RC4 | SSL_MD5 | SSL_TLSV1,
            SSL_EXPORT | SSL_EXP56,
            56,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));
        /* Cipher 61 */
        CipherNames.put("EXP1024-RC2-CBC-MD5",
            new Def("EXP1024-RC2-CBC-MD5",
            SSL_kRSA | SSL_aRSA | SSL_RC2 | SSL_MD5 | SSL_TLSV1,
            SSL_EXPORT | SSL_EXP56,
            56,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL = new HashMap<String, String>(120, 1);

        SuiteToOSSL.put("SSL_RSA_WITH_NULL_MD5", "NULL-MD5");
        SuiteToOSSL.put("TLS_RSA_WITH_NULL_MD5", "NULL-MD5");
        CipherNames.put("NULL-MD5", new Def("NULL-MD5",
            SSL_kRSA | SSL_aRSA | SSL_eNULL | SSL_MD5 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_STRONG_NONE,
            0,
            0,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_RSA_WITH_NULL_SHA", "NULL-SHA");
        SuiteToOSSL.put("TLS_RSA_WITH_NULL_SHA", "NULL-SHA");
        CipherNames.put("NULL-SHA", new Def("NULL-SHA",
            SSL_kRSA | SSL_aRSA | SSL_eNULL | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_STRONG_NONE,
            0,
            0,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_RSA_EXPORT_WITH_RC4_40_MD5", "EXP-RC4-MD5");
        SuiteToOSSL.put("TLS_RSA_EXPORT_WITH_RC4_40_MD5", "EXP-RC4-MD5");
        SuiteToOSSL.put("SSL_CK_RC4_128_EXPORT40_WITH_MD5", "EXP-RC4-MD5");
        CipherNames.put("EXP-RC4-MD5", new Def("EXP-RC4-MD5",
            SSL_kRSA | SSL_aRSA | SSL_RC4 | SSL_MD5 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_RSA_WITH_RC4_128_MD5", "RC4-MD5");
        SuiteToOSSL.put("TLS_RSA_WITH_RC4_128_MD5", "RC4-MD5");
        SuiteToOSSL.put("SSL_CK_RC4_128_WITH_MD5", "RC4-MD5");
        CipherNames.put("RC4-MD5", new Def("RC4-MD5",
            SSL_kRSA | SSL_aRSA | SSL_RC4 | SSL_MD5 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_MEDIUM,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_RSA_WITH_RC4_128_SHA", "RC4-SHA");
        SuiteToOSSL.put("TLS_RSA_WITH_RC4_128_SHA", "RC4-SHA");
        CipherNames.put("RC4-SHA", new Def("RC4-SHA",
            SSL_kRSA | SSL_aRSA | SSL_RC4 | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_MEDIUM,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5", "EXP-RC2-CBC-MD5");
        SuiteToOSSL.put("TLS_RSA_EXPORT_WITH_RC2_CBC_40_MD5", "EXP-RC2-CBC-MD5");
        CipherNames.put("EXP-RC2-CBC-MD5", new Def("EXP-RC2-CBC-MD5",
            SSL_kRSA | SSL_aRSA | SSL_RC2 | SSL_MD5 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_RSA_WITH_IDEA_CBC_SHA", "IDEA-CBC-SHA");
        SuiteToOSSL.put("TLS_RSA_WITH_IDEA_CBC_SHA", "IDEA-CBC-SHA");
        CipherNames.put("IDEA-CBC-SHA", new Def("IDEA-CBC-SHA",
            SSL_kRSA | SSL_aRSA | SSL_IDEA | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_MEDIUM,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", "EXP-DES-CBC-SHA");
        SuiteToOSSL.put("TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "EXP-DES-CBC-SHA");
        CipherNames.put("EXP-DES-CBC-SHA", new Def("EXP-DES-CBC-SHA",
            SSL_kRSA | SSL_aRSA | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_RSA_WITH_DES_CBC_SHA", "DES-CBC-SHA");
        SuiteToOSSL.put("TLS_RSA_WITH_DES_CBC_SHA", "DES-CBC-SHA");
        CipherNames.put("DES-CBC-SHA", new Def("DES-CBC-SHA",
            SSL_kRSA | SSL_aRSA | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_LOW,
            56,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_RSA_WITH_3DES_EDE_CBC_SHA", "DES-CBC3-SHA");
        SuiteToOSSL.put("TLS_RSA_WITH_3DES_EDE_CBC_SHA", "DES-CBC3-SHA");
        CipherNames.put("DES-CBC3-SHA", new Def("DES-CBC3-SHA",
            SSL_kRSA | SSL_aRSA | SSL_3DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_HIGH,
            168,
            168,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "EXP-EDH-DSS-DES-CBC-SHA");
        SuiteToOSSL.put("TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "EXP-EDH-DSS-DES-CBC-SHA");
        CipherNames.put("EXP-EDH-DSS-DES-CBC-SHA", new Def("EXP-EDH-DSS-DES-CBC-SHA",
            SSL_kEDH | SSL_aDSS | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "EDH-DSS-DES-CBC3-SHA");
        SuiteToOSSL.put("TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "EDH-DSS-DES-CBC3-SHA");
        CipherNames.put("EDH-DSS-DES-CBC3-SHA", new Def("EDH-DSS-DES-CBC3-SHA",
            SSL_kEDH | SSL_aDSS | SSL_3DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_HIGH,
            168,
            168,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "EXP-EDH-RSA-DES-CBC-SHA");
        SuiteToOSSL.put("TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "EXP-EDH-RSA-DES-CBC-SHA");
        CipherNames.put("EXP-EDH-RSA-DES-CBC-SHA", new Def("EXP-EDH-RSA-DES-CBC-SHA",
            SSL_kEDH | SSL_aRSA | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_DHE_RSA_WITH_DES_CBC_SHA", "EDH-RSA-DES-CBC-SHA");
        SuiteToOSSL.put("TLS_DHE_RSA_WITH_DES_CBC_SHA", "EDH-RSA-DES-CBC-SHA");
        CipherNames.put("EDH-RSA-DES-CBC-SHA", new Def("EDH-RSA-DES-CBC-SHA",
            SSL_kEDH | SSL_aRSA | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_LOW,
            56,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "EDH-RSA-DES-CBC3-SHA");
        SuiteToOSSL.put("TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "EDH-RSA-DES-CBC3-SHA");
        CipherNames.put("EDH-RSA-DES-CBC3-SHA", new Def("EDH-RSA-DES-CBC3-SHA",
            SSL_kEDH | SSL_aRSA | SSL_3DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_HIGH,
            168,
            168,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", "EXP-ADH-RC4-MD5");
        SuiteToOSSL.put("TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "EXP-ADH-RC4-MD5");
        CipherNames.put("EXP-ADH-RC4-MD5", new Def("EXP-ADH-RC4-MD5",
            SSL_kEDH | SSL_aNULL | SSL_RC4 | SSL_MD5 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_DH_anon_WITH_RC4_128_MD5", "ADH-RC4-MD5");
        SuiteToOSSL.put("TLS_DH_anon_WITH_RC4_128_MD5", "ADH-RC4-MD5");
        CipherNames.put("ADH-RC4-MD5", new Def("ADH-RC4-MD5",
            SSL_kEDH | SSL_aNULL | SSL_RC4 | SSL_MD5 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_MEDIUM,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "EXP-ADH-DES-CBC-SHA");
        SuiteToOSSL.put("TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "EXP-ADH-DES-CBC-SHA");
        CipherNames.put("EXP-ADH-DES-CBC-SHA", new Def("EXP-ADH-DES-CBC-SHA",
            SSL_kEDH | SSL_aNULL | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_EXPORT | SSL_EXP40,
            40,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_DH_anon_WITH_DES_CBC_SHA", "ADH-DES-CBC-SHA");
        SuiteToOSSL.put("TLS_DH_anon_WITH_DES_CBC_SHA", "ADH-DES-CBC-SHA");
        CipherNames.put("ADH-DES-CBC-SHA", new Def("ADH-DES-CBC-SHA",
            SSL_kEDH | SSL_aNULL | SSL_DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_LOW,
            56,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", "ADH-DES-CBC3-SHA");
        SuiteToOSSL.put("TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "ADH-DES-CBC3-SHA");
        CipherNames.put("ADH-DES-CBC3-SHA", new Def("ADH-DES-CBC3-SHA",
            SSL_kEDH | SSL_aNULL | SSL_3DES | SSL_SHA1 | SSL_SSLV3,
            SSL_NOT_EXP | SSL_HIGH,
            168,
            168,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_RSA_WITH_AES_128_CBC_SHA", "AES128-SHA");
        SuiteToOSSL.put("SSL_RSA_WITH_AES_128_CBC_SHA", "AES128-SHA");
        CipherNames.put("AES128-SHA", new Def("AES128-SHA",
            SSL_kRSA | SSL_aRSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_RSA_WITH_AES_256_CBC_SHA", "AES256-SHA");
        SuiteToOSSL.put("SSL_RSA_WITH_AES_256_CBC_SHA", "AES256-SHA");
        CipherNames.put("AES256-SHA", new Def("AES256-SHA",
            SSL_kRSA | SSL_aRSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            256,
            256,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DH_DSS_WITH_AES_128_CBC_SHA", "DH-DSS-AES128-SHA");
        CipherNames.put("DH-DSS-AES128-SHA", new Def("DH-DSS-AES128-SHA",
            SSL_kDHd | SSL_aDH | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DH_DSS_WITH_AES_256_CBC_SHA", "DH-DSS-AES256-SHA");
        CipherNames.put("DH-DSS-AES256-SHA", new Def("DH-DSS-AES256-SHA",
            SSL_kDHd | SSL_aDH | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            256,
            256,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DH_RSA_WITH_AES_128_CBC_SHA", "DH-RSA-AES128-SHA");
        CipherNames.put("DH-RSA-AES128-SHA", new Def("DH-RSA-AES128-SHA",
            SSL_kDHr | SSL_aDH | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DH_RSA_WITH_AES_256_CBC_SHA", "DH-RSA-AES256-SHA");
        CipherNames.put("DH-RSA-AES256-SHA", new Def("DH-RSA-AES256-SHA",
            SSL_kDHr | SSL_aDH | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            256,
            256,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "DHE-DSS-AES128-SHA");
        SuiteToOSSL.put("SSL_DHE_DSS_WITH_AES_128_CBC_SHA", "DHE-DSS-AES128-SHA");
        CipherNames.put("DHE-DSS-AES128-SHA", new Def("DHE-DSS-AES128-SHA",
            SSL_kEDH | SSL_aDSS | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "DHE-DSS-AES256-SHA");
        SuiteToOSSL.put("SSL_DHE_DSS_WITH_AES_256_CBC_SHA", "DHE-DSS-AES256-SHA");
        CipherNames.put("DHE-DSS-AES256-SHA", new Def("DHE-DSS-AES256-SHA",
            SSL_kEDH | SSL_aDSS | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            256,
            256,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "DHE-RSA-AES128-SHA");
        SuiteToOSSL.put("SSL_DHE_RSA_WITH_AES_128_CBC_SHA", "DHE-RSA-AES128-SHA");
        CipherNames.put("DHE-RSA-AES128-SHA", new Def("DHE-RSA-AES128-SHA",
            SSL_kEDH | SSL_aRSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "DHE-RSA-AES256-SHA");
        SuiteToOSSL.put("SSL_DHE_RSA_WITH_AES_256_CBC_SHA", "DHE-RSA-AES256-SHA");
        CipherNames.put("DHE-RSA-AES256-SHA", new Def("DHE-RSA-AES256-SHA",
            SSL_kEDH | SSL_aRSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            256,
            256,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DH_anon_WITH_AES_128_CBC_SHA", "ADH-AES128-SHA");
        SuiteToOSSL.put("SSL_DH_anon_WITH_AES_128_CBC_SHA", "ADH-AES128-SHA");
        CipherNames.put("ADH-AES128-SHA", new Def("ADH-AES128-SHA",
            SSL_kEDH | SSL_aNULL | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DH_anon_WITH_AES_256_CBC_SHA", "ADH-AES256-SHA");
        SuiteToOSSL.put("SSL_DH_anon_WITH_AES_256_CBC_SHA", "ADH-AES256-SHA");
        CipherNames.put("ADH-AES256-SHA", new Def("ADH-AES256-SHA",
            SSL_kEDH | SSL_aNULL | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            256,
            256,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_RSA_EXPORT1024_WITH_DES_CBC_SHA", "EXP1024-DES-CBC-SHA");
        CipherNames.put("EXP1024-DES-CBC-SHA", new Def("EXP1024-DES-CBC-SHA",
            SSL_kRSA | SSL_aRSA | SSL_DES | SSL_SHA | SSL_TLSV1,
            SSL_EXPORT | SSL_EXP56,
            56,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_RSA_EXPORT1024_WITH_RC4_56_SHA", "EXP1024-RC4-SHA");
        CipherNames.put("EXP1024-RC4-SHA", new Def("EXP1024-RC4-SHA",
            SSL_kRSA | SSL_aRSA | SSL_RC4 | SSL_SHA | SSL_TLSV1,
            SSL_EXPORT | SSL_EXP56,
            56,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DHE_DSS_EXPORT1024_WITH_DES_CBC_SHA", "EXP1024-DHE-DSS-DES-CBC-SHA");
        CipherNames.put("EXP1024-DHE-DSS-DES-CBC-SHA", new Def("EXP1024-DHE-DSS-DES-CBC-SHA",
            SSL_kEDH | SSL_aDSS | SSL_DES | SSL_SHA | SSL_TLSV1,
            SSL_EXPORT | SSL_EXP56,
            56,
            56,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DHE_DSS_EXPORT1024_WITH_RC4_56_SHA", "EXP1024-DHE-DSS-RC4-SHA");
        CipherNames.put("EXP1024-DHE-DSS-RC4-SHA", new Def("EXP1024-DHE-DSS-RC4-SHA",
            SSL_kEDH | SSL_aDSS | SSL_RC4 | SSL_SHA | SSL_TLSV1,
            SSL_EXPORT | SSL_EXP56,
            56,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_DHE_DSS_WITH_RC4_128_SHA", "DHE-DSS-RC4-SHA");
        CipherNames.put("DHE-DSS-RC4-SHA", new Def("DHE-DSS-RC4-SHA",
            SSL_kEDH | SSL_aDSS | SSL_RC4 | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_MEDIUM,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "ECDHE-ECDSA-AES128-SHA");
        SuiteToOSSL.put("SSL_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "ECDHE-ECDSA-AES128-SHA");
        CipherNames.put("ECDHE-ECDSA-AES128-SHA", new Def("ECDHE-ECDSA-AES128-SHA",
            SSL_kECDHE | SSL_aECDSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 128, 128, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "ECDHE-ECDSA-AES256-SHA");
        SuiteToOSSL.put("SSL_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "ECDHE-ECDSA-AES256-SHA");
        CipherNames.put("ECDHE-ECDSA-AES256-SHA", new Def("ECDHE-ECDSA-AES256-SHA",
            SSL_kECDHE | SSL_aECDSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 256, 256, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "ECDHE-ECDSA-AES128-SHA256");
        SuiteToOSSL.put("SSL_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "ECDHE-ECDSA-AES128-SHA256");
        CipherNames.put("ECDHE-ECDSA-AES128-SHA256", new Def("ECDHE-ECDSA-AES128-SHA256",
            SSL_kECDHE | SSL_aECDSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 128, 256, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "ECDHE-ECDSA-AES256-SHA384");
        SuiteToOSSL.put("SSL_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "ECDHE-ECDSA-AES256-SHA384");
        CipherNames.put("ECDHE-ECDSA-AES256-SHA384", new Def("ECDHE-ECDSA-AES256-SHA384",
            SSL_kECDHE | SSL_aECDSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 256, 384, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "ECDHE-RSA-AES128-SHA");
        SuiteToOSSL.put("SSL_ECDHE_RSA_WITH_AES_128_CBC_SHA", "ECDHE-RSA-AES128-SHA");
        CipherNames.put("ECDHE-RSA-AES128-SHA", new Def("ECDHE-RSA-AES128-SHA",
            SSL_kECDHE | SSL_aRSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 128, 128, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "ECDHE-RSA-AES256-SHA");
        SuiteToOSSL.put("SSL_ECDHE_RSA_WITH_AES_256_CBC_SHA", "ECDHE-RSA-AES256-SHA");
        CipherNames.put("ECDHE-RSA-AES256-SHA", new Def("ECDHE-RSA-AES256-SHA",
            SSL_kECDHE | SSL_aRSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 256, 256, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "ECDHE-RSA-AES128-SHA256");
        SuiteToOSSL.put("SSL_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "ECDHE-RSA-AES128-SHA256");
        CipherNames.put("ECDHE-RSA-AES128-SHA256", new Def("ECDHE-RSA-AES128-SHA256",
            SSL_kECDHE | SSL_aRSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 128, 256, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "ECDHE-RSA-AES256-SHA384");
        CipherNames.put("ECDHE-RSA-AES256-SHA384", new Def("ECDHE-RSA-AES256-SHA384",
            SSL_kECDHE | SSL_aRSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 256, 384, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "ECDH-ECDSA-AES128-SHA");
        SuiteToOSSL.put("SSL_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "ECDH-ECDSA-AES128-SHA");
        CipherNames.put("ECDH-ECDSA-AES128-SHA", new Def("ECDH-ECDSA-AES128-SHA",
            SSL_kECDH | SSL_aECDSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 128, 128, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "ECDH-ECDSA-AES256-SHA");
        SuiteToOSSL.put("SSL_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "ECDH-ECDSA-AES256-SHA");
        CipherNames.put("ECDH-ECDSA-AES256-SHA", new Def("ECDH-ECDSA-AES256-SHA",
            SSL_kECDH | SSL_aECDSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 256, 256, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "ECDH-ECDSA-AES128-SHA256");
        SuiteToOSSL.put("SSL_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "ECDH-ECDSA-AES128-SHA256");
        CipherNames.put("ECDH-ECDSA-AES128-SHA256", new Def("ECDH-ECDSA-AES128-SHA256",
            SSL_kECDH | SSL_aECDSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 128, 256, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "ECDH-ECDSA-AES256-SHA384");
        SuiteToOSSL.put("SSL_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "ECDH-ECDSA-AES256-SHA384");
        CipherNames.put("ECDH-ECDSA-AES256-SHA384", new Def("ECDH-ECDSA-AES256-SHA384",
            SSL_kECDH | SSL_aECDSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 256, 384, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "ECDH-RSA-AES128-SHA");
        SuiteToOSSL.put("SSL_ECDH_RSA_WITH_AES_128_CBC_SHA", "ECDH-RSA-AES128-SHA");
        CipherNames.put("ECDH-RSA-AES128-SHA", new Def("ECDH-RSA-AES128-SHA",
            SSL_kECDH | SSL_aRSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 128, 128, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "ECDH-RSA-AES256-SHA");
        SuiteToOSSL.put("SSL_ECDH_RSA_WITH_AES_256_CBC_SHA", "ECDH-RSA-AES256-SHA");
        CipherNames.put("ECDH-RSA-AES256-SHA", new Def("ECDH-RSA-AES256-SHA",
            SSL_kECDH | SSL_aRSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 256, 256, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "ECDH-RSA-AES128-SHA256");
        SuiteToOSSL.put("SSL_ECDH_RSA_WITH_AES_128_CBC_SHA256", "ECDH-RSA-AES128-SHA256");
        CipherNames.put("ECDH-RSA-AES128-SHA256", new Def("ECDH-RSA-AES128-SHA256",
            SSL_kECDH | SSL_aRSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 128, 256, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "ECDH-RSA-AES256-SHA384");
        SuiteToOSSL.put("SSL_ECDH_RSA_WITH_AES_256_CBC_SHA384", "ECDH-RSA-AES256-SHA384");
        CipherNames.put("ECDH-RSA-AES256-SHA384", new Def("ECDH-RSA-AES256-SHA384",
            SSL_kECDH | SSL_aRSA | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 256, 384, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "ECDHE-ECDSA-DES-CBC3-SHA");
        CipherNames.put("ECDHE-ECDSA-DES-CBC3-SHA", new Def("ECDHE-ECDSA-DES-CBC3-SHA",
            SSL_kECDHE | SSL_aECDSA | SSL_3DES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            168,
            168,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "ECDH-ECDSA-DES-CBC3-SHA");
        CipherNames.put("ECDH-ECDSA-DES-CBC3-SHA", new Def("ECDH-ECDSA-DES-CBC3-SHA",
            SSL_kECDH | SSL_aECDSA | SSL_3DES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            168,
            168,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "ECDHE-RSA-DES-CBC3-SHA");
        CipherNames.put("ECDHE-RSA-DES-CBC3-SHA", new Def("ECDHE-RSA-DES-CBC3-SHA",
            SSL_kECDHE | SSL_aRSA | SSL_3DES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            168,
            168,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "ECDH-RSA-DES-CBC3-SHA");
        CipherNames.put("ECDH-RSA-DES-CBC3-SHA", new Def("ECDH-RSA-DES-CBC3-SHA",
            SSL_kECDH | SSL_aRSA | SSL_3DES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH,
            168,
            168,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "ECDHE-ECDSA-RC4-SHA");
        CipherNames.put("ECDHE-ECDSA-RC4-SHA", new Def("ECDHE-ECDSA-RC4-SHA",
            SSL_kECDHE | SSL_aECDSA | SSL_RC4 | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_RSA_WITH_RC4_128_SHA", "ECDHE-RSA-RC4-SHA");
        CipherNames.put("ECDHE-RSA-RC4-SHA", new Def("ECDHE-RSA-RC4-SHA",
            SSL_kECDHE | SSL_aRSA | SSL_RC4 | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "ECDH-ECDSA-RC4-SHA");
        CipherNames.put("ECDH-ECDSA-RC4-SHA", new Def("ECDH-ECDSA-RC4-SHA",
            SSL_kECDH | SSL_aECDSA | SSL_RC4 | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_RSA_WITH_RC4_128_SHA", "ECDH-RSA-RC4-SHA");
        CipherNames.put("ECDH-RSA-RC4-SHA", new Def("ECDH-RSA-RC4-SHA",
            SSL_kECDH | SSL_aRSA | SSL_RC4 | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP,
            128,
            128,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "AECDH-AES128-SHA");
        SuiteToOSSL.put("SSL_ECDH_anon_WITH_AES_128_CBC_SHA", "AECDH-AES128-SHA");
        CipherNames.put("AECDH-AES128-SHA", new Def("AECDH-AES128-SHA",
            SSL_kECDHE | SSL_aNULL | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 128, 128, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "AECDH-AES256-SHA");
        SuiteToOSSL.put("SSL_ECDH_anon_WITH_AES_256_CBC_SHA", "AECDH-AES256-SHA");
        CipherNames.put("AECDH-AES256-SHA", new Def("AECDH-AES256-SHA",
            SSL_kECDHE | SSL_aNULL | SSL_AES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 256, 256, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "AECDH-DES-CBC3-SHA");
        CipherNames.put("AECDH-DES-CBC3-SHA", new Def("AECDH-DES-CBC3-SHA",
            SSL_kECDHE | SSL_aNULL | SSL_3DES | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP | SSL_HIGH, 168, 168, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_anon_WITH_RC4_128_SHA", "AECDH-RC4-SHA");
        CipherNames.put("AECDH-RC4-SHA", new Def("AECDH-RC4-SHA",
            SSL_kECDHE | SSL_aNULL | SSL_RC4 | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP, 128, 128, SSL_ALL_CIPHERS, SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_ECDSA_WITH_NULL_SHA", "ECDHE-ECDSA-NULL-SHA");
        SuiteToOSSL.put("SSL_ECDHE_ECDSA_WITH_NULL_SHA", "ECDHE-ECDSA-NULL-SHA");
        CipherNames.put("ECDHE-ECDSA-NULL-SHA", new Def("ECDHE-ECDSA-NULL-SHA",
            SSL_kECDHE | SSL_aECDSA | SSL_eNULL | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP,
            0,
            0,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDHE_RSA_WITH_NULL_SHA", "ECDHE-RSA-NULL-SHA");
        SuiteToOSSL.put("SSL_ECDHE_RSA_WITH_NULL_SHA", "ECDHE-RSA-NULL-SHA");
        CipherNames.put("ECDHE-RSA-NULL-SHA", new Def("ECDHE-RSA-NULL-SHA",
            SSL_kECDHE | SSL_aRSA | SSL_eNULL | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP,
            0,
            0,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_ECDSA_WITH_NULL_SHA", "ECDH-ECDSA-NULL-SHA");
        SuiteToOSSL.put("SSL_ECDH_ECDSA_WITH_NULL_SHA", "ECDH-ECDSA-NULL-SHA");
        CipherNames.put("ECDH-ECDSA-NULL-SHA", new Def("ECDH-ECDSA-NULL-SHA",
            SSL_kECDH | SSL_aECDSA | SSL_eNULL | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP,
            0,
            0,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_RSA_WITH_NULL_SHA", "ECDH-RSA-NULL-SHA");
        SuiteToOSSL.put("SSL_ECDH_RSA_WITH_NULL_SHA", "ECDH-RSA-NULL-SHA");
        CipherNames.put("ECDH-RSA-NULL-SHA", new Def("ECDH-RSA-NULL-SHA",
            SSL_kECDH | SSL_aRSA | SSL_eNULL | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP,
            0,
            0,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("TLS_ECDH_anon_WITH_NULL_SHA", "AECDH-NULL-SHA");
        SuiteToOSSL.put("SSL_ECDH_anon_WITH_NULL_SHA", "AECDH-NULL-SHA");
        CipherNames.put("AECDH-NULL-SHA", new Def("AECDH-NULL-SHA",
            SSL_kECDHE | SSL_aNULL | SSL_eNULL | SSL_SHA | SSL_TLSV1,
            SSL_NOT_EXP,
            0,
            0,
            SSL_ALL_CIPHERS,
            SSL_ALL_STRENGTHS
        ));

        SuiteToOSSL.put("SSL_RSA_WITH_AES_128_CBC_SHA256", "AES128-SHA256");
        SuiteToOSSL.put("TLS_RSA_WITH_AES_128_CBC_SHA256", "AES128-SHA256");

        SuiteToOSSL.put("SSL_RSA_WITH_AES_256_CBC_SHA256", "AES256-SHA256");
        SuiteToOSSL.put("TLS_RSA_WITH_AES_256_CBC_SHA256", "AES256-SHA256");

        SuiteToOSSL.put("SSL_DHE_DSS_WITH_DES_CBC_SHA", "EDH-DSS-CBC-SHA");
        SuiteToOSSL.put("TLS_DHE_DSS_WITH_DES_CBC_SHA", "EDH-DSS-CBC-SHA");

        SuiteToOSSL.put("SSL_CK_RC2_128_CBC_WITH_MD5", "RC2-MD5");

        SuiteToOSSL.put("SSL_CK_RC2_128_CBC_EXPORT40_WITH_MD5", "EXP-RC2-MD5");

        SuiteToOSSL.put("SSL_CK_IDEA_128_CBC_WITH_MD5", "IDEA-CBC-MD5");

        SuiteToOSSL.put("SSL_CK_DES_64_CBC_WITH_MD5", "DES-CBC-MD5");

        SuiteToOSSL.put("SSL_CK_DES_192_EDE3_CBC_WITH_MD5", "DES-CBC3-MD5");

        SuiteToOSSL.put("SSL_DH_anon_WITH_AES_128_CBC_SHA256", "ADH-AES128-SHA256");
        SuiteToOSSL.put("TLS_DH_anon_WITH_AES_128_CBC_SHA256", "ADH-AES128-SHA256");

        SuiteToOSSL.put("SSL_DH_anon_WITH_AES_128_GCM_SHA256", "ADH-AES128-GCM-SHA256");

        SuiteToOSSL.put("SSL_DH_anon_WITH_AES_256_CBC_SHA256", "ADH-AES256-SHA256");
        SuiteToOSSL.put("TLS_DH_anon_WITH_AES_256_CBC_SHA256", "ADH-AES256-SHA256");

        SuiteToOSSL.put("SSL_DH_anon_WITH_AES_256_GCM_SHA384", "ADH-AES256-GCM-SHA384");

        SuiteToOSSL.put("SSL_DHE_DSS_WITH_AES_128_CBC_SHA256", "DHE-DSS-AES128-SHA256");
        SuiteToOSSL.put("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "DHE-DSS-AES128-SHA256");

        SuiteToOSSL.put("SSL_DHE_DSS_WITH_AES_128_GCM_SHA256", "DHE-DSS-AES128-GCM-SHA256");

        SuiteToOSSL.put("SSL_DHE_DSS_WITH_AES_256_CBC_SHA256", "DHE-DSS-AES256-SHA256");
        SuiteToOSSL.put("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "DHE-DSS-AES256-SHA256");

        SuiteToOSSL.put("SSL_DHE_DSS_WITH_AES_256_GCM_SHA384", "DHE-DSS-AES256-GCM-SHA384");

        SuiteToOSSL.put("SSL_DHE_RSA_WITH_AES_128_CBC_SHA256", "DHE-RSA-AES128-SHA256");
        SuiteToOSSL.put("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "DHE-RSA-AES128-SHA256");

        SuiteToOSSL.put("SSL_DHE_RSA_WITH_AES_128_GCM_SHA256", "DHE-RSA-AES128-GCM-SHA256");

        SuiteToOSSL.put("SSL_DHE_RSA_WITH_AES_256_CBC_SHA256", "DHE-RSA-AES256-SHA256");
        SuiteToOSSL.put("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "DHE-RSA-AES256-SHA256");

        SuiteToOSSL.put("SSL_DHE_RSA_WITH_AES_256_GCM_SHA384", "DHE-RSA-AES256-GCM-SHA384");

        SuiteToOSSL.put("SSL_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "ECDH-ECDSA-AES128-GCM-SHA256");

        SuiteToOSSL.put("SSL_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "ECDH-ECDSA-AES256-GCM-SHA384");

        SuiteToOSSL.put("SSL_ECDH_RSA_WITH_AES_128_GCM_SHA256", "ECDH-RSA-AES128-GCM-SHA256");

        SuiteToOSSL.put("SSL_ECDH_RSA_WITH_AES_256_GCM_SHA384", "ECDH-RSA-AES256-GCM-SHA384");

        SuiteToOSSL.put("SSL_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "ECDHE-ECDSA-AES128-GCM-SHA256");

        SuiteToOSSL.put("SSL_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "ECDHE-ECDSA-AES256-GCM-SHA384");

        SuiteToOSSL.put("SSL_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "ECDHE-RSA-AES128-SHA384");

        SuiteToOSSL.put("SSL_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "ECDHE-RSA-AES256-GCM-SHA384");

        SuiteToOSSL.put("SSL_RSA_WITH_AES_128_GCM_SHA256", "AES128-GCM-SHA256");

        SuiteToOSSL.put("SSL_RSA_WITH_AES_256_GCM_SHA384", "AES256-GCM-SHA384");

        SuiteToOSSL.put("SSL_RSA_WITH_NULL_SHA256", "NULL-SHA256");
        SuiteToOSSL.put("TLS_RSA_WITH_NULL_SHA256", "NULL-SHA256");

        // left overs supported by Java 7's SSLv3 / TLS v1.2 :

        //    TLS_EMPTY_RENEGOTIATION_INFO_SCSV,
        //    TLS_KRB5_WITH_3DES_EDE_CBC_SHA,
        //    TLS_KRB5_WITH_3DES_EDE_CBC_MD5,
        //    TLS_KRB5_WITH_RC4_128_SHA,
        //    TLS_KRB5_WITH_RC4_128_MD5,
        //    TLS_KRB5_WITH_DES_CBC_SHA,
        //    TLS_KRB5_WITH_DES_CBC_MD5,
        //    TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA,
        //    TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5,
        //    TLS_KRB5_EXPORT_WITH_RC4_40_SHA,
        //    TLS_KRB5_EXPORT_WITH_RC4_40_MD5
    }
}// CipherStrings
