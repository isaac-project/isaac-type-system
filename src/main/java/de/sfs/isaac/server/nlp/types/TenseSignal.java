

/* First created by JCasGen Tue Aug 29 14:20:25 CEST 2017 */
package de.sfs.isaac.server.nlp.types;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** a key-value pair for tense annotations
 * Updated by JCasGen Tue Apr 14 16:08:07 CEST 2020
 * XML source: /home/rziai/git/isaac-backend/src/main/resources/isaac-type-system.xml
 * @generated */
public class TenseSignal extends KeyValuePair {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.sfs.isaac.server.nlp.types.TenseSignal";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TenseSignal.class);
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
   
  public final static String _FeatName_predictedTense = "predictedTense";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_predictedTense = TypeSystemImpl.createCallSite(TenseSignal.class, "predictedTense");
  private final static MethodHandle _FH_predictedTense = _FC_predictedTense.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected TenseSignal() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TenseSignal(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TenseSignal(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TenseSignal(JCas jcas, int begin, int end) {
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
  //* Feature: predictedTense

  /** getter for predictedTense - gets the tense this word is indicative of
   * @generated
   * @return value of the feature 
   */
  public String getPredictedTense() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_predictedTense));
  }
    
  /** setter for predictedTense - sets the tense this word is indicative of 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPredictedTense(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_predictedTense), v);
  }    
    
  }

    