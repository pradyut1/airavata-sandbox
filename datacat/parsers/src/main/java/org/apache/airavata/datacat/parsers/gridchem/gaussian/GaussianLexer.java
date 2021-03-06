/*
*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*
*/
package org.apache.airavata.datacat.parsers.gridchem.gaussian;/* The following code was generated by JFlex 1.4.3 on 9/10/14 9:00 AM */

import java_cup.runtime.Symbol;
import org.apache.airavata.datacat.parsers.gridchem.Settings;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/10/14 9:00 AM from the specification file
 * <tt>gaussian.flex</tt>
 */
public class GaussianLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int IGNOREALL = 6;
  public static final int ITER1 = 4;
  public static final int YYINITIAL = 0;
  public static final int ITER = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     6,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  2,  0,  0, 
     0, 19,  9,  0, 10,  0,  0,  0,  0,  0,  0,  0,  0,  1,  0,  0, 
     0,  0,  0,  0,  0,  0, 13, 18, 12,  0,  0,  0,  0,  7,  0,  0, 
     8,  0, 11,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0, 21,  0, 23, 15, 22, 14,  0,  0,  0,  0, 24,  0,  3, 
     4,  0, 16, 20,  5, 17,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\22\1\4\0\1\2\2\0\1\3\4\0\1\4"+
    "\6\0\1\5\1\6\1\7\1\10\1\11\1\0\1\12"+
    "\1\13\1\14\1\15\3\0\1\16\1\0\1\17\1\20"+
    "\42\0\1\21\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[94];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
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
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\31\0\62\0\113\0\144\0\175\0\226\0\257"+
    "\0\310\0\341\0\372\0\u0113\0\u012c\0\u0145\0\u015e\0\u0177"+
    "\0\u0190\0\u01a9\0\u01c2\0\u01db\0\u01f4\0\u020d\0\u0226\0\u023f"+
    "\0\u0258\0\u0271\0\144\0\u028a\0\u02a3\0\144\0\u02bc\0\u02d5"+
    "\0\u02ee\0\u0307\0\144\0\u01a9\0\u0320\0\u0339\0\u0352\0\u036b"+
    "\0\u0384\0\144\0\144\0\144\0\144\0\144\0\u039d\0\144"+
    "\0\144\0\144\0\144\0\u03b6\0\u03cf\0\u03e8\0\144\0\u0401"+
    "\0\144\0\144\0\u041a\0\u0433\0\u044c\0\u0465\0\u047e\0\u0497"+
    "\0\u04b0\0\u04c9\0\u04e2\0\u04fb\0\u0514\0\u052d\0\u0546\0\u055f"+
    "\0\u0578\0\u0591\0\u05aa\0\u05c3\0\u05dc\0\u05f5\0\u060e\0\u0627"+
    "\0\u0640\0\u0659\0\u0672\0\u068b\0\u06a4\0\u06bd\0\u06d6\0\u06ef"+
    "\0\u0708\0\u0721\0\u073a\0\u0753\0\144\0\144";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[94];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\5\1\6\31\5\1\7\3\5\1\10\3\5\1\11"+
    "\2\5\1\12\1\5\1\13\1\14\1\15\10\5\1\16"+
    "\1\17\3\5\1\20\3\5\1\21\2\5\1\22\1\5"+
    "\1\23\1\24\2\5\1\25\1\5\1\26\33\5\33\0"+
    "\1\27\32\0\1\30\34\0\1\31\34\0\1\32\33\0"+
    "\1\33\27\0\1\34\30\0\1\35\35\0\1\36\7\0"+
    "\1\37\32\0\1\40\34\0\1\41\34\0\1\42\33\0"+
    "\1\43\27\0\1\44\30\0\1\45\37\0\1\46\32\0"+
    "\1\47\3\0\1\50\33\0\1\51\34\0\1\52\1\53"+
    "\33\0\1\54\32\0\1\55\30\0\1\56\13\0\1\57"+
    "\33\0\1\60\34\0\1\61\34\0\1\62\32\0\1\63"+
    "\30\0\1\64\14\0\1\65\27\0\1\66\34\0\1\67"+
    "\24\0\1\70\27\0\1\71\57\0\1\72\2\0\1\73"+
    "\30\0\1\74\30\0\1\75\30\0\1\76\30\0\1\77"+
    "\30\0\1\100\30\0\1\101\30\0\1\102\30\0\1\103"+
    "\30\0\1\104\30\0\1\105\30\0\1\106\30\0\1\107"+
    "\30\0\1\110\30\0\1\111\30\0\1\112\30\0\1\113"+
    "\30\0\1\114\30\0\1\115\30\0\1\116\30\0\1\117"+
    "\30\0\1\120\30\0\1\121\30\0\1\122\30\0\1\123"+
    "\30\0\1\124\30\0\1\125\30\0\1\126\30\0\1\127"+
    "\30\0\1\130\30\0\1\131\30\0\1\132\30\0\1\133"+
    "\30\0\1\134\30\0\1\135\30\0\1\136\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1900];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

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
    "\4\0\1\11\21\1\4\0\1\11\2\0\1\11\4\0"+
    "\1\11\6\0\5\11\1\0\4\11\3\0\1\11\1\0"+
    "\2\11\42\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[94];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public static boolean DEBUG = false;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public GaussianLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public GaussianLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
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
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
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
        case 17: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found Gaussian 98");
           yybegin(ITER);
	   return new Symbol(GaussianSym.FOUNDITER);
          }
        case 19: break;
        case 12: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found RHF");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype2"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
      yybegin(IGNOREALL);
     return new Symbol(GaussianSym.RUNTYP1);
          }
        case 20: break;
        case 8: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found rhf");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype1"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
     yybegin(ITER1);
     return new Symbol(GaussianSym.RUNTYP);
          }
        case 21: break;
        case 2: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found hf");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype1"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
     yybegin(ITER1);
     return new Symbol(GaussianSym.RUNTYP);
          }
        case 22: break;
        case 16: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found geom");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype2"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
     yybegin(IGNOREALL);
     return new Symbol(GaussianSym.RUNTYP1);
          }
        case 23: break;
        case 10: 
          { if  (Settings.DEBUG) System.out.println("GaussianFlex: Found opt ");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype2"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
     yybegin(IGNOREALL);   
     return new Symbol(GaussianSym.RUNTYP1);
          }
        case 24: break;
        case 7: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found RHF");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype1"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
     yybegin(ITER1);
     return new Symbol(GaussianSym.RUNTYP);
          }
        case 25: break;
        case 3: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found G1");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype1"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
     yybegin(ITER1);
     return new Symbol(GaussianSym.RUNTYP);
          }
        case 26: break;
        case 18: 
          { yybegin(IGNOREALL);
    return new Symbol(GaussianSym.SCFDONE);
          }
        case 27: break;
        case 13: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found uhf");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype2"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
     yybegin(IGNOREALL);
     return new Symbol(GaussianSym.RUNTYP1);
          }
        case 28: break;
        case 9: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found uhf");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype1"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
     yybegin(ITER1);
     return new Symbol(GaussianSym.RUNTYP);
          }
        case 29: break;
        case 11: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found MP2");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype2"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
     yybegin(IGNOREALL);   
     return new Symbol(GaussianSym.RUNTYP1);
          }
        case 30: break;
        case 4: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found rhf");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype2"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
     yybegin(IGNOREALL);
     return new Symbol(GaussianSym.RUNTYP1);
          }
        case 31: break;
        case 15: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found scf=");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype2"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
      yybegin(IGNOREALL);
     return new Symbol(GaussianSym.RUNTYP1);
          }
        case 32: break;
        case 6: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found MP4");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype1"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
     yybegin(ITER1);
     return new Symbol(GaussianSym.RUNTYP);
          }
        case 33: break;
        case 5: 
          { if (Settings.DEBUG) System.out.println("GaussianFlex: Found MP2");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype1"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}
     yybegin(ITER1);
     return new Symbol(GaussianSym.RUNTYP);
          }
        case 34: break;
        case 14: 
          { if  (Settings.DEBUG) System.out.println("GaussianFlex: Found opt ");
   if (Settings.DEBUG) System.out.println(yytext());
 try{
     PrintStream temp = new PrintStream(new FileOutputStream("runtype1"));
     temp.print(yytext());
     System.out.println(yytext());}
   catch (IOException ie){ System.out.println("Error in Gaussian Lexer");}

     yybegin(ITER1);
     return new Symbol(GaussianSym.RUNTYP);
          }
        case 35: break;
        case 1: 
          { 
          }
        case 36: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(GaussianSym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Converts an int token code into the name of the
   * token by reflection on the cup symbol class/interface sym
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  private String getTokenName(int token) {
    try {
      java.lang.reflect.Field [] classFields = GaussianSym.class.getFields();
      for (int i = 0; i < classFields.length; i++) {
        if (classFields[i].getInt(null) == token) {
          return classFields[i].getName();
        }
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }

    return "UNKNOWN TOKEN";
  }

  /**
   * Same as next_token but also prints the token to standard out
   * for debugging.
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  public java_cup.runtime.Symbol debug_next_token() throws java.io.IOException {
    java_cup.runtime.Symbol s = next_token();
    System.out.println( " --"+ yytext() + "--" + getTokenName(s.sym) + "--");
    return s;
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java GaussianLexer <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        GaussianLexer scanner = null;
        try {
          scanner = new GaussianLexer( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
