

/* First created by JCasGen Thu May 11 17:00:13 CEST 2017 */
package de.sfs.isaac.server.nlp.types;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


import org.apache.uima.jcas.cas.TOP_Type;


/** a tense annotation (for English)
 * Updated by JCasGen Tue Apr 14 16:08:07 CEST 2020
 * XML source: /home/rziai/git/isaac-backend/src/main/resources/isaac-type-system.xml
 * @generated */
public class Tense extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.sfs.isaac.server.nlp.types.Tense";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Tense.class);
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
   
  public final static String _FeatName_tokens = "tokens";
  public final static String _FeatName_passive = "passive";
  public final static String _FeatName_value = "value";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_tokens = TypeSystemImpl.createCallSite(Tense.class, "tokens");
  private final static MethodHandle _FH_tokens = _FC_tokens.dynamicInvoker();
  private final static CallSite _FC_passive = TypeSystemImpl.createCallSite(Tense.class, "passive");
  private final static MethodHandle _FH_passive = _FC_passive.dynamicInvoker();
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(Tense.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected Tense() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Tense(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Tense(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Tense(JCas jcas, int begin, int end) {
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
  //* Feature: tokens

  /** getter for tokens - gets a list of links pointing to the participant tokens of this tense
   * @generated
   * @return value of the feature 
   */
  public FSArray getTokens() { 
    return (FSArray<TenseTokensLink>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_tokens)));
  }
    
  /** setter for tokens - sets a list of links pointing to the participant tokens of this tense 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokens(FSArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_tokens), v);
  }    
    
    
  /** indexed getter for tokens - gets an indexed value - a list of links pointing to the participant tokens of this tense
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TenseTokensLink getTokens(int i) {
     return (TenseTokensLink)(((FSArray<TenseTokensLink>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_tokens)))).get(i));
  } 

  /** indexed setter for tokens - sets an indexed value - a list of links pointing to the participant tokens of this tense
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setTokens(int i, TenseTokensLink v) {
    ((FSArray<TenseTokensLink>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_tokens)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: passive

  /** getter for passive - gets whether this tense is expressed in passive voice
   * @generated
   * @return value of the feature 
   */
  public boolean getPassive() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_passive));
  }
    
  /** setter for passive - sets whether this tense is expressed in passive voice 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPassive(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_passive), v);
  }    
    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_value));
  }
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_value), v);
  }    
    
  }

    