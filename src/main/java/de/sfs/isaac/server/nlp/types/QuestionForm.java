

/* First created by JCasGen Tue Jun 19 14:06:08 CEST 2018 */
package de.sfs.isaac.server.nlp.types;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import org.apache.uima.jcas.tcas.Annotation;


/** a surface question form, such as 'how' or 'who'
 * Updated by JCasGen Tue Apr 14 16:08:07 CEST 2020
 * XML source: /home/rziai/git/isaac-backend/src/main/resources/isaac-type-system.xml
 * @generated */
public class QuestionForm extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.sfs.isaac.server.nlp.types.QuestionForm";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuestionForm.class);
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
   
  public final static String _FeatName_label = "label";
  public final static String _FeatName_involvedTokens = "involvedTokens";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_label = TypeSystemImpl.createCallSite(QuestionForm.class, "label");
  private final static MethodHandle _FH_label = _FC_label.dynamicInvoker();
  private final static CallSite _FC_involvedTokens = TypeSystemImpl.createCallSite(QuestionForm.class, "involvedTokens");
  private final static MethodHandle _FH_involvedTokens = _FC_involvedTokens.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected QuestionForm() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public QuestionForm(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public QuestionForm(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public QuestionForm(JCas jcas, int begin, int end) {
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
  //* Feature: label

  /** getter for label - gets the question form label
   * @generated
   * @return value of the feature 
   */
  public String getLabel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_label));
  }
    
  /** setter for label - sets the question form label 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_label), v);
  }    
    
   
    
  //*--------------*
  //* Feature: involvedTokens

  /** getter for involvedTokens - gets a list of tokens involved in this question form
   * @generated
   * @return value of the feature 
   */
  public FSArray getInvolvedTokens() { 
    return (FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_involvedTokens)));
  }
    
  /** setter for involvedTokens - sets a list of tokens involved in this question form 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInvolvedTokens(FSArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_involvedTokens), v);
  }    
    
    
  /** indexed getter for involvedTokens - gets an indexed value - a list of tokens involved in this question form
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Token getInvolvedTokens(int i) {
     return (Token)(((FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_involvedTokens)))).get(i));
  } 

  /** indexed setter for involvedTokens - sets an indexed value - a list of tokens involved in this question form
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setInvolvedTokens(int i, Token v) {
    ((FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_involvedTokens)))).set(i, v);
  }  
  }

    