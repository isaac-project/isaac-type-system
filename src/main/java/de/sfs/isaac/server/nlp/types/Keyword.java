

/* First created by JCasGen Tue May 15 16:51:50 CEST 2018 */
package de.sfs.isaac.server.nlp.types;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** a keyword in a target answer
 * Updated by JCasGen Tue Apr 14 16:08:07 CEST 2020
 * XML source: /home/rziai/git/isaac-backend/src/main/resources/isaac-type-system.xml
 * @generated */
public class Keyword extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.sfs.isaac.server.nlp.types.Keyword";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Keyword.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_keywordText = "keywordText";
  public final static String _FeatName_source = "source";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_keywordText = TypeSystemImpl.createCallSite(Keyword.class, "keywordText");
  private final static MethodHandle _FH_keywordText = _FC_keywordText.dynamicInvoker();
  private final static CallSite _FC_source = TypeSystemImpl.createCallSite(Keyword.class, "source");
  private final static MethodHandle _FH_source = _FC_source.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected Keyword() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Keyword(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Keyword(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Keyword(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: keywordText

  /** getter for keywordText - gets the keyword string
   * @generated
   * @return value of the feature 
   */
  public String getKeywordText() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_keywordText));
  }
    
  /** setter for keywordText - sets the keyword string 
   * @generated
   * @param v value to set into the feature 
   */
  public void setKeywordText(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_keywordText), v);
  }    
    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets the keyword's source, either "human" or "automatic"
   * @generated
   * @return value of the feature 
   */
  public String getSource() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_source));
  }
    
  /** setter for source - sets the keyword's source, either "human" or "automatic" 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_source), v);
  }    
    
  }

    