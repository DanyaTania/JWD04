package json;


    /* JSONParserTokenManager.java */
    /* Generated By:JavaCC: Do not edit this line. JSONParserTokenManager.java */
    /*
     * Licensed to the Apache Software Foundation (ASF) under one or more
     * contributor license agreements.  See the NOTICE file distributed with
     * this work for additional information regarding copyright ownership.
     * The ASF licenses this file to You under the Apache License, Version 2.0
     * (the "License"); you may not use this file except in compliance with
     * the License.  You may obtain a copy of the License at
     *
     *      http://www.apache.org/licenses/LICENSE-2.0
     *
     * Unless required by applicable law or agreed to in writing, software
     * distributed under the License is distributed on an "AS IS" BASIS,
     * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * See the License for the specific language governing permissions and
     * limitations under the License.
     */

//package org.apache.tomcat.util.json;

    /** Token Manager. */
    @SuppressWarnings("all") // Ignore warnings in generated code
    public class JSONParserTokenManager implements JSONParserConstants {

        /** Debug output. */
        public  java.io.PrintStream debugStream = System.out;
        /** Set debug output. */
        public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
        private final int jjStopStringLiteralDfa_0(int pos, long active0){
            switch (pos)
            {
                case 0:
                    if ((active0 & 0xe0000L) != 0L)
                    {
                        jjmatchedKind = 28;
                        return 15;
                    }
                    if ((active0 & 0x400000L) != 0L)
                        return 38;
                    if ((active0 & 0x800000L) != 0L)
                        return 39;
                    return -1;
                case 1:
                    if ((active0 & 0xe0000L) != 0L)
                    {
                        jjmatchedKind = 28;
                        jjmatchedPos = 1;
                        return 15;
                    }
                    return -1;
                case 2:
                    if ((active0 & 0xe0000L) != 0L)
                    {
                        jjmatchedKind = 28;
                        jjmatchedPos = 2;
                        return 15;
                    }
                    return -1;
                case 3:
                    if ((active0 & 0xa0000L) != 0L)
                        return 15;
                    if ((active0 & 0x40000L) != 0L)
                    {
                        jjmatchedKind = 28;
                        jjmatchedPos = 3;
                        return 15;
                    }
                    return -1;
                default :
                    return -1;
            }
        }
        private final int jjStartNfa_0(int pos, long active0){
            return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
        }
        private int jjStopAtPos(int pos, int kind)
        {
            jjmatchedKind = kind;
            jjmatchedPos = pos;
            return pos + 1;
        }
        private int jjMoveStringLiteralDfa0_0(){
            switch(curChar)
            {
                case 34:
                    return jjMoveStringLiteralDfa1_0(0x800000L);
                case 39:
                    return jjMoveStringLiteralDfa1_0(0x400000L);
                case 44:
                    return jjStopAtPos(0, 6);
                case 58:
                    return jjStopAtPos(0, 9);
                case 91:
                    return jjStopAtPos(0, 10);
                case 93:
                    return jjStopAtPos(0, 11);
                case 70:
                case 102:
                    return jjMoveStringLiteralDfa1_0(0x40000L);
                case 78:
                case 110:
                    return jjMoveStringLiteralDfa1_0(0x80000L);
                case 84:
                case 116:
                    return jjMoveStringLiteralDfa1_0(0x20000L);
                case 123:
                    return jjStopAtPos(0, 7);
                case 125:
                    return jjStopAtPos(0, 8);
                default :
                    return jjMoveNfa_0(0, 0);
            }
        }
        private int jjMoveStringLiteralDfa1_0(long active0){
            try { curChar = input_stream.readChar(); }
            catch(java.io.IOException e) {
                jjStopStringLiteralDfa_0(0, active0);
                return 1;
            }
            switch(curChar)
            {
                case 34:
                    if ((active0 & 0x800000L) != 0L)
                        return jjStopAtPos(1, 23);
                    break;
                case 39:
                    if ((active0 & 0x400000L) != 0L)
                        return jjStopAtPos(1, 22);
                    break;
                case 65:
                case 97:
                    return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
                case 82:
                case 114:
                    return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
                case 85:
                case 117:
                    return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
                default :
                    break;
            }
            return jjStartNfa_0(0, active0);
        }
        private int jjMoveStringLiteralDfa2_0(long old0, long active0){
            if (((active0 &= old0)) == 0L)
                return jjStartNfa_0(0, old0);
            try { curChar = input_stream.readChar(); }
            catch(java.io.IOException e) {
                jjStopStringLiteralDfa_0(1, active0);
                return 2;
            }
            switch(curChar)
            {
                case 76:
                case 108:
                    return jjMoveStringLiteralDfa3_0(active0, 0xc0000L);
                case 85:
                case 117:
                    return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
                default :
                    break;
            }
            return jjStartNfa_0(1, active0);
        }
        private int jjMoveStringLiteralDfa3_0(long old0, long active0){
            if (((active0 &= old0)) == 0L)
                return jjStartNfa_0(1, old0);
            try { curChar = input_stream.readChar(); }
            catch(java.io.IOException e) {
                jjStopStringLiteralDfa_0(2, active0);
                return 3;
            }
            switch(curChar)
            {
                case 69:
                case 101:
                    if ((active0 & 0x20000L) != 0L)
                        return jjStartNfaWithStates_0(3, 17, 15);
                    break;
                case 76:
                case 108:
                    if ((active0 & 0x80000L) != 0L)
                        return jjStartNfaWithStates_0(3, 19, 15);
                    break;
                case 83:
                case 115:
                    return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
                default :
                    break;
            }
            return jjStartNfa_0(2, active0);
        }
        private int jjMoveStringLiteralDfa4_0(long old0, long active0){
            if (((active0 &= old0)) == 0L)
                return jjStartNfa_0(2, old0);
            try { curChar = input_stream.readChar(); }
            catch(java.io.IOException e) {
                jjStopStringLiteralDfa_0(3, active0);
                return 4;
            }
            switch(curChar)
            {
                case 69:
                case 101:
                    if ((active0 & 0x40000L) != 0L)
                        return jjStartNfaWithStates_0(4, 18, 15);
                    break;
                default :
                    break;
            }
            return jjStartNfa_0(3, active0);
        }
        private int jjStartNfaWithStates_0(int pos, int kind, int state)
        {
            jjmatchedKind = kind;
            jjmatchedPos = pos;
            try { curChar = input_stream.readChar(); }
            catch(java.io.IOException e) { return pos + 1; }
            return jjMoveNfa_0(state, pos + 1);
        }
        static final long[] jjbitVec0 = {
                0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
        };
        static final long[] jjbitVec2 = {
                0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
        };
        private int jjMoveNfa_0(int startState, int curPos)
        {
            int startsAt = 0;
            jjnewStateCnt = 38;
            int i = 1;
            jjstateSet[0] = startState;
            int kind = 0x7fffffff;
            for (;;)
            {
                if (++jjround == 0x7fffffff)
                    ReInitRounds();
                if (curChar < 64)
                {
                    long l = 1L << curChar;
                    do
                    {
                        switch(jjstateSet[--i])
                        {
                            case 0:
                                if ((0x3ff000000000000L & l) != 0L)
                                {
                                    if (kind > 28)
                                        kind = 28;
                                    { jjCheckNAdd(15); }
                                }
                                else if ((0x3400L & l) != 0L)
                                {
                                    if (kind > 5)
                                        kind = 5;
                                }
                                else if ((0x100000200L & l) != 0L)
                                {
                                    if (kind > 4)
                                        kind = 4;
                                }
                                else if (curChar == 45)
                                { jjCheckNAddStates(0, 3); }
                                else if (curChar == 47)
                                { jjAddStates(4, 5); }
                                else if (curChar == 34)
                                { jjCheckNAddTwoStates(11, 12); }
                                else if (curChar == 39)
                                { jjCheckNAddTwoStates(6, 7); }
                                else if (curChar == 35)
                                { jjCheckNAddTwoStates(1, 2); }
                                if ((0x3fe000000000000L & l) != 0L)
                                {
                                    if (kind > 15)
                                        kind = 15;
                                    { jjCheckNAddStates(6, 8); }
                                }
                                else if (curChar == 48)
                                {
                                    if (kind > 15)
                                        kind = 15;
                                    { jjCheckNAddStates(9, 11); }
                                }
                                break;
                            case 38:
                            case 6:
                                if ((0xffffff7fffffc9ffL & l) != 0L)
                                { jjCheckNAddStates(12, 14); }
                                break;
                            case 39:
                            case 11:
                                if ((0xfffffffbffffc9ffL & l) != 0L)
                                { jjCheckNAddStates(15, 17); }
                                break;
                            case 1:
                                if ((0xffffffffffffcbffL & l) != 0L)
                                { jjCheckNAddTwoStates(1, 2); }
                                break;
                            case 2:
                                if ((0x3400L & l) != 0L && kind > 3)
                                    kind = 3;
                                break;
                            case 3:
                                if ((0x100000200L & l) != 0L && kind > 4)
                                    kind = 4;
                                break;
                            case 4:
                                if ((0x3400L & l) != 0L && kind > 5)
                                    kind = 5;
                                break;
                            case 5:
                                if (curChar == 39)
                                { jjCheckNAddTwoStates(6, 7); }
                                break;
                            case 8:
                                if ((0x808000000000L & l) != 0L)
                                { jjCheckNAddStates(12, 14); }
                                break;
                            case 9:
                                if (curChar == 39 && kind > 26)
                                    kind = 26;
                                break;
                            case 10:
                                if (curChar == 34)
                                { jjCheckNAddTwoStates(11, 12); }
                                break;
                            case 13:
                                if ((0x800400000000L & l) != 0L)
                                { jjCheckNAddStates(15, 17); }
                                break;
                            case 14:
                                if (curChar == 34 && kind > 27)
                                    kind = 27;
                                break;
                            case 15:
                                if ((0x3ff000000000000L & l) == 0L)
                                    break;
                                if (kind > 28)
                                    kind = 28;
                            { jjCheckNAdd(15); }
                            break;
                            case 16:
                                if (curChar == 47)
                                { jjAddStates(4, 5); }
                                break;
                            case 17:
                                if (curChar == 47)
                                { jjCheckNAddTwoStates(18, 19); }
                                break;
                            case 18:
                                if ((0xffffffffffffcbffL & l) != 0L)
                                { jjCheckNAddTwoStates(18, 19); }
                                break;
                            case 19:
                                if ((0x3400L & l) != 0L && kind > 1)
                                    kind = 1;
                                break;
                            case 20:
                                if (curChar == 42)
                                { jjCheckNAddTwoStates(21, 23); }
                                break;
                            case 21:
                            { jjCheckNAddTwoStates(21, 23); }
                            break;
                            case 22:
                                if (curChar == 47 && kind > 2)
                                    kind = 2;
                                break;
                            case 23:
                                if (curChar == 42)
                                    jjstateSet[jjnewStateCnt++] = 22;
                                break;
                            case 24:
                                if (curChar == 45)
                                { jjCheckNAddStates(0, 3); }
                                break;
                            case 25:
                                if (curChar != 48)
                                    break;
                                if (kind > 15)
                                    kind = 15;
                            { jjCheckNAdd(25); }
                            break;
                            case 26:
                                if ((0x3fe000000000000L & l) == 0L)
                                    break;
                                if (kind > 15)
                                    kind = 15;
                            { jjCheckNAdd(27); }
                            break;
                            case 27:
                                if ((0x3ff000000000000L & l) == 0L)
                                    break;
                                if (kind > 15)
                                    kind = 15;
                            { jjCheckNAdd(27); }
                            break;
                            case 28:
                                if (curChar == 48)
                                { jjCheckNAddTwoStates(28, 29); }
                                break;
                            case 29:
                                if (curChar == 46)
                                { jjCheckNAdd(30); }
                                break;
                            case 30:
                                if ((0x3ff000000000000L & l) == 0L)
                                    break;
                                if (kind > 16)
                                    kind = 16;
                            { jjCheckNAddTwoStates(30, 31); }
                            break;
                            case 32:
                                if ((0x280000000000L & l) != 0L)
                                { jjCheckNAdd(33); }
                                break;
                            case 33:
                                if ((0x3ff000000000000L & l) == 0L)
                                    break;
                                if (kind > 16)
                                    kind = 16;
                            { jjCheckNAdd(33); }
                            break;
                            case 34:
                                if ((0x3fe000000000000L & l) != 0L)
                                { jjCheckNAddTwoStates(35, 29); }
                                break;
                            case 35:
                                if ((0x3ff000000000000L & l) != 0L)
                                { jjCheckNAddTwoStates(35, 29); }
                                break;
                            case 36:
                                if (curChar != 48)
                                    break;
                                if (kind > 15)
                                    kind = 15;
                            { jjCheckNAddStates(9, 11); }
                            break;
                            case 37:
                                if ((0x3fe000000000000L & l) == 0L)
                                    break;
                                if (kind > 15)
                                    kind = 15;
                            { jjCheckNAddStates(6, 8); }
                            break;
                            default : break;
                        }
                    } while(i != startsAt);
                }
                else if (curChar < 128)
                {
                    long l = 1L << (curChar & 077);
                    do
                    {
                        switch(jjstateSet[--i])
                        {
                            case 0:
                            case 15:
                                if ((0x7fffffe07fffffeL & l) == 0L)
                                    break;
                                if (kind > 28)
                                    kind = 28;
                            { jjCheckNAdd(15); }
                            break;
                            case 38:
                                if ((0xffffffffefffffffL & l) != 0L)
                                { jjCheckNAddStates(12, 14); }
                                else if (curChar == 92)
                                    jjstateSet[jjnewStateCnt++] = 8;
                                break;
                            case 39:
                                if ((0xffffffffefffffffL & l) != 0L)
                                { jjCheckNAddStates(15, 17); }
                                else if (curChar == 92)
                                    jjstateSet[jjnewStateCnt++] = 13;
                                break;
                            case 1:
                            { jjAddStates(18, 19); }
                            break;
                            case 6:
                                if ((0xffffffffefffffffL & l) != 0L)
                                { jjCheckNAddStates(12, 14); }
                                break;
                            case 7:
                                if (curChar == 92)
                                    jjstateSet[jjnewStateCnt++] = 8;
                                break;
                            case 8:
                                if ((0x14404410144044L & l) != 0L)
                                { jjCheckNAddStates(12, 14); }
                                break;
                            case 11:
                                if ((0xffffffffefffffffL & l) != 0L)
                                { jjCheckNAddStates(15, 17); }
                                break;
                            case 12:
                                if (curChar == 92)
                                    jjstateSet[jjnewStateCnt++] = 13;
                                break;
                            case 13:
                                if ((0x14404410144044L & l) != 0L)
                                { jjCheckNAddStates(15, 17); }
                                break;
                            case 18:
                            { jjAddStates(20, 21); }
                            break;
                            case 21:
                            { jjAddStates(22, 23); }
                            break;
                            case 31:
                                if ((0x2000000020L & l) != 0L)
                                { jjAddStates(24, 25); }
                                break;
                            default : break;
                        }
                    } while(i != startsAt);
                } else {
                    int hiByte = (curChar >> 8);
                    int i1 = hiByte >> 6;
                    long l1 = 1L << (hiByte & 077);
                    int i2 = (curChar & 0xff) >> 6;
                    long l2 = 1L << (curChar & 077);
                    do
                    {
                        switch(jjstateSet[--i])
                        {
                            case 38:
                            case 6:
                                if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                                { jjCheckNAddStates(12, 14); }
                                break;
                            case 39:
                            case 11:
                                if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                                { jjCheckNAddStates(15, 17); }
                                break;
                            case 1:
                                if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                                { jjAddStates(18, 19); }
                                break;
                            case 18:
                                if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                                { jjAddStates(20, 21); }
                                break;
                            case 21:
                                if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                                { jjAddStates(22, 23); }
                                break;
                            default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
                        }
                    } while(i != startsAt);
                }
                if (kind != 0x7fffffff)
                {
                    jjmatchedKind = kind;
                    jjmatchedPos = curPos;
                    kind = 0x7fffffff;
                }
                ++curPos;
                if ((i = jjnewStateCnt) == (startsAt = 38 - (jjnewStateCnt = startsAt)))
                    return curPos;
                try { curChar = input_stream.readChar(); }
                catch(java.io.IOException e) { return curPos; }
            }
        }

        /** Token literal values. */
        public static final String[] jjstrLiteralImages = {
                "", null, null, null, null, null, "\54", "\173", "\175", "\72", "\133",
                "\135", null, null, null, null, null, null, null, null, null, null, "\47\47",
                "\42\42", null, null, null, null, null, };
        protected Token jjFillToken()
        {
            final Token t;
            final String curTokenImage;
            final int beginLine;
            final int endLine;
            final int beginColumn;
            final int endColumn;
            String im = jjstrLiteralImages[jjmatchedKind];
            curTokenImage = (im == null) ? input_stream.GetImage() : im;
            beginLine = input_stream.getBeginLine();
            beginColumn = input_stream.getBeginColumn();
            endLine = input_stream.getEndLine();
            endColumn = input_stream.getEndColumn();
            t = Token.newToken(jjmatchedKind, curTokenImage);

            t.beginLine = beginLine;
            t.endLine = endLine;
            t.beginColumn = beginColumn;
            t.endColumn = endColumn;

            return t;
        }
        static final int[] jjnextStates = {
                25, 26, 28, 34, 17, 20, 27, 35, 29, 25, 28, 29, 6, 7, 9, 11,
                12, 14, 1, 2, 18, 19, 21, 23, 32, 33,
        };
        private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
        {
            switch(hiByte)
            {
                case 0:
                    return ((jjbitVec2[i2] & l2) != 0L);
                default :
                    if ((jjbitVec0[i1] & l1) != 0L)
                        return true;
                    return false;
            }
        }

        int curLexState = 0;
        int defaultLexState = 0;
        int jjnewStateCnt;
        int jjround;
        int jjmatchedPos;
        int jjmatchedKind;

        /** Get the next Token. */
        public Token getNextToken()
        {
            Token matchedToken;
            int curPos = 0;

            EOFLoop :
            for (;;)
            {
                try
                {
                    curChar = input_stream.BeginToken();
                }
                catch(Exception e)
                {
                    jjmatchedKind = 0;
                    jjmatchedPos = -1;
                    matchedToken = jjFillToken();
                    return matchedToken;
                }

                jjmatchedKind = 0x7fffffff;
                jjmatchedPos = 0;
                curPos = jjMoveStringLiteralDfa0_0();
                if (jjmatchedKind != 0x7fffffff)
                {
                    if (jjmatchedPos + 1 < curPos)
                        input_stream.backup(curPos - jjmatchedPos - 1);
                    if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
                    {
                        matchedToken = jjFillToken();
                        return matchedToken;
                    } else {
                        continue EOFLoop;
                    }
                }
                int error_line = input_stream.getEndLine();
                int error_column = input_stream.getEndColumn();
                String error_after = null;
                boolean EOFSeen = false;
                try { input_stream.readChar(); input_stream.backup(1); }
                catch (java.io.IOException e1) {
                    EOFSeen = true;
                    error_after = curPos <= 1 ? "" : input_stream.GetImage();
                    if (curChar == '\n' || curChar == '\r') {
                        error_line++;
                        error_column = 0;
                    }
                    else
                        error_column++;
                }
                if (!EOFSeen) {
                    input_stream.backup(1);
                    error_after = curPos <= 1 ? "" : input_stream.GetImage();
                }
                throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
            }
        }

        void SkipLexicalActions(Token matchedToken)
        {
            switch(jjmatchedKind)
            {
                default :
                    break;
            }
        }
        void MoreLexicalActions()
        {
            jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
            switch(jjmatchedKind)
            {
                default :
                    break;
            }
        }
        void TokenLexicalActions(Token matchedToken)
        {
            switch(jjmatchedKind)
            {
                default :
                    break;
            }
        }
        private void jjCheckNAdd(int state)
        {
            if (jjrounds[state] != jjround)
            {
                jjstateSet[jjnewStateCnt++] = state;
                jjrounds[state] = jjround;
            }
        }
        private void jjAddStates(int start, int end)
        {
            do {
                jjstateSet[jjnewStateCnt++] = jjnextStates[start];
            } while (start++ != end);
        }
        private void jjCheckNAddTwoStates(int state1, int state2)
        {
            jjCheckNAdd(state1);
            jjCheckNAdd(state2);
        }

        private void jjCheckNAddStates(int start, int end)
        {
            do {
                jjCheckNAdd(jjnextStates[start]);
            } while (start++ != end);
        }

        /** Constructor. */
        public JSONParserTokenManager(JavaCharStream stream){

            if (JavaCharStream.staticFlag)
                throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

            input_stream = stream;
        }

        /** Constructor. */
        public JSONParserTokenManager (JavaCharStream stream, int lexState){
            ReInit(stream);
            SwitchTo(lexState);
        }

        /** Reinitialise parser. */
        public void ReInit(JavaCharStream stream)
        {
            jjmatchedPos =
                    jjnewStateCnt =
                            0;
            curLexState = defaultLexState;
            input_stream = stream;
            ReInitRounds();
        }

        private void ReInitRounds()
        {
            int i;
            jjround = 0x80000001;
            for (i = 38; i-- > 0;)
                jjrounds[i] = 0x80000000;
        }

        /** Reinitialise parser. */
        public void ReInit(JavaCharStream stream, int lexState)
        {
            ReInit(stream);
            SwitchTo(lexState);
        }

        /** Switch to specified lex state. */
        public void SwitchTo(int lexState)
        {
            if (lexState >= 1 || lexState < 0)
                throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
            else
                curLexState = lexState;
        }


        /** Lexer state names. */
        public static final String[] lexStateNames = {
                "DEFAULT",
        };

        /** Lex State array. */
        public static final int[] jjnewLexState = {
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1,
        };
        static final long[] jjtoToken = {
                0x1ccf8fc1L,
        };
        static final long[] jjtoSkip = {
                0x3eL,
        };
        static final long[] jjtoSpecial = {
                0x0L,
        };
        static final long[] jjtoMore = {
                0x0L,
        };
        protected JavaCharStream  input_stream;

        private final int[] jjrounds = new int[38];
        private final int[] jjstateSet = new int[2 * 38];
        private final StringBuilder jjimage = new StringBuilder();
        private StringBuilder image = jjimage;
        private int jjimageLen;
        private int lengthOfMatch;
        protected int curChar;
    }

