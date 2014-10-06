/* The following code was generated by JFlex 1.4.3 on 06/10/14 23:03 */

package com.nraynaud.ada;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.nraynaud.ada.psi.AdaTypes;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 06/10/14 23:03 from the specification file
 * <tt>/Users/nraynaud/dev/adaplugin/src/com/nraynaud/ada/Ada.flex</tt>
 */
class AdaLexer implements FlexLexer {
  /** lexical states */
  public static final int YYINITIAL = 0;
    /**
     * the current lexical state
     */
    private int zzLexicalState = YYINITIAL;
    /**
     * initial size of the lookahead buffer
     */
    private static final int ZZ_BUFFERSIZE = 16384;
  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };
  /**
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED =
          "\11\0\1\5\1\3\1\0\1\5\1\4\22\0\1\5\1\0\1\7" +
                  "\12\0\1\6\2\0\12\1\7\0\32\2\4\0\1\1\1\0\1\10" +
                  "\1\11\1\16\1\23\1\17\1\27\1\26\1\34\1\22\1\2\1\35" +
                  "\1\21\1\32\1\24\1\12\1\20\1\37\1\13\1\15\1\14\1\31" +
                  "\1\36\1\33\1\30\1\25\1\2\uff85\0";
  /**
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);
  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();
  private static final String ZZ_ACTION_PACKED_0 =
          "\1\0\1\1\1\2\2\3\1\4\2\1\23\2\1\5" +
                  "\1\0\1\6\2\2\1\7\45\2\1\7\123\2";
  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();
    private static final String ZZ_ROWMAP_PACKED_0 =
            "\0\0\0\40\0\100\0\40\0\140\0\200\0\240\0\300" +
                    "\0\340\0\u0100\0\u0120\0\u0140\0\u0160\0\u0180\0\u01a0\0\u01c0" +
                    "\0\u01e0\0\u0200\0\u0220\0\u0240\0\u0260\0\u0280\0\u02a0\0\u02c0" +
                    "\0\u02e0\0\u0300\0\u0320\0\u0340\0\300\0\u0360\0\u0380\0\u03a0" +
                    "\0\100\0\u03c0\0\u03e0\0\u0400\0\u0420\0\u0440\0\u0460\0\u0480" +
                    "\0\u04a0\0\u04c0\0\u04e0\0\u0500\0\u0520\0\u0540\0\u0560\0\u0580" +
                    "\0\u05a0\0\u05c0\0\u05e0\0\u0600\0\u0620\0\u0640\0\u0660\0\u0680" +
                    "\0\u06a0\0\u06c0\0\u06e0\0\u0700\0\u0720\0\u0740\0\u0760\0\u0780" +
                    "\0\u07a0\0\u07c0\0\u07e0\0\u0800\0\u0820\0\u0840\0\u0860\0\u0880" +
                    "\0\u08a0\0\u08c0\0\u08e0\0\u0900\0\u0920\0\u0940\0\u0960\0\u0980" +
                    "\0\u09a0\0\u09c0\0\u09e0\0\u0a00\0\u0a20\0\u0a40\0\u0a60\0\u0a80" +
                    "\0\u0aa0\0\u0ac0\0\u0ae0\0\u0b00\0\u0b20\0\u0b40\0\u0b60\0\u0b80" +
                    "\0\u0ba0\0\u0bc0\0\u0be0\0\u0c00\0\u0c20\0\u0c40\0\u0c60\0\u0c80" +
                    "\0\u0ca0\0\u0cc0\0\u0ce0\0\u0d00\0\u0d20\0\u0d40\0\u0d60\0\u0d80" +
                    "\0\u0da0\0\u0dc0\0\u0de0\0\u0e00\0\u0e20\0\u0e40\0\u0e60\0\u0e80" +
                    "\0\u0ea0\0\u0ec0\0\u0ee0\0\u0f00\0\u0f20\0\u0f40\0\u0f60\0\u0f80" +
                    "\0\u0fa0\0\u0fc0\0\u0fe0\0\u1000\0\u1020\0\u1040\0\u1060\0\u1080" +
                    "\0\u10a0\0\u10c0\0\u10e0\0\u1100\0\u1120\0\u1140\0\u1160\0\u1180" +
                    "\0\u11a0\0\u11c0\0\u11e0\0\u1200\0\u1220\0\u1240\0\u1260\0\u1280" +
    "\0\u12a0\0\u12c0";
  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();
  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21" +
            "\1\22\1\23\1\24\1\25\1\3\1\26\1\27\1\30" +
            "\1\31\1\32\1\33\4\3\41\0\2\3\5\0\30\3" +
            "\3\0\1\4\41\0\1\6\40\0\1\34\31\0\7\35" +
            "\1\36\30\35\1\0\2\3\5\0\1\3\1\37\1\3" +
            "\1\40\1\41\1\3\1\42\2\3\1\43\2\3\1\44" +
            "\13\3\1\0\2\3\5\0\2\3\1\45\4\3\1\46" +
            "\20\3\1\0\2\3\5\0\3\3\1\41\1\47\12\3" +
            "\1\41\1\3\1\50\6\3\1\0\2\3\5\0\1\51" +
            "\6\3\1\52\20\3\1\0\2\3\5\0\1\53\6\3" +
            "\1\54\5\3\1\55\6\3\1\56\3\3\1\0\2\3" +
            "\5\0\7\3\1\57\11\3\1\60\6\3\1\0\2\3" +
            "\5\0\1\61\1\3\1\62\25\3\1\0\2\3\5\0" +
            "\11\3\1\63\2\3\1\64\3\3\1\65\7\3\1\0" +
            "\2\3\5\0\1\66\2\3\1\67\24\3\1\0\2\3" +
            "\5\0\2\3\1\70\7\3\1\71\15\3\1\0\2\3" +
            "\5\0\5\3\1\41\6\3\1\41\2\3\1\41\10\3" +
            "\1\0\2\3\5\0\2\3\1\41\4\3\1\72\2\3" +
            "\1\73\15\3\1\0\2\3\5\0\2\3\1\50\4\3" +
            "\1\74\11\3\1\75\6\3\1\0\2\3\5\0\2\3" +
            "\1\76\4\3\1\77\20\3\1\0\2\3\5\0\2\3" +
            "\1\100\16\3\1\101\6\3\1\0\2\3\5\0\2\3" +
            "\1\100\25\3\1\0\2\3\5\0\5\3\1\102\6\3" +
            "\1\103\13\3\1\0\2\3\5\0\2\3\1\44\25\3" +
            "\1\0\2\3\5\0\12\3\1\104\11\3\1\105\3\3" +
            "\3\34\2\0\33\34\7\0\1\35\31\0\2\3\5\0" +
            "\2\3\1\106\2\3\1\107\22\3\1\0\2\3\5\0" +
            "\3\3\1\110\24\3\1\0\2\3\5\0\6\3\1\111" +
            "\21\3\1\0\2\3\5\0\11\3\1\41\1\112\15\3" +
            "\1\0\2\3\5\0\13\3\1\41\14\3\1\0\2\3" +
            "\5\0\13\3\1\113\14\3\1\0\2\3\5\0\16\3" +
            "\1\114\11\3\1\0\2\3\5\0\24\3\1\115\3\3" +
            "\1\0\2\3\5\0\4\3\1\41\23\3\1\0\2\3" +
            "\5\0\12\3\1\61\1\3\1\116\13\3\1\0\2\3" +
            "\5\0\4\3\1\117\1\3\1\120\5\3\1\121\5\3" +
            "\1\41\3\3\1\122\1\123\1\0\2\3\5\0\5\3" +
            "\1\124\10\3\1\125\11\3\1\0\2\3\5\0\3\3" +
            "\1\126\24\3\1\0\2\3\5\0\10\3\1\102\17\3" +
            "\1\0\2\3\5\0\7\3\1\127\20\3\1\0\2\3" +
            "\5\0\10\3\1\130\1\131\16\3\1\0\2\3\5\0" +
            "\1\3\1\132\26\3\1\0\2\3\5\0\5\3\1\102" +
            "\22\3\1\0\2\3\5\0\14\3\1\133\13\3\1\0" +
            "\2\3\5\0\5\3\1\134\22\3\1\0\2\3\5\0" +
            "\4\3\1\135\6\3\1\41\14\3\1\0\2\3\5\0" +
            "\6\3\1\136\3\3\1\50\15\3\1\0\2\3\5\0" +
            "\6\3\1\137\21\3\1\0\2\3\5\0\1\140\1\3" +
            "\1\141\7\3\1\142\15\3\1\0\2\3\5\0\2\3" +
            "\1\143\25\3\1\0\2\3\5\0\22\3\1\144\5\3" +
            "\1\0\2\3\5\0\6\3\1\145\2\3\1\146\16\3" +
            "\1\0\2\3\5\0\16\3\1\147\11\3\1\0\2\3" +
            "\5\0\23\3\1\41\4\3\1\0\2\3\5\0\11\3" +
            "\1\150\16\3\1\0\2\3\5\0\4\3\1\151\23\3" +
            "\1\0\2\3\5\0\14\3\1\152\13\3\1\0\2\3" +
            "\5\0\3\3\1\41\24\3\1\0\2\3\5\0\14\3" +
            "\1\153\13\3\1\0\2\3\5\0\7\3\1\41\20\3" +
            "\1\0\2\3\5\0\4\3\1\154\23\3\1\0\2\3" +
            "\5\0\4\3\1\155\23\3\1\0\2\3\5\0\7\3" +
            "\1\127\2\3\1\156\15\3\1\0\2\3\5\0\3\3" +
            "\1\50\24\3\1\0\2\3\5\0\4\3\1\157\23\3" +
            "\1\0\2\3\5\0\1\113\27\3\1\0\2\3\5\0" +
            "\7\3\1\160\20\3\1\0\2\3\5\0\1\161\27\3" +
            "\1\0\2\3\5\0\15\3\1\41\12\3\1\0\2\3" +
            "\5\0\12\3\1\127\15\3\1\0\2\3\5\0\7\3" +
            "\1\162\20\3\1\0\2\3\5\0\16\3\1\102\11\3" +
            "\1\0\2\3\5\0\21\3\1\163\6\3\1\0\2\3" +
            "\5\0\2\3\1\164\25\3\1\0\2\3\5\0\1\165" +
            "\27\3\1\0\2\3\5\0\7\3\1\166\20\3\1\0" +
            "\2\3\5\0\21\3\1\167\6\3\1\0\2\3\5\0" +
            "\25\3\1\41\2\3\1\0\2\3\5\0\16\3\1\170" +
            "\11\3\1\0\2\3\5\0\22\3\1\171\5\3\1\0" +
            "\2\3\5\0\14\3\1\41\13\3\1\0\2\3\5\0" +
            "\1\172\27\3\1\0\2\3\5\0\7\3\1\173\20\3" +
            "\1\0\2\3\5\0\4\3\1\174\23\3\1\0\2\3" +
            "\5\0\5\3\1\175\22\3\1\0\2\3\5\0\7\3" +
            "\1\41\2\3\1\176\15\3\1\0\2\3\5\0\3\3" +
            "\1\113\24\3\1\0\2\3\5\0\7\3\1\177\20\3" +
            "\1\0\2\3\5\0\25\3\1\200\2\3\1\0\2\3" +
            "\5\0\16\3\1\201\11\3\1\0\2\3\5\0\4\3" +
            "\1\202\1\3\1\203\21\3\1\0\2\3\5\0\26\3" +
            "\1\204\1\3\1\0\2\3\5\0\10\3\1\41\17\3" +
            "\1\0\2\3\5\0\12\3\1\205\15\3\1\0\2\3" +
            "\5\0\11\3\1\206\16\3\1\0\2\3\5\0\1\113" +
            "\3\3\1\207\23\3\1\0\2\3\5\0\12\3\1\210" +
            "\15\3\1\0\2\3\5\0\11\3\1\41\16\3\1\0" +
            "\2\3\5\0\2\3\1\41\25\3\1\0\2\3\5\0" +
            "\7\3\1\211\20\3\1\0\2\3\5\0\6\3\1\212" +
            "\21\3\1\0\2\3\5\0\12\3\1\150\15\3\1\0" +
            "\2\3\5\0\24\3\1\41\3\3\1\0\2\3\5\0" +
            "\11\3\1\102\16\3\1\0\2\3\5\0\3\3\1\213" +
            "\24\3\1\0\2\3\5\0\5\3\1\214\2\3\1\50" +
            "\17\3\1\0\2\3\5\0\5\3\1\170\22\3\1\0" +
            "\2\3\5\0\3\3\1\214\24\3\1\0\2\3\5\0" +
            "\3\3\1\127\24\3\1\0\2\3\5\0\3\3\1\44" +
            "\24\3\1\0\2\3\5\0\22\3\1\215\5\3\1\0" +
            "\2\3\5\0\3\3\1\61\24\3\1\0\2\3\5\0" +
            "\7\3\1\216\20\3\1\0\2\3\5\0\7\3\1\44" +
            "\20\3\1\0\2\3\5\0\12\3\1\217\15\3\1\0" +
            "\2\3\5\0\3\3\1\204\24\3\1\0\2\3\5\0" +
            "\6\3\1\50\21\3\1\0\2\3\5\0\15\3\1\55" +
            "\12\3\1\0\2\3\5\0\4\3\1\220\23\3\1\0" +
            "\2\3\5\0\17\3\1\41\10\3\1\0\2\3\5\0" +
            "\10\3\1\212\17\3\1\0\2\3\5\0\1\116\27\3" +
            "\1\0\2\3\5\0\22\3\1\207\5\3\1\0\2\3" +
            "\5\0\7\3\1\221\20\3\1\0\2\3\5\0\7\3" +
            "\1\222\20\3\1\0\2\3\5\0\1\223\27\3\1\0" +
            "\2\3\5\0\4\3\1\170\23\3\1\0\2\3\5\0" +
            "\1\224\27\3\1\0\2\3\5\0\1\41\27\3\1\0" +
            "\2\3\5\0\4\3\1\214\23\3\1\0\2\3\5\0" +
            "\3\3\1\225\24\3\1\0\2\3\5\0\4\3\1\226" +
            "\23\3\1\0\2\3\5\0\1\173\27\3\1\0\2\3" +
            "\5\0\5\3\1\41\22\3\1\0\2\3\5\0\7\3" +
            "\1\214\20\3\1\0\2\3\5\0\21\3\1\102\6\3" +
            "\1\0\2\3\5\0\14\3\1\204\13\3\1\0\2\3" +
            "\5\0\1\227\27\3\1\0\2\3\5\0\6\3\1\205" +
            "\21\3\1\0\2\3\5\0\13\3\1\230\14\3\1\0" +
            "\2\3\5\0\4\3\1\102\23\3\1\0\2\3\5\0" +
            "\3\3\1\102\24\3\1\0\2\3\5\0\12\3\1\231" +
            "\15\3\1\0\2\3\5\0\12\3\1\232\15\3\1\0" +
            "\2\3\5\0\14\3\1\50\13\3\1\0\2\3\5\0" +
            "\21\3\1\224\6\3\1\0\2\3\5\0\6\3\1\41" +
            "\21\3\1\0\2\3\5\0\2\3\1\127\25\3";
  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };
  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();
  private static final String ZZ_ATTRIBUTE_PACKED_0 =
          "\1\0\1\11\1\1\1\11\30\1\1\0\175\1";
    private static java.io.Reader zzReader = null; // Fake
  /** the current state of the DFA */
  private int zzState;
    /**
     * this buffer contains the current text to be matched and is
     * the source of the yytext() string
     */
    private CharSequence zzBuffer = "";
    /**
     * this buffer may contains the current text array to be matched when it is cheap to acquire it
     */
    private char[] zzBufferArray;
    /**
     * the textposition at the last accepting state
     */
    private int zzMarkedPos;
    /**
     * the textposition at the last state to be included in yytext
     */
    private int zzPushbackPos;
    /**
     * the current text position in the buffer
     */
    private int zzCurrentPos;
    /**
     * startRead marks the beginning of the yytext() string in the buffer
     */
    private int zzStartRead;
    /**
     * endRead marks the last character in the buffer, that has been read
     * from input
     */
    private int zzEndRead;
    /**
     * zzAtBOL == true <=> the scanner is currently at the beginning of a line
     */
    private boolean zzAtBOL = true;
    /**
     * zzAtEOF == true <=> the scanner is at the EOF
     */
    private boolean zzAtEOF;
    /**
     * denotes if the user-EOF-code has already been executed
     */
    private boolean zzEOFDone;

    AdaLexer(java.io.Reader in) {
        this.zzReader = in;
    }

    /**
     * Creates a new scanner.
     * There is also java.io.Reader version of this constructor.
     *
     * @param   in  the java.io.Inputstream to read input from.
     */
    AdaLexer(java.io.InputStream in) {
        this(new java.io.InputStreamReader(in));
    }

    private static int[] zzUnpackAction() {
        int[] result = new int[154];
        int offset = 0;
        offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAction(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }

    private static int[] zzUnpackRowMap() {
        int[] result = new int[154];
        int offset = 0;
        offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackRowMap(String packed, int offset, int[] result) {
        int i = 0;  /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int high = packed.charAt(i++) << 16;
            result[j++] = high | packed.charAt(i++);
        }
        return j;
    }

    private static int[] zzUnpackTrans() {
        int[] result = new int[4832];
        int offset = 0;
        offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackTrans(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            value--;
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }

    private static int[] zzUnpackAttribute() {
        int [] result = new int[154];
        int offset = 0;
        offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAttribute(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
      char[] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 92) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: {
            return AdaTypes.OTHER;
        }
            case 8:
                break;
            case 2: {
                return AdaTypes.IDENTIFIER;
          }
        case 9: break;
        case 6: {
            return AdaTypes.STRING_LITERAL;
          }
        case 10: break;
        case 5: 
          { return AdaTypes.COMMENT;
          }
            case 11: break;
        case 4: 
          { yybegin(YYINITIAL);
              return TokenType.WHITE_SPACE;
          }
        case 12: break;
        case 7: 
          { return AdaTypes.KEYWORD;
          }
        case 13: break;
        case 3: 
          { yybegin(YYINITIAL); return AdaTypes.CRLF;
          }
        case 14: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
