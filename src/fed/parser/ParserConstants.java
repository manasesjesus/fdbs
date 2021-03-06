/* Generated By:JavaCC: Do not edit this line. ParserConstants.java */
package fed.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int COMMENT_LINE = 6;
  /** RegularExpression Id. */
  int COMMENT_BLOCK = 7;
  /** RegularExpression Id. */
  int O_ASTERISK = 8;
  /** RegularExpression Id. */
  int O_CLOSEPAREN = 9;
  /** RegularExpression Id. */
  int O_OPENPAREN = 10;
  /** RegularExpression Id. */
  int O_COMMA = 11;
  /** RegularExpression Id. */
  int O_TERMINATOR = 12;
  /** RegularExpression Id. */
  int O_DOT = 13;
  /** RegularExpression Id. */
  int O_PERCENT = 14;
  /** RegularExpression Id. */
  int O_EQUAL = 15;
  /** RegularExpression Id. */
  int O_GREATER = 16;
  /** RegularExpression Id. */
  int O_GREATEREQUAL = 17;
  /** RegularExpression Id. */
  int O_LESS = 18;
  /** RegularExpression Id. */
  int O_LESSEQUAL = 19;
  /** RegularExpression Id. */
  int O_MINUS = 20;
  /** RegularExpression Id. */
  int O_NOTEQUAL2 = 21;
  /** RegularExpression Id. */
  int O_NOTEQUAL = 22;
  /** RegularExpression Id. */
  int FLOAT = 23;
  /** RegularExpression Id. */
  int INTEGER = 24;
  /** RegularExpression Id. */
  int DIGIT = 25;
  /** RegularExpression Id. */
  int K_CREATE = 26;
  /** RegularExpression Id. */
  int K_DROP = 27;
  /** RegularExpression Id. */
  int K_TABLE = 28;
  /** RegularExpression Id. */
  int K_INSERT = 29;
  /** RegularExpression Id. */
  int K_INTO = 30;
  /** RegularExpression Id. */
  int K_DELETE = 31;
  /** RegularExpression Id. */
  int K_FROM = 32;
  /** RegularExpression Id. */
  int K_COMMIT = 33;
  /** RegularExpression Id. */
  int K_ROLLBACK = 34;
  /** RegularExpression Id. */
  int R_AND = 35;
  /** RegularExpression Id. */
  int R_ASC = 36;
  /** RegularExpression Id. */
  int R_BY = 37;
  /** RegularExpression Id. */
  int R_CONNECT = 38;
  /** RegularExpression Id. */
  int R_DESC = 39;
  /** RegularExpression Id. */
  int R_DISTINCT = 40;
  /** RegularExpression Id. */
  int R_GROUP = 41;
  /** RegularExpression Id. */
  int R_HAVING = 42;
  /** RegularExpression Id. */
  int R_IN = 43;
  /** RegularExpression Id. */
  int R_IS = 44;
  /** RegularExpression Id. */
  int R_LIKE = 45;
  /** RegularExpression Id. */
  int R_NOT = 46;
  /** RegularExpression Id. */
  int R_NULL = 47;
  /** RegularExpression Id. */
  int R_OR = 48;
  /** RegularExpression Id. */
  int R_ORDER = 49;
  /** RegularExpression Id. */
  int R_SELECT = 50;
  /** RegularExpression Id. */
  int R_UNIQUE = 51;
  /** RegularExpression Id. */
  int R_UPDATE = 52;
  /** RegularExpression Id. */
  int R_VALUES = 53;
  /** RegularExpression Id. */
  int R_WHERE = 54;
  /** RegularExpression Id. */
  int R_CONSTRAINTS = 55;
  /** RegularExpression Id. */
  int R_CONSTRAINT = 56;
  /** RegularExpression Id. */
  int R_CREATE = 57;
  /** RegularExpression Id. */
  int R_DROP = 58;
  /** RegularExpression Id. */
  int R_INSERT = 59;
  /** RegularExpression Id. */
  int R_DELETE = 60;
  /** RegularExpression Id. */
  int R_PRIMARY = 61;
  /** RegularExpression Id. */
  int R_FOREIGN = 62;
  /** RegularExpression Id. */
  int R_INTEGER = 63;
  /** RegularExpression Id. */
  int R_VARCHAR = 64;
  /** RegularExpression Id. */
  int R_HORIZONTAL = 65;
  /** RegularExpression Id. */
  int R_SET = 66;
  /** RegularExpression Id. */
  int R_SUM = 67;
  /** RegularExpression Id. */
  int R_COUNT = 68;
  /** RegularExpression Id. */
  int R_CHECK = 69;
  /** RegularExpression Id. */
  int R_BETWEEN = 70;
  /** RegularExpression Id. */
  int R_REFERENCES = 71;
  /** RegularExpression Id. */
  int R_CASCADE = 72;
  /** RegularExpression Id. */
  int Q_ATTRIBUTE = 73;
  /** RegularExpression Id. */
  int Q_COUNT = 74;
  /** RegularExpression Id. */
  int Q_SUM = 75;
  /** RegularExpression Id. */
  int S_IDENTIFIER = 76;
  /** RegularExpression Id. */
  int LETTER = 77;
  /** RegularExpression Id. */
  int SPECIAL_CHARS = 78;
  /** RegularExpression Id. */
  int QUOTED_STRING = 79;
  /** RegularExpression Id. */
  int EMPTY_STRING = 80;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<COMMENT_LINE>",
    "<COMMENT_BLOCK>",
    "\"*\"",
    "\")\"",
    "\"(\"",
    "\",\"",
    "\";\"",
    "\".\"",
    "\"%\"",
    "\"=\"",
    "\">\"",
    "\">=\"",
    "\"<\"",
    "\"<=\"",
    "\"-\"",
    "\"<>\"",
    "\"!=\"",
    "<FLOAT>",
    "<INTEGER>",
    "<DIGIT>",
    "\"CREATE\"",
    "\"DROP\"",
    "\"TABLE\"",
    "\"INSERT\"",
    "\"INTO\"",
    "\"DELETE\"",
    "\"FROM\"",
    "\"COMMIT\"",
    "\"ROLLBACK\"",
    "\"AND\"",
    "\"ASC\"",
    "\"BY\"",
    "\"CONNECT\"",
    "\"DESC\"",
    "\"DISTINCT\"",
    "\"GROUP\"",
    "\"HAVING\"",
    "\"IN\"",
    "\"IS\"",
    "\"LIKE\"",
    "\"NOT\"",
    "\"NULL\"",
    "\"OR\"",
    "\"ORDER\"",
    "\"SELECT\"",
    "\"UNIQUE\"",
    "\"UPDATE\"",
    "\"VALUES\"",
    "\"WHERE\"",
    "\"CONSTRAINTS\"",
    "\"CONSTRAINT\"",
    "\"CREATE TABLE\"",
    "\"DROP TABLE\"",
    "\"INSERT INTO\"",
    "\"DELETE FROM\"",
    "\"PRIMARY KEY\"",
    "\"FOREIGN KEY\"",
    "\"INTEGER\"",
    "\"VARCHAR\"",
    "\"HORIZONTAL\"",
    "\"SET\"",
    "\"SUM\"",
    "\"COUNT\"",
    "\"CHECK\"",
    "\"BETWEEN\"",
    "\"REFERENCES\"",
    "\"CASCADE\"",
    "<Q_ATTRIBUTE>",
    "<Q_COUNT>",
    "<Q_SUM>",
    "<S_IDENTIFIER>",
    "<LETTER>",
    "\"_\"",
    "<QUOTED_STRING>",
    "<EMPTY_STRING>",
  };

}
